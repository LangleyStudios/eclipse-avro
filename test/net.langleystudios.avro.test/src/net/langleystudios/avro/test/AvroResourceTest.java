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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.emf.examples.extlibrary.Person;
import org.eclipse.emf.examples.extlibrary.avro.ConvertEMFtoAvro;
import org.eclipse.emf.examples.extlibrary.avro.Writer;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

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
			fileWriter.create(org.eclipse.emf.examples.extlibrary.avro.Person
					.getClassSchema(), new File("test.avro"));
			org.eclipse.emf.examples.extlibrary.avro.Person avroPerson = converter
					.convertPerson(person);
			fileWriter.append(avroPerson);
			fileWriter.close();

			SpecificData sData = new SpecificData(
					org.eclipse.emf.examples.extlibrary.avro.Person.class
							.getClassLoader());
			DatumReader reader = sData.createDatumReader(unionSchema);
			DataFileReader<Object> dataFileReader = new DataFileReader<Object>(
					new File("test.avro"), reader);
			Object o = dataFileReader.next();

			org.eclipse.emf.examples.extlibrary.avro.Person temp = (org.eclipse.emf.examples.extlibrary.avro.Person) o;
			System.out.println(temp);
			System.out.println(avroPerson);

		} catch (Exception exc) {
			exc.printStackTrace();
		} catch (Error error) {
			error.printStackTrace();
		}

	}

	@Test
	public void testPersonResource() {

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
			fail(e.getMessage());
		} catch (Error error) {
			fail(error.getMessage());
		}

		AvroResource loadResource = new AvroResource(uri);
		loadResource
				.setClassLoader(org.eclipse.emf.examples.extlibrary.avro.Person.class
						.getClassLoader());
		loadResource.setConverter(converter);
		try {
			loadResource.load(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(loadResource.getContents().size() == 1);
		EObject eobject = loadResource.getContents().get(0);
		boolean isequal = EcoreUtil.equals(person, eobject);
		assertTrue(isequal);
	}

	@Test
	public void testLibraryResource() {

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI("tempFile.avro");
		resourceSet.createResource(uri);
		AvroResource resource = new AvroResource(uri);
		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		resource.setConverter(converter);
		Library library = EXTLibraryFactory.eINSTANCE.createLibrary();
		resource.getContents().add(library);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (Error error) {
			error.printStackTrace();
		}

		AvroResource loadResource = new AvroResource(uri);
		loadResource
				.setClassLoader(org.eclipse.emf.examples.extlibrary.avro.Person.class
						.getClassLoader());
		loadResource.setConverter(converter);
		try {
			loadResource.load(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		for (EObject eobject : loadResource.getContents()) {
			System.out.println(eobject);
		}
	}

	@Test(expected = IOException.class)
	public void testInvalidBookResource() throws IOException {

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI("book.avro");
		resourceSet.createResource(uri);
		AvroResource resource = new AvroResource(uri);
		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		resource.setConverter(converter);
		Book book = EXTLibraryFactory.eINSTANCE.createBook();
		resource.getContents().add(book);
		resource.save(null);
	}

	@Test
	public void testValidBookResource() throws IOException {

		org.eclipse.emf.examples.extlibrary.Writer writer = EXTLibraryFactory.eINSTANCE
				.createWriter();
		writer.setFirstName("John");
		writer.setLastName("Smith");
		writer.setName("John Smith");
		writer.setAddress("123 Sesame Street");
		ResourceSet resourceSet = new ResourceSetImpl();
		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		URI writerURI = URI.createFileURI("writer.library_avro");
		AvroResource writerResource = (AvroResource) resourceSet
				.createResource(writerURI);
		resourceSet.getResources().add(writerResource);
		writerResource.setConverter(converter);

		writerResource.getContents().add(writer);
		writerResource.save(null);

		URI uri = URI.createFileURI("book.library_avro");
		AvroResource resource = (AvroResource) resourceSet.createResource(uri);
		resourceSet.getResources().add(resource);
		resource.setConverter(converter);
		Book book = EXTLibraryFactory.eINSTANCE.createBook();
		book.setAuthor(writer);
		resource.getContents().add(book);
		try {
			resource.save(null);
		} catch (IOException e) {
			fail(e.getMessage());
		} catch (Error error) {
			fail(error.getMessage());
		}

		AvroResource loadResource = (AvroResource) resourceSet.getResource(uri,
				false);
		try {
			loadResource.load(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(loadResource.getContents().size() == 1);
		EObject loadedObject = loadResource.getContents().get(0);
		assertNotNull(loadedObject);
		assertTrue(loadedObject instanceof Book);
		assertTrue(EcoreUtil.equals(book, loadedObject));
	}

	@Test
	public void testResourceFactory() {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI("tempFile.library_avro");
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
			fail(e.getMessage());
		} catch (Error error) {
			error.printStackTrace();
		}

		resourceSet = null;
		ResourceSet newSet = new ResourceSetImpl();
		try {
			Resource newResource = newSet.getResource(uri, true);
			assertNotNull(newResource);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
