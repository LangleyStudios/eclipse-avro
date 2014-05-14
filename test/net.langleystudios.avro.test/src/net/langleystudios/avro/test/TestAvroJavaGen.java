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
