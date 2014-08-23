package org.eclipse.emf.examples.extlibrary.avro;

import net.langleystudios.avro.ecore.AvroResource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class AvroResourceFactory extends ResourceFactoryImpl {

	/**
	 * Constructor for AvroResourceFactory.
	 */
	public AvroResourceFactory() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		AvroResource resource = new AvroResource(uri);
		resource.setClassLoader(org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.class.getClassLoader());

		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		resource.setConverter(converter);
		return resource;
	}

}
