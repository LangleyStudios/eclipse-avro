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
		File schemaDir = new File("library-schemas/schema");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		for(File file: schemaDir.listFiles())
		{
			int rvalue = GenerateJavaHandler.generateCode(file, srcDir);
			assertTrue(rvalue == 0);
		}
	}

	@Test
	public void testEcore() {
		File schemaDir = new File("ecore-schemas/schema");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		for(File file: schemaDir.listFiles())
		{
			int rvalue = GenerateJavaHandler.generateCode(file, srcDir);
			assertTrue(rvalue == 0);
		}
	}
	
	@Test
	public void testXMLNamespace() {
		File schemaDir = new File("xml-namespace-schemas/schema");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		for(File file: schemaDir.listFiles())
		{
			int rvalue = GenerateJavaHandler.generateCode(file, srcDir);
			assertTrue(rvalue == 0);
		}
	}
	
	@Test
	public void testXMLType() {
		File schemaDir = new File("xml-type-schemas/schema");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		for(File file: schemaDir.listFiles())
		{
			int rvalue = GenerateJavaHandler.generateCode(file, srcDir);
			assertTrue(rvalue == 0);
		}
	}
}
