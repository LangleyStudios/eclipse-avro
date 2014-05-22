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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import net.langleystudios.avro.AvroEMFConverter;

import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class AvroResource extends ResourceImpl {

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

		Schema unionSchema = converter.getSchema();
		
		SpecificData sData = new SpecificData(loader);
		DatumReader reader = sData.createDatumReader(unionSchema);
		DataFileStream<Object> dataStream = new DataFileStream<Object>(
				inputStream, reader);

		for (Object object : dataStream) {
			EObject obj = converter.convertAvroObject(object);
			this.getContents().add(obj);
		}
		dataStream.close();

	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {

		Schema schema = converter.getSchema();

		try {
			DatumWriter<Object> writer = new SpecificDatumWriter<Object>(
					schema);
			DataFileWriter<Object> fileWriter = new DataFileWriter<Object>(
					writer);
			fileWriter.setCodec(CodecFactory.deflateCodec(9));
			fileWriter.create(schema, outputStream);
			for (EObject eobject : this.contents) {
				Object o = converter.convertEObject(eobject);
				fileWriter.append(o);
			}
			fileWriter.close();
		} catch (Exception exc) {
			exc.printStackTrace();
		} catch(Error error)
		{
			error.printStackTrace();
		}
	}
}