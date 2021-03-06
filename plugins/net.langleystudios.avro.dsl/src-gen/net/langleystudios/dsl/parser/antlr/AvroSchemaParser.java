/*
* generated by Xtext
*/
package net.langleystudios.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;

public class AvroSchemaParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AvroSchemaGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected net.langleystudios.dsl.parser.antlr.internal.InternalAvroSchemaParser createParser(XtextTokenStream stream) {
		return new net.langleystudios.dsl.parser.antlr.internal.InternalAvroSchemaParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "AvroSchema";
	}
	
	public AvroSchemaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AvroSchemaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
