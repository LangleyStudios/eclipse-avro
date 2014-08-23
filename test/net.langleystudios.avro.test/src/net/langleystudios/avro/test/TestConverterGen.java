package net.langleystudios.avro.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import net.langleystudios.avro.gen.Utility;
import net.langleystudios.avro.gen.common.GenerateAvroConverter;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
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

public class TestConverterGen implements IAcceleoTextGenerationListener {

	private boolean generationComplete = false;
	private boolean fileGenerated = false;
	private boolean textGenerated = false;
	
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
			GenerateAvroConverter generator;
			try {
				generator = new GenerateAvroConverter(
						genPackage.getEcorePackage(), avroLocation,
						new ArrayList<Object>());
				generator.addGenerationListener(this);
				Map<String, String> results = generator.generate(new BasicMonitor());
				assertNotNull(results);
				assertTrue(textGenerated);
				assertTrue(fileGenerated);
				assertTrue(generationComplete);
			} catch (IOException e) {
				fail(e.getMessage());
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

	@Override
	public void textGenerated(AcceleoTextGenerationEvent event) {
		textGenerated = true;
	}

	@Override
	public void filePathComputed(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void fileGenerated(AcceleoTextGenerationEvent event) {
		fileGenerated = true;
	}

	@Override
	public void generationEnd(AcceleoTextGenerationEvent event) {
		generationComplete = true;		
	}

	@Override
	public boolean listensToGenerationEnd() {
		return true;
	}

}
