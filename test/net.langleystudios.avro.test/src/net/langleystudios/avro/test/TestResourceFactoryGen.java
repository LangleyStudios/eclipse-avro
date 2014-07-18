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
import java.net.URL;
import java.util.ArrayList;

import net.langleystudios.avro.gen.Utility;
import net.langleystudios.avro.gen.common.GenerateResourceFactory;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestResourceFactoryGen {

	@Test
	public void test() throws IOException {
		File locationFile;
		Bundle bundle = Platform.getBundle("org.eclipse.emf.examples.library");
		URL bundleURL = bundle.getEntry("model/extlibrary.genmodel");
		URL fileURL = FileLocator.toFileURL(bundleURL);

		URI locationURI = URI.createFileURI(fileURL.getPath());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(locationURI, true);
		GenModel genModel = (GenModel) resource.getContents().get(0);

		locationFile = new File("src-gen");
		clearDir(locationFile);
		AcceleoPreferences.switchQueryCache(false);

		for (GenPackage genPackage : genModel.getGenPackages()) {
			String basePackage = genPackage.getBasePackage() + "."
					+ genPackage.getEcorePackage().getName();
			Utility.setBasePackage(basePackage);
			Utility.setFactory(genPackage.getPrefix() + "Factory");
			Utility.setPackage(genPackage.getPrefix() + "Package");

			String avroDir = locationFile.toString() + File.separator
					+ basePackage.replace('.', '/') + File.separator + "avro";
			File avroLocation = new File(avroDir);
			GenerateResourceFactory factoryGenerator;
			try {
				factoryGenerator = new GenerateResourceFactory(
						genPackage.getEcorePackage(), avroLocation,
						new ArrayList<Object>());
				factoryGenerator.generate(new BasicMonitor());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void clearDir(File locationFile) {
		if (locationFile.exists()) {
			File[] files = locationFile.listFiles();
			for (File f : files) {
				f.delete();
			}
			locationFile.delete();
		}
		locationFile.mkdir();
	}

}
