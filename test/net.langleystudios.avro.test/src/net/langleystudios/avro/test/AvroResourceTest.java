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
package net.langleystudios.avro.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import net.langleystudios.avro.ecore.AvroResource;

import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.Person;
import org.eclipse.emf.examples.extlibrary.avro.ConvertEMFtoAvro;
import org.junit.Test;

public class AvroResourceTest {

	@Test
	public void testEncoding() {
		Person person = EXTLibraryFactory.eINSTANCE.createPerson();
		person.setAddress("123 Sesame Street");
		person.setFirstName("John");
		person.setLastName("Smith");

		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		
		Schema unionSchema = converter.getSchema();

		try {
			DatumWriter<Object> writer = new SpecificDatumWriter<Object>(
					unionSchema);
			DataFileWriter<Object> fileWriter = new DataFileWriter<Object>(
					writer);
			fileWriter.setCodec(CodecFactory.deflateCodec(9));
			fileWriter.create(org.eclipse.emf.examples.extlibrary.avro.Person.getClassSchema(),
					new File("test.avro"));
			org.eclipse.emf.examples.extlibrary.avro.Person avroPerson = converter.convertPerson(person);
			fileWriter.append(avroPerson);
			fileWriter.close();

			SpecificData sData = new SpecificData(org.eclipse.emf.examples.extlibrary.avro.Person.class.getClassLoader());
			DatumReader reader = sData.createDatumReader(unionSchema);
			DataFileReader<Object> dataFileReader = new DataFileReader<Object>(
					new File("test.avro"), reader);
			Object o = dataFileReader.next();
			
			org.eclipse.emf.examples.extlibrary.avro.Person temp = (org.eclipse.emf.examples.extlibrary.avro.Person)o;
			System.out.println(temp);
			System.out.println(avroPerson);

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
		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		resource.setConverter(converter);
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

		AvroResource loadResource = new AvroResource(uri);
		loadResource.setClassLoader(org.eclipse.emf.examples.extlibrary.avro.Person.class.getClassLoader());
		loadResource.setConverter(converter);
		try {
			loadResource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		for(EObject eobject: loadResource.getContents())
		{
			System.out.println(eobject);
		}
	}

}
