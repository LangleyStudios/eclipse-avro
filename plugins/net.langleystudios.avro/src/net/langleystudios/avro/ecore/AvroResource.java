/*******************************************************************************
 * Copyright (c) 2014 Langley Studios
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Langley Studios - initial API and implementation
 *******************************************************************************/
package net.langleystudios.avro.ecore;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.langleystudios.avro.AvroEMFConverter;

import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.apache.avro.io.JsonEncoder;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class AvroResource extends ResourceImpl {

	/**
	 * A load or save option that when set to Boolean.TRUE, directs the resource
	 * to produce or consume a binary resource encoded by Avro
	 */
	public final static String OPTION_AVRO_BINARY = "AVRO_BINARY";
	
	/**
	 * A save option that when set to Boolean.TRUE, directs the resource
	 * to produce a compressed resource encoded by Avro. The resource compression
	 * is automatically determined for loading.
	 */
	public final static String OPTION_AVRO_ZIP = "AVRO_ZIP";

	/**
	 * A key used for storing a list of package URIs as metadata in the
	 * Avro file.
	 */
	public final static String AVRO_PACKAGE_LIST = "AVRO_PACKAGE_LIST";
	
	private ClassLoader loader = null;

	private AvroEMFConverter converter = null;

	public AvroResource() {
		super();
	}

	public AvroResource(URI uri) {
		super(uri);
	}

	public void setClassLoader(ClassLoader loader) {
		this.loader = loader;
	}

	public void setConverter(AvroEMFConverter converter) {
		this.converter = converter;
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {

		// Compression is read from the file metadata if binary
		// Object zipOption = options.get(Resource.OPTION_ZIP);

		Object binaryOption = null;
		if (options != null) {
			binaryOption = options.get(OPTION_AVRO_BINARY);
		}

		SpecificData sData = new SpecificData(loader);
		Schema unionSchema = converter.getSchema();
		DatumReader<Object> reader = sData.createDatumReader(unionSchema);

		// If the binary option is not set, use Json encoding
		if (!Boolean.TRUE.equals(binaryOption)) {
			JsonDecoder decoder = DecoderFactory.get().jsonDecoder(unionSchema,
					inputStream);
			try {
				Object object = reader.read(null, decoder);
				while (object != null) {
					EObject obj = converter.convertAvroObject(object);
					this.getContents().add(obj);
					reader.read(null, decoder);
				}
			} catch (EOFException eof) {
				// Find a way to read without relying on an exception to stop
			}
		} else // Use binary encoding with the DataFileStream
		{
			DataFileStream<Object> dataStream = new DataFileStream<Object>(
					inputStream, reader);
			for (Object object : dataStream) {
				EObject obj = converter.convertAvroObject(object);
				this.getContents().add(obj);
			}
		}
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		Error error = null;
		Exception exception = null;

		// Bail early if we have nothing to save
		if (this.contents == null && this.contents.size() == 0) {
			return;
		}

		// Create a union schema using only the EObjects that are in contents
		// and build a list of unique URIs for the packages
		List<Schema> schemaList = new ArrayList<Schema>();
		List<String> uriList = new ArrayList<String>();
		for (EObject eobject : this.contents) {
			Schema schema = converter.getSchema(eobject);
			if (schema != null) {
				schemaList.add(schema);
			}
			String uri = eobject.eClass().getEPackage().getNsURI();
			if(!uriList.contains(uri))
			{
				uriList.add(uri);
			}
		}
		Schema unionSchema = Schema.createUnion(schemaList);

		DatumWriter<Object> writer = new SpecificDatumWriter<Object>(
				unionSchema);

		// Build the package list
		StringBuilder builder = new StringBuilder();
		if(uriList.size() > 0)
		{
			builder.append(uriList.get(0));
			for(int i = 1; i < uriList.size(); i++)
			{
				builder.append(",");
				builder.append(uriList.get(i));
			}
		}
		
		Object zipOption = null;
		Object binaryOption = null;
		if (options != null) {
			zipOption = options.get(OPTION_AVRO_ZIP);
			binaryOption = options.get(OPTION_AVRO_BINARY);
		}

		if (Boolean.TRUE.equals(binaryOption)) {
			DataFileWriter<Object> fileWriter = null;
			try {
				fileWriter = new DataFileWriter<Object>(writer);
				fileWriter.setMeta(AVRO_PACKAGE_LIST, builder.toString());
				// Check to see if we're using compression
				if (Boolean.TRUE.equals(zipOption)) {
					fileWriter.setCodec(CodecFactory.deflateCodec(9));
				}

				fileWriter.create(unionSchema, outputStream);
				for (EObject eobject : this.contents) {
					Object o = converter.convertEObject(eobject);
					fileWriter.append(o);
				}
			} catch (Exception exc) {
				exception = exc;
			} catch (Error err) {
				error = err;
			} finally {
				if (fileWriter != null) {
					fileWriter.flush();
				}
			}
		} else {
			JsonEncoder encoder = EncoderFactory.get().jsonEncoder(unionSchema,
					outputStream);
			try {
				for (EObject eobject : this.contents) {
					Object o = converter.convertEObject(eobject);
					writer.write(o, encoder);
				}
			} catch (Exception exc) {
				exception = exc;
			} catch (Error err) {
				error = err;
			} finally {
				if (encoder != null) {
					encoder.flush();
				}
			}
		}

		// Re-throw any exceptions as IOExceptions
		if (exception != null) {
			throw new IOException(exception);
		} else if (error != null) {
			throw new IOException(error);
		}

	}

	protected void doTempSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		Error error = null;
		Exception exception = null;

		// Bail early if we have nothing to save
		if (this.contents == null && this.contents.size() == 0) {
			return;
		}

		// Create a union schema using only the EObjects that are in contents
		List<Schema> schemaList = new ArrayList<Schema>();
		for (EObject eobject : this.contents) {
			Schema schema = converter.getSchema(eobject);
			if (schema != null) {
				schemaList.add(schema);
			}
		}
		Schema unionSchema = Schema.createUnion(schemaList);

		DataFileWriter<Object> fileWriter = null;
		try {
			DatumWriter<Object> writer = new SpecificDatumWriter<Object>(
					unionSchema);
			fileWriter = new DataFileWriter<Object>(writer);
			fileWriter.setCodec(CodecFactory.deflateCodec(9));
			fileWriter.create(unionSchema, outputStream);
			for (EObject eobject : this.contents) {
				Object o = converter.convertEObject(eobject);
				fileWriter.append(o);
			}
		} catch (Exception exc) {
			exception = exc;
		} catch (Error err) {
			error = err;
		} finally {
			if (fileWriter != null) {
				fileWriter.close();
			}
		}
		if (exception != null) {
			throw new IOException(exception);
		} else if (error != null) {
			throw new IOException(error);
		}
	}

}
