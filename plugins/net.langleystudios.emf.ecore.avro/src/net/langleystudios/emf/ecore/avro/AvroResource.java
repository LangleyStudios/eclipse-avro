package net.langleystudios.emf.ecore.avro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

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

import avro.extlibrary.ConvertAvroToEMF;
import avro.extlibrary.ConvertEMFtoAvro;

public class AvroResource extends ResourceImpl {

	private ClassLoader loader = null;
	
	public AvroResource() {
		super();
	}

	public AvroResource(URI uri) {
		super(uri);
	}

	public void setClassLoader(ClassLoader loader) {
		this.loader = loader;
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {

		Schema unionSchema = ConvertEMFtoAvro.getUnionSchema();
		
		SpecificData sData = new SpecificData(loader);
		DatumReader reader = sData.createDatumReader(unionSchema);
		DataFileStream<Object> dataStream = new DataFileStream<Object>(
				inputStream, reader);

		for (Object object : dataStream) {
			EObject obj = ConvertAvroToEMF.convertAvroObject(object);
			this.getContents().add(obj);
		}
		dataStream.close();

	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {

		Schema unionSchema = ConvertEMFtoAvro.getUnionSchema();

		try {
			DatumWriter<Object> writer = new SpecificDatumWriter<Object>(
					unionSchema);
			DataFileWriter<Object> fileWriter = new DataFileWriter<Object>(
					writer);
			fileWriter.setCodec(CodecFactory.deflateCodec(9));
			fileWriter.create(avro.extlibrary.Person.getClassSchema(), outputStream);
			for (EObject eobject : this.contents) {
				Object o = ConvertEMFtoAvro.convertEObject(eobject);
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
