package net.langleystudios.emf.ecore.avro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.DatumWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import avro.extlibrary.ConvertEMFtoAvro;

public class AvroResource extends ResourceImpl {

	public static final String NS_URI_META = "ns.uri.meta";
	public static final String NS_SPLIT_STRING = ";";

	public AvroResource() {
		super();
	}

	public AvroResource(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {

		Schema unionSchema = ConvertEMFtoAvro.getUnionSchema();
		GenericDatumReader<EObject> reader = new GenericDatumReader<EObject>();
		DataFileStream<EObject> dataStream = new DataFileStream<EObject>(
				inputStream, reader);
		reader.setExpected(unionSchema);

		for (EObject eobject : dataStream) {
			contents.add(eobject);
		}
		dataStream.close();

	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {

		Schema unionSchema = ConvertEMFtoAvro.getUnionSchema();

		try {
			DatumWriter<Object> writer = new GenericDatumWriter<Object>(
					avro.extlibrary.Person.getClassSchema());
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
