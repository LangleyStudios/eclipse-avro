/*
* generated by Xtext
*/
package net.langleystudios.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AvroSchemaAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.tokens");
	}
}
