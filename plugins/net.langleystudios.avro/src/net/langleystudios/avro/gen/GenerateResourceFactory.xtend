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
package net.langleystudios.avro.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EPackage

class GenerateResourceFactory {
	def generateResourceFactory(EPackage anEPackage, IFileSystemAccess fsa) {

		fsa.generateFile(
			'AvroResourceFactory.java',
			'''
package «Utility.getBasePackage()».avro;

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
		resource.setClassLoader(«Utility.getBasePackage().concat(Utility.getPackage())».class.getClassLoader());

		ConvertEMFtoAvro converter = new ConvertEMFtoAvro();
		resource.setConverter(converter);
		return resource;
	}

}
'''
		)

	}

}
