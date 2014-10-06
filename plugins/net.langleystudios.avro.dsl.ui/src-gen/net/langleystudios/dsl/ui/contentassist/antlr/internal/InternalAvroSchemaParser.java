package net.langleystudios.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAvroSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'['", "']'", "','", "'\"'", "'{'", "'type'", "':'", "'}'", "'record'", "'fields'", "'namespace'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalAvroSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAvroSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAvroSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g"; }


     
     	private AvroSchemaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AvroSchemaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAvroSchema"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:60:1: entryRuleAvroSchema : ruleAvroSchema EOF ;
    public final void entryRuleAvroSchema() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:61:1: ( ruleAvroSchema EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:62:1: ruleAvroSchema EOF
            {
             before(grammarAccess.getAvroSchemaRule()); 
            pushFollow(FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema61);
            ruleAvroSchema();

            state._fsp--;

             after(grammarAccess.getAvroSchemaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvroSchema68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvroSchema"


    // $ANTLR start "ruleAvroSchema"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:69:1: ruleAvroSchema : ( ( rule__AvroSchema__TypesAssignment ) ) ;
    public final void ruleAvroSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:73:2: ( ( ( rule__AvroSchema__TypesAssignment ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:74:1: ( ( rule__AvroSchema__TypesAssignment ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:74:1: ( ( rule__AvroSchema__TypesAssignment ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:75:1: ( rule__AvroSchema__TypesAssignment )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAssignment()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:76:1: ( rule__AvroSchema__TypesAssignment )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:76:2: rule__AvroSchema__TypesAssignment
            {
            pushFollow(FOLLOW_rule__AvroSchema__TypesAssignment_in_ruleAvroSchema94);
            rule__AvroSchema__TypesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAvroSchemaAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvroSchema"


    // $ANTLR start "entryRuleUnionType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:88:1: entryRuleUnionType : ruleUnionType EOF ;
    public final void entryRuleUnionType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:89:1: ( ruleUnionType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:90:1: ruleUnionType EOF
            {
             before(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_ruleUnionType_in_entryRuleUnionType121);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getUnionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:97:1: ruleUnionType : ( ( rule__UnionType__Group__0 ) ) ;
    public final void ruleUnionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:101:2: ( ( ( rule__UnionType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:102:1: ( ( rule__UnionType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:102:1: ( ( rule__UnionType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:103:1: ( rule__UnionType__Group__0 )
            {
             before(grammarAccess.getUnionTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:104:1: ( rule__UnionType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:104:2: rule__UnionType__Group__0
            {
            pushFollow(FOLLOW_rule__UnionType__Group__0_in_ruleUnionType154);
            rule__UnionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleUnionMember"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:116:1: entryRuleUnionMember : ruleUnionMember EOF ;
    public final void entryRuleUnionMember() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:117:1: ( ruleUnionMember EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:118:1: ruleUnionMember EOF
            {
             before(grammarAccess.getUnionMemberRule()); 
            pushFollow(FOLLOW_ruleUnionMember_in_entryRuleUnionMember181);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionMember188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionMember"


    // $ANTLR start "ruleUnionMember"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:125:1: ruleUnionMember : ( ( rule__UnionMember__Alternatives ) ) ;
    public final void ruleUnionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:129:2: ( ( ( rule__UnionMember__Alternatives ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:130:1: ( ( rule__UnionMember__Alternatives ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:130:1: ( ( rule__UnionMember__Alternatives ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:131:1: ( rule__UnionMember__Alternatives )
            {
             before(grammarAccess.getUnionMemberAccess().getAlternatives()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:132:1: ( rule__UnionMember__Alternatives )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:132:2: rule__UnionMember__Alternatives
            {
            pushFollow(FOLLOW_rule__UnionMember__Alternatives_in_ruleUnionMember214);
            rule__UnionMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnionMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionMember"


    // $ANTLR start "entryRuleJsonType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:144:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:145:1: ( ruleJsonType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:146:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType241);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:153:1: ruleJsonType : ( ( rule__JsonType__Group__0 ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:157:2: ( ( ( rule__JsonType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:158:1: ( ( rule__JsonType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:158:1: ( ( rule__JsonType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:159:1: ( rule__JsonType__Group__0 )
            {
             before(grammarAccess.getJsonTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:160:1: ( rule__JsonType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:160:2: rule__JsonType__Group__0
            {
            pushFollow(FOLLOW_rule__JsonType__Group__0_in_ruleJsonType274);
            rule__JsonType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleRecordType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:172:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:173:1: ( ruleRecordType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:174:1: ruleRecordType EOF
            {
             before(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType301);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getRecordTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:181:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:185:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:186:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:186:1: ( ( rule__RecordType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:187:1: ( rule__RecordType__Group__0 )
            {
             before(grammarAccess.getRecordTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:188:1: ( rule__RecordType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:188:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType334);
            rule__RecordType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:200:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:201:1: ( ruleField EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:202:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField361);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:209:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:213:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:214:1: ( ( rule__Field__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:214:1: ( ( rule__Field__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:215:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:216:1: ( rule__Field__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:216:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField394);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnumType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:228:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:229:1: ( ruleEnumType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:230:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType421);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:237:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:241:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:242:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:242:1: ( ( rule__EnumType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:243:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:244:1: ( rule__EnumType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:244:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType454);
            rule__EnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleArrayType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:256:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:257:1: ( ruleArrayType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:258:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType481);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:265:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:269:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:270:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:270:1: ( ( rule__ArrayType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:271:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:272:1: ( rule__ArrayType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:272:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType514);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleMapType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:284:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:285:1: ( ruleMapType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:286:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType541);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:293:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:297:2: ( ( ( rule__MapType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:298:1: ( ( rule__MapType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:298:1: ( ( rule__MapType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:299:1: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:300:1: ( rule__MapType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:300:2: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_rule__MapType__Group__0_in_ruleMapType574);
            rule__MapType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleFixedType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:312:1: entryRuleFixedType : ruleFixedType EOF ;
    public final void entryRuleFixedType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:313:1: ( ruleFixedType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:314:1: ruleFixedType EOF
            {
             before(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType601);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFixedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:321:1: ruleFixedType : ( ( rule__FixedType__Group__0 ) ) ;
    public final void ruleFixedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:325:2: ( ( ( rule__FixedType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:326:1: ( ( rule__FixedType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:326:1: ( ( rule__FixedType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:327:1: ( rule__FixedType__Group__0 )
            {
             before(grammarAccess.getFixedTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:328:1: ( rule__FixedType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:328:2: rule__FixedType__Group__0
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0_in_ruleFixedType634);
            rule__FixedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRulePrimitive"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:340:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:341:1: ( rulePrimitive EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:342:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive661);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:349:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:353:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:354:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:354:1: ( ( rule__Primitive__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:355:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:356:1: ( rule__Primitive__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:356:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive694);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNamespace"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:368:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:369:1: ( ruleNamespace EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:370:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace721);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:377:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:381:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:382:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:382:1: ( ( rule__Namespace__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:383:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:384:1: ( rule__Namespace__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:384:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace754);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "rule__AvroSchema__TypesAlternatives_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:396:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );
    public final void rule__AvroSchema__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:400:1: ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:401:1: ( ruleJsonType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:401:1: ( ruleJsonType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:402:1: ruleJsonType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleJsonType_in_rule__AvroSchema__TypesAlternatives_0790);
                    ruleJsonType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:407:6: ( ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:407:6: ( ruleRecordType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:408:1: ruleRecordType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleRecordType_in_rule__AvroSchema__TypesAlternatives_0807);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:413:6: ( ruleUnionType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:413:6: ( ruleUnionType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:414:1: ruleUnionType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleUnionType_in_rule__AvroSchema__TypesAlternatives_0824);
                    ruleUnionType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroSchema__TypesAlternatives_0"


    // $ANTLR start "rule__UnionMember__Alternatives"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:424:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) );
    public final void rule__UnionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:428:1: ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:429:1: ( ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:429:1: ( ruleRecordType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:430:1: ruleRecordType
                    {
                     before(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRecordType_in_rule__UnionMember__Alternatives856);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:435:6: ( ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:435:6: ( ruleArrayType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:436:1: ruleArrayType
                    {
                     before(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__UnionMember__Alternatives873);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:441:6: ( rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:441:6: ( rulePrimitive )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:442:1: rulePrimitive
                    {
                     before(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePrimitive_in_rule__UnionMember__Alternatives890);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:447:6: ( ruleMapType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:447:6: ( ruleMapType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:448:1: ruleMapType
                    {
                     before(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMapType_in_rule__UnionMember__Alternatives907);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:453:6: ( ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:453:6: ( ruleEnumType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:454:1: ruleEnumType
                    {
                     before(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__UnionMember__Alternatives924);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:459:6: ( ruleFixedType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:459:6: ( ruleFixedType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:460:1: ruleFixedType
                    {
                     before(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFixedType_in_rule__UnionMember__Alternatives941);
                    ruleFixedType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:465:6: ( ( rule__UnionMember__Group_6__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:465:6: ( ( rule__UnionMember__Group_6__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:466:1: ( rule__UnionMember__Group_6__0 )
                    {
                     before(grammarAccess.getUnionMemberAccess().getGroup_6()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:467:1: ( rule__UnionMember__Group_6__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:467:2: rule__UnionMember__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__UnionMember__Group_6__0_in_rule__UnionMember__Alternatives958);
                    rule__UnionMember__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnionMemberAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Alternatives"


    // $ANTLR start "rule__Field__NameAlternatives_6_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:476:1: rule__Field__NameAlternatives_6_0 : ( ( 'name' ) | ( RULE_ID ) );
    public final void rule__Field__NameAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:480:1: ( ( 'name' ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:481:1: ( 'name' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:481:1: ( 'name' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:482:1: 'name'
                    {
                     before(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 
                    match(input,10,FOLLOW_10_in_rule__Field__NameAlternatives_6_0992); 
                     after(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:489:6: ( RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:489:6: ( RULE_ID )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:490:1: RULE_ID
                    {
                     before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_01011); 
                     after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAlternatives_6_0"


    // $ANTLR start "rule__Field__Alternatives_13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:500:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );
    public final void rule__Field__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:504:1: ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:505:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:505:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:506:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:507:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:507:2: rule__Field__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131043);
                    rule__Field__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:511:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:511:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:512:1: ( rule__Field__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:513:1: ( rule__Field__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:513:2: rule__Field__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131061);
                    rule__Field__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( ( rule__Field__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( ( rule__Field__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:518:1: ( rule__Field__Group_13_2__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:519:1: ( rule__Field__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:519:2: rule__Field__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131079);
                    rule__Field__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:523:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:523:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:524:1: ( rule__Field__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:525:1: ( rule__Field__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:525:2: rule__Field__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131097);
                    rule__Field__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:529:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:529:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:530:1: ( rule__Field__ArrayAssignment_13_4 )
                    {
                     before(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:531:1: ( rule__Field__ArrayAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:531:2: rule__Field__ArrayAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131115);
                    rule__Field__ArrayAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:536:1: ( rule__Field__MapAssignment_13_5 )
                    {
                     before(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:537:1: ( rule__Field__MapAssignment_13_5 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:537:2: rule__Field__MapAssignment_13_5
                    {
                    pushFollow(FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131133);
                    rule__Field__MapAssignment_13_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:541:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:541:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:542:1: ( rule__Field__FixedAssignment_13_6 )
                    {
                     before(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:543:1: ( rule__Field__FixedAssignment_13_6 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:543:2: rule__Field__FixedAssignment_13_6
                    {
                    pushFollow(FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131151);
                    rule__Field__FixedAssignment_13_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:547:6: ( ( rule__Field__UnionAssignment_13_7 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:547:6: ( ( rule__Field__UnionAssignment_13_7 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:548:1: ( rule__Field__UnionAssignment_13_7 )
                    {
                     before(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:549:1: ( rule__Field__UnionAssignment_13_7 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:549:2: rule__Field__UnionAssignment_13_7
                    {
                    pushFollow(FOLLOW_rule__Field__UnionAssignment_13_7_in_rule__Field__Alternatives_131169);
                    rule__Field__UnionAssignment_13_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives_13"


    // $ANTLR start "rule__ArrayType__Alternatives_13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:558:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );
    public final void rule__ArrayType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:562:1: ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:564:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:2: rule__ArrayType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131202);
                    rule__ArrayType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:570:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:2: rule__ArrayType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131220);
                    rule__ArrayType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:575:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:575:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:576:1: ( rule__ArrayType__Group_13_2__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:577:1: ( rule__ArrayType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:577:2: rule__ArrayType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131238);
                    rule__ArrayType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:581:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:581:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:582:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:583:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:583:2: rule__ArrayType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131256);
                    rule__ArrayType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Alternatives_13"


    // $ANTLR start "rule__MapType__Alternatives_13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:592:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );
    public final void rule__MapType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:596:1: ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:598:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:2: rule__MapType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131289);
                    rule__MapType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:604:1: ( rule__MapType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:1: ( rule__MapType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:2: rule__MapType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131307);
                    rule__MapType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__MapType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__MapType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:610:1: ( rule__MapType__Group_13_2__0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:1: ( rule__MapType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:2: rule__MapType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131325);
                    rule__MapType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:615:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:615:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:616:1: ( rule__MapType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:617:1: ( rule__MapType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:617:2: rule__MapType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131343);
                    rule__MapType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:621:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:621:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:622:1: ( rule__MapType__AtypeAssignment_13_4 )
                    {
                     before(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:623:1: ( rule__MapType__AtypeAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:623:2: rule__MapType__AtypeAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131361);
                    rule__MapType__AtypeAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Alternatives_13"


    // $ANTLR start "rule__Primitive__TypeAlternatives_1_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:632:1: rule__Primitive__TypeAlternatives_1_0 : ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) );
    public final void rule__Primitive__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:636:1: ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:637:1: ( 'null' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:637:1: ( 'null' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:638:1: 'null'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01395); 
                     after(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:645:6: ( 'boolean' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:645:6: ( 'boolean' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:646:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01415); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:653:6: ( 'int' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:653:6: ( 'int' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:654:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01435); 
                     after(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:661:6: ( 'long' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:661:6: ( 'long' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:662:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01455); 
                     after(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:669:6: ( 'float' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:669:6: ( 'float' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:670:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01475); 
                     after(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:677:6: ( 'double' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:677:6: ( 'double' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:678:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 
                    match(input,16,FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01495); 
                     after(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:685:6: ( 'bytes' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:685:6: ( 'bytes' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:686:1: 'bytes'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 
                    match(input,17,FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01515); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:693:6: ( 'string' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:693:6: ( 'string' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:694:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 
                    match(input,18,FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01535); 
                     after(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__TypeAlternatives_1_0"


    // $ANTLR start "rule__UnionType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:708:1: rule__UnionType__Group__0 : rule__UnionType__Group__0__Impl rule__UnionType__Group__1 ;
    public final void rule__UnionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:712:1: ( rule__UnionType__Group__0__Impl rule__UnionType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:713:2: rule__UnionType__Group__0__Impl rule__UnionType__Group__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01567);
            rule__UnionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01570);
            rule__UnionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__0"


    // $ANTLR start "rule__UnionType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:720:1: rule__UnionType__Group__0__Impl : ( '[' ) ;
    public final void rule__UnionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:724:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:725:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:725:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:726:1: '['
            {
             before(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__UnionType__Group__0__Impl1598); 
             after(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__0__Impl"


    // $ANTLR start "rule__UnionType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:739:1: rule__UnionType__Group__1 : rule__UnionType__Group__1__Impl rule__UnionType__Group__2 ;
    public final void rule__UnionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:743:1: ( rule__UnionType__Group__1__Impl rule__UnionType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:744:2: rule__UnionType__Group__1__Impl rule__UnionType__Group__2
            {
            pushFollow(FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11629);
            rule__UnionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11632);
            rule__UnionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__1"


    // $ANTLR start "rule__UnionType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:751:1: rule__UnionType__Group__1__Impl : ( ( rule__UnionType__TypesAssignment_1 ) ) ;
    public final void rule__UnionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:755:1: ( ( ( rule__UnionType__TypesAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:756:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:756:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:757:1: ( rule__UnionType__TypesAssignment_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:758:1: ( rule__UnionType__TypesAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:758:2: rule__UnionType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1659);
            rule__UnionType__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__1__Impl"


    // $ANTLR start "rule__UnionType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:768:1: rule__UnionType__Group__2 : rule__UnionType__Group__2__Impl rule__UnionType__Group__3 ;
    public final void rule__UnionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:772:1: ( rule__UnionType__Group__2__Impl rule__UnionType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:773:2: rule__UnionType__Group__2__Impl rule__UnionType__Group__3
            {
            pushFollow(FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21689);
            rule__UnionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21692);
            rule__UnionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__2"


    // $ANTLR start "rule__UnionType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:780:1: rule__UnionType__Group__2__Impl : ( ( rule__UnionType__Group_2__0 )* ) ;
    public final void rule__UnionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:784:1: ( ( ( rule__UnionType__Group_2__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:785:1: ( ( rule__UnionType__Group_2__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:785:1: ( ( rule__UnionType__Group_2__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:786:1: ( rule__UnionType__Group_2__0 )*
            {
             before(grammarAccess.getUnionTypeAccess().getGroup_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:787:1: ( rule__UnionType__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:787:2: rule__UnionType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1719);
            	    rule__UnionType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUnionTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__2__Impl"


    // $ANTLR start "rule__UnionType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:797:1: rule__UnionType__Group__3 : rule__UnionType__Group__3__Impl ;
    public final void rule__UnionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:801:1: ( rule__UnionType__Group__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:802:2: rule__UnionType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31750);
            rule__UnionType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__3"


    // $ANTLR start "rule__UnionType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:808:1: rule__UnionType__Group__3__Impl : ( ']' ) ;
    public final void rule__UnionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:812:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:813:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:813:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:814:1: ']'
            {
             before(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__UnionType__Group__3__Impl1778); 
             after(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__3__Impl"


    // $ANTLR start "rule__UnionType__Group_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:835:1: rule__UnionType__Group_2__0 : rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 ;
    public final void rule__UnionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:839:1: ( rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:840:2: rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01817);
            rule__UnionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01820);
            rule__UnionType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__0"


    // $ANTLR start "rule__UnionType__Group_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:847:1: rule__UnionType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:851:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:852:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:852:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:853:1: ','
            {
             before(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1848); 
             after(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__0__Impl"


    // $ANTLR start "rule__UnionType__Group_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:866:1: rule__UnionType__Group_2__1 : rule__UnionType__Group_2__1__Impl ;
    public final void rule__UnionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:870:1: ( rule__UnionType__Group_2__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:871:2: rule__UnionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11879);
            rule__UnionType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__1"


    // $ANTLR start "rule__UnionType__Group_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:877:1: rule__UnionType__Group_2__1__Impl : ( ( rule__UnionType__TypesAssignment_2_1 ) ) ;
    public final void rule__UnionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:881:1: ( ( ( rule__UnionType__TypesAssignment_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:882:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:882:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:883:1: ( rule__UnionType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:884:1: ( rule__UnionType__TypesAssignment_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:884:2: rule__UnionType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1906);
            rule__UnionType__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__1__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:898:1: rule__UnionMember__Group_6__0 : rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1 ;
    public final void rule__UnionMember__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:902:1: ( rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:903:2: rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1
            {
            pushFollow(FOLLOW_rule__UnionMember__Group_6__0__Impl_in_rule__UnionMember__Group_6__01940);
            rule__UnionMember__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionMember__Group_6__1_in_rule__UnionMember__Group_6__01943);
            rule__UnionMember__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__0"


    // $ANTLR start "rule__UnionMember__Group_6__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:910:1: rule__UnionMember__Group_6__0__Impl : ( '\"' ) ;
    public final void rule__UnionMember__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:914:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:915:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:915:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:916:1: '\"'
            {
             before(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__UnionMember__Group_6__0__Impl1971); 
             after(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__0__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:929:1: rule__UnionMember__Group_6__1 : rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2 ;
    public final void rule__UnionMember__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:933:1: ( rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:934:2: rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2
            {
            pushFollow(FOLLOW_rule__UnionMember__Group_6__1__Impl_in_rule__UnionMember__Group_6__12002);
            rule__UnionMember__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionMember__Group_6__2_in_rule__UnionMember__Group_6__12005);
            rule__UnionMember__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__1"


    // $ANTLR start "rule__UnionMember__Group_6__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:941:1: rule__UnionMember__Group_6__1__Impl : ( ( rule__UnionMember__RecordRefAssignment_6_1 ) ) ;
    public final void rule__UnionMember__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:945:1: ( ( ( rule__UnionMember__RecordRefAssignment_6_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:946:1: ( ( rule__UnionMember__RecordRefAssignment_6_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:946:1: ( ( rule__UnionMember__RecordRefAssignment_6_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:947:1: ( rule__UnionMember__RecordRefAssignment_6_1 )
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:948:1: ( rule__UnionMember__RecordRefAssignment_6_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:948:2: rule__UnionMember__RecordRefAssignment_6_1
            {
            pushFollow(FOLLOW_rule__UnionMember__RecordRefAssignment_6_1_in_rule__UnionMember__Group_6__1__Impl2032);
            rule__UnionMember__RecordRefAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__1__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:958:1: rule__UnionMember__Group_6__2 : rule__UnionMember__Group_6__2__Impl ;
    public final void rule__UnionMember__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:962:1: ( rule__UnionMember__Group_6__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:963:2: rule__UnionMember__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__UnionMember__Group_6__2__Impl_in_rule__UnionMember__Group_6__22062);
            rule__UnionMember__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__2"


    // $ANTLR start "rule__UnionMember__Group_6__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:969:1: rule__UnionMember__Group_6__2__Impl : ( '\"' ) ;
    public final void rule__UnionMember__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:973:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:974:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:974:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:975:1: '\"'
            {
             before(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2()); 
            match(input,22,FOLLOW_22_in_rule__UnionMember__Group_6__2__Impl2090); 
             after(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__2__Impl"


    // $ANTLR start "rule__JsonType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:994:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:998:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:999:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__02127);
            rule__JsonType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__02130);
            rule__JsonType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__0"


    // $ANTLR start "rule__JsonType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1006:1: rule__JsonType__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1010:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1011:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1011:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1012:1: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__0__Impl2158); 
             after(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__0__Impl"


    // $ANTLR start "rule__JsonType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1025:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1029:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1030:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__12189);
            rule__JsonType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__12192);
            rule__JsonType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__1"


    // $ANTLR start "rule__JsonType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1037:1: rule__JsonType__Group__1__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1041:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1042:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1042:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1043:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__1__Impl2220); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__1__Impl"


    // $ANTLR start "rule__JsonType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1056:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl rule__JsonType__Group__3 ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1060:1: ( rule__JsonType__Group__2__Impl rule__JsonType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1061:2: rule__JsonType__Group__2__Impl rule__JsonType__Group__3
            {
            pushFollow(FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22251);
            rule__JsonType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22254);
            rule__JsonType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__2"


    // $ANTLR start "rule__JsonType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1068:1: rule__JsonType__Group__2__Impl : ( 'type' ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1072:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1073:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1073:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1074:1: 'type'
            {
             before(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__JsonType__Group__2__Impl2282); 
             after(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__2__Impl"


    // $ANTLR start "rule__JsonType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1087:1: rule__JsonType__Group__3 : rule__JsonType__Group__3__Impl rule__JsonType__Group__4 ;
    public final void rule__JsonType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1091:1: ( rule__JsonType__Group__3__Impl rule__JsonType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1092:2: rule__JsonType__Group__3__Impl rule__JsonType__Group__4
            {
            pushFollow(FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32313);
            rule__JsonType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32316);
            rule__JsonType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__3"


    // $ANTLR start "rule__JsonType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1099:1: rule__JsonType__Group__3__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1103:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1104:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1104:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1105:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__3__Impl2344); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__3__Impl"


    // $ANTLR start "rule__JsonType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1118:1: rule__JsonType__Group__4 : rule__JsonType__Group__4__Impl rule__JsonType__Group__5 ;
    public final void rule__JsonType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1122:1: ( rule__JsonType__Group__4__Impl rule__JsonType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1123:2: rule__JsonType__Group__4__Impl rule__JsonType__Group__5
            {
            pushFollow(FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42375);
            rule__JsonType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42378);
            rule__JsonType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__4"


    // $ANTLR start "rule__JsonType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1130:1: rule__JsonType__Group__4__Impl : ( ':' ) ;
    public final void rule__JsonType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1134:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1135:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1135:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1136:1: ':'
            {
             before(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__JsonType__Group__4__Impl2406); 
             after(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__4__Impl"


    // $ANTLR start "rule__JsonType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1149:1: rule__JsonType__Group__5 : rule__JsonType__Group__5__Impl rule__JsonType__Group__6 ;
    public final void rule__JsonType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1153:1: ( rule__JsonType__Group__5__Impl rule__JsonType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1154:2: rule__JsonType__Group__5__Impl rule__JsonType__Group__6
            {
            pushFollow(FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52437);
            rule__JsonType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52440);
            rule__JsonType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__5"


    // $ANTLR start "rule__JsonType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1161:1: rule__JsonType__Group__5__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1165:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1166:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1166:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1167:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__5__Impl2468); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__5__Impl"


    // $ANTLR start "rule__JsonType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1180:1: rule__JsonType__Group__6 : rule__JsonType__Group__6__Impl rule__JsonType__Group__7 ;
    public final void rule__JsonType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1184:1: ( rule__JsonType__Group__6__Impl rule__JsonType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1185:2: rule__JsonType__Group__6__Impl rule__JsonType__Group__7
            {
            pushFollow(FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62499);
            rule__JsonType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62502);
            rule__JsonType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__6"


    // $ANTLR start "rule__JsonType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1192:1: rule__JsonType__Group__6__Impl : ( ( rule__JsonType__TypeAssignment_6 ) ) ;
    public final void rule__JsonType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1196:1: ( ( ( rule__JsonType__TypeAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1197:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1197:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1198:1: ( rule__JsonType__TypeAssignment_6 )
            {
             before(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1199:1: ( rule__JsonType__TypeAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1199:2: rule__JsonType__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2529);
            rule__JsonType__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__6__Impl"


    // $ANTLR start "rule__JsonType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1209:1: rule__JsonType__Group__7 : rule__JsonType__Group__7__Impl rule__JsonType__Group__8 ;
    public final void rule__JsonType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1213:1: ( rule__JsonType__Group__7__Impl rule__JsonType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1214:2: rule__JsonType__Group__7__Impl rule__JsonType__Group__8
            {
            pushFollow(FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72559);
            rule__JsonType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72562);
            rule__JsonType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__7"


    // $ANTLR start "rule__JsonType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1221:1: rule__JsonType__Group__7__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1225:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1226:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1226:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1227:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__7__Impl2590); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__7__Impl"


    // $ANTLR start "rule__JsonType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1240:1: rule__JsonType__Group__8 : rule__JsonType__Group__8__Impl ;
    public final void rule__JsonType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1244:1: ( rule__JsonType__Group__8__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1245:2: rule__JsonType__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82621);
            rule__JsonType__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__8"


    // $ANTLR start "rule__JsonType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1251:1: rule__JsonType__Group__8__Impl : ( '}' ) ;
    public final void rule__JsonType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1255:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1256:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1256:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1257:1: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__JsonType__Group__8__Impl2649); 
             after(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1288:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1292:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1293:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02698);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02701);
            rule__RecordType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1300:1: rule__RecordType__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1304:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1305:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1305:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1306:1: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__0__Impl2729); 
             after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1319:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1323:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1324:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12760);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12763);
            rule__RecordType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1331:1: rule__RecordType__Group__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1335:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1336:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1336:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1337:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__1__Impl2791); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1350:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1354:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1355:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22822);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22825);
            rule__RecordType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1362:1: rule__RecordType__Group__2__Impl : ( 'type' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1366:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1367:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1367:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1368:1: 'type'
            {
             before(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__RecordType__Group__2__Impl2853); 
             after(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1381:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1385:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1386:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32884);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32887);
            rule__RecordType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1393:1: rule__RecordType__Group__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1397:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1398:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1398:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1399:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__3__Impl2915); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1412:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1416:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1417:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__42946);
            rule__RecordType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__42949);
            rule__RecordType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1424:1: rule__RecordType__Group__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1428:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1429:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1429:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1430:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__4__Impl2977); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1443:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1447:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1448:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53008);
            rule__RecordType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53011);
            rule__RecordType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5"


    // $ANTLR start "rule__RecordType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1455:1: rule__RecordType__Group__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1459:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1460:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1460:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1461:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__5__Impl3039); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5__Impl"


    // $ANTLR start "rule__RecordType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1474:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1478:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1479:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63070);
            rule__RecordType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63073);
            rule__RecordType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6"


    // $ANTLR start "rule__RecordType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1486:1: rule__RecordType__Group__6__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1490:1: ( ( 'record' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1491:1: ( 'record' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1491:1: ( 'record' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1492:1: 'record'
            {
             before(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__RecordType__Group__6__Impl3101); 
             after(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6__Impl"


    // $ANTLR start "rule__RecordType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1505:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl rule__RecordType__Group__8 ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1509:1: ( rule__RecordType__Group__7__Impl rule__RecordType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1510:2: rule__RecordType__Group__7__Impl rule__RecordType__Group__8
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__73132);
            rule__RecordType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__73135);
            rule__RecordType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7"


    // $ANTLR start "rule__RecordType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1517:1: rule__RecordType__Group__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1521:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1522:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1522:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1523:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__7__Impl3163); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7__Impl"


    // $ANTLR start "rule__RecordType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1536:1: rule__RecordType__Group__8 : rule__RecordType__Group__8__Impl rule__RecordType__Group__9 ;
    public final void rule__RecordType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1540:1: ( rule__RecordType__Group__8__Impl rule__RecordType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1541:2: rule__RecordType__Group__8__Impl rule__RecordType__Group__9
            {
            pushFollow(FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__83194);
            rule__RecordType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__83197);
            rule__RecordType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__8"


    // $ANTLR start "rule__RecordType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1548:1: rule__RecordType__Group__8__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1552:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1553:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1553:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1554:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__8__Impl3225); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1567:1: rule__RecordType__Group__9 : rule__RecordType__Group__9__Impl rule__RecordType__Group__10 ;
    public final void rule__RecordType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1571:1: ( rule__RecordType__Group__9__Impl rule__RecordType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1572:2: rule__RecordType__Group__9__Impl rule__RecordType__Group__10
            {
            pushFollow(FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93256);
            rule__RecordType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93259);
            rule__RecordType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__9"


    // $ANTLR start "rule__RecordType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1579:1: rule__RecordType__Group__9__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1583:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1584:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1584:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1585:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__9__Impl3287); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__9__Impl"


    // $ANTLR start "rule__RecordType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1598:1: rule__RecordType__Group__10 : rule__RecordType__Group__10__Impl rule__RecordType__Group__11 ;
    public final void rule__RecordType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1602:1: ( rule__RecordType__Group__10__Impl rule__RecordType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1603:2: rule__RecordType__Group__10__Impl rule__RecordType__Group__11
            {
            pushFollow(FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103318);
            rule__RecordType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103321);
            rule__RecordType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__10"


    // $ANTLR start "rule__RecordType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1610:1: rule__RecordType__Group__10__Impl : ( 'name' ) ;
    public final void rule__RecordType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1614:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1615:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1615:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1616:1: 'name'
            {
             before(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__RecordType__Group__10__Impl3349); 
             after(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__10__Impl"


    // $ANTLR start "rule__RecordType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1629:1: rule__RecordType__Group__11 : rule__RecordType__Group__11__Impl rule__RecordType__Group__12 ;
    public final void rule__RecordType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1633:1: ( rule__RecordType__Group__11__Impl rule__RecordType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1634:2: rule__RecordType__Group__11__Impl rule__RecordType__Group__12
            {
            pushFollow(FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113380);
            rule__RecordType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113383);
            rule__RecordType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__11"


    // $ANTLR start "rule__RecordType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1641:1: rule__RecordType__Group__11__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1645:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1646:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1646:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1647:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__11__Impl3411); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__11__Impl"


    // $ANTLR start "rule__RecordType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1660:1: rule__RecordType__Group__12 : rule__RecordType__Group__12__Impl rule__RecordType__Group__13 ;
    public final void rule__RecordType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1664:1: ( rule__RecordType__Group__12__Impl rule__RecordType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1665:2: rule__RecordType__Group__12__Impl rule__RecordType__Group__13
            {
            pushFollow(FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123442);
            rule__RecordType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123445);
            rule__RecordType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__12"


    // $ANTLR start "rule__RecordType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1672:1: rule__RecordType__Group__12__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1676:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1677:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1677:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1678:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__12__Impl3473); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__12__Impl"


    // $ANTLR start "rule__RecordType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1691:1: rule__RecordType__Group__13 : rule__RecordType__Group__13__Impl rule__RecordType__Group__14 ;
    public final void rule__RecordType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1695:1: ( rule__RecordType__Group__13__Impl rule__RecordType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1696:2: rule__RecordType__Group__13__Impl rule__RecordType__Group__14
            {
            pushFollow(FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133504);
            rule__RecordType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133507);
            rule__RecordType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__13"


    // $ANTLR start "rule__RecordType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1703:1: rule__RecordType__Group__13__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1707:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1708:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1708:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1709:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__13__Impl3535); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__13__Impl"


    // $ANTLR start "rule__RecordType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1722:1: rule__RecordType__Group__14 : rule__RecordType__Group__14__Impl rule__RecordType__Group__15 ;
    public final void rule__RecordType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1726:1: ( rule__RecordType__Group__14__Impl rule__RecordType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1727:2: rule__RecordType__Group__14__Impl rule__RecordType__Group__15
            {
            pushFollow(FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143566);
            rule__RecordType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143569);
            rule__RecordType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__14"


    // $ANTLR start "rule__RecordType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1734:1: rule__RecordType__Group__14__Impl : ( ( rule__RecordType__NameAssignment_14 ) ) ;
    public final void rule__RecordType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1738:1: ( ( ( rule__RecordType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1739:1: ( ( rule__RecordType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1739:1: ( ( rule__RecordType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1740:1: ( rule__RecordType__NameAssignment_14 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1741:1: ( rule__RecordType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1741:2: rule__RecordType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3596);
            rule__RecordType__NameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__14__Impl"


    // $ANTLR start "rule__RecordType__Group__15"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1751:1: rule__RecordType__Group__15 : rule__RecordType__Group__15__Impl rule__RecordType__Group__16 ;
    public final void rule__RecordType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1755:1: ( rule__RecordType__Group__15__Impl rule__RecordType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1756:2: rule__RecordType__Group__15__Impl rule__RecordType__Group__16
            {
            pushFollow(FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153626);
            rule__RecordType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153629);
            rule__RecordType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__15"


    // $ANTLR start "rule__RecordType__Group__15__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1763:1: rule__RecordType__Group__15__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1767:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1768:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1768:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1769:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__15__Impl3657); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__15__Impl"


    // $ANTLR start "rule__RecordType__Group__16"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1782:1: rule__RecordType__Group__16 : rule__RecordType__Group__16__Impl rule__RecordType__Group__17 ;
    public final void rule__RecordType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1786:1: ( rule__RecordType__Group__16__Impl rule__RecordType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1787:2: rule__RecordType__Group__16__Impl rule__RecordType__Group__17
            {
            pushFollow(FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163688);
            rule__RecordType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163691);
            rule__RecordType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__16"


    // $ANTLR start "rule__RecordType__Group__16__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1794:1: rule__RecordType__Group__16__Impl : ( ( rule__RecordType__Group_16__0 )? ) ;
    public final void rule__RecordType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1798:1: ( ( ( rule__RecordType__Group_16__0 )? ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1799:1: ( ( rule__RecordType__Group_16__0 )? )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1799:1: ( ( rule__RecordType__Group_16__0 )? )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1800:1: ( rule__RecordType__Group_16__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_16()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1801:1: ( rule__RecordType__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==22) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1801:2: rule__RecordType__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3718);
                    rule__RecordType__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordTypeAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__16__Impl"


    // $ANTLR start "rule__RecordType__Group__17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1811:1: rule__RecordType__Group__17 : rule__RecordType__Group__17__Impl rule__RecordType__Group__18 ;
    public final void rule__RecordType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1815:1: ( rule__RecordType__Group__17__Impl rule__RecordType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1816:2: rule__RecordType__Group__17__Impl rule__RecordType__Group__18
            {
            pushFollow(FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173749);
            rule__RecordType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173752);
            rule__RecordType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__17"


    // $ANTLR start "rule__RecordType__Group__17__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1823:1: rule__RecordType__Group__17__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1827:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1828:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1828:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1829:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__17__Impl3780); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__17__Impl"


    // $ANTLR start "rule__RecordType__Group__18"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1842:1: rule__RecordType__Group__18 : rule__RecordType__Group__18__Impl rule__RecordType__Group__19 ;
    public final void rule__RecordType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1846:1: ( rule__RecordType__Group__18__Impl rule__RecordType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1847:2: rule__RecordType__Group__18__Impl rule__RecordType__Group__19
            {
            pushFollow(FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183811);
            rule__RecordType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183814);
            rule__RecordType__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__18"


    // $ANTLR start "rule__RecordType__Group__18__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1854:1: rule__RecordType__Group__18__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1858:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1859:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1859:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1860:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__18__Impl3842); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__18__Impl"


    // $ANTLR start "rule__RecordType__Group__19"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1873:1: rule__RecordType__Group__19 : rule__RecordType__Group__19__Impl rule__RecordType__Group__20 ;
    public final void rule__RecordType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1877:1: ( rule__RecordType__Group__19__Impl rule__RecordType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1878:2: rule__RecordType__Group__19__Impl rule__RecordType__Group__20
            {
            pushFollow(FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193873);
            rule__RecordType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193876);
            rule__RecordType__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__19"


    // $ANTLR start "rule__RecordType__Group__19__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1885:1: rule__RecordType__Group__19__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1889:1: ( ( 'fields' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1890:1: ( 'fields' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1890:1: ( 'fields' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1891:1: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 
            match(input,28,FOLLOW_28_in_rule__RecordType__Group__19__Impl3904); 
             after(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__19__Impl"


    // $ANTLR start "rule__RecordType__Group__20"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1904:1: rule__RecordType__Group__20 : rule__RecordType__Group__20__Impl rule__RecordType__Group__21 ;
    public final void rule__RecordType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1908:1: ( rule__RecordType__Group__20__Impl rule__RecordType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1909:2: rule__RecordType__Group__20__Impl rule__RecordType__Group__21
            {
            pushFollow(FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203935);
            rule__RecordType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203938);
            rule__RecordType__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__20"


    // $ANTLR start "rule__RecordType__Group__20__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1916:1: rule__RecordType__Group__20__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1920:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1921:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1921:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1922:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__20__Impl3966); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__20__Impl"


    // $ANTLR start "rule__RecordType__Group__21"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1935:1: rule__RecordType__Group__21 : rule__RecordType__Group__21__Impl rule__RecordType__Group__22 ;
    public final void rule__RecordType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1939:1: ( rule__RecordType__Group__21__Impl rule__RecordType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1940:2: rule__RecordType__Group__21__Impl rule__RecordType__Group__22
            {
            pushFollow(FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__213997);
            rule__RecordType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__214000);
            rule__RecordType__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__21"


    // $ANTLR start "rule__RecordType__Group__21__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1947:1: rule__RecordType__Group__21__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1951:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1952:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1952:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1953:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__21__Impl4028); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__21__Impl"


    // $ANTLR start "rule__RecordType__Group__22"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1966:1: rule__RecordType__Group__22 : rule__RecordType__Group__22__Impl rule__RecordType__Group__23 ;
    public final void rule__RecordType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1970:1: ( rule__RecordType__Group__22__Impl rule__RecordType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1971:2: rule__RecordType__Group__22__Impl rule__RecordType__Group__23
            {
            pushFollow(FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__224059);
            rule__RecordType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__224062);
            rule__RecordType__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__22"


    // $ANTLR start "rule__RecordType__Group__22__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1978:1: rule__RecordType__Group__22__Impl : ( '[' ) ;
    public final void rule__RecordType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1982:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1983:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1983:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1984:1: '['
            {
             before(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 
            match(input,19,FOLLOW_19_in_rule__RecordType__Group__22__Impl4090); 
             after(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__22__Impl"


    // $ANTLR start "rule__RecordType__Group__23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1997:1: rule__RecordType__Group__23 : rule__RecordType__Group__23__Impl rule__RecordType__Group__24 ;
    public final void rule__RecordType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2001:1: ( rule__RecordType__Group__23__Impl rule__RecordType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2002:2: rule__RecordType__Group__23__Impl rule__RecordType__Group__24
            {
            pushFollow(FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__234121);
            rule__RecordType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__234124);
            rule__RecordType__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__23"


    // $ANTLR start "rule__RecordType__Group__23__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2009:1: rule__RecordType__Group__23__Impl : ( ( rule__RecordType__FieldsAssignment_23 ) ) ;
    public final void rule__RecordType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2013:1: ( ( ( rule__RecordType__FieldsAssignment_23 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2014:1: ( ( rule__RecordType__FieldsAssignment_23 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2014:1: ( ( rule__RecordType__FieldsAssignment_23 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2015:1: ( rule__RecordType__FieldsAssignment_23 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2016:1: ( rule__RecordType__FieldsAssignment_23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2016:2: rule__RecordType__FieldsAssignment_23
            {
            pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_23_in_rule__RecordType__Group__23__Impl4151);
            rule__RecordType__FieldsAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__23__Impl"


    // $ANTLR start "rule__RecordType__Group__24"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2026:1: rule__RecordType__Group__24 : rule__RecordType__Group__24__Impl rule__RecordType__Group__25 ;
    public final void rule__RecordType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2030:1: ( rule__RecordType__Group__24__Impl rule__RecordType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2031:2: rule__RecordType__Group__24__Impl rule__RecordType__Group__25
            {
            pushFollow(FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__244181);
            rule__RecordType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__244184);
            rule__RecordType__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__24"


    // $ANTLR start "rule__RecordType__Group__24__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2038:1: rule__RecordType__Group__24__Impl : ( ( rule__RecordType__Group_24__0 )* ) ;
    public final void rule__RecordType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2042:1: ( ( ( rule__RecordType__Group_24__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2043:1: ( ( rule__RecordType__Group_24__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2043:1: ( ( rule__RecordType__Group_24__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2044:1: ( rule__RecordType__Group_24__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_24()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2045:1: ( rule__RecordType__Group_24__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2045:2: rule__RecordType__Group_24__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_24__0_in_rule__RecordType__Group__24__Impl4211);
            	    rule__RecordType__Group_24__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRecordTypeAccess().getGroup_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__24__Impl"


    // $ANTLR start "rule__RecordType__Group__25"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2055:1: rule__RecordType__Group__25 : rule__RecordType__Group__25__Impl rule__RecordType__Group__26 ;
    public final void rule__RecordType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2059:1: ( rule__RecordType__Group__25__Impl rule__RecordType__Group__26 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2060:2: rule__RecordType__Group__25__Impl rule__RecordType__Group__26
            {
            pushFollow(FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254242);
            rule__RecordType__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__26_in_rule__RecordType__Group__254245);
            rule__RecordType__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__25"


    // $ANTLR start "rule__RecordType__Group__25__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2067:1: rule__RecordType__Group__25__Impl : ( ']' ) ;
    public final void rule__RecordType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2071:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2072:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2072:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2073:1: ']'
            {
             before(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_25()); 
            match(input,20,FOLLOW_20_in_rule__RecordType__Group__25__Impl4273); 
             after(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__25__Impl"


    // $ANTLR start "rule__RecordType__Group__26"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2086:1: rule__RecordType__Group__26 : rule__RecordType__Group__26__Impl ;
    public final void rule__RecordType__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2090:1: ( rule__RecordType__Group__26__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2091:2: rule__RecordType__Group__26__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__26__Impl_in_rule__RecordType__Group__264304);
            rule__RecordType__Group__26__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__26"


    // $ANTLR start "rule__RecordType__Group__26__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2097:1: rule__RecordType__Group__26__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2101:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2102:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2102:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2103:1: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_26()); 
            match(input,26,FOLLOW_26_in_rule__RecordType__Group__26__Impl4332); 
             after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__26__Impl"


    // $ANTLR start "rule__RecordType__Group_16__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2170:1: rule__RecordType__Group_16__0 : rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 ;
    public final void rule__RecordType__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2174:1: ( rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2175:2: rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04417);
            rule__RecordType__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04420);
            rule__RecordType__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__0"


    // $ANTLR start "rule__RecordType__Group_16__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2182:1: rule__RecordType__Group_16__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2186:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2187:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2187:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2188:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4448); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__0__Impl"


    // $ANTLR start "rule__RecordType__Group_16__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2201:1: rule__RecordType__Group_16__1 : rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 ;
    public final void rule__RecordType__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2205:1: ( rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2206:2: rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14479);
            rule__RecordType__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14482);
            rule__RecordType__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__1"


    // $ANTLR start "rule__RecordType__Group_16__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2213:1: rule__RecordType__Group_16__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2217:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2218:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2218:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2219:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__1__Impl4510); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__1__Impl"


    // $ANTLR start "rule__RecordType__Group_16__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2232:1: rule__RecordType__Group_16__2 : rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 ;
    public final void rule__RecordType__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2236:1: ( rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2237:2: rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24541);
            rule__RecordType__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24544);
            rule__RecordType__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__2"


    // $ANTLR start "rule__RecordType__Group_16__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2244:1: rule__RecordType__Group_16__2__Impl : ( 'namespace' ) ;
    public final void rule__RecordType__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2248:1: ( ( 'namespace' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2249:1: ( 'namespace' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2249:1: ( 'namespace' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2250:1: 'namespace'
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 
            match(input,29,FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4572); 
             after(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__2__Impl"


    // $ANTLR start "rule__RecordType__Group_16__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2263:1: rule__RecordType__Group_16__3 : rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 ;
    public final void rule__RecordType__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2267:1: ( rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2268:2: rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34603);
            rule__RecordType__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34606);
            rule__RecordType__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__3"


    // $ANTLR start "rule__RecordType__Group_16__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2275:1: rule__RecordType__Group_16__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2279:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2280:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2280:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2281:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__3__Impl4634); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__3__Impl"


    // $ANTLR start "rule__RecordType__Group_16__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2294:1: rule__RecordType__Group_16__4 : rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 ;
    public final void rule__RecordType__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2298:1: ( rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2299:2: rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44665);
            rule__RecordType__Group_16__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44668);
            rule__RecordType__Group_16__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__4"


    // $ANTLR start "rule__RecordType__Group_16__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2306:1: rule__RecordType__Group_16__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2310:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2311:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2311:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2312:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4696); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__4__Impl"


    // $ANTLR start "rule__RecordType__Group_16__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2325:1: rule__RecordType__Group_16__5 : rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 ;
    public final void rule__RecordType__Group_16__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2329:1: ( rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2330:2: rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54727);
            rule__RecordType__Group_16__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54730);
            rule__RecordType__Group_16__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__5"


    // $ANTLR start "rule__RecordType__Group_16__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2337:1: rule__RecordType__Group_16__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2341:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2342:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2342:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2343:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__5__Impl4758); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__5__Impl"


    // $ANTLR start "rule__RecordType__Group_16__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2356:1: rule__RecordType__Group_16__6 : rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 ;
    public final void rule__RecordType__Group_16__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2360:1: ( rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2361:2: rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64789);
            rule__RecordType__Group_16__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64792);
            rule__RecordType__Group_16__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__6"


    // $ANTLR start "rule__RecordType__Group_16__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2368:1: rule__RecordType__Group_16__6__Impl : ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) ;
    public final void rule__RecordType__Group_16__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2372:1: ( ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2373:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2373:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2374:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2375:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2375:2: rule__RecordType__NamespaceAssignment_16_6
            {
            pushFollow(FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4819);
            rule__RecordType__NamespaceAssignment_16_6();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__6__Impl"


    // $ANTLR start "rule__RecordType__Group_16__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2385:1: rule__RecordType__Group_16__7 : rule__RecordType__Group_16__7__Impl ;
    public final void rule__RecordType__Group_16__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2389:1: ( rule__RecordType__Group_16__7__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2390:2: rule__RecordType__Group_16__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74849);
            rule__RecordType__Group_16__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__7"


    // $ANTLR start "rule__RecordType__Group_16__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2396:1: rule__RecordType__Group_16__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2400:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2401:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2401:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2402:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__7__Impl4877); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__7__Impl"


    // $ANTLR start "rule__RecordType__Group_24__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2431:1: rule__RecordType__Group_24__0 : rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1 ;
    public final void rule__RecordType__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2435:1: ( rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2436:2: rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_24__0__Impl_in_rule__RecordType__Group_24__04924);
            rule__RecordType__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_24__1_in_rule__RecordType__Group_24__04927);
            rule__RecordType__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_24__0"


    // $ANTLR start "rule__RecordType__Group_24__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2443:1: rule__RecordType__Group_24__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2447:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2448:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2448:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2449:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_24_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_24__0__Impl4955); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_24__0__Impl"


    // $ANTLR start "rule__RecordType__Group_24__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2462:1: rule__RecordType__Group_24__1 : rule__RecordType__Group_24__1__Impl ;
    public final void rule__RecordType__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2466:1: ( rule__RecordType__Group_24__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2467:2: rule__RecordType__Group_24__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_24__1__Impl_in_rule__RecordType__Group_24__14986);
            rule__RecordType__Group_24__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_24__1"


    // $ANTLR start "rule__RecordType__Group_24__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2473:1: rule__RecordType__Group_24__1__Impl : ( ( rule__RecordType__FieldsAssignment_24_1 ) ) ;
    public final void rule__RecordType__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2477:1: ( ( ( rule__RecordType__FieldsAssignment_24_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2478:1: ( ( rule__RecordType__FieldsAssignment_24_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2478:1: ( ( rule__RecordType__FieldsAssignment_24_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2479:1: ( rule__RecordType__FieldsAssignment_24_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_24_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2480:1: ( rule__RecordType__FieldsAssignment_24_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2480:2: rule__RecordType__FieldsAssignment_24_1
            {
            pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_24_1_in_rule__RecordType__Group_24__1__Impl5013);
            rule__RecordType__FieldsAssignment_24_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_24__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2494:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2498:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2499:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05047);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05050);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2506:1: rule__Field__Group__0__Impl : ( '{' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2510:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2511:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2511:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2512:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__0__Impl5078); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2525:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2529:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2530:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15109);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15112);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2537:1: rule__Field__Group__1__Impl : ( '\"' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2541:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2542:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2542:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2543:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__1__Impl5140); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2556:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2560:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2561:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25171);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25174);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2568:1: rule__Field__Group__2__Impl : ( 'name' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2572:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2573:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2573:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2574:1: 'name'
            {
             before(grammarAccess.getFieldAccess().getNameKeyword_2()); 
            match(input,10,FOLLOW_10_in_rule__Field__Group__2__Impl5202); 
             after(grammarAccess.getFieldAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2587:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2591:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2592:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35233);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35236);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2599:1: rule__Field__Group__3__Impl : ( '\"' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2603:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2604:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2604:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2605:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__3__Impl5264); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2618:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2622:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2623:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45295);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45298);
            rule__Field__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2630:1: rule__Field__Group__4__Impl : ( ':' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2634:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2635:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2635:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2636:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__4__Impl5326); 
             after(grammarAccess.getFieldAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2649:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2653:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2654:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55357);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55360);
            rule__Field__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2661:1: rule__Field__Group__5__Impl : ( '\"' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2665:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2666:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2666:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2667:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__5__Impl5388); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2680:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2684:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2685:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65419);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65422);
            rule__Field__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2692:1: rule__Field__Group__6__Impl : ( ( rule__Field__NameAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2696:1: ( ( ( rule__Field__NameAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2697:1: ( ( rule__Field__NameAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2697:1: ( ( rule__Field__NameAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2698:1: ( rule__Field__NameAssignment_6 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2699:1: ( rule__Field__NameAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2699:2: rule__Field__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5449);
            rule__Field__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2709:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2713:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2714:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75479);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75482);
            rule__Field__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2721:1: rule__Field__Group__7__Impl : ( '\"' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2725:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2726:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2726:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2727:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__7__Impl5510); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2740:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2744:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2745:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85541);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85544);
            rule__Field__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__8"


    // $ANTLR start "rule__Field__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2752:1: rule__Field__Group__8__Impl : ( ',' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2756:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2757:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2757:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2758:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Field__Group__8__Impl5572); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__8__Impl"


    // $ANTLR start "rule__Field__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2771:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2775:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2776:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95603);
            rule__Field__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95606);
            rule__Field__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__9"


    // $ANTLR start "rule__Field__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2783:1: rule__Field__Group__9__Impl : ( '\"' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2787:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2788:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2788:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2789:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__9__Impl5634); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__9__Impl"


    // $ANTLR start "rule__Field__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2802:1: rule__Field__Group__10 : rule__Field__Group__10__Impl rule__Field__Group__11 ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2806:1: ( rule__Field__Group__10__Impl rule__Field__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2807:2: rule__Field__Group__10__Impl rule__Field__Group__11
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105665);
            rule__Field__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105668);
            rule__Field__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__10"


    // $ANTLR start "rule__Field__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2814:1: rule__Field__Group__10__Impl : ( 'type' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2818:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2819:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2819:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2820:1: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_10()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group__10__Impl5696); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__10__Impl"


    // $ANTLR start "rule__Field__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2833:1: rule__Field__Group__11 : rule__Field__Group__11__Impl rule__Field__Group__12 ;
    public final void rule__Field__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2837:1: ( rule__Field__Group__11__Impl rule__Field__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2838:2: rule__Field__Group__11__Impl rule__Field__Group__12
            {
            pushFollow(FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115727);
            rule__Field__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115730);
            rule__Field__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__11"


    // $ANTLR start "rule__Field__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2845:1: rule__Field__Group__11__Impl : ( '\"' ) ;
    public final void rule__Field__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2849:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2850:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2850:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2851:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__11__Impl5758); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__11__Impl"


    // $ANTLR start "rule__Field__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2864:1: rule__Field__Group__12 : rule__Field__Group__12__Impl rule__Field__Group__13 ;
    public final void rule__Field__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2868:1: ( rule__Field__Group__12__Impl rule__Field__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2869:2: rule__Field__Group__12__Impl rule__Field__Group__13
            {
            pushFollow(FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125789);
            rule__Field__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125792);
            rule__Field__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__12"


    // $ANTLR start "rule__Field__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2876:1: rule__Field__Group__12__Impl : ( ':' ) ;
    public final void rule__Field__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2880:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2881:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2881:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2882:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__12__Impl5820); 
             after(grammarAccess.getFieldAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__12__Impl"


    // $ANTLR start "rule__Field__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2895:1: rule__Field__Group__13 : rule__Field__Group__13__Impl rule__Field__Group__14 ;
    public final void rule__Field__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2899:1: ( rule__Field__Group__13__Impl rule__Field__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2900:2: rule__Field__Group__13__Impl rule__Field__Group__14
            {
            pushFollow(FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135851);
            rule__Field__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135854);
            rule__Field__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__13"


    // $ANTLR start "rule__Field__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2907:1: rule__Field__Group__13__Impl : ( ( rule__Field__Alternatives_13 ) ) ;
    public final void rule__Field__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2911:1: ( ( ( rule__Field__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2912:1: ( ( rule__Field__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2912:1: ( ( rule__Field__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2913:1: ( rule__Field__Alternatives_13 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2914:1: ( rule__Field__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2914:2: rule__Field__Alternatives_13
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl5881);
            rule__Field__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__13__Impl"


    // $ANTLR start "rule__Field__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2924:1: rule__Field__Group__14 : rule__Field__Group__14__Impl ;
    public final void rule__Field__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2928:1: ( rule__Field__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2929:2: rule__Field__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__145911);
            rule__Field__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__14"


    // $ANTLR start "rule__Field__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2935:1: rule__Field__Group__14__Impl : ( '}' ) ;
    public final void rule__Field__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2939:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2940:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2940:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2941:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__Field__Group__14__Impl5939); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__14__Impl"


    // $ANTLR start "rule__Field__Group_13_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2984:1: rule__Field__Group_13_2__0 : rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 ;
    public final void rule__Field__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2988:1: ( rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2989:2: rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__06000);
            rule__Field__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__06003);
            rule__Field__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__0"


    // $ANTLR start "rule__Field__Group_13_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2996:1: rule__Field__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3000:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3001:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3001:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3002:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group_13_2__0__Impl6031); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__0__Impl"


    // $ANTLR start "rule__Field__Group_13_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3015:1: rule__Field__Group_13_2__1 : rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 ;
    public final void rule__Field__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3019:1: ( rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3020:2: rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__16062);
            rule__Field__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__16065);
            rule__Field__Group_13_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__1"


    // $ANTLR start "rule__Field__Group_13_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3027:1: rule__Field__Group_13_2__1__Impl : ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__Field__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3031:1: ( ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3032:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3032:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3033:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3034:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3034:2: rule__Field__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl6092);
            rule__Field__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__1__Impl"


    // $ANTLR start "rule__Field__Group_13_2__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3044:1: rule__Field__Group_13_2__2 : rule__Field__Group_13_2__2__Impl ;
    public final void rule__Field__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3048:1: ( rule__Field__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3049:2: rule__Field__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__26122);
            rule__Field__Group_13_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__2"


    // $ANTLR start "rule__Field__Group_13_2__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3055:1: rule__Field__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3059:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3060:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3060:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3061:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group_13_2__2__Impl6150); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__2__Impl"


    // $ANTLR start "rule__EnumType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3080:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3084:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3085:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__06187);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__06190);
            rule__EnumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3092:1: rule__EnumType__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3096:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3097:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3097:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3098:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__0__Impl6218); 
             after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3111:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3115:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3116:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16249);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16252);
            rule__EnumType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3123:1: rule__EnumType__Group__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3127:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3128:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3128:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3129:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__1__Impl6280); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3142:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3146:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3147:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26311);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26314);
            rule__EnumType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3154:1: rule__EnumType__Group__2__Impl : ( 'type' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3158:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3159:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3159:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3160:1: 'type'
            {
             before(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__EnumType__Group__2__Impl6342); 
             after(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3173:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3177:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3178:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36373);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36376);
            rule__EnumType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3185:1: rule__EnumType__Group__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3189:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3190:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3190:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3191:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__3__Impl6404); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3204:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3208:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3209:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46435);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46438);
            rule__EnumType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3216:1: rule__EnumType__Group__4__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3220:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3221:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3221:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3222:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__4__Impl6466); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3235:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3239:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3240:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56497);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56500);
            rule__EnumType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3247:1: rule__EnumType__Group__5__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3251:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3252:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3252:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3253:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__5__Impl6528); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3266:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl rule__EnumType__Group__7 ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3270:1: ( rule__EnumType__Group__6__Impl rule__EnumType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3271:2: rule__EnumType__Group__6__Impl rule__EnumType__Group__7
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66559);
            rule__EnumType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66562);
            rule__EnumType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6"


    // $ANTLR start "rule__EnumType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3278:1: rule__EnumType__Group__6__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3282:1: ( ( 'enum' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3283:1: ( 'enum' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3283:1: ( 'enum' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3284:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EnumType__Group__6__Impl6590); 
             after(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6__Impl"


    // $ANTLR start "rule__EnumType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3297:1: rule__EnumType__Group__7 : rule__EnumType__Group__7__Impl rule__EnumType__Group__8 ;
    public final void rule__EnumType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3301:1: ( rule__EnumType__Group__7__Impl rule__EnumType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3302:2: rule__EnumType__Group__7__Impl rule__EnumType__Group__8
            {
            pushFollow(FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76621);
            rule__EnumType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76624);
            rule__EnumType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__7"


    // $ANTLR start "rule__EnumType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3309:1: rule__EnumType__Group__7__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3313:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3314:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3314:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3315:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__7__Impl6652); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__7__Impl"


    // $ANTLR start "rule__EnumType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3328:1: rule__EnumType__Group__8 : rule__EnumType__Group__8__Impl rule__EnumType__Group__9 ;
    public final void rule__EnumType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3332:1: ( rule__EnumType__Group__8__Impl rule__EnumType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3333:2: rule__EnumType__Group__8__Impl rule__EnumType__Group__9
            {
            pushFollow(FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86683);
            rule__EnumType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86686);
            rule__EnumType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__8"


    // $ANTLR start "rule__EnumType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3340:1: rule__EnumType__Group__8__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3344:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3345:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3345:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3346:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__8__Impl6714); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__8__Impl"


    // $ANTLR start "rule__EnumType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3359:1: rule__EnumType__Group__9 : rule__EnumType__Group__9__Impl rule__EnumType__Group__10 ;
    public final void rule__EnumType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3363:1: ( rule__EnumType__Group__9__Impl rule__EnumType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3364:2: rule__EnumType__Group__9__Impl rule__EnumType__Group__10
            {
            pushFollow(FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96745);
            rule__EnumType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96748);
            rule__EnumType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__9"


    // $ANTLR start "rule__EnumType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3371:1: rule__EnumType__Group__9__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3375:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3376:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3376:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3377:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__9__Impl6776); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__9__Impl"


    // $ANTLR start "rule__EnumType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3390:1: rule__EnumType__Group__10 : rule__EnumType__Group__10__Impl rule__EnumType__Group__11 ;
    public final void rule__EnumType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3394:1: ( rule__EnumType__Group__10__Impl rule__EnumType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3395:2: rule__EnumType__Group__10__Impl rule__EnumType__Group__11
            {
            pushFollow(FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106807);
            rule__EnumType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106810);
            rule__EnumType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__10"


    // $ANTLR start "rule__EnumType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3402:1: rule__EnumType__Group__10__Impl : ( 'name' ) ;
    public final void rule__EnumType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3406:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3407:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3407:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3408:1: 'name'
            {
             before(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__EnumType__Group__10__Impl6838); 
             after(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__10__Impl"


    // $ANTLR start "rule__EnumType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3421:1: rule__EnumType__Group__11 : rule__EnumType__Group__11__Impl rule__EnumType__Group__12 ;
    public final void rule__EnumType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3425:1: ( rule__EnumType__Group__11__Impl rule__EnumType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3426:2: rule__EnumType__Group__11__Impl rule__EnumType__Group__12
            {
            pushFollow(FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116869);
            rule__EnumType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116872);
            rule__EnumType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__11"


    // $ANTLR start "rule__EnumType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3433:1: rule__EnumType__Group__11__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3437:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3438:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3438:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3439:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__11__Impl6900); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__11__Impl"


    // $ANTLR start "rule__EnumType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3452:1: rule__EnumType__Group__12 : rule__EnumType__Group__12__Impl rule__EnumType__Group__13 ;
    public final void rule__EnumType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3456:1: ( rule__EnumType__Group__12__Impl rule__EnumType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3457:2: rule__EnumType__Group__12__Impl rule__EnumType__Group__13
            {
            pushFollow(FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__126931);
            rule__EnumType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__126934);
            rule__EnumType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__12"


    // $ANTLR start "rule__EnumType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3464:1: rule__EnumType__Group__12__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3468:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3469:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3469:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3470:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__12__Impl6962); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__12__Impl"


    // $ANTLR start "rule__EnumType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3483:1: rule__EnumType__Group__13 : rule__EnumType__Group__13__Impl rule__EnumType__Group__14 ;
    public final void rule__EnumType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3487:1: ( rule__EnumType__Group__13__Impl rule__EnumType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3488:2: rule__EnumType__Group__13__Impl rule__EnumType__Group__14
            {
            pushFollow(FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__136993);
            rule__EnumType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__136996);
            rule__EnumType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__13"


    // $ANTLR start "rule__EnumType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3495:1: rule__EnumType__Group__13__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3499:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3500:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3500:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3501:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__13__Impl7024); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__13__Impl"


    // $ANTLR start "rule__EnumType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3514:1: rule__EnumType__Group__14 : rule__EnumType__Group__14__Impl rule__EnumType__Group__15 ;
    public final void rule__EnumType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3518:1: ( rule__EnumType__Group__14__Impl rule__EnumType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3519:2: rule__EnumType__Group__14__Impl rule__EnumType__Group__15
            {
            pushFollow(FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__147055);
            rule__EnumType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__147058);
            rule__EnumType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__14"


    // $ANTLR start "rule__EnumType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3526:1: rule__EnumType__Group__14__Impl : ( ( rule__EnumType__NameAssignment_14 ) ) ;
    public final void rule__EnumType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3530:1: ( ( ( rule__EnumType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3531:1: ( ( rule__EnumType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3531:1: ( ( rule__EnumType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3532:1: ( rule__EnumType__NameAssignment_14 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3533:1: ( rule__EnumType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3533:2: rule__EnumType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl7085);
            rule__EnumType__NameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__14__Impl"


    // $ANTLR start "rule__EnumType__Group__15"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3543:1: rule__EnumType__Group__15 : rule__EnumType__Group__15__Impl rule__EnumType__Group__16 ;
    public final void rule__EnumType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3547:1: ( rule__EnumType__Group__15__Impl rule__EnumType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3548:2: rule__EnumType__Group__15__Impl rule__EnumType__Group__16
            {
            pushFollow(FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__157115);
            rule__EnumType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__157118);
            rule__EnumType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__15"


    // $ANTLR start "rule__EnumType__Group__15__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3555:1: rule__EnumType__Group__15__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3559:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3560:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3560:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3561:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__15__Impl7146); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__15__Impl"


    // $ANTLR start "rule__EnumType__Group__16"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3574:1: rule__EnumType__Group__16 : rule__EnumType__Group__16__Impl rule__EnumType__Group__17 ;
    public final void rule__EnumType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3578:1: ( rule__EnumType__Group__16__Impl rule__EnumType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3579:2: rule__EnumType__Group__16__Impl rule__EnumType__Group__17
            {
            pushFollow(FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__167177);
            rule__EnumType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__167180);
            rule__EnumType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__16"


    // $ANTLR start "rule__EnumType__Group__16__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3586:1: rule__EnumType__Group__16__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3590:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3591:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3591:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3592:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__16__Impl7208); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__16__Impl"


    // $ANTLR start "rule__EnumType__Group__17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3605:1: rule__EnumType__Group__17 : rule__EnumType__Group__17__Impl rule__EnumType__Group__18 ;
    public final void rule__EnumType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3609:1: ( rule__EnumType__Group__17__Impl rule__EnumType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3610:2: rule__EnumType__Group__17__Impl rule__EnumType__Group__18
            {
            pushFollow(FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177239);
            rule__EnumType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177242);
            rule__EnumType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__17"


    // $ANTLR start "rule__EnumType__Group__17__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3617:1: rule__EnumType__Group__17__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3621:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3622:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3622:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3623:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__17__Impl7270); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__17__Impl"


    // $ANTLR start "rule__EnumType__Group__18"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3636:1: rule__EnumType__Group__18 : rule__EnumType__Group__18__Impl rule__EnumType__Group__19 ;
    public final void rule__EnumType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3640:1: ( rule__EnumType__Group__18__Impl rule__EnumType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3641:2: rule__EnumType__Group__18__Impl rule__EnumType__Group__19
            {
            pushFollow(FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187301);
            rule__EnumType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187304);
            rule__EnumType__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__18"


    // $ANTLR start "rule__EnumType__Group__18__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3648:1: rule__EnumType__Group__18__Impl : ( 'symbols' ) ;
    public final void rule__EnumType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3652:1: ( ( 'symbols' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3653:1: ( 'symbols' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3653:1: ( 'symbols' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3654:1: 'symbols'
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 
            match(input,31,FOLLOW_31_in_rule__EnumType__Group__18__Impl7332); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__18__Impl"


    // $ANTLR start "rule__EnumType__Group__19"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3667:1: rule__EnumType__Group__19 : rule__EnumType__Group__19__Impl rule__EnumType__Group__20 ;
    public final void rule__EnumType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3671:1: ( rule__EnumType__Group__19__Impl rule__EnumType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3672:2: rule__EnumType__Group__19__Impl rule__EnumType__Group__20
            {
            pushFollow(FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197363);
            rule__EnumType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197366);
            rule__EnumType__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__19"


    // $ANTLR start "rule__EnumType__Group__19__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3679:1: rule__EnumType__Group__19__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3683:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3684:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3684:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3685:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__19__Impl7394); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__19__Impl"


    // $ANTLR start "rule__EnumType__Group__20"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3698:1: rule__EnumType__Group__20 : rule__EnumType__Group__20__Impl rule__EnumType__Group__21 ;
    public final void rule__EnumType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3702:1: ( rule__EnumType__Group__20__Impl rule__EnumType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3703:2: rule__EnumType__Group__20__Impl rule__EnumType__Group__21
            {
            pushFollow(FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207425);
            rule__EnumType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207428);
            rule__EnumType__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__20"


    // $ANTLR start "rule__EnumType__Group__20__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3710:1: rule__EnumType__Group__20__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3714:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3715:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3715:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3716:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__20__Impl7456); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__20__Impl"


    // $ANTLR start "rule__EnumType__Group__21"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3729:1: rule__EnumType__Group__21 : rule__EnumType__Group__21__Impl rule__EnumType__Group__22 ;
    public final void rule__EnumType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3733:1: ( rule__EnumType__Group__21__Impl rule__EnumType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3734:2: rule__EnumType__Group__21__Impl rule__EnumType__Group__22
            {
            pushFollow(FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217487);
            rule__EnumType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217490);
            rule__EnumType__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__21"


    // $ANTLR start "rule__EnumType__Group__21__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3741:1: rule__EnumType__Group__21__Impl : ( '[' ) ;
    public final void rule__EnumType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3745:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3746:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3746:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3747:1: '['
            {
             before(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 
            match(input,19,FOLLOW_19_in_rule__EnumType__Group__21__Impl7518); 
             after(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__21__Impl"


    // $ANTLR start "rule__EnumType__Group__22"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3760:1: rule__EnumType__Group__22 : rule__EnumType__Group__22__Impl rule__EnumType__Group__23 ;
    public final void rule__EnumType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3764:1: ( rule__EnumType__Group__22__Impl rule__EnumType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3765:2: rule__EnumType__Group__22__Impl rule__EnumType__Group__23
            {
            pushFollow(FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227549);
            rule__EnumType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227552);
            rule__EnumType__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__22"


    // $ANTLR start "rule__EnumType__Group__22__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3772:1: rule__EnumType__Group__22__Impl : ( ( rule__EnumType__Group_22__0 ) ) ;
    public final void rule__EnumType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3776:1: ( ( ( rule__EnumType__Group_22__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3777:1: ( ( rule__EnumType__Group_22__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3777:1: ( ( rule__EnumType__Group_22__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3778:1: ( rule__EnumType__Group_22__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_22()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3779:1: ( rule__EnumType__Group_22__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3779:2: rule__EnumType__Group_22__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7579);
            rule__EnumType__Group_22__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__22__Impl"


    // $ANTLR start "rule__EnumType__Group__23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3789:1: rule__EnumType__Group__23 : rule__EnumType__Group__23__Impl rule__EnumType__Group__24 ;
    public final void rule__EnumType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3793:1: ( rule__EnumType__Group__23__Impl rule__EnumType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3794:2: rule__EnumType__Group__23__Impl rule__EnumType__Group__24
            {
            pushFollow(FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237609);
            rule__EnumType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237612);
            rule__EnumType__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__23"


    // $ANTLR start "rule__EnumType__Group__23__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3801:1: rule__EnumType__Group__23__Impl : ( ( rule__EnumType__Group_23__0 )* ) ;
    public final void rule__EnumType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3805:1: ( ( ( rule__EnumType__Group_23__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3806:1: ( ( rule__EnumType__Group_23__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3806:1: ( ( rule__EnumType__Group_23__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3807:1: ( rule__EnumType__Group_23__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3808:1: ( rule__EnumType__Group_23__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3808:2: rule__EnumType__Group_23__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7639);
            	    rule__EnumType__Group_23__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getGroup_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__23__Impl"


    // $ANTLR start "rule__EnumType__Group__24"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3818:1: rule__EnumType__Group__24 : rule__EnumType__Group__24__Impl rule__EnumType__Group__25 ;
    public final void rule__EnumType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3822:1: ( rule__EnumType__Group__24__Impl rule__EnumType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3823:2: rule__EnumType__Group__24__Impl rule__EnumType__Group__25
            {
            pushFollow(FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247670);
            rule__EnumType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247673);
            rule__EnumType__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__24"


    // $ANTLR start "rule__EnumType__Group__24__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3830:1: rule__EnumType__Group__24__Impl : ( ']' ) ;
    public final void rule__EnumType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3834:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3835:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3835:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3836:1: ']'
            {
             before(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_20_in_rule__EnumType__Group__24__Impl7701); 
             after(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__24__Impl"


    // $ANTLR start "rule__EnumType__Group__25"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3849:1: rule__EnumType__Group__25 : rule__EnumType__Group__25__Impl ;
    public final void rule__EnumType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3853:1: ( rule__EnumType__Group__25__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3854:2: rule__EnumType__Group__25__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257732);
            rule__EnumType__Group__25__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__25"


    // $ANTLR start "rule__EnumType__Group__25__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3860:1: rule__EnumType__Group__25__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3864:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3865:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3865:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3866:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_26_in_rule__EnumType__Group__25__Impl7760); 
             after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__25__Impl"


    // $ANTLR start "rule__EnumType__Group_22__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3931:1: rule__EnumType__Group_22__0 : rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 ;
    public final void rule__EnumType__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3935:1: ( rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3936:2: rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07843);
            rule__EnumType__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07846);
            rule__EnumType__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__0"


    // $ANTLR start "rule__EnumType__Group_22__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3943:1: rule__EnumType__Group_22__0__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3947:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3948:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3948:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3949:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_22__0__Impl7874); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__0__Impl"


    // $ANTLR start "rule__EnumType__Group_22__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3962:1: rule__EnumType__Group_22__1 : rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 ;
    public final void rule__EnumType__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3966:1: ( rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3967:2: rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__17905);
            rule__EnumType__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__17908);
            rule__EnumType__Group_22__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__1"


    // $ANTLR start "rule__EnumType__Group_22__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3974:1: rule__EnumType__Group_22__1__Impl : ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) ;
    public final void rule__EnumType__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3978:1: ( ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3979:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3979:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3980:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3981:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3981:2: rule__EnumType__SymbolsAssignment_22_1
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl7935);
            rule__EnumType__SymbolsAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__1__Impl"


    // $ANTLR start "rule__EnumType__Group_22__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3991:1: rule__EnumType__Group_22__2 : rule__EnumType__Group_22__2__Impl ;
    public final void rule__EnumType__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3995:1: ( rule__EnumType__Group_22__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3996:2: rule__EnumType__Group_22__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__27965);
            rule__EnumType__Group_22__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__2"


    // $ANTLR start "rule__EnumType__Group_22__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4002:1: rule__EnumType__Group_22__2__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4006:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4007:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4007:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4008:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_22__2__Impl7993); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__2__Impl"


    // $ANTLR start "rule__EnumType__Group_23__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4027:1: rule__EnumType__Group_23__0 : rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 ;
    public final void rule__EnumType__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4031:1: ( rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4032:2: rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__08030);
            rule__EnumType__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__08033);
            rule__EnumType__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__0"


    // $ANTLR start "rule__EnumType__Group_23__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4039:1: rule__EnumType__Group_23__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4043:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4044:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4044:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4045:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group_23__0__Impl8061); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__0__Impl"


    // $ANTLR start "rule__EnumType__Group_23__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4058:1: rule__EnumType__Group_23__1 : rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 ;
    public final void rule__EnumType__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4062:1: ( rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4063:2: rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__18092);
            rule__EnumType__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__18095);
            rule__EnumType__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__1"


    // $ANTLR start "rule__EnumType__Group_23__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4070:1: rule__EnumType__Group_23__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4074:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4075:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4075:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4076:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_23__1__Impl8123); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__1__Impl"


    // $ANTLR start "rule__EnumType__Group_23__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4089:1: rule__EnumType__Group_23__2 : rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 ;
    public final void rule__EnumType__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4093:1: ( rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4094:2: rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__28154);
            rule__EnumType__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__28157);
            rule__EnumType__Group_23__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__2"


    // $ANTLR start "rule__EnumType__Group_23__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4101:1: rule__EnumType__Group_23__2__Impl : ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) ;
    public final void rule__EnumType__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4105:1: ( ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4106:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4106:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4107:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4108:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4108:2: rule__EnumType__SymbolsAssignment_23_2
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl8184);
            rule__EnumType__SymbolsAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__2__Impl"


    // $ANTLR start "rule__EnumType__Group_23__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4118:1: rule__EnumType__Group_23__3 : rule__EnumType__Group_23__3__Impl ;
    public final void rule__EnumType__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4122:1: ( rule__EnumType__Group_23__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4123:2: rule__EnumType__Group_23__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__38214);
            rule__EnumType__Group_23__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__3"


    // $ANTLR start "rule__EnumType__Group_23__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4129:1: rule__EnumType__Group_23__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4133:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4134:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4134:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4135:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_23__3__Impl8242); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4156:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4160:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4161:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08281);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08284);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4168:1: rule__ArrayType__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4172:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4173:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4173:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4174:1: '{'
            {
             before(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__0__Impl8312); 
             after(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4187:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4191:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4192:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18343);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18346);
            rule__ArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4199:1: rule__ArrayType__Group__1__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4203:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4204:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4204:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4205:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__1__Impl8374); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4218:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4222:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4223:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28405);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28408);
            rule__ArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4230:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4234:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4235:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4235:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4236:1: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ArrayType__Group__2__Impl8436); 
             after(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4249:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4253:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4254:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38467);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38470);
            rule__ArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4261:1: rule__ArrayType__Group__3__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4265:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4266:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4266:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4267:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__3__Impl8498); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4280:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4284:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4285:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48529);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48532);
            rule__ArrayType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4"


    // $ANTLR start "rule__ArrayType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4292:1: rule__ArrayType__Group__4__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4296:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4297:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4297:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4298:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__4__Impl8560); 
             after(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4__Impl"


    // $ANTLR start "rule__ArrayType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4311:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4315:1: ( rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4316:2: rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58591);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58594);
            rule__ArrayType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5"


    // $ANTLR start "rule__ArrayType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4323:1: rule__ArrayType__Group__5__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4327:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4328:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4328:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4329:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__5__Impl8622); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5__Impl"


    // $ANTLR start "rule__ArrayType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4342:1: rule__ArrayType__Group__6 : rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 ;
    public final void rule__ArrayType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4346:1: ( rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4347:2: rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68653);
            rule__ArrayType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68656);
            rule__ArrayType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__6"


    // $ANTLR start "rule__ArrayType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4354:1: rule__ArrayType__Group__6__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4358:1: ( ( 'array' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4359:1: ( 'array' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4359:1: ( 'array' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4360:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__ArrayType__Group__6__Impl8684); 
             after(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__6__Impl"


    // $ANTLR start "rule__ArrayType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4373:1: rule__ArrayType__Group__7 : rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 ;
    public final void rule__ArrayType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4377:1: ( rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4378:2: rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78715);
            rule__ArrayType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78718);
            rule__ArrayType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__7"


    // $ANTLR start "rule__ArrayType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4385:1: rule__ArrayType__Group__7__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4389:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4390:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4390:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4391:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__7__Impl8746); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__7__Impl"


    // $ANTLR start "rule__ArrayType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4404:1: rule__ArrayType__Group__8 : rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 ;
    public final void rule__ArrayType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4408:1: ( rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4409:2: rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88777);
            rule__ArrayType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88780);
            rule__ArrayType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__8"


    // $ANTLR start "rule__ArrayType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4416:1: rule__ArrayType__Group__8__Impl : ( ',' ) ;
    public final void rule__ArrayType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4420:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4421:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4421:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4422:1: ','
            {
             before(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__ArrayType__Group__8__Impl8808); 
             after(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__8__Impl"


    // $ANTLR start "rule__ArrayType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4435:1: rule__ArrayType__Group__9 : rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 ;
    public final void rule__ArrayType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4439:1: ( rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4440:2: rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98839);
            rule__ArrayType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98842);
            rule__ArrayType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__9"


    // $ANTLR start "rule__ArrayType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4447:1: rule__ArrayType__Group__9__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4451:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4452:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4452:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4453:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__9__Impl8870); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__9__Impl"


    // $ANTLR start "rule__ArrayType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4466:1: rule__ArrayType__Group__10 : rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 ;
    public final void rule__ArrayType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4470:1: ( rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4471:2: rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__108901);
            rule__ArrayType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__108904);
            rule__ArrayType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__10"


    // $ANTLR start "rule__ArrayType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4478:1: rule__ArrayType__Group__10__Impl : ( 'items' ) ;
    public final void rule__ArrayType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4482:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4483:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4483:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4484:1: 'items'
            {
             before(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__ArrayType__Group__10__Impl8932); 
             after(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__10__Impl"


    // $ANTLR start "rule__ArrayType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4497:1: rule__ArrayType__Group__11 : rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 ;
    public final void rule__ArrayType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4501:1: ( rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4502:2: rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__118963);
            rule__ArrayType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__118966);
            rule__ArrayType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__11"


    // $ANTLR start "rule__ArrayType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4509:1: rule__ArrayType__Group__11__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4513:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4514:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4514:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4515:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__11__Impl8994); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__11__Impl"


    // $ANTLR start "rule__ArrayType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4528:1: rule__ArrayType__Group__12 : rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 ;
    public final void rule__ArrayType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4532:1: ( rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4533:2: rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__129025);
            rule__ArrayType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__129028);
            rule__ArrayType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__12"


    // $ANTLR start "rule__ArrayType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4540:1: rule__ArrayType__Group__12__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4544:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4545:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4545:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4546:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__12__Impl9056); 
             after(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__12__Impl"


    // $ANTLR start "rule__ArrayType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4559:1: rule__ArrayType__Group__13 : rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 ;
    public final void rule__ArrayType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4563:1: ( rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4564:2: rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__139087);
            rule__ArrayType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__139090);
            rule__ArrayType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__13"


    // $ANTLR start "rule__ArrayType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4571:1: rule__ArrayType__Group__13__Impl : ( ( rule__ArrayType__Alternatives_13 ) ) ;
    public final void rule__ArrayType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4575:1: ( ( ( rule__ArrayType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4576:1: ( ( rule__ArrayType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4576:1: ( ( rule__ArrayType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4577:1: ( rule__ArrayType__Alternatives_13 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4578:1: ( rule__ArrayType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4578:2: rule__ArrayType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl9117);
            rule__ArrayType__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__13__Impl"


    // $ANTLR start "rule__ArrayType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4588:1: rule__ArrayType__Group__14 : rule__ArrayType__Group__14__Impl ;
    public final void rule__ArrayType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4592:1: ( rule__ArrayType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4593:2: rule__ArrayType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__149147);
            rule__ArrayType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__14"


    // $ANTLR start "rule__ArrayType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4599:1: rule__ArrayType__Group__14__Impl : ( '}' ) ;
    public final void rule__ArrayType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4603:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4604:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4604:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4605:1: '}'
            {
             before(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__ArrayType__Group__14__Impl9175); 
             after(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__14__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4648:1: rule__ArrayType__Group_13_2__0 : rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 ;
    public final void rule__ArrayType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4652:1: ( rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4653:2: rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09236);
            rule__ArrayType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09239);
            rule__ArrayType__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__0"


    // $ANTLR start "rule__ArrayType__Group_13_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4660:1: rule__ArrayType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4664:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4665:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4665:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4666:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group_13_2__0__Impl9267); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4679:1: rule__ArrayType__Group_13_2__1 : rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 ;
    public final void rule__ArrayType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4683:1: ( rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4684:2: rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19298);
            rule__ArrayType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19301);
            rule__ArrayType__Group_13_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__1"


    // $ANTLR start "rule__ArrayType__Group_13_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4691:1: rule__ArrayType__Group_13_2__1__Impl : ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__ArrayType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4695:1: ( ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4696:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4696:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4697:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4698:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4698:2: rule__ArrayType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9328);
            rule__ArrayType__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4708:1: rule__ArrayType__Group_13_2__2 : rule__ArrayType__Group_13_2__2__Impl ;
    public final void rule__ArrayType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4712:1: ( rule__ArrayType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4713:2: rule__ArrayType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29358);
            rule__ArrayType__Group_13_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__2"


    // $ANTLR start "rule__ArrayType__Group_13_2__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4719:1: rule__ArrayType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4723:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4724:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4724:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4725:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group_13_2__2__Impl9386); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__2__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4744:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4748:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4749:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09423);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09426);
            rule__MapType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4756:1: rule__MapType__Group__0__Impl : ( '{' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4760:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4761:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4761:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4762:1: '{'
            {
             before(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__0__Impl9454); 
             after(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4775:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4779:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4780:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19485);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19488);
            rule__MapType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4787:1: rule__MapType__Group__1__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4791:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4792:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4792:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4793:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__1__Impl9516); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4806:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4810:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4811:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29547);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29550);
            rule__MapType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4818:1: rule__MapType__Group__2__Impl : ( 'type' ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4822:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4823:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4823:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4824:1: 'type'
            {
             before(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__MapType__Group__2__Impl9578); 
             after(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4837:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4841:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4842:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39609);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39612);
            rule__MapType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3"


    // $ANTLR start "rule__MapType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4849:1: rule__MapType__Group__3__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4853:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4854:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4854:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4855:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__3__Impl9640); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4868:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4872:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4873:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49671);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49674);
            rule__MapType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4"


    // $ANTLR start "rule__MapType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4880:1: rule__MapType__Group__4__Impl : ( ':' ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4884:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4885:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4885:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4886:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__4__Impl9702); 
             after(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4__Impl"


    // $ANTLR start "rule__MapType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4899:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl rule__MapType__Group__6 ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4903:1: ( rule__MapType__Group__5__Impl rule__MapType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4904:2: rule__MapType__Group__5__Impl rule__MapType__Group__6
            {
            pushFollow(FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59733);
            rule__MapType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59736);
            rule__MapType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5"


    // $ANTLR start "rule__MapType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4911:1: rule__MapType__Group__5__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4915:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4916:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4916:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4917:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__5__Impl9764); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5__Impl"


    // $ANTLR start "rule__MapType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4930:1: rule__MapType__Group__6 : rule__MapType__Group__6__Impl rule__MapType__Group__7 ;
    public final void rule__MapType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4934:1: ( rule__MapType__Group__6__Impl rule__MapType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4935:2: rule__MapType__Group__6__Impl rule__MapType__Group__7
            {
            pushFollow(FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69795);
            rule__MapType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69798);
            rule__MapType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__6"


    // $ANTLR start "rule__MapType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4942:1: rule__MapType__Group__6__Impl : ( 'map' ) ;
    public final void rule__MapType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4946:1: ( ( 'map' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4947:1: ( 'map' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4947:1: ( 'map' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4948:1: 'map'
            {
             before(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__MapType__Group__6__Impl9826); 
             after(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__6__Impl"


    // $ANTLR start "rule__MapType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4961:1: rule__MapType__Group__7 : rule__MapType__Group__7__Impl rule__MapType__Group__8 ;
    public final void rule__MapType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4965:1: ( rule__MapType__Group__7__Impl rule__MapType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4966:2: rule__MapType__Group__7__Impl rule__MapType__Group__8
            {
            pushFollow(FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79857);
            rule__MapType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79860);
            rule__MapType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__7"


    // $ANTLR start "rule__MapType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4973:1: rule__MapType__Group__7__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4977:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4978:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4978:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4979:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__7__Impl9888); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__7__Impl"


    // $ANTLR start "rule__MapType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4992:1: rule__MapType__Group__8 : rule__MapType__Group__8__Impl rule__MapType__Group__9 ;
    public final void rule__MapType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4996:1: ( rule__MapType__Group__8__Impl rule__MapType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4997:2: rule__MapType__Group__8__Impl rule__MapType__Group__9
            {
            pushFollow(FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__89919);
            rule__MapType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__89922);
            rule__MapType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__8"


    // $ANTLR start "rule__MapType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5004:1: rule__MapType__Group__8__Impl : ( ',' ) ;
    public final void rule__MapType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5008:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5009:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5009:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5010:1: ','
            {
             before(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__MapType__Group__8__Impl9950); 
             after(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__8__Impl"


    // $ANTLR start "rule__MapType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5023:1: rule__MapType__Group__9 : rule__MapType__Group__9__Impl rule__MapType__Group__10 ;
    public final void rule__MapType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5027:1: ( rule__MapType__Group__9__Impl rule__MapType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5028:2: rule__MapType__Group__9__Impl rule__MapType__Group__10
            {
            pushFollow(FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__99981);
            rule__MapType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__99984);
            rule__MapType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__9"


    // $ANTLR start "rule__MapType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5035:1: rule__MapType__Group__9__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5039:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5040:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5040:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5041:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__9__Impl10012); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__9__Impl"


    // $ANTLR start "rule__MapType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5054:1: rule__MapType__Group__10 : rule__MapType__Group__10__Impl rule__MapType__Group__11 ;
    public final void rule__MapType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5058:1: ( rule__MapType__Group__10__Impl rule__MapType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5059:2: rule__MapType__Group__10__Impl rule__MapType__Group__11
            {
            pushFollow(FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__1010043);
            rule__MapType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__1010046);
            rule__MapType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__10"


    // $ANTLR start "rule__MapType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5066:1: rule__MapType__Group__10__Impl : ( 'items' ) ;
    public final void rule__MapType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5070:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5071:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5071:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5072:1: 'items'
            {
             before(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__MapType__Group__10__Impl10074); 
             after(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__10__Impl"


    // $ANTLR start "rule__MapType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5085:1: rule__MapType__Group__11 : rule__MapType__Group__11__Impl rule__MapType__Group__12 ;
    public final void rule__MapType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5089:1: ( rule__MapType__Group__11__Impl rule__MapType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5090:2: rule__MapType__Group__11__Impl rule__MapType__Group__12
            {
            pushFollow(FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__1110105);
            rule__MapType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__1110108);
            rule__MapType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__11"


    // $ANTLR start "rule__MapType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5097:1: rule__MapType__Group__11__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5101:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5102:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5102:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5103:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__11__Impl10136); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__11__Impl"


    // $ANTLR start "rule__MapType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5116:1: rule__MapType__Group__12 : rule__MapType__Group__12__Impl rule__MapType__Group__13 ;
    public final void rule__MapType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5120:1: ( rule__MapType__Group__12__Impl rule__MapType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5121:2: rule__MapType__Group__12__Impl rule__MapType__Group__13
            {
            pushFollow(FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__1210167);
            rule__MapType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__1210170);
            rule__MapType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__12"


    // $ANTLR start "rule__MapType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5128:1: rule__MapType__Group__12__Impl : ( ':' ) ;
    public final void rule__MapType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5132:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5133:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5133:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5134:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__12__Impl10198); 
             after(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__12__Impl"


    // $ANTLR start "rule__MapType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5147:1: rule__MapType__Group__13 : rule__MapType__Group__13__Impl rule__MapType__Group__14 ;
    public final void rule__MapType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5151:1: ( rule__MapType__Group__13__Impl rule__MapType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5152:2: rule__MapType__Group__13__Impl rule__MapType__Group__14
            {
            pushFollow(FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310229);
            rule__MapType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310232);
            rule__MapType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__13"


    // $ANTLR start "rule__MapType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5159:1: rule__MapType__Group__13__Impl : ( ( rule__MapType__Alternatives_13 ) ) ;
    public final void rule__MapType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5163:1: ( ( ( rule__MapType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5164:1: ( ( rule__MapType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5164:1: ( ( rule__MapType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5165:1: ( rule__MapType__Alternatives_13 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5166:1: ( rule__MapType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5166:2: rule__MapType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10259);
            rule__MapType__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__13__Impl"


    // $ANTLR start "rule__MapType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5176:1: rule__MapType__Group__14 : rule__MapType__Group__14__Impl ;
    public final void rule__MapType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5180:1: ( rule__MapType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5181:2: rule__MapType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410289);
            rule__MapType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__14"


    // $ANTLR start "rule__MapType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5187:1: rule__MapType__Group__14__Impl : ( '}' ) ;
    public final void rule__MapType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5191:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5192:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5192:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5193:1: '}'
            {
             before(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__MapType__Group__14__Impl10317); 
             after(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__14__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5236:1: rule__MapType__Group_13_2__0 : rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 ;
    public final void rule__MapType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5240:1: ( rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5241:2: rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010378);
            rule__MapType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010381);
            rule__MapType__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__0"


    // $ANTLR start "rule__MapType__Group_13_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5248:1: rule__MapType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5252:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5253:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5253:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5254:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group_13_2__0__Impl10409); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__0__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5267:1: rule__MapType__Group_13_2__1 : rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 ;
    public final void rule__MapType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5271:1: ( rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5272:2: rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110440);
            rule__MapType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110443);
            rule__MapType__Group_13_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__1"


    // $ANTLR start "rule__MapType__Group_13_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5279:1: rule__MapType__Group_13_2__1__Impl : ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__MapType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5283:1: ( ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5284:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5284:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5285:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5286:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5286:2: rule__MapType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10470);
            rule__MapType__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__1__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5296:1: rule__MapType__Group_13_2__2 : rule__MapType__Group_13_2__2__Impl ;
    public final void rule__MapType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5300:1: ( rule__MapType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5301:2: rule__MapType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210500);
            rule__MapType__Group_13_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__2"


    // $ANTLR start "rule__MapType__Group_13_2__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5307:1: rule__MapType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5311:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5312:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5312:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5313:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group_13_2__2__Impl10528); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__2__Impl"


    // $ANTLR start "rule__FixedType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5332:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5336:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5337:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010565);
            rule__FixedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010568);
            rule__FixedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__0"


    // $ANTLR start "rule__FixedType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5344:1: rule__FixedType__Group__0__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5348:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5349:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5349:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5350:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__0__Impl10596); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__0__Impl"


    // $ANTLR start "rule__FixedType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5363:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5367:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5368:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110627);
            rule__FixedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110630);
            rule__FixedType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__1"


    // $ANTLR start "rule__FixedType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5375:1: rule__FixedType__Group__1__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5379:1: ( ( 'fixed' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5380:1: ( 'fixed' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5380:1: ( 'fixed' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5381:1: 'fixed'
            {
             before(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__FixedType__Group__1__Impl10658); 
             after(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__1__Impl"


    // $ANTLR start "rule__FixedType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5394:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5398:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5399:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210689);
            rule__FixedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210692);
            rule__FixedType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__2"


    // $ANTLR start "rule__FixedType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5406:1: rule__FixedType__Group__2__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5410:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5411:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5411:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5412:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__2__Impl10720); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__2__Impl"


    // $ANTLR start "rule__FixedType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5425:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5429:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5430:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310751);
            rule__FixedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310754);
            rule__FixedType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__3"


    // $ANTLR start "rule__FixedType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5437:1: rule__FixedType__Group__3__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5441:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5442:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5442:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5443:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__3__Impl10782); 
             after(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__3__Impl"


    // $ANTLR start "rule__FixedType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5456:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5460:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5461:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410813);
            rule__FixedType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410816);
            rule__FixedType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__4"


    // $ANTLR start "rule__FixedType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5468:1: rule__FixedType__Group__4__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5472:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5473:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5473:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5474:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__4__Impl10844); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__4__Impl"


    // $ANTLR start "rule__FixedType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5487:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl rule__FixedType__Group__6 ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5491:1: ( rule__FixedType__Group__5__Impl rule__FixedType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5492:2: rule__FixedType__Group__5__Impl rule__FixedType__Group__6
            {
            pushFollow(FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510875);
            rule__FixedType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510878);
            rule__FixedType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__5"


    // $ANTLR start "rule__FixedType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5499:1: rule__FixedType__Group__5__Impl : ( 'name' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5503:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5504:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5504:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5505:1: 'name'
            {
             before(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 
            match(input,10,FOLLOW_10_in_rule__FixedType__Group__5__Impl10906); 
             after(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__5__Impl"


    // $ANTLR start "rule__FixedType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5518:1: rule__FixedType__Group__6 : rule__FixedType__Group__6__Impl rule__FixedType__Group__7 ;
    public final void rule__FixedType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5522:1: ( rule__FixedType__Group__6__Impl rule__FixedType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5523:2: rule__FixedType__Group__6__Impl rule__FixedType__Group__7
            {
            pushFollow(FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__610937);
            rule__FixedType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__610940);
            rule__FixedType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__6"


    // $ANTLR start "rule__FixedType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5530:1: rule__FixedType__Group__6__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5534:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5535:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5535:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5536:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__6__Impl10968); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__6__Impl"


    // $ANTLR start "rule__FixedType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5549:1: rule__FixedType__Group__7 : rule__FixedType__Group__7__Impl rule__FixedType__Group__8 ;
    public final void rule__FixedType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5553:1: ( rule__FixedType__Group__7__Impl rule__FixedType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5554:2: rule__FixedType__Group__7__Impl rule__FixedType__Group__8
            {
            pushFollow(FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__710999);
            rule__FixedType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__711002);
            rule__FixedType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__7"


    // $ANTLR start "rule__FixedType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5561:1: rule__FixedType__Group__7__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5565:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5566:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5566:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5567:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__7__Impl11030); 
             after(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__7__Impl"


    // $ANTLR start "rule__FixedType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5580:1: rule__FixedType__Group__8 : rule__FixedType__Group__8__Impl rule__FixedType__Group__9 ;
    public final void rule__FixedType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5584:1: ( rule__FixedType__Group__8__Impl rule__FixedType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5585:2: rule__FixedType__Group__8__Impl rule__FixedType__Group__9
            {
            pushFollow(FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__811061);
            rule__FixedType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__811064);
            rule__FixedType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__8"


    // $ANTLR start "rule__FixedType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5592:1: rule__FixedType__Group__8__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5596:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5597:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5597:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5598:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__8__Impl11092); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__8__Impl"


    // $ANTLR start "rule__FixedType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5611:1: rule__FixedType__Group__9 : rule__FixedType__Group__9__Impl rule__FixedType__Group__10 ;
    public final void rule__FixedType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5615:1: ( rule__FixedType__Group__9__Impl rule__FixedType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5616:2: rule__FixedType__Group__9__Impl rule__FixedType__Group__10
            {
            pushFollow(FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__911123);
            rule__FixedType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__911126);
            rule__FixedType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__9"


    // $ANTLR start "rule__FixedType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5623:1: rule__FixedType__Group__9__Impl : ( ( rule__FixedType__NameAssignment_9 ) ) ;
    public final void rule__FixedType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5627:1: ( ( ( rule__FixedType__NameAssignment_9 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5628:1: ( ( rule__FixedType__NameAssignment_9 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5628:1: ( ( rule__FixedType__NameAssignment_9 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5629:1: ( rule__FixedType__NameAssignment_9 )
            {
             before(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5630:1: ( rule__FixedType__NameAssignment_9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5630:2: rule__FixedType__NameAssignment_9
            {
            pushFollow(FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl11153);
            rule__FixedType__NameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__9__Impl"


    // $ANTLR start "rule__FixedType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5640:1: rule__FixedType__Group__10 : rule__FixedType__Group__10__Impl rule__FixedType__Group__11 ;
    public final void rule__FixedType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5644:1: ( rule__FixedType__Group__10__Impl rule__FixedType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5645:2: rule__FixedType__Group__10__Impl rule__FixedType__Group__11
            {
            pushFollow(FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1011183);
            rule__FixedType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1011186);
            rule__FixedType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__10"


    // $ANTLR start "rule__FixedType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5652:1: rule__FixedType__Group__10__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5656:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5657:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5657:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5658:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__10__Impl11214); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__10__Impl"


    // $ANTLR start "rule__FixedType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5671:1: rule__FixedType__Group__11 : rule__FixedType__Group__11__Impl rule__FixedType__Group__12 ;
    public final void rule__FixedType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5675:1: ( rule__FixedType__Group__11__Impl rule__FixedType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5676:2: rule__FixedType__Group__11__Impl rule__FixedType__Group__12
            {
            pushFollow(FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111245);
            rule__FixedType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111248);
            rule__FixedType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__11"


    // $ANTLR start "rule__FixedType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5683:1: rule__FixedType__Group__11__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5687:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5688:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5688:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5689:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__11__Impl11276); 
             after(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__11__Impl"


    // $ANTLR start "rule__FixedType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5702:1: rule__FixedType__Group__12 : rule__FixedType__Group__12__Impl rule__FixedType__Group__13 ;
    public final void rule__FixedType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5706:1: ( rule__FixedType__Group__12__Impl rule__FixedType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5707:2: rule__FixedType__Group__12__Impl rule__FixedType__Group__13
            {
            pushFollow(FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211307);
            rule__FixedType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211310);
            rule__FixedType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__12"


    // $ANTLR start "rule__FixedType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5714:1: rule__FixedType__Group__12__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5718:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5719:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5719:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5720:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__12__Impl11338); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__12__Impl"


    // $ANTLR start "rule__FixedType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5733:1: rule__FixedType__Group__13 : rule__FixedType__Group__13__Impl rule__FixedType__Group__14 ;
    public final void rule__FixedType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5737:1: ( rule__FixedType__Group__13__Impl rule__FixedType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5738:2: rule__FixedType__Group__13__Impl rule__FixedType__Group__14
            {
            pushFollow(FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311369);
            rule__FixedType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311372);
            rule__FixedType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__13"


    // $ANTLR start "rule__FixedType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5745:1: rule__FixedType__Group__13__Impl : ( 'size' ) ;
    public final void rule__FixedType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5749:1: ( ( 'size' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5750:1: ( 'size' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5750:1: ( 'size' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5751:1: 'size'
            {
             before(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 
            match(input,36,FOLLOW_36_in_rule__FixedType__Group__13__Impl11400); 
             after(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__13__Impl"


    // $ANTLR start "rule__FixedType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5764:1: rule__FixedType__Group__14 : rule__FixedType__Group__14__Impl rule__FixedType__Group__15 ;
    public final void rule__FixedType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5768:1: ( rule__FixedType__Group__14__Impl rule__FixedType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5769:2: rule__FixedType__Group__14__Impl rule__FixedType__Group__15
            {
            pushFollow(FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411431);
            rule__FixedType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411434);
            rule__FixedType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__14"


    // $ANTLR start "rule__FixedType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5776:1: rule__FixedType__Group__14__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5780:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5781:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5781:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5782:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__14__Impl11462); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__14__Impl"


    // $ANTLR start "rule__FixedType__Group__15"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5795:1: rule__FixedType__Group__15 : rule__FixedType__Group__15__Impl rule__FixedType__Group__16 ;
    public final void rule__FixedType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5799:1: ( rule__FixedType__Group__15__Impl rule__FixedType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5800:2: rule__FixedType__Group__15__Impl rule__FixedType__Group__16
            {
            pushFollow(FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511493);
            rule__FixedType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511496);
            rule__FixedType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__15"


    // $ANTLR start "rule__FixedType__Group__15__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5807:1: rule__FixedType__Group__15__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5811:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5812:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5812:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5813:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__15__Impl11524); 
             after(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__15__Impl"


    // $ANTLR start "rule__FixedType__Group__16"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5826:1: rule__FixedType__Group__16 : rule__FixedType__Group__16__Impl rule__FixedType__Group__17 ;
    public final void rule__FixedType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5830:1: ( rule__FixedType__Group__16__Impl rule__FixedType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5831:2: rule__FixedType__Group__16__Impl rule__FixedType__Group__17
            {
            pushFollow(FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611555);
            rule__FixedType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611558);
            rule__FixedType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__16"


    // $ANTLR start "rule__FixedType__Group__16__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5838:1: rule__FixedType__Group__16__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5842:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5843:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5843:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5844:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__16__Impl11586); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__16__Impl"


    // $ANTLR start "rule__FixedType__Group__17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5857:1: rule__FixedType__Group__17 : rule__FixedType__Group__17__Impl rule__FixedType__Group__18 ;
    public final void rule__FixedType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5861:1: ( rule__FixedType__Group__17__Impl rule__FixedType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5862:2: rule__FixedType__Group__17__Impl rule__FixedType__Group__18
            {
            pushFollow(FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711617);
            rule__FixedType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711620);
            rule__FixedType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__17"


    // $ANTLR start "rule__FixedType__Group__17__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5869:1: rule__FixedType__Group__17__Impl : ( ( rule__FixedType__SizeAssignment_17 ) ) ;
    public final void rule__FixedType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5873:1: ( ( ( rule__FixedType__SizeAssignment_17 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5874:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5874:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5875:1: ( rule__FixedType__SizeAssignment_17 )
            {
             before(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5876:1: ( rule__FixedType__SizeAssignment_17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5876:2: rule__FixedType__SizeAssignment_17
            {
            pushFollow(FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11647);
            rule__FixedType__SizeAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__17__Impl"


    // $ANTLR start "rule__FixedType__Group__18"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5886:1: rule__FixedType__Group__18 : rule__FixedType__Group__18__Impl ;
    public final void rule__FixedType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5890:1: ( rule__FixedType__Group__18__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5891:2: rule__FixedType__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811677);
            rule__FixedType__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__18"


    // $ANTLR start "rule__FixedType__Group__18__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5897:1: rule__FixedType__Group__18__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5901:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5902:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5902:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5903:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__18__Impl11705); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__18__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5954:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5958:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5959:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011774);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011777);
            rule__Primitive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5966:1: rule__Primitive__Group__0__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5970:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5971:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5971:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5972:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Primitive__Group__0__Impl11805); 
             after(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5985:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5989:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5990:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111836);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111839);
            rule__Primitive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5997:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__TypeAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6001:1: ( ( ( rule__Primitive__TypeAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6002:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6002:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6003:1: ( rule__Primitive__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6004:1: ( rule__Primitive__TypeAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6004:2: rule__Primitive__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11866);
            rule__Primitive__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6014:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6018:1: ( rule__Primitive__Group__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6019:2: rule__Primitive__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__211896);
            rule__Primitive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__2"


    // $ANTLR start "rule__Primitive__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6025:1: rule__Primitive__Group__2__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6029:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6030:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6030:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6031:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Primitive__Group__2__Impl11924); 
             after(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6050:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6054:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6055:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__011961);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__011964);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6062:1: rule__Namespace__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6066:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6067:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6067:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6068:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl11991); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6079:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6083:1: ( rule__Namespace__Group__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6084:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__112020);
            rule__Namespace__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6090:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__Group_1__0 )* ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6094:1: ( ( ( rule__Namespace__Group_1__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6095:1: ( ( rule__Namespace__Group_1__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6095:1: ( ( rule__Namespace__Group_1__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6096:1: ( rule__Namespace__Group_1__0 )*
            {
             before(grammarAccess.getNamespaceAccess().getGroup_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6097:1: ( rule__Namespace__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6097:2: rule__Namespace__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl12047);
            	    rule__Namespace__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group_1__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6111:1: rule__Namespace__Group_1__0 : rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 ;
    public final void rule__Namespace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6115:1: ( rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6116:2: rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__012082);
            rule__Namespace__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__012085);
            rule__Namespace__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__0"


    // $ANTLR start "rule__Namespace__Group_1__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6123:1: rule__Namespace__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Namespace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6127:1: ( ( '.' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6128:1: ( '.' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6128:1: ( '.' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6129:1: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Namespace__Group_1__0__Impl12113); 
             after(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__0__Impl"


    // $ANTLR start "rule__Namespace__Group_1__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6142:1: rule__Namespace__Group_1__1 : rule__Namespace__Group_1__1__Impl ;
    public final void rule__Namespace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6146:1: ( rule__Namespace__Group_1__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6147:2: rule__Namespace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__112144);
            rule__Namespace__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__1"


    // $ANTLR start "rule__Namespace__Group_1__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6153:1: rule__Namespace__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6157:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6158:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6158:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6159:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl12171); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__1__Impl"


    // $ANTLR start "rule__AvroSchema__TypesAssignment"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6175:1: rule__AvroSchema__TypesAssignment : ( ( rule__AvroSchema__TypesAlternatives_0 ) ) ;
    public final void rule__AvroSchema__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6179:1: ( ( ( rule__AvroSchema__TypesAlternatives_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6180:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6180:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6181:1: ( rule__AvroSchema__TypesAlternatives_0 )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6182:1: ( rule__AvroSchema__TypesAlternatives_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6182:2: rule__AvroSchema__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment12209);
            rule__AvroSchema__TypesAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroSchema__TypesAssignment"


    // $ANTLR start "rule__UnionType__TypesAssignment_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6191:1: rule__UnionType__TypesAssignment_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6195:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6196:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6196:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6197:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112242);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__TypesAssignment_1"


    // $ANTLR start "rule__UnionType__TypesAssignment_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6206:1: rule__UnionType__TypesAssignment_2_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6210:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6211:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6211:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6212:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112273);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__TypesAssignment_2_1"


    // $ANTLR start "rule__UnionMember__RecordRefAssignment_6_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6221:1: rule__UnionMember__RecordRefAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__UnionMember__RecordRefAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6225:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6226:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6226:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6227:1: ( RULE_ID )
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefRecordTypeCrossReference_6_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6228:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6229:1: RULE_ID
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefRecordTypeIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UnionMember__RecordRefAssignment_6_112308); 
             after(grammarAccess.getUnionMemberAccess().getRecordRefRecordTypeIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getUnionMemberAccess().getRecordRefRecordTypeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__RecordRefAssignment_6_1"


    // $ANTLR start "rule__JsonType__TypeAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6240:1: rule__JsonType__TypeAssignment_6 : ( rulePrimitive ) ;
    public final void rule__JsonType__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6244:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6245:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6245:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6246:1: rulePrimitive
            {
             before(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612343);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__TypeAssignment_6"


    // $ANTLR start "rule__RecordType__NameAssignment_14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6255:1: rule__RecordType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6259:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6260:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6260:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6261:1: RULE_ID
            {
             before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412374); 
             after(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_14"


    // $ANTLR start "rule__RecordType__NamespaceAssignment_16_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6270:1: rule__RecordType__NamespaceAssignment_16_6 : ( ruleNamespace ) ;
    public final void rule__RecordType__NamespaceAssignment_16_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6274:1: ( ( ruleNamespace ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6275:1: ( ruleNamespace )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6275:1: ( ruleNamespace )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6276:1: ruleNamespace
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612405);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NamespaceAssignment_16_6"


    // $ANTLR start "rule__RecordType__FieldsAssignment_23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6285:1: rule__RecordType__FieldsAssignment_23 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6289:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6290:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6290:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6291:1: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_23_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_2312436);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__FieldsAssignment_23"


    // $ANTLR start "rule__RecordType__FieldsAssignment_24_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6300:1: rule__RecordType__FieldsAssignment_24_1 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6304:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6305:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6305:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6306:1: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_24_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_24_112467);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_24_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__FieldsAssignment_24_1"


    // $ANTLR start "rule__Field__NameAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6315:1: rule__Field__NameAssignment_6 : ( ( rule__Field__NameAlternatives_6_0 ) ) ;
    public final void rule__Field__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6319:1: ( ( ( rule__Field__NameAlternatives_6_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6320:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6320:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6321:1: ( rule__Field__NameAlternatives_6_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6322:1: ( rule__Field__NameAlternatives_6_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6322:2: rule__Field__NameAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612498);
            rule__Field__NameAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_6"


    // $ANTLR start "rule__Field__PrimitiveAssignment_13_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6331:1: rule__Field__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__Field__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6335:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6336:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6336:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6337:1: rulePrimitive
            {
             before(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012531);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__Field__RecordAssignment_13_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6346:1: rule__Field__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__Field__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6350:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6351:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6351:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6352:1: ruleRecordType
            {
             before(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112562);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RecordAssignment_13_1"


    // $ANTLR start "rule__Field__RecordRefAssignment_13_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6361:1: rule__Field__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6365:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6366:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6366:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6367:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6368:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6369:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112597); 
             after(grammarAccess.getFieldAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__Field__EtypeAssignment_13_3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6380:1: rule__Field__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__Field__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6384:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6385:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6385:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6386:1: ruleEnumType
            {
             before(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312632);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__EtypeAssignment_13_3"


    // $ANTLR start "rule__Field__ArrayAssignment_13_4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6395:1: rule__Field__ArrayAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__Field__ArrayAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6399:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6400:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6400:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6401:1: ruleArrayType
            {
             before(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412663);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ArrayAssignment_13_4"


    // $ANTLR start "rule__Field__MapAssignment_13_5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6410:1: rule__Field__MapAssignment_13_5 : ( ruleMapType ) ;
    public final void rule__Field__MapAssignment_13_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6414:1: ( ( ruleMapType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6415:1: ( ruleMapType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6415:1: ( ruleMapType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6416:1: ruleMapType
            {
             before(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
            pushFollow(FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512694);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__MapAssignment_13_5"


    // $ANTLR start "rule__Field__FixedAssignment_13_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6425:1: rule__Field__FixedAssignment_13_6 : ( ruleFixedType ) ;
    public final void rule__Field__FixedAssignment_13_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6429:1: ( ( ruleFixedType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6430:1: ( ruleFixedType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6430:1: ( ruleFixedType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6431:1: ruleFixedType
            {
             before(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
            pushFollow(FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612725);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FixedAssignment_13_6"


    // $ANTLR start "rule__Field__UnionAssignment_13_7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6440:1: rule__Field__UnionAssignment_13_7 : ( ruleUnionType ) ;
    public final void rule__Field__UnionAssignment_13_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6444:1: ( ( ruleUnionType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6445:1: ( ruleUnionType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6445:1: ( ruleUnionType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6446:1: ruleUnionType
            {
             before(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 
            pushFollow(FOLLOW_ruleUnionType_in_rule__Field__UnionAssignment_13_712756);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__UnionAssignment_13_7"


    // $ANTLR start "rule__EnumType__NameAssignment_14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6455:1: rule__EnumType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__EnumType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6459:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6460:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6460:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6461:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412787); 
             after(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__NameAssignment_14"


    // $ANTLR start "rule__EnumType__SymbolsAssignment_22_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6470:1: rule__EnumType__SymbolsAssignment_22_1 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6474:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6475:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6475:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6476:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112818); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__SymbolsAssignment_22_1"


    // $ANTLR start "rule__EnumType__SymbolsAssignment_23_2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6485:1: rule__EnumType__SymbolsAssignment_23_2 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6489:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6490:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6490:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6491:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212849); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__SymbolsAssignment_23_2"


    // $ANTLR start "rule__ArrayType__PrimitiveAssignment_13_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6500:1: rule__ArrayType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__ArrayType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6504:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6505:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6505:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6506:1: rulePrimitive
            {
             before(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_012880);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__ArrayType__RecordAssignment_13_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6515:1: rule__ArrayType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__ArrayType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6519:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6520:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6520:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6521:1: ruleRecordType
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_112911);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__RecordAssignment_13_1"


    // $ANTLR start "rule__ArrayType__RecordRefAssignment_13_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6530:1: rule__ArrayType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArrayType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6534:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6535:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6535:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6536:1: ( RULE_ID )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6537:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6538:1: RULE_ID
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_112946); 
             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__ArrayType__EtypeAssignment_13_3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6549:1: rule__ArrayType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__ArrayType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6553:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6554:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6554:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6555:1: ruleEnumType
            {
             before(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_312981);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__EtypeAssignment_13_3"


    // $ANTLR start "rule__MapType__PrimitiveAssignment_13_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6564:1: rule__MapType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__MapType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6568:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6569:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6569:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6570:1: rulePrimitive
            {
             before(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_013012);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__MapType__RecordAssignment_13_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6579:1: rule__MapType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__MapType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6583:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6584:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6584:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6585:1: ruleRecordType
            {
             before(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_113043);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__RecordAssignment_13_1"


    // $ANTLR start "rule__MapType__RecordRefAssignment_13_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6594:1: rule__MapType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6598:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6599:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6599:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6600:1: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6601:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6602:1: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_113078); 
             after(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__MapType__EtypeAssignment_13_3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6613:1: rule__MapType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__MapType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6617:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6618:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6618:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6619:1: ruleEnumType
            {
             before(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_313113);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__EtypeAssignment_13_3"


    // $ANTLR start "rule__MapType__AtypeAssignment_13_4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6628:1: rule__MapType__AtypeAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__MapType__AtypeAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6632:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6633:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6633:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6634:1: ruleArrayType
            {
             before(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_413144);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__AtypeAssignment_13_4"


    // $ANTLR start "rule__FixedType__NameAssignment_9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6643:1: rule__FixedType__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__FixedType__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6647:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6648:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6648:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6649:1: RULE_ID
            {
             before(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_913175); 
             after(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__NameAssignment_9"


    // $ANTLR start "rule__FixedType__SizeAssignment_17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6658:1: rule__FixedType__SizeAssignment_17 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6662:1: ( ( RULE_INT ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6663:1: ( RULE_INT )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6663:1: ( RULE_INT )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6664:1: RULE_INT
            {
             before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1713206); 
             after(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__SizeAssignment_17"


    // $ANTLR start "rule__Primitive__TypeAssignment_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6673:1: rule__Primitive__TypeAssignment_1 : ( ( rule__Primitive__TypeAlternatives_1_0 ) ) ;
    public final void rule__Primitive__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6677:1: ( ( ( rule__Primitive__TypeAlternatives_1_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6678:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6678:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6679:1: ( rule__Primitive__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6680:1: ( rule__Primitive__TypeAlternatives_1_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6680:2: rule__Primitive__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_113237);
            rule__Primitive__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\23\1\26\1\uffff\1\30\1\26\1\31\2\26\2\uffff";
    static final String DFA1_maxS =
        "\1\27\1\26\1\uffff\1\30\1\26\1\31\1\26\1\33\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\4\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "396:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );";
        }
    }
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\2\26\1\4\1\30\3\uffff\1\26\1\31\1\26\1\33\4\uffff";
    static final String DFA2_maxS =
        "\1\27\1\26\1\43\1\30\3\uffff\1\26\1\31\1\26\1\42\4\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\7\1\3\1\6\4\uffff\1\4\1\1\1\2\1\5";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1",
            "\1\3",
            "\1\4\6\uffff\10\5\20\uffff\1\6",
            "\1\7",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\2\uffff\1\16\1\uffff\1\15\1\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "424:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\23\1\4\1\26\4\uffff\1\30\1\26\1\31\1\26\1\33\4\uffff";
    static final String DFA4_maxS =
        "\1\27\1\43\1\26\4\uffff\1\30\1\26\1\31\1\26\1\42\4\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\10\1\3\1\7\1\1\5\uffff\1\4\1\5\1\6\1\2";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\1\1\2",
            "\1\4\6\uffff\10\6\20\uffff\1\5",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\17\2\uffff\1\14\1\uffff\1\15\1\uffff\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "500:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );";
        }
    }
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\26\1\4\1\26\2\uffff\1\30\1\26\1\31\1\26\1\33\2\uffff";
    static final String DFA5_maxS =
        "\1\27\1\22\1\26\2\uffff\1\30\1\26\1\31\1\26\1\36\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\2\1\4";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2",
            "\1\4\6\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\2\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "558:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\26\1\4\1\26\2\uffff\1\30\1\26\1\31\1\26\1\33\3\uffff";
    static final String DFA6_maxS =
        "\1\27\1\22\1\26\2\uffff\1\30\1\26\1\31\1\26\1\40\3\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\2\1\5\1\4";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\2",
            "\1\4\6\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\2\uffff\1\14\1\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "592:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvroSchema68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroSchema__TypesAssignment_in_ruleAvroSchema94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_entryRuleUnionType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__0_in_ruleUnionType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_entryRuleUnionMember181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionMember188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Alternatives_in_ruleUnionMember214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__0_in_ruleJsonType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0_in_ruleMapType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0_in_ruleFixedType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__AvroSchema__TypesAlternatives_0790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__AvroSchema__TypesAlternatives_0807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_rule__AvroSchema__TypesAlternatives_0824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__UnionMember__Alternatives856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__UnionMember__Alternatives873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__UnionMember__Alternatives890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__UnionMember__Alternatives907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__UnionMember__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__UnionMember__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__0_in_rule__UnionMember__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__NameAlternatives_6_0992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_01011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UnionAssignment_13_7_in_rule__Field__Alternatives_131169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01567 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnionType__Group__0__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11629 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21689 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1719 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UnionType__Group__3__Impl1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01817 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__0__Impl_in_rule__UnionMember__Group_6__01940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__1_in_rule__UnionMember__Group_6__01943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnionMember__Group_6__0__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__1__Impl_in_rule__UnionMember__Group_6__12002 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__2_in_rule__UnionMember__Group_6__12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__RecordRefAssignment_6_1_in_rule__UnionMember__Group_6__1__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__2__Impl_in_rule__UnionMember__Group_6__22062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnionMember__Group_6__2__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__02127 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__0__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__12189 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__1__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22251 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonType__Group__2__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32313 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__3__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42375 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonType__Group__4__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52437 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__5__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62499 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72559 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__7__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonType__Group__8__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02698 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__0__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12760 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__1__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22822 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group__2__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32884 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__3__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__42946 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__42949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__4__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53008 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__5__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63070 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordType__Group__6__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__73132 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__73135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__7__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__83194 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__83197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__8__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__9__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103318 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__RecordType__Group__10__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113380 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__11__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123442 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__12__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__13__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143566 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153626 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__15__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163688 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173749 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__17__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183811 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__18__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193873 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RecordType__Group__19__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__20__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__213997 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__214000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__21__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__224059 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__224062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordType__Group__22__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__234121 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__234124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_23_in_rule__RecordType__Group__23__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__244181 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__244184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__0_in_rule__RecordType__Group__24__Impl4211 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254242 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__26_in_rule__RecordType__Group__254245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group__25__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__26__Impl_in_rule__RecordType__Group__264304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RecordType__Group__26__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04417 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14479 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__1__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24541 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34603 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__3__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44665 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__5__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64789 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__7__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__0__Impl_in_rule__RecordType__Group_24__04924 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__1_in_rule__RecordType__Group_24__04927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_24__0__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__1__Impl_in_rule__RecordType__Group_24__14986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_24_1_in_rule__RecordType__Group_24__1__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05047 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__0__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15109 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25171 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__Group__2__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35233 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__3__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__4__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55357 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__5__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65419 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75479 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__7__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85541 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group__8__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95603 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__9__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105665 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__10__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115727 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__11__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125789 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__12__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135851 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__145911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__14__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__06000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__06003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group_13_2__0__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__16062 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__16065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__26122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group_13_2__2__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__06187 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__06190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__0__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16249 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__1__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26311 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumType__Group__2__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36373 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__3__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46435 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__4__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56497 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__5__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66559 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumType__Group__6__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76621 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__7__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86683 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__8__Impl6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96745 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__9__Impl6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106807 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EnumType__Group__10__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116869 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__11__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__126931 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__126934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__12__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__136993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__136996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__13__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__147055 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__147058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__157115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__157118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__15__Impl7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__167177 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__167180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__16__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177239 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__17__Impl7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187301 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumType__Group__18__Impl7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__19__Impl7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207425 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__20__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217487 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumType__Group__21__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227549 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237609 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7639 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247670 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumType__Group__24__Impl7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumType__Group__25__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_22__0__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__17905 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__17908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__27965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_22__2__Impl7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__08030 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__08033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group_23__0__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__18092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__18095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_23__1__Impl8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__28154 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__28157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__38214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_23__3__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08281 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__0__Impl8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18343 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__1__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArrayType__Group__2__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38467 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__3__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48529 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__4__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58591 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__5__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68653 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayType__Group__6__Impl8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78715 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__7__Impl8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88777 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayType__Group__8__Impl8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98839 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__9__Impl8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__108901 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__108904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ArrayType__Group__10__Impl8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__118963 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__118966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__11__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__129025 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__129028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__12__Impl9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__139087 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__139090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__149147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ArrayType__Group__14__Impl9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group_13_2__0__Impl9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19298 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group_13_2__2__Impl9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09423 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__0__Impl9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19485 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__1__Impl9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29547 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapType__Group__2__Impl9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39609 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__3__Impl9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__4__Impl9702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59733 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__5__Impl9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69795 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MapType__Group__6__Impl9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79857 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__7__Impl9888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__89919 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__89922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapType__Group__8__Impl9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__99981 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__99984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__9__Impl10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__1010043 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__1010046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MapType__Group__10__Impl10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__1110105 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__1110108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__11__Impl10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__1210167 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__1210170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__12__Impl10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310229 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MapType__Group__14__Impl10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group_13_2__0__Impl10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group_13_2__2__Impl10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010565 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__0__Impl10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110627 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FixedType__Group__1__Impl10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210689 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__2__Impl10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310751 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__3__Impl10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410813 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__4__Impl10844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510875 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__FixedType__Group__5__Impl10906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__610937 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__610940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__6__Impl10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__710999 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__711002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__7__Impl11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__811061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__811064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__8__Impl11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__911123 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__911126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1011183 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1011186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__10__Impl11214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111245 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__11__Impl11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211307 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__12__Impl11338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311369 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FixedType__Group__13__Impl11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411431 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__14__Impl11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511493 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__15__Impl11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__16__Impl11586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711617 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__18__Impl11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011774 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Group__0__Impl11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111836 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__211896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Group__2__Impl11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__011961 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__011964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__112020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl12047 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__012082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__012085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Namespace__Group_1__0__Impl12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__112144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UnionMember__RecordRefAssignment_6_112308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_2312436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_24_112467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_rule__Field__UnionAssignment_13_712756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_012880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_112911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_112946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_312981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_013012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_113043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_113078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_313113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_413144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_913175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1713206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_113237 = new BitSet(new long[]{0x0000000000000002L});

}