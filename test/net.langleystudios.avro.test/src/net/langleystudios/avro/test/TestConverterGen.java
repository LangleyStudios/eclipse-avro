package net.langleystudios.avro.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.junit.Test;
import org.osgi.framework.Bundle;

import net.langleystudios.avro.gen.AvroSchemaGenerator;
import net.langleystudios.avro.gen.GenerateAvroConverter;
import net.langleystudios.avro.gen.Utility;

public class TestConverterGen {

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

		for (GenPackage genPackage : genModel.getGenPackages()) {
			String basePackage = genPackage.getBasePackage() + "."
					+ genPackage.getEcorePackage().getName();
			Utility.setBasePackage(basePackage);
			Utility.setFactory(genPackage.getPrefix() + "Factory");
			Utility.setPackage(genPackage.getPrefix() + "Package");

			String avroDir = locationFile.toString() + File.separator
					+ basePackage.replace('.', '/') + File.separator + "avro";
			fileAccess.setOutputPath(avroDir);
			GenerateAvroConverter generator = new GenerateAvroConverter();

			generator.generateConverter(genPackage.getEcorePackage(), fileAccess);
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
