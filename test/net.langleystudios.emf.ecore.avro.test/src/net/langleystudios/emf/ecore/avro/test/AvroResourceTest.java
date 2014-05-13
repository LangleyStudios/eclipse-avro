package net.langleystudios.emf.ecore.avro.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import net.langleystudios.emf.ecore.avro.AvroResource;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.Person;
import org.junit.Test;

import avro.extlibrary.ConvertEMFtoAvro;

public class AvroResourceTest {

	@Test
	public void testEncoding() {
		Person person = EXTLibraryFactory.eINSTANCE.createPerson();
		person.setAddress("123 Sesame Street");
		person.setFirstName("John");
		person.setLastName("Smith");

		try {
			DatumWriter<avro.extlibrary.Person> writer = new GenericDatumWriter<avro.extlibrary.Person>(
					avro.extlibrary.Person.getClassSchema());
			DataFileWriter<avro.extlibrary.Person> fileWriter = new DataFileWriter<avro.extlibrary.Person>(
					writer);
			// fileWriter.setCodec(CodecFactory.deflateCodec(9));
			fileWriter.create(avro.extlibrary.Person.getClassSchema(), new File("test.avro"));
			avro.extlibrary.Person o = ConvertEMFtoAvro.convertPerson(person);
			fileWriter.append(o);
			fileWriter.close();

			DatumReader<avro.extlibrary.Person> reader = new GenericDatumReader<avro.extlibrary.Person>();
			DataFileReader<avro.extlibrary.Person> dataFileReader = new DataFileReader<avro.extlibrary.Person>(
					new File("test.avro"), reader);
			o = dataFileReader.next();
			
			System.out.println(o);

		} catch (Exception exc) {
			exc.printStackTrace();
		} catch (Error error) {
			error.printStackTrace();
		}

	}

	@Test
	public void test() {

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI("tempFile.avro");
		resourceSet.createResource(uri);
		AvroResource resource = new AvroResource(uri);
		Person person = EXTLibraryFactory.eINSTANCE.createPerson();
		person.setAddress("123 Sesame Street");
		person.setFirstName("John");
		person.setLastName("Smith");
		resource.getContents().add(person);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (Error error) {
			error.printStackTrace();
		}
	}

}
