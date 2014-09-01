package net.langleystudios.avro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAvroSchemaGen.class, TestAvroJavaGen.class,
		TestConverterGen.class, AvroResourceTest.class,
		TestResourceFactoryGen.class,
		BinaryAvroResourceTest.class })
public class AllTests {

}
