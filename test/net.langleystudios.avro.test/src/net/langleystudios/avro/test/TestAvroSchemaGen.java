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

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;

import net.langleystudios.avro.gen.AvroSchemaGenerator;

@RunWith(XtextRunner.class)

public class TestAvroSchemaGen {

	IResourceServiceProvider.Registry registry = new IResourceServiceProvider.Registry() {

		@Override
		public IResourceServiceProvider getResourceServiceProvider(URI uri, String contentType) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IResourceServiceProvider getResourceServiceProvider(URI uri) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Map<String, Object> getContentTypeToFactoryMap() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Map<String, Object> getExtensionToFactoryMap() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Map<String, Object> getProtocolToFactoryMap() {
			// TODO Auto-generated method stub
			return null;
		}

	};

	IEncodingProvider provider = new IEncodingProvider() {
		@Override
		public String getEncoding(URI uri) {
			return "utf-8";
		}
	};

	JavaIoFileSystemAccess fileAccess = new JavaIoFileSystemAccess(registry, provider);
	
	@Test
	public void testLibraryExample() throws IOException, URISyntaxException {
		URI modelURI;
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.examples.library");
		URL bundleURL = bundle.getEntry("model/extlibrary.ecore");
		URL fileURL = FileLocator.toFileURL(bundleURL);
		modelURI = URI.createURI(fileURL.toURI().toString());

		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource resource = set.getResource(modelURI, true);

		locationFile = new File("library-schemas");
		clearDir(locationFile);
		locationFile.mkdir();

		fileAccess.setOutputPath(locationFile.getAbsolutePath());

		AvroSchemaGenerator generator = new AvroSchemaGenerator();

		generator.generateAvroSchema(resource, "org.eclipse.emf.examples", fileAccess);
	}

	@Test
	public void testEMFEcore() throws IOException, URISyntaxException {
		URI modelURI;
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.ecore");
		URL bundleURL = bundle.getEntry("model/Ecore.ecore");
		URL fileURL = FileLocator.toFileURL(bundleURL);
		System.out.println(fileURL);
		modelURI = URI.createURI(fileURL.toURI().toString());
		locationFile = new File("ecore-schemas");
		clearDir(locationFile);

		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource resource = set.getResource(modelURI, true);

		fileAccess.setOutputPath(locationFile.getAbsolutePath());

		AvroSchemaGenerator generator = new AvroSchemaGenerator();

		generator.generateAvroSchema(resource, "testPackage", fileAccess);

	}

	private void clearDir(File locationFile) {
		if (locationFile.exists()) {
			File[] files = locationFile.listFiles();
			for (File f : files) {
				if (f.isDirectory()) {
					clearDir(f);
				} else {
					f.delete();
				}
			}
			locationFile.delete();
		}
	}
}
