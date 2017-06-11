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

import static org.junit.Assert.assertTrue;

import java.io.File;

import net.langleystudios.avro.gen.handler.GenerateJavaHandler;

import org.junit.Test;

public class TestAvroJavaGen {

	@Test
	public void testLibrary() {
		File schemaDir = new File("library-schemas");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		for(File file: schemaDir.listFiles())
		{
			System.out.println("Generating Java Code for " + file.getName());
			int rvalue = GenerateJavaHandler.generateCode(file, srcDir);
			
			assertTrue("Failed for " + file.getName(), rvalue == 0);
		}
	}

	@Test
	public void testEcore() {
		File schemaDir = new File("ecore-schemas");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		for(File file: schemaDir.listFiles())
		{
			System.out.println("Generating Java Code for " + file.getName());
			int rvalue = GenerateJavaHandler.generateCode(file, srcDir);
			assertTrue("Failed for " + file.getName(), rvalue == 0);
		}
	}
}
