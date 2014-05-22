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

import net.langleystudios.avro.gen.handler.GenerateJavaHandler;

import org.junit.Test;

public class TestAvroJavaGen {

	@Test
	public void test() {
		File schemaDir = new File("schemas");
		File srcDir = new File("src-gen");
		srcDir.mkdir();
		
		GenerateJavaHandler handler = new GenerateJavaHandler();
		
		for(File file: schemaDir.listFiles())
		{
			handler.generateCode(file, srcDir);
		}
	}

}
