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
import java.net.URL;
import java.util.ArrayList;

import net.langleystudios.avro.gen.common.GenerateAvroSchema;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestAvroSchemaGen {

	@Test
	public void testLibraryExample() throws IOException {
		URI modelURI;
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.examples.library");
		URL bundleURL = bundle.getEntry("model/extlibrary.ecore");
		URL fileURL = FileLocator.toFileURL(bundleURL);
		modelURI = URI.createFileURI(fileURL.toString());
		locationFile = new File("library-schemas");
		clearDir(locationFile);
		AcceleoPreferences.switchQueryCache(false);
		GenerateAvroSchema generator;
		try {
			generator = new GenerateAvroSchema(
					modelURI, locationFile, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testEMFEcore() throws IOException {
		URI modelURI;
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.ecore");
		URL bundleURL = bundle.getEntry("model/Ecore.ecore");
		URL fileURL = FileLocator.toFileURL(bundleURL);
		modelURI = URI.createFileURI(fileURL.toString());
		locationFile = new File("ecore-schemas");
		clearDir(locationFile);
		AcceleoPreferences.switchQueryCache(false);
		GenerateAvroSchema generator;
		try {
			generator = new GenerateAvroSchema(
					modelURI, locationFile, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testXMLNamespace() throws IOException {
		URI modelURI;
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.ecore");
		URL bundleURL = bundle.getEntry("model/XMLNamespace.ecore");
		URL fileURL = FileLocator.toFileURL(bundleURL);
		modelURI = URI.createFileURI(fileURL.toString());
		locationFile = new File("xml-namespace-schemas");
		clearDir(locationFile);
		AcceleoPreferences.switchQueryCache(false);
		GenerateAvroSchema generator;
		try {
			generator = new GenerateAvroSchema(
					modelURI, locationFile, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testXMLType() throws IOException {
		URI modelURI;
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.ecore");
		URL bundleURL = bundle.getEntry("model/XMLType.ecore");
		URL fileURL = FileLocator.toFileURL(bundleURL);
		modelURI = URI.createFileURI(fileURL.toString());
		locationFile = new File("xml-type-schemas");
		clearDir(locationFile);
		AcceleoPreferences.switchQueryCache(false);
		GenerateAvroSchema generator;
		try {
			generator = new GenerateAvroSchema(
					modelURI, locationFile, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	private void clearDir(File locationFile)
	{
		if(locationFile.exists())
		{
			File[] files = locationFile.listFiles();
			for(File f: files)
			{
				f.delete();
			}
			locationFile.delete();
		}
		locationFile.mkdir();
	}
}
