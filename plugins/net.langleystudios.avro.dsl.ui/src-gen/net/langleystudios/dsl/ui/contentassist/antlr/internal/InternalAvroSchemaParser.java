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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'['", "']'", "','", "'{'", "'\"'", "'type'", "':'", "'}'", "'record'", "'fields'", "'namespace'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'.'"
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:424:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) );
    public final void rule__UnionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:428:1: ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) )
            int alt2=6;
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

            }
        }
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:470:1: rule__Field__NameAlternatives_6_0 : ( ( 'name' ) | ( RULE_ID ) );
    public final void rule__Field__NameAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:474:1: ( ( 'name' ) | ( RULE_ID ) )
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
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:475:1: ( 'name' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:475:1: ( 'name' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:476:1: 'name'
                    {
                     before(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 
                    match(input,10,FOLLOW_10_in_rule__Field__NameAlternatives_6_0974); 
                     after(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:483:6: ( RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:483:6: ( RULE_ID )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:484:1: RULE_ID
                    {
                     before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_0993); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:494:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );
    public final void rule__Field__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:498:1: ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:499:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:499:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:500:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:501:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:501:2: rule__Field__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131025);
                    rule__Field__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:505:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:505:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:506:1: ( rule__Field__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:507:1: ( rule__Field__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:507:2: rule__Field__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131043);
                    rule__Field__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:511:6: ( ( rule__Field__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:511:6: ( ( rule__Field__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:512:1: ( rule__Field__Group_13_2__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:513:1: ( rule__Field__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:513:2: rule__Field__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131061);
                    rule__Field__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:518:1: ( rule__Field__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:519:1: ( rule__Field__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:519:2: rule__Field__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131079);
                    rule__Field__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:523:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:523:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:524:1: ( rule__Field__ArrayAssignment_13_4 )
                    {
                     before(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:525:1: ( rule__Field__ArrayAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:525:2: rule__Field__ArrayAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131097);
                    rule__Field__ArrayAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:529:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:529:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:530:1: ( rule__Field__MapAssignment_13_5 )
                    {
                     before(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:531:1: ( rule__Field__MapAssignment_13_5 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:531:2: rule__Field__MapAssignment_13_5
                    {
                    pushFollow(FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131115);
                    rule__Field__MapAssignment_13_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:536:1: ( rule__Field__FixedAssignment_13_6 )
                    {
                     before(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:537:1: ( rule__Field__FixedAssignment_13_6 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:537:2: rule__Field__FixedAssignment_13_6
                    {
                    pushFollow(FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131133);
                    rule__Field__FixedAssignment_13_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:541:6: ( ( rule__Field__UnionAssignment_13_7 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:541:6: ( ( rule__Field__UnionAssignment_13_7 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:542:1: ( rule__Field__UnionAssignment_13_7 )
                    {
                     before(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:543:1: ( rule__Field__UnionAssignment_13_7 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:543:2: rule__Field__UnionAssignment_13_7
                    {
                    pushFollow(FOLLOW_rule__Field__UnionAssignment_13_7_in_rule__Field__Alternatives_131151);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:552:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );
    public final void rule__ArrayType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:556:1: ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:557:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:557:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:558:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:559:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:559:2: rule__ArrayType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131184);
                    rule__ArrayType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:564:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:2: rule__ArrayType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131202);
                    rule__ArrayType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:570:1: ( rule__ArrayType__Group_13_2__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:1: ( rule__ArrayType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:2: rule__ArrayType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131220);
                    rule__ArrayType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:575:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:575:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:576:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:577:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:577:2: rule__ArrayType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131238);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:586:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );
    public final void rule__MapType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:590:1: ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:591:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:591:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:592:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:593:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:593:2: rule__MapType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131271);
                    rule__MapType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:598:1: ( rule__MapType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:1: ( rule__MapType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:2: rule__MapType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131289);
                    rule__MapType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__MapType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__MapType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:604:1: ( rule__MapType__Group_13_2__0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:1: ( rule__MapType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:2: rule__MapType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131307);
                    rule__MapType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:610:1: ( rule__MapType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:1: ( rule__MapType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:2: rule__MapType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131325);
                    rule__MapType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:615:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:615:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:616:1: ( rule__MapType__AtypeAssignment_13_4 )
                    {
                     before(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:617:1: ( rule__MapType__AtypeAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:617:2: rule__MapType__AtypeAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131343);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:626:1: rule__Primitive__TypeAlternatives_1_0 : ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) );
    public final void rule__Primitive__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:630:1: ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) )
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
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:631:1: ( 'null' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:631:1: ( 'null' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:632:1: 'null'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01377); 
                     after(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:639:6: ( 'boolean' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:639:6: ( 'boolean' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:640:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01397); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:647:6: ( 'int' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:647:6: ( 'int' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:648:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01417); 
                     after(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:655:6: ( 'long' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:655:6: ( 'long' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:656:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01437); 
                     after(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:663:6: ( 'float' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:663:6: ( 'float' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:664:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01457); 
                     after(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:671:6: ( 'double' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:671:6: ( 'double' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:672:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 
                    match(input,16,FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01477); 
                     after(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:679:6: ( 'bytes' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:679:6: ( 'bytes' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:680:1: 'bytes'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 
                    match(input,17,FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01497); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:687:6: ( 'string' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:687:6: ( 'string' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:688:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 
                    match(input,18,FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01517); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:702:1: rule__UnionType__Group__0 : rule__UnionType__Group__0__Impl rule__UnionType__Group__1 ;
    public final void rule__UnionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:706:1: ( rule__UnionType__Group__0__Impl rule__UnionType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:707:2: rule__UnionType__Group__0__Impl rule__UnionType__Group__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01549);
            rule__UnionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01552);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:714:1: rule__UnionType__Group__0__Impl : ( '[' ) ;
    public final void rule__UnionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:718:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:719:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:719:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:720:1: '['
            {
             before(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__UnionType__Group__0__Impl1580); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:733:1: rule__UnionType__Group__1 : rule__UnionType__Group__1__Impl rule__UnionType__Group__2 ;
    public final void rule__UnionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:737:1: ( rule__UnionType__Group__1__Impl rule__UnionType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:738:2: rule__UnionType__Group__1__Impl rule__UnionType__Group__2
            {
            pushFollow(FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11611);
            rule__UnionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11614);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:745:1: rule__UnionType__Group__1__Impl : ( ( rule__UnionType__TypesAssignment_1 ) ) ;
    public final void rule__UnionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:749:1: ( ( ( rule__UnionType__TypesAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:750:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:750:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:751:1: ( rule__UnionType__TypesAssignment_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:752:1: ( rule__UnionType__TypesAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:752:2: rule__UnionType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1641);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:762:1: rule__UnionType__Group__2 : rule__UnionType__Group__2__Impl rule__UnionType__Group__3 ;
    public final void rule__UnionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:766:1: ( rule__UnionType__Group__2__Impl rule__UnionType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:767:2: rule__UnionType__Group__2__Impl rule__UnionType__Group__3
            {
            pushFollow(FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21671);
            rule__UnionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21674);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:774:1: rule__UnionType__Group__2__Impl : ( ( rule__UnionType__Group_2__0 )* ) ;
    public final void rule__UnionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:778:1: ( ( ( rule__UnionType__Group_2__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:779:1: ( ( rule__UnionType__Group_2__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:779:1: ( ( rule__UnionType__Group_2__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:780:1: ( rule__UnionType__Group_2__0 )*
            {
             before(grammarAccess.getUnionTypeAccess().getGroup_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:781:1: ( rule__UnionType__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:781:2: rule__UnionType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1701);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:791:1: rule__UnionType__Group__3 : rule__UnionType__Group__3__Impl ;
    public final void rule__UnionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:795:1: ( rule__UnionType__Group__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:796:2: rule__UnionType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31732);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:802:1: rule__UnionType__Group__3__Impl : ( ']' ) ;
    public final void rule__UnionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:806:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:807:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:807:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:808:1: ']'
            {
             before(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__UnionType__Group__3__Impl1760); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:829:1: rule__UnionType__Group_2__0 : rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 ;
    public final void rule__UnionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:833:1: ( rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:834:2: rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01799);
            rule__UnionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01802);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:841:1: rule__UnionType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:845:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:846:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:846:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:847:1: ','
            {
             before(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1830); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:860:1: rule__UnionType__Group_2__1 : rule__UnionType__Group_2__1__Impl ;
    public final void rule__UnionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:864:1: ( rule__UnionType__Group_2__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:865:2: rule__UnionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11861);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:871:1: rule__UnionType__Group_2__1__Impl : ( ( rule__UnionType__TypesAssignment_2_1 ) ) ;
    public final void rule__UnionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:875:1: ( ( ( rule__UnionType__TypesAssignment_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:876:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:876:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:877:1: ( rule__UnionType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:878:1: ( rule__UnionType__TypesAssignment_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:878:2: rule__UnionType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1888);
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


    // $ANTLR start "rule__JsonType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:892:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:896:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:897:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__01922);
            rule__JsonType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__01925);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:904:1: rule__JsonType__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:908:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:909:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:909:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:910:1: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__0__Impl1953); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:923:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:927:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:928:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__11984);
            rule__JsonType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__11987);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:935:1: rule__JsonType__Group__1__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:939:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:940:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:940:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:941:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__1__Impl2015); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:954:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl rule__JsonType__Group__3 ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:958:1: ( rule__JsonType__Group__2__Impl rule__JsonType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:959:2: rule__JsonType__Group__2__Impl rule__JsonType__Group__3
            {
            pushFollow(FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22046);
            rule__JsonType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22049);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:966:1: rule__JsonType__Group__2__Impl : ( 'type' ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:970:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:971:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:971:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:972:1: 'type'
            {
             before(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__JsonType__Group__2__Impl2077); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:985:1: rule__JsonType__Group__3 : rule__JsonType__Group__3__Impl rule__JsonType__Group__4 ;
    public final void rule__JsonType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:989:1: ( rule__JsonType__Group__3__Impl rule__JsonType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:990:2: rule__JsonType__Group__3__Impl rule__JsonType__Group__4
            {
            pushFollow(FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32108);
            rule__JsonType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32111);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:997:1: rule__JsonType__Group__3__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1001:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1002:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1002:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1003:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__3__Impl2139); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1016:1: rule__JsonType__Group__4 : rule__JsonType__Group__4__Impl rule__JsonType__Group__5 ;
    public final void rule__JsonType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1020:1: ( rule__JsonType__Group__4__Impl rule__JsonType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1021:2: rule__JsonType__Group__4__Impl rule__JsonType__Group__5
            {
            pushFollow(FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42170);
            rule__JsonType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42173);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1028:1: rule__JsonType__Group__4__Impl : ( ':' ) ;
    public final void rule__JsonType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1032:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1033:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1033:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1034:1: ':'
            {
             before(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__JsonType__Group__4__Impl2201); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1047:1: rule__JsonType__Group__5 : rule__JsonType__Group__5__Impl rule__JsonType__Group__6 ;
    public final void rule__JsonType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1051:1: ( rule__JsonType__Group__5__Impl rule__JsonType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1052:2: rule__JsonType__Group__5__Impl rule__JsonType__Group__6
            {
            pushFollow(FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52232);
            rule__JsonType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52235);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1059:1: rule__JsonType__Group__5__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1063:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1064:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1064:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1065:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__5__Impl2263); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1078:1: rule__JsonType__Group__6 : rule__JsonType__Group__6__Impl rule__JsonType__Group__7 ;
    public final void rule__JsonType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1082:1: ( rule__JsonType__Group__6__Impl rule__JsonType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1083:2: rule__JsonType__Group__6__Impl rule__JsonType__Group__7
            {
            pushFollow(FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62294);
            rule__JsonType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62297);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1090:1: rule__JsonType__Group__6__Impl : ( ( rule__JsonType__TypeAssignment_6 ) ) ;
    public final void rule__JsonType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1094:1: ( ( ( rule__JsonType__TypeAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1095:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1095:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1096:1: ( rule__JsonType__TypeAssignment_6 )
            {
             before(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1097:1: ( rule__JsonType__TypeAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1097:2: rule__JsonType__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2324);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1107:1: rule__JsonType__Group__7 : rule__JsonType__Group__7__Impl rule__JsonType__Group__8 ;
    public final void rule__JsonType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1111:1: ( rule__JsonType__Group__7__Impl rule__JsonType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1112:2: rule__JsonType__Group__7__Impl rule__JsonType__Group__8
            {
            pushFollow(FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72354);
            rule__JsonType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72357);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1119:1: rule__JsonType__Group__7__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1123:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1124:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1124:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1125:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__7__Impl2385); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1138:1: rule__JsonType__Group__8 : rule__JsonType__Group__8__Impl ;
    public final void rule__JsonType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1142:1: ( rule__JsonType__Group__8__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1143:2: rule__JsonType__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82416);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1149:1: rule__JsonType__Group__8__Impl : ( '}' ) ;
    public final void rule__JsonType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1153:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1154:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1154:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1155:1: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__JsonType__Group__8__Impl2444); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1186:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1190:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1191:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02493);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02496);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1198:1: rule__RecordType__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1202:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1203:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1203:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1204:1: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__0__Impl2524); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1217:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1221:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1222:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12555);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12558);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1229:1: rule__RecordType__Group__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1233:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1234:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1234:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1235:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__1__Impl2586); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1248:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1252:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1253:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22617);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22620);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1260:1: rule__RecordType__Group__2__Impl : ( 'type' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1264:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1265:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1265:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1266:1: 'type'
            {
             before(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__RecordType__Group__2__Impl2648); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1279:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1283:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1284:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32679);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32682);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1291:1: rule__RecordType__Group__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1295:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1296:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1296:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1297:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__3__Impl2710); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1310:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1314:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1315:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__42741);
            rule__RecordType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__42744);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1322:1: rule__RecordType__Group__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1326:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1327:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1327:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1328:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__4__Impl2772); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1341:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1345:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1346:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__52803);
            rule__RecordType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__52806);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1353:1: rule__RecordType__Group__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1357:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1358:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1358:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1359:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__5__Impl2834); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1372:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1376:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1377:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__62865);
            rule__RecordType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__62868);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1384:1: rule__RecordType__Group__6__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1388:1: ( ( 'record' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1389:1: ( 'record' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1389:1: ( 'record' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1390:1: 'record'
            {
             before(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__RecordType__Group__6__Impl2896); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1403:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl rule__RecordType__Group__8 ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1407:1: ( rule__RecordType__Group__7__Impl rule__RecordType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1408:2: rule__RecordType__Group__7__Impl rule__RecordType__Group__8
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__72927);
            rule__RecordType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__72930);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1415:1: rule__RecordType__Group__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1419:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1420:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1420:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1421:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__7__Impl2958); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1434:1: rule__RecordType__Group__8 : rule__RecordType__Group__8__Impl rule__RecordType__Group__9 ;
    public final void rule__RecordType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1438:1: ( rule__RecordType__Group__8__Impl rule__RecordType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1439:2: rule__RecordType__Group__8__Impl rule__RecordType__Group__9
            {
            pushFollow(FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__82989);
            rule__RecordType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__82992);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1446:1: rule__RecordType__Group__8__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1450:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1451:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1451:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1452:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__8__Impl3020); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1465:1: rule__RecordType__Group__9 : rule__RecordType__Group__9__Impl rule__RecordType__Group__10 ;
    public final void rule__RecordType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1469:1: ( rule__RecordType__Group__9__Impl rule__RecordType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1470:2: rule__RecordType__Group__9__Impl rule__RecordType__Group__10
            {
            pushFollow(FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93051);
            rule__RecordType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93054);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1477:1: rule__RecordType__Group__9__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1481:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1482:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1482:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1483:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__9__Impl3082); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1496:1: rule__RecordType__Group__10 : rule__RecordType__Group__10__Impl rule__RecordType__Group__11 ;
    public final void rule__RecordType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1500:1: ( rule__RecordType__Group__10__Impl rule__RecordType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1501:2: rule__RecordType__Group__10__Impl rule__RecordType__Group__11
            {
            pushFollow(FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103113);
            rule__RecordType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103116);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1508:1: rule__RecordType__Group__10__Impl : ( 'name' ) ;
    public final void rule__RecordType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1512:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1513:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1513:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1514:1: 'name'
            {
             before(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__RecordType__Group__10__Impl3144); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1527:1: rule__RecordType__Group__11 : rule__RecordType__Group__11__Impl rule__RecordType__Group__12 ;
    public final void rule__RecordType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1531:1: ( rule__RecordType__Group__11__Impl rule__RecordType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1532:2: rule__RecordType__Group__11__Impl rule__RecordType__Group__12
            {
            pushFollow(FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113175);
            rule__RecordType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113178);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1539:1: rule__RecordType__Group__11__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1543:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1544:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1544:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1545:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__11__Impl3206); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1558:1: rule__RecordType__Group__12 : rule__RecordType__Group__12__Impl rule__RecordType__Group__13 ;
    public final void rule__RecordType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1562:1: ( rule__RecordType__Group__12__Impl rule__RecordType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1563:2: rule__RecordType__Group__12__Impl rule__RecordType__Group__13
            {
            pushFollow(FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123237);
            rule__RecordType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123240);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1570:1: rule__RecordType__Group__12__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1574:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1575:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1575:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1576:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__12__Impl3268); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1589:1: rule__RecordType__Group__13 : rule__RecordType__Group__13__Impl rule__RecordType__Group__14 ;
    public final void rule__RecordType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1593:1: ( rule__RecordType__Group__13__Impl rule__RecordType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1594:2: rule__RecordType__Group__13__Impl rule__RecordType__Group__14
            {
            pushFollow(FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133299);
            rule__RecordType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133302);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1601:1: rule__RecordType__Group__13__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1605:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1606:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1606:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1607:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__13__Impl3330); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1620:1: rule__RecordType__Group__14 : rule__RecordType__Group__14__Impl rule__RecordType__Group__15 ;
    public final void rule__RecordType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1624:1: ( rule__RecordType__Group__14__Impl rule__RecordType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1625:2: rule__RecordType__Group__14__Impl rule__RecordType__Group__15
            {
            pushFollow(FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143361);
            rule__RecordType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143364);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1632:1: rule__RecordType__Group__14__Impl : ( ( rule__RecordType__NameAssignment_14 ) ) ;
    public final void rule__RecordType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1636:1: ( ( ( rule__RecordType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1637:1: ( ( rule__RecordType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1637:1: ( ( rule__RecordType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1638:1: ( rule__RecordType__NameAssignment_14 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1639:1: ( rule__RecordType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1639:2: rule__RecordType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3391);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1649:1: rule__RecordType__Group__15 : rule__RecordType__Group__15__Impl rule__RecordType__Group__16 ;
    public final void rule__RecordType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1653:1: ( rule__RecordType__Group__15__Impl rule__RecordType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1654:2: rule__RecordType__Group__15__Impl rule__RecordType__Group__16
            {
            pushFollow(FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153421);
            rule__RecordType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153424);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1661:1: rule__RecordType__Group__15__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1665:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1666:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1666:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1667:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__15__Impl3452); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1680:1: rule__RecordType__Group__16 : rule__RecordType__Group__16__Impl rule__RecordType__Group__17 ;
    public final void rule__RecordType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1684:1: ( rule__RecordType__Group__16__Impl rule__RecordType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1685:2: rule__RecordType__Group__16__Impl rule__RecordType__Group__17
            {
            pushFollow(FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163483);
            rule__RecordType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163486);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1692:1: rule__RecordType__Group__16__Impl : ( ( rule__RecordType__Group_16__0 )? ) ;
    public final void rule__RecordType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1696:1: ( ( ( rule__RecordType__Group_16__0 )? ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1697:1: ( ( rule__RecordType__Group_16__0 )? )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1697:1: ( ( rule__RecordType__Group_16__0 )? )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1698:1: ( rule__RecordType__Group_16__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_16()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1699:1: ( rule__RecordType__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1699:2: rule__RecordType__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3513);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1709:1: rule__RecordType__Group__17 : rule__RecordType__Group__17__Impl rule__RecordType__Group__18 ;
    public final void rule__RecordType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1713:1: ( rule__RecordType__Group__17__Impl rule__RecordType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1714:2: rule__RecordType__Group__17__Impl rule__RecordType__Group__18
            {
            pushFollow(FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173544);
            rule__RecordType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173547);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1721:1: rule__RecordType__Group__17__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1725:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1726:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1726:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1727:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__17__Impl3575); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1740:1: rule__RecordType__Group__18 : rule__RecordType__Group__18__Impl rule__RecordType__Group__19 ;
    public final void rule__RecordType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1744:1: ( rule__RecordType__Group__18__Impl rule__RecordType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1745:2: rule__RecordType__Group__18__Impl rule__RecordType__Group__19
            {
            pushFollow(FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183606);
            rule__RecordType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183609);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1752:1: rule__RecordType__Group__18__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1756:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1757:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1757:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1758:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__18__Impl3637); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1771:1: rule__RecordType__Group__19 : rule__RecordType__Group__19__Impl rule__RecordType__Group__20 ;
    public final void rule__RecordType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1775:1: ( rule__RecordType__Group__19__Impl rule__RecordType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1776:2: rule__RecordType__Group__19__Impl rule__RecordType__Group__20
            {
            pushFollow(FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193668);
            rule__RecordType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193671);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1783:1: rule__RecordType__Group__19__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1787:1: ( ( 'fields' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1788:1: ( 'fields' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1788:1: ( 'fields' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1789:1: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 
            match(input,28,FOLLOW_28_in_rule__RecordType__Group__19__Impl3699); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1802:1: rule__RecordType__Group__20 : rule__RecordType__Group__20__Impl rule__RecordType__Group__21 ;
    public final void rule__RecordType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1806:1: ( rule__RecordType__Group__20__Impl rule__RecordType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1807:2: rule__RecordType__Group__20__Impl rule__RecordType__Group__21
            {
            pushFollow(FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203730);
            rule__RecordType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203733);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1814:1: rule__RecordType__Group__20__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1818:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1819:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1819:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1820:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__20__Impl3761); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1833:1: rule__RecordType__Group__21 : rule__RecordType__Group__21__Impl rule__RecordType__Group__22 ;
    public final void rule__RecordType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1837:1: ( rule__RecordType__Group__21__Impl rule__RecordType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1838:2: rule__RecordType__Group__21__Impl rule__RecordType__Group__22
            {
            pushFollow(FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__213792);
            rule__RecordType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__213795);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1845:1: rule__RecordType__Group__21__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1849:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1850:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1850:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1851:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__21__Impl3823); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1864:1: rule__RecordType__Group__22 : rule__RecordType__Group__22__Impl rule__RecordType__Group__23 ;
    public final void rule__RecordType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1868:1: ( rule__RecordType__Group__22__Impl rule__RecordType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1869:2: rule__RecordType__Group__22__Impl rule__RecordType__Group__23
            {
            pushFollow(FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__223854);
            rule__RecordType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__223857);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1876:1: rule__RecordType__Group__22__Impl : ( '[' ) ;
    public final void rule__RecordType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1880:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1881:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1881:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1882:1: '['
            {
             before(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 
            match(input,19,FOLLOW_19_in_rule__RecordType__Group__22__Impl3885); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1895:1: rule__RecordType__Group__23 : rule__RecordType__Group__23__Impl rule__RecordType__Group__24 ;
    public final void rule__RecordType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1899:1: ( rule__RecordType__Group__23__Impl rule__RecordType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1900:2: rule__RecordType__Group__23__Impl rule__RecordType__Group__24
            {
            pushFollow(FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__233916);
            rule__RecordType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__233919);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1907:1: rule__RecordType__Group__23__Impl : ( ( rule__RecordType__FieldsAssignment_23 ) ) ;
    public final void rule__RecordType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1911:1: ( ( ( rule__RecordType__FieldsAssignment_23 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1912:1: ( ( rule__RecordType__FieldsAssignment_23 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1912:1: ( ( rule__RecordType__FieldsAssignment_23 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1913:1: ( rule__RecordType__FieldsAssignment_23 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1914:1: ( rule__RecordType__FieldsAssignment_23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1914:2: rule__RecordType__FieldsAssignment_23
            {
            pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_23_in_rule__RecordType__Group__23__Impl3946);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1924:1: rule__RecordType__Group__24 : rule__RecordType__Group__24__Impl rule__RecordType__Group__25 ;
    public final void rule__RecordType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1928:1: ( rule__RecordType__Group__24__Impl rule__RecordType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1929:2: rule__RecordType__Group__24__Impl rule__RecordType__Group__25
            {
            pushFollow(FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__243976);
            rule__RecordType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__243979);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1936:1: rule__RecordType__Group__24__Impl : ( ( rule__RecordType__Group_24__0 )* ) ;
    public final void rule__RecordType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1940:1: ( ( ( rule__RecordType__Group_24__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1941:1: ( ( rule__RecordType__Group_24__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1941:1: ( ( rule__RecordType__Group_24__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1942:1: ( rule__RecordType__Group_24__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_24()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1943:1: ( rule__RecordType__Group_24__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1943:2: rule__RecordType__Group_24__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_24__0_in_rule__RecordType__Group__24__Impl4006);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1953:1: rule__RecordType__Group__25 : rule__RecordType__Group__25__Impl rule__RecordType__Group__26 ;
    public final void rule__RecordType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1957:1: ( rule__RecordType__Group__25__Impl rule__RecordType__Group__26 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1958:2: rule__RecordType__Group__25__Impl rule__RecordType__Group__26
            {
            pushFollow(FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254037);
            rule__RecordType__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__26_in_rule__RecordType__Group__254040);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1965:1: rule__RecordType__Group__25__Impl : ( ']' ) ;
    public final void rule__RecordType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1969:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1970:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1970:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1971:1: ']'
            {
             before(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_25()); 
            match(input,20,FOLLOW_20_in_rule__RecordType__Group__25__Impl4068); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1984:1: rule__RecordType__Group__26 : rule__RecordType__Group__26__Impl ;
    public final void rule__RecordType__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1988:1: ( rule__RecordType__Group__26__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1989:2: rule__RecordType__Group__26__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__26__Impl_in_rule__RecordType__Group__264099);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1995:1: rule__RecordType__Group__26__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1999:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2000:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2000:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2001:1: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_26()); 
            match(input,26,FOLLOW_26_in_rule__RecordType__Group__26__Impl4127); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2068:1: rule__RecordType__Group_16__0 : rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 ;
    public final void rule__RecordType__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2072:1: ( rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2073:2: rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04212);
            rule__RecordType__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04215);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2080:1: rule__RecordType__Group_16__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2084:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2085:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2085:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2086:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4243); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2099:1: rule__RecordType__Group_16__1 : rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 ;
    public final void rule__RecordType__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2103:1: ( rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2104:2: rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14274);
            rule__RecordType__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14277);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2111:1: rule__RecordType__Group_16__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2115:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2116:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2116:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2117:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__1__Impl4305); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2130:1: rule__RecordType__Group_16__2 : rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 ;
    public final void rule__RecordType__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2134:1: ( rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2135:2: rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24336);
            rule__RecordType__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24339);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2142:1: rule__RecordType__Group_16__2__Impl : ( 'namespace' ) ;
    public final void rule__RecordType__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2146:1: ( ( 'namespace' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2147:1: ( 'namespace' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2147:1: ( 'namespace' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2148:1: 'namespace'
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 
            match(input,29,FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4367); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2161:1: rule__RecordType__Group_16__3 : rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 ;
    public final void rule__RecordType__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2165:1: ( rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2166:2: rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34398);
            rule__RecordType__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34401);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2173:1: rule__RecordType__Group_16__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2177:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2178:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2178:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2179:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__3__Impl4429); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2192:1: rule__RecordType__Group_16__4 : rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 ;
    public final void rule__RecordType__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2196:1: ( rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2197:2: rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44460);
            rule__RecordType__Group_16__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44463);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2204:1: rule__RecordType__Group_16__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2208:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2209:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2209:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2210:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4491); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2223:1: rule__RecordType__Group_16__5 : rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 ;
    public final void rule__RecordType__Group_16__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2227:1: ( rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2228:2: rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54522);
            rule__RecordType__Group_16__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54525);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2235:1: rule__RecordType__Group_16__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2239:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2240:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2240:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2241:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__5__Impl4553); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2254:1: rule__RecordType__Group_16__6 : rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 ;
    public final void rule__RecordType__Group_16__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2258:1: ( rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2259:2: rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64584);
            rule__RecordType__Group_16__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64587);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2266:1: rule__RecordType__Group_16__6__Impl : ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) ;
    public final void rule__RecordType__Group_16__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2270:1: ( ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2271:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2271:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2272:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2273:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2273:2: rule__RecordType__NamespaceAssignment_16_6
            {
            pushFollow(FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4614);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2283:1: rule__RecordType__Group_16__7 : rule__RecordType__Group_16__7__Impl ;
    public final void rule__RecordType__Group_16__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2287:1: ( rule__RecordType__Group_16__7__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2288:2: rule__RecordType__Group_16__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74644);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2294:1: rule__RecordType__Group_16__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2298:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2299:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2299:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2300:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__7__Impl4672); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2329:1: rule__RecordType__Group_24__0 : rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1 ;
    public final void rule__RecordType__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2333:1: ( rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2334:2: rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_24__0__Impl_in_rule__RecordType__Group_24__04719);
            rule__RecordType__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_24__1_in_rule__RecordType__Group_24__04722);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2341:1: rule__RecordType__Group_24__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2345:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2346:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2346:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2347:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_24_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_24__0__Impl4750); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2360:1: rule__RecordType__Group_24__1 : rule__RecordType__Group_24__1__Impl ;
    public final void rule__RecordType__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2364:1: ( rule__RecordType__Group_24__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2365:2: rule__RecordType__Group_24__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_24__1__Impl_in_rule__RecordType__Group_24__14781);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2371:1: rule__RecordType__Group_24__1__Impl : ( ( rule__RecordType__FieldsAssignment_24_1 ) ) ;
    public final void rule__RecordType__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2375:1: ( ( ( rule__RecordType__FieldsAssignment_24_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2376:1: ( ( rule__RecordType__FieldsAssignment_24_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2376:1: ( ( rule__RecordType__FieldsAssignment_24_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2377:1: ( rule__RecordType__FieldsAssignment_24_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_24_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2378:1: ( rule__RecordType__FieldsAssignment_24_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2378:2: rule__RecordType__FieldsAssignment_24_1
            {
            pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_24_1_in_rule__RecordType__Group_24__1__Impl4808);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2392:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2396:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2397:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04842);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04845);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2404:1: rule__Field__Group__0__Impl : ( '{' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2408:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2409:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2409:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2410:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__0__Impl4873); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2423:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2427:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2428:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14904);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14907);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2435:1: rule__Field__Group__1__Impl : ( '\"' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2439:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2440:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2440:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2441:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__1__Impl4935); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2454:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2458:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2459:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24966);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24969);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2466:1: rule__Field__Group__2__Impl : ( 'name' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2470:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2471:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2471:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2472:1: 'name'
            {
             before(grammarAccess.getFieldAccess().getNameKeyword_2()); 
            match(input,10,FOLLOW_10_in_rule__Field__Group__2__Impl4997); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2485:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2489:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2490:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35028);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35031);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2497:1: rule__Field__Group__3__Impl : ( '\"' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2501:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2502:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2502:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2503:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__3__Impl5059); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2516:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2520:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2521:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45090);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45093);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2528:1: rule__Field__Group__4__Impl : ( ':' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2532:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2533:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2533:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2534:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__4__Impl5121); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2547:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2551:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2552:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55152);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55155);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2559:1: rule__Field__Group__5__Impl : ( '\"' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2563:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2564:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2564:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2565:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__5__Impl5183); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2578:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2582:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2583:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65214);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65217);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2590:1: rule__Field__Group__6__Impl : ( ( rule__Field__NameAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2594:1: ( ( ( rule__Field__NameAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2595:1: ( ( rule__Field__NameAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2595:1: ( ( rule__Field__NameAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2596:1: ( rule__Field__NameAssignment_6 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2597:1: ( rule__Field__NameAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2597:2: rule__Field__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5244);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2607:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2611:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2612:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75274);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75277);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2619:1: rule__Field__Group__7__Impl : ( '\"' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2623:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2624:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2624:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2625:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__7__Impl5305); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2638:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2642:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2643:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85336);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85339);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2650:1: rule__Field__Group__8__Impl : ( ',' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2654:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2655:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2655:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2656:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Field__Group__8__Impl5367); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2669:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2673:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2674:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95398);
            rule__Field__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95401);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2681:1: rule__Field__Group__9__Impl : ( '\"' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2685:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2686:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2686:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2687:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__9__Impl5429); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2700:1: rule__Field__Group__10 : rule__Field__Group__10__Impl rule__Field__Group__11 ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2704:1: ( rule__Field__Group__10__Impl rule__Field__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2705:2: rule__Field__Group__10__Impl rule__Field__Group__11
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105460);
            rule__Field__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105463);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2712:1: rule__Field__Group__10__Impl : ( 'type' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2716:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2717:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2717:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2718:1: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_10()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group__10__Impl5491); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2731:1: rule__Field__Group__11 : rule__Field__Group__11__Impl rule__Field__Group__12 ;
    public final void rule__Field__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2735:1: ( rule__Field__Group__11__Impl rule__Field__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2736:2: rule__Field__Group__11__Impl rule__Field__Group__12
            {
            pushFollow(FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115522);
            rule__Field__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115525);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2743:1: rule__Field__Group__11__Impl : ( '\"' ) ;
    public final void rule__Field__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2747:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2748:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2748:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2749:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__11__Impl5553); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2762:1: rule__Field__Group__12 : rule__Field__Group__12__Impl rule__Field__Group__13 ;
    public final void rule__Field__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2766:1: ( rule__Field__Group__12__Impl rule__Field__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2767:2: rule__Field__Group__12__Impl rule__Field__Group__13
            {
            pushFollow(FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125584);
            rule__Field__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125587);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2774:1: rule__Field__Group__12__Impl : ( ':' ) ;
    public final void rule__Field__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2778:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2779:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2779:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2780:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__12__Impl5615); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2793:1: rule__Field__Group__13 : rule__Field__Group__13__Impl rule__Field__Group__14 ;
    public final void rule__Field__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2797:1: ( rule__Field__Group__13__Impl rule__Field__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2798:2: rule__Field__Group__13__Impl rule__Field__Group__14
            {
            pushFollow(FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135646);
            rule__Field__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135649);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2805:1: rule__Field__Group__13__Impl : ( ( rule__Field__Alternatives_13 ) ) ;
    public final void rule__Field__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2809:1: ( ( ( rule__Field__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2810:1: ( ( rule__Field__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2810:1: ( ( rule__Field__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2811:1: ( rule__Field__Alternatives_13 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2812:1: ( rule__Field__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2812:2: rule__Field__Alternatives_13
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl5676);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2822:1: rule__Field__Group__14 : rule__Field__Group__14__Impl ;
    public final void rule__Field__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2826:1: ( rule__Field__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2827:2: rule__Field__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__145706);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2833:1: rule__Field__Group__14__Impl : ( '}' ) ;
    public final void rule__Field__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2837:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2838:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2838:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2839:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__Field__Group__14__Impl5734); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2882:1: rule__Field__Group_13_2__0 : rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 ;
    public final void rule__Field__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2886:1: ( rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2887:2: rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__05795);
            rule__Field__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__05798);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2894:1: rule__Field__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2898:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2899:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2899:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2900:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_13_2__0__Impl5826); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2913:1: rule__Field__Group_13_2__1 : rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 ;
    public final void rule__Field__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2917:1: ( rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2918:2: rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__15857);
            rule__Field__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__15860);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2925:1: rule__Field__Group_13_2__1__Impl : ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__Field__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2929:1: ( ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2930:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2930:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2931:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2932:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2932:2: rule__Field__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl5887);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2942:1: rule__Field__Group_13_2__2 : rule__Field__Group_13_2__2__Impl ;
    public final void rule__Field__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2946:1: ( rule__Field__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2947:2: rule__Field__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__25917);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2953:1: rule__Field__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2957:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2958:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2958:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2959:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_13_2__2__Impl5945); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2978:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2982:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2983:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__05982);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__05985);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2990:1: rule__EnumType__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2994:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2995:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2995:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2996:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__0__Impl6013); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3009:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3013:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3014:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16044);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16047);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3021:1: rule__EnumType__Group__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3025:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3026:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3026:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3027:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__1__Impl6075); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3040:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3044:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3045:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26106);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26109);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3052:1: rule__EnumType__Group__2__Impl : ( 'type' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3056:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3057:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3057:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3058:1: 'type'
            {
             before(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__EnumType__Group__2__Impl6137); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3071:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3075:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3076:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36168);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36171);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3083:1: rule__EnumType__Group__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3087:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3088:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3088:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3089:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__3__Impl6199); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3102:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3106:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3107:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46230);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46233);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3114:1: rule__EnumType__Group__4__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3118:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3119:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3119:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3120:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__4__Impl6261); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3133:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3137:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3138:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56292);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56295);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3145:1: rule__EnumType__Group__5__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3149:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3150:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3150:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3151:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__5__Impl6323); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3164:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl rule__EnumType__Group__7 ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3168:1: ( rule__EnumType__Group__6__Impl rule__EnumType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3169:2: rule__EnumType__Group__6__Impl rule__EnumType__Group__7
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66354);
            rule__EnumType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66357);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3176:1: rule__EnumType__Group__6__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3180:1: ( ( 'enum' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3181:1: ( 'enum' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3181:1: ( 'enum' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3182:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EnumType__Group__6__Impl6385); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3195:1: rule__EnumType__Group__7 : rule__EnumType__Group__7__Impl rule__EnumType__Group__8 ;
    public final void rule__EnumType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3199:1: ( rule__EnumType__Group__7__Impl rule__EnumType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3200:2: rule__EnumType__Group__7__Impl rule__EnumType__Group__8
            {
            pushFollow(FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76416);
            rule__EnumType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76419);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3207:1: rule__EnumType__Group__7__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3211:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3212:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3212:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3213:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__7__Impl6447); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3226:1: rule__EnumType__Group__8 : rule__EnumType__Group__8__Impl rule__EnumType__Group__9 ;
    public final void rule__EnumType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3230:1: ( rule__EnumType__Group__8__Impl rule__EnumType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3231:2: rule__EnumType__Group__8__Impl rule__EnumType__Group__9
            {
            pushFollow(FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86478);
            rule__EnumType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86481);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3238:1: rule__EnumType__Group__8__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3242:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3243:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3243:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3244:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__8__Impl6509); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3257:1: rule__EnumType__Group__9 : rule__EnumType__Group__9__Impl rule__EnumType__Group__10 ;
    public final void rule__EnumType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3261:1: ( rule__EnumType__Group__9__Impl rule__EnumType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3262:2: rule__EnumType__Group__9__Impl rule__EnumType__Group__10
            {
            pushFollow(FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96540);
            rule__EnumType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96543);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3269:1: rule__EnumType__Group__9__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3273:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3274:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3274:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3275:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__9__Impl6571); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3288:1: rule__EnumType__Group__10 : rule__EnumType__Group__10__Impl rule__EnumType__Group__11 ;
    public final void rule__EnumType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3292:1: ( rule__EnumType__Group__10__Impl rule__EnumType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3293:2: rule__EnumType__Group__10__Impl rule__EnumType__Group__11
            {
            pushFollow(FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106602);
            rule__EnumType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106605);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3300:1: rule__EnumType__Group__10__Impl : ( 'name' ) ;
    public final void rule__EnumType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3304:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3305:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3305:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3306:1: 'name'
            {
             before(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__EnumType__Group__10__Impl6633); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3319:1: rule__EnumType__Group__11 : rule__EnumType__Group__11__Impl rule__EnumType__Group__12 ;
    public final void rule__EnumType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3323:1: ( rule__EnumType__Group__11__Impl rule__EnumType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3324:2: rule__EnumType__Group__11__Impl rule__EnumType__Group__12
            {
            pushFollow(FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116664);
            rule__EnumType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116667);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3331:1: rule__EnumType__Group__11__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3335:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3336:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3336:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3337:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__11__Impl6695); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3350:1: rule__EnumType__Group__12 : rule__EnumType__Group__12__Impl rule__EnumType__Group__13 ;
    public final void rule__EnumType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3354:1: ( rule__EnumType__Group__12__Impl rule__EnumType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3355:2: rule__EnumType__Group__12__Impl rule__EnumType__Group__13
            {
            pushFollow(FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__126726);
            rule__EnumType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__126729);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3362:1: rule__EnumType__Group__12__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3366:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3367:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3367:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3368:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__12__Impl6757); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3381:1: rule__EnumType__Group__13 : rule__EnumType__Group__13__Impl rule__EnumType__Group__14 ;
    public final void rule__EnumType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3385:1: ( rule__EnumType__Group__13__Impl rule__EnumType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3386:2: rule__EnumType__Group__13__Impl rule__EnumType__Group__14
            {
            pushFollow(FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__136788);
            rule__EnumType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__136791);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3393:1: rule__EnumType__Group__13__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3397:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3398:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3398:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3399:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__13__Impl6819); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3412:1: rule__EnumType__Group__14 : rule__EnumType__Group__14__Impl rule__EnumType__Group__15 ;
    public final void rule__EnumType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3416:1: ( rule__EnumType__Group__14__Impl rule__EnumType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3417:2: rule__EnumType__Group__14__Impl rule__EnumType__Group__15
            {
            pushFollow(FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__146850);
            rule__EnumType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__146853);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3424:1: rule__EnumType__Group__14__Impl : ( ( rule__EnumType__NameAssignment_14 ) ) ;
    public final void rule__EnumType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3428:1: ( ( ( rule__EnumType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3429:1: ( ( rule__EnumType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3429:1: ( ( rule__EnumType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3430:1: ( rule__EnumType__NameAssignment_14 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3431:1: ( rule__EnumType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3431:2: rule__EnumType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl6880);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3441:1: rule__EnumType__Group__15 : rule__EnumType__Group__15__Impl rule__EnumType__Group__16 ;
    public final void rule__EnumType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3445:1: ( rule__EnumType__Group__15__Impl rule__EnumType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3446:2: rule__EnumType__Group__15__Impl rule__EnumType__Group__16
            {
            pushFollow(FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__156910);
            rule__EnumType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__156913);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3453:1: rule__EnumType__Group__15__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3457:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3458:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3458:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3459:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__15__Impl6941); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3472:1: rule__EnumType__Group__16 : rule__EnumType__Group__16__Impl rule__EnumType__Group__17 ;
    public final void rule__EnumType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3476:1: ( rule__EnumType__Group__16__Impl rule__EnumType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3477:2: rule__EnumType__Group__16__Impl rule__EnumType__Group__17
            {
            pushFollow(FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__166972);
            rule__EnumType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__166975);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3484:1: rule__EnumType__Group__16__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3488:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3489:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3489:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3490:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__16__Impl7003); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3503:1: rule__EnumType__Group__17 : rule__EnumType__Group__17__Impl rule__EnumType__Group__18 ;
    public final void rule__EnumType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3507:1: ( rule__EnumType__Group__17__Impl rule__EnumType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3508:2: rule__EnumType__Group__17__Impl rule__EnumType__Group__18
            {
            pushFollow(FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177034);
            rule__EnumType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177037);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3515:1: rule__EnumType__Group__17__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3519:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3520:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3520:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3521:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__17__Impl7065); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3534:1: rule__EnumType__Group__18 : rule__EnumType__Group__18__Impl rule__EnumType__Group__19 ;
    public final void rule__EnumType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3538:1: ( rule__EnumType__Group__18__Impl rule__EnumType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3539:2: rule__EnumType__Group__18__Impl rule__EnumType__Group__19
            {
            pushFollow(FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187096);
            rule__EnumType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187099);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3546:1: rule__EnumType__Group__18__Impl : ( 'symbols' ) ;
    public final void rule__EnumType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3550:1: ( ( 'symbols' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3551:1: ( 'symbols' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3551:1: ( 'symbols' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3552:1: 'symbols'
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 
            match(input,31,FOLLOW_31_in_rule__EnumType__Group__18__Impl7127); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3565:1: rule__EnumType__Group__19 : rule__EnumType__Group__19__Impl rule__EnumType__Group__20 ;
    public final void rule__EnumType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3569:1: ( rule__EnumType__Group__19__Impl rule__EnumType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3570:2: rule__EnumType__Group__19__Impl rule__EnumType__Group__20
            {
            pushFollow(FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197158);
            rule__EnumType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197161);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3577:1: rule__EnumType__Group__19__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3581:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3582:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3582:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3583:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__19__Impl7189); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3596:1: rule__EnumType__Group__20 : rule__EnumType__Group__20__Impl rule__EnumType__Group__21 ;
    public final void rule__EnumType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3600:1: ( rule__EnumType__Group__20__Impl rule__EnumType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3601:2: rule__EnumType__Group__20__Impl rule__EnumType__Group__21
            {
            pushFollow(FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207220);
            rule__EnumType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207223);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3608:1: rule__EnumType__Group__20__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3612:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3613:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3613:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3614:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__20__Impl7251); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3627:1: rule__EnumType__Group__21 : rule__EnumType__Group__21__Impl rule__EnumType__Group__22 ;
    public final void rule__EnumType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3631:1: ( rule__EnumType__Group__21__Impl rule__EnumType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3632:2: rule__EnumType__Group__21__Impl rule__EnumType__Group__22
            {
            pushFollow(FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217282);
            rule__EnumType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217285);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3639:1: rule__EnumType__Group__21__Impl : ( '[' ) ;
    public final void rule__EnumType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3643:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3644:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3644:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3645:1: '['
            {
             before(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 
            match(input,19,FOLLOW_19_in_rule__EnumType__Group__21__Impl7313); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3658:1: rule__EnumType__Group__22 : rule__EnumType__Group__22__Impl rule__EnumType__Group__23 ;
    public final void rule__EnumType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3662:1: ( rule__EnumType__Group__22__Impl rule__EnumType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3663:2: rule__EnumType__Group__22__Impl rule__EnumType__Group__23
            {
            pushFollow(FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227344);
            rule__EnumType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227347);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3670:1: rule__EnumType__Group__22__Impl : ( ( rule__EnumType__Group_22__0 ) ) ;
    public final void rule__EnumType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3674:1: ( ( ( rule__EnumType__Group_22__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3675:1: ( ( rule__EnumType__Group_22__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3675:1: ( ( rule__EnumType__Group_22__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3676:1: ( rule__EnumType__Group_22__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_22()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3677:1: ( rule__EnumType__Group_22__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3677:2: rule__EnumType__Group_22__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7374);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3687:1: rule__EnumType__Group__23 : rule__EnumType__Group__23__Impl rule__EnumType__Group__24 ;
    public final void rule__EnumType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3691:1: ( rule__EnumType__Group__23__Impl rule__EnumType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3692:2: rule__EnumType__Group__23__Impl rule__EnumType__Group__24
            {
            pushFollow(FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237404);
            rule__EnumType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237407);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3699:1: rule__EnumType__Group__23__Impl : ( ( rule__EnumType__Group_23__0 )* ) ;
    public final void rule__EnumType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3703:1: ( ( ( rule__EnumType__Group_23__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3704:1: ( ( rule__EnumType__Group_23__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3704:1: ( ( rule__EnumType__Group_23__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3705:1: ( rule__EnumType__Group_23__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3706:1: ( rule__EnumType__Group_23__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3706:2: rule__EnumType__Group_23__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7434);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3716:1: rule__EnumType__Group__24 : rule__EnumType__Group__24__Impl rule__EnumType__Group__25 ;
    public final void rule__EnumType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3720:1: ( rule__EnumType__Group__24__Impl rule__EnumType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3721:2: rule__EnumType__Group__24__Impl rule__EnumType__Group__25
            {
            pushFollow(FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247465);
            rule__EnumType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247468);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3728:1: rule__EnumType__Group__24__Impl : ( ']' ) ;
    public final void rule__EnumType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3732:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3733:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3733:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3734:1: ']'
            {
             before(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_20_in_rule__EnumType__Group__24__Impl7496); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3747:1: rule__EnumType__Group__25 : rule__EnumType__Group__25__Impl ;
    public final void rule__EnumType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3751:1: ( rule__EnumType__Group__25__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3752:2: rule__EnumType__Group__25__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257527);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3758:1: rule__EnumType__Group__25__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3762:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3763:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3763:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3764:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_26_in_rule__EnumType__Group__25__Impl7555); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3829:1: rule__EnumType__Group_22__0 : rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 ;
    public final void rule__EnumType__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3833:1: ( rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3834:2: rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07638);
            rule__EnumType__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07641);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3841:1: rule__EnumType__Group_22__0__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3845:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3846:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3846:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3847:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_22__0__Impl7669); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3860:1: rule__EnumType__Group_22__1 : rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 ;
    public final void rule__EnumType__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3864:1: ( rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3865:2: rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__17700);
            rule__EnumType__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__17703);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3872:1: rule__EnumType__Group_22__1__Impl : ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) ;
    public final void rule__EnumType__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3876:1: ( ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3877:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3877:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3878:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3879:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3879:2: rule__EnumType__SymbolsAssignment_22_1
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl7730);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3889:1: rule__EnumType__Group_22__2 : rule__EnumType__Group_22__2__Impl ;
    public final void rule__EnumType__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3893:1: ( rule__EnumType__Group_22__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3894:2: rule__EnumType__Group_22__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__27760);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3900:1: rule__EnumType__Group_22__2__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3904:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3905:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3905:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3906:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_22__2__Impl7788); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3925:1: rule__EnumType__Group_23__0 : rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 ;
    public final void rule__EnumType__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3929:1: ( rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3930:2: rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__07825);
            rule__EnumType__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__07828);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3937:1: rule__EnumType__Group_23__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3941:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3942:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3942:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3943:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group_23__0__Impl7856); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3956:1: rule__EnumType__Group_23__1 : rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 ;
    public final void rule__EnumType__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3960:1: ( rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3961:2: rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__17887);
            rule__EnumType__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__17890);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3968:1: rule__EnumType__Group_23__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3972:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3973:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3973:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3974:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_23__1__Impl7918); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3987:1: rule__EnumType__Group_23__2 : rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 ;
    public final void rule__EnumType__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3991:1: ( rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3992:2: rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__27949);
            rule__EnumType__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__27952);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3999:1: rule__EnumType__Group_23__2__Impl : ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) ;
    public final void rule__EnumType__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4003:1: ( ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4004:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4004:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4005:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4006:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4006:2: rule__EnumType__SymbolsAssignment_23_2
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl7979);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4016:1: rule__EnumType__Group_23__3 : rule__EnumType__Group_23__3__Impl ;
    public final void rule__EnumType__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4020:1: ( rule__EnumType__Group_23__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4021:2: rule__EnumType__Group_23__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__38009);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4027:1: rule__EnumType__Group_23__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4031:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4032:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4032:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4033:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_23__3__Impl8037); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4054:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4058:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4059:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08076);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08079);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4066:1: rule__ArrayType__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4070:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4071:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4071:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4072:1: '{'
            {
             before(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__0__Impl8107); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4085:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4089:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4090:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18138);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18141);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4097:1: rule__ArrayType__Group__1__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4101:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4102:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4102:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4103:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__1__Impl8169); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4116:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4120:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4121:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28200);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28203);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4128:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4132:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4133:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4133:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4134:1: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ArrayType__Group__2__Impl8231); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4147:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4151:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4152:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38262);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38265);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4159:1: rule__ArrayType__Group__3__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4163:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4164:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4164:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4165:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__3__Impl8293); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4178:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4182:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4183:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48324);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48327);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4190:1: rule__ArrayType__Group__4__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4194:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4195:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4195:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4196:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__4__Impl8355); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4209:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4213:1: ( rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4214:2: rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58386);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58389);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4221:1: rule__ArrayType__Group__5__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4225:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4226:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4226:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4227:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__5__Impl8417); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4240:1: rule__ArrayType__Group__6 : rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 ;
    public final void rule__ArrayType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4244:1: ( rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4245:2: rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68448);
            rule__ArrayType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68451);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4252:1: rule__ArrayType__Group__6__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4256:1: ( ( 'array' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4257:1: ( 'array' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4257:1: ( 'array' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4258:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__ArrayType__Group__6__Impl8479); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4271:1: rule__ArrayType__Group__7 : rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 ;
    public final void rule__ArrayType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4275:1: ( rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4276:2: rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78510);
            rule__ArrayType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78513);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4283:1: rule__ArrayType__Group__7__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4287:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4288:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4288:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4289:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__7__Impl8541); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4302:1: rule__ArrayType__Group__8 : rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 ;
    public final void rule__ArrayType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4306:1: ( rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4307:2: rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88572);
            rule__ArrayType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88575);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4314:1: rule__ArrayType__Group__8__Impl : ( ',' ) ;
    public final void rule__ArrayType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4318:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4319:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4319:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4320:1: ','
            {
             before(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__ArrayType__Group__8__Impl8603); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4333:1: rule__ArrayType__Group__9 : rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 ;
    public final void rule__ArrayType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4337:1: ( rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4338:2: rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98634);
            rule__ArrayType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98637);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4345:1: rule__ArrayType__Group__9__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4349:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4350:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4350:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4351:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__9__Impl8665); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4364:1: rule__ArrayType__Group__10 : rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 ;
    public final void rule__ArrayType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4368:1: ( rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4369:2: rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__108696);
            rule__ArrayType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__108699);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4376:1: rule__ArrayType__Group__10__Impl : ( 'items' ) ;
    public final void rule__ArrayType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4380:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4381:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4381:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4382:1: 'items'
            {
             before(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__ArrayType__Group__10__Impl8727); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4395:1: rule__ArrayType__Group__11 : rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 ;
    public final void rule__ArrayType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4399:1: ( rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4400:2: rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__118758);
            rule__ArrayType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__118761);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4407:1: rule__ArrayType__Group__11__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4411:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4412:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4412:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4413:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__11__Impl8789); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4426:1: rule__ArrayType__Group__12 : rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 ;
    public final void rule__ArrayType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4430:1: ( rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4431:2: rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__128820);
            rule__ArrayType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__128823);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4438:1: rule__ArrayType__Group__12__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4442:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4443:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4443:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4444:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__12__Impl8851); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4457:1: rule__ArrayType__Group__13 : rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 ;
    public final void rule__ArrayType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4461:1: ( rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4462:2: rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__138882);
            rule__ArrayType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__138885);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4469:1: rule__ArrayType__Group__13__Impl : ( ( rule__ArrayType__Alternatives_13 ) ) ;
    public final void rule__ArrayType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4473:1: ( ( ( rule__ArrayType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4474:1: ( ( rule__ArrayType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4474:1: ( ( rule__ArrayType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4475:1: ( rule__ArrayType__Alternatives_13 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4476:1: ( rule__ArrayType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4476:2: rule__ArrayType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl8912);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4486:1: rule__ArrayType__Group__14 : rule__ArrayType__Group__14__Impl ;
    public final void rule__ArrayType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4490:1: ( rule__ArrayType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4491:2: rule__ArrayType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__148942);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4497:1: rule__ArrayType__Group__14__Impl : ( '}' ) ;
    public final void rule__ArrayType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4501:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4502:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4502:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4503:1: '}'
            {
             before(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__ArrayType__Group__14__Impl8970); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4546:1: rule__ArrayType__Group_13_2__0 : rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 ;
    public final void rule__ArrayType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4550:1: ( rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4551:2: rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09031);
            rule__ArrayType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09034);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4558:1: rule__ArrayType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4562:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4563:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4563:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4564:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group_13_2__0__Impl9062); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4577:1: rule__ArrayType__Group_13_2__1 : rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 ;
    public final void rule__ArrayType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4581:1: ( rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4582:2: rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19093);
            rule__ArrayType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19096);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4589:1: rule__ArrayType__Group_13_2__1__Impl : ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__ArrayType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4593:1: ( ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4594:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4594:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4595:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4596:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4596:2: rule__ArrayType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9123);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4606:1: rule__ArrayType__Group_13_2__2 : rule__ArrayType__Group_13_2__2__Impl ;
    public final void rule__ArrayType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4610:1: ( rule__ArrayType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4611:2: rule__ArrayType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29153);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4617:1: rule__ArrayType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4621:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4622:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4622:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4623:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group_13_2__2__Impl9181); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4642:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4646:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4647:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09218);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09221);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4654:1: rule__MapType__Group__0__Impl : ( '{' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4658:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4659:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4659:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4660:1: '{'
            {
             before(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__0__Impl9249); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4673:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4677:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4678:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19280);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19283);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4685:1: rule__MapType__Group__1__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4689:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4690:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4690:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4691:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__1__Impl9311); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4704:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4708:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4709:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29342);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29345);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4716:1: rule__MapType__Group__2__Impl : ( 'type' ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4720:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4721:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4721:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4722:1: 'type'
            {
             before(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__MapType__Group__2__Impl9373); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4735:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4739:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4740:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39404);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39407);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4747:1: rule__MapType__Group__3__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4751:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4752:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4752:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4753:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__3__Impl9435); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4766:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4770:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4771:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49466);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49469);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4778:1: rule__MapType__Group__4__Impl : ( ':' ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4782:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4783:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4783:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4784:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__4__Impl9497); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4797:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl rule__MapType__Group__6 ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4801:1: ( rule__MapType__Group__5__Impl rule__MapType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4802:2: rule__MapType__Group__5__Impl rule__MapType__Group__6
            {
            pushFollow(FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59528);
            rule__MapType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59531);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4809:1: rule__MapType__Group__5__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4813:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4814:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4814:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4815:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__5__Impl9559); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4828:1: rule__MapType__Group__6 : rule__MapType__Group__6__Impl rule__MapType__Group__7 ;
    public final void rule__MapType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4832:1: ( rule__MapType__Group__6__Impl rule__MapType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4833:2: rule__MapType__Group__6__Impl rule__MapType__Group__7
            {
            pushFollow(FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69590);
            rule__MapType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69593);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4840:1: rule__MapType__Group__6__Impl : ( 'map' ) ;
    public final void rule__MapType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4844:1: ( ( 'map' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4845:1: ( 'map' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4845:1: ( 'map' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4846:1: 'map'
            {
             before(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__MapType__Group__6__Impl9621); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4859:1: rule__MapType__Group__7 : rule__MapType__Group__7__Impl rule__MapType__Group__8 ;
    public final void rule__MapType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4863:1: ( rule__MapType__Group__7__Impl rule__MapType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4864:2: rule__MapType__Group__7__Impl rule__MapType__Group__8
            {
            pushFollow(FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79652);
            rule__MapType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79655);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4871:1: rule__MapType__Group__7__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4875:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4876:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4876:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4877:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__7__Impl9683); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4890:1: rule__MapType__Group__8 : rule__MapType__Group__8__Impl rule__MapType__Group__9 ;
    public final void rule__MapType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4894:1: ( rule__MapType__Group__8__Impl rule__MapType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4895:2: rule__MapType__Group__8__Impl rule__MapType__Group__9
            {
            pushFollow(FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__89714);
            rule__MapType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__89717);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4902:1: rule__MapType__Group__8__Impl : ( ',' ) ;
    public final void rule__MapType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4906:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4907:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4907:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4908:1: ','
            {
             before(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__MapType__Group__8__Impl9745); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4921:1: rule__MapType__Group__9 : rule__MapType__Group__9__Impl rule__MapType__Group__10 ;
    public final void rule__MapType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4925:1: ( rule__MapType__Group__9__Impl rule__MapType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4926:2: rule__MapType__Group__9__Impl rule__MapType__Group__10
            {
            pushFollow(FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__99776);
            rule__MapType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__99779);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4933:1: rule__MapType__Group__9__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4937:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4938:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4938:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4939:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__9__Impl9807); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4952:1: rule__MapType__Group__10 : rule__MapType__Group__10__Impl rule__MapType__Group__11 ;
    public final void rule__MapType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4956:1: ( rule__MapType__Group__10__Impl rule__MapType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4957:2: rule__MapType__Group__10__Impl rule__MapType__Group__11
            {
            pushFollow(FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__109838);
            rule__MapType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__109841);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4964:1: rule__MapType__Group__10__Impl : ( 'items' ) ;
    public final void rule__MapType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4968:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4969:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4969:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4970:1: 'items'
            {
             before(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__MapType__Group__10__Impl9869); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4983:1: rule__MapType__Group__11 : rule__MapType__Group__11__Impl rule__MapType__Group__12 ;
    public final void rule__MapType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4987:1: ( rule__MapType__Group__11__Impl rule__MapType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4988:2: rule__MapType__Group__11__Impl rule__MapType__Group__12
            {
            pushFollow(FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__119900);
            rule__MapType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__119903);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4995:1: rule__MapType__Group__11__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4999:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5000:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5000:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5001:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__11__Impl9931); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5014:1: rule__MapType__Group__12 : rule__MapType__Group__12__Impl rule__MapType__Group__13 ;
    public final void rule__MapType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5018:1: ( rule__MapType__Group__12__Impl rule__MapType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5019:2: rule__MapType__Group__12__Impl rule__MapType__Group__13
            {
            pushFollow(FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__129962);
            rule__MapType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__129965);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5026:1: rule__MapType__Group__12__Impl : ( ':' ) ;
    public final void rule__MapType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5030:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5031:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5031:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5032:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__12__Impl9993); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5045:1: rule__MapType__Group__13 : rule__MapType__Group__13__Impl rule__MapType__Group__14 ;
    public final void rule__MapType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5049:1: ( rule__MapType__Group__13__Impl rule__MapType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5050:2: rule__MapType__Group__13__Impl rule__MapType__Group__14
            {
            pushFollow(FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310024);
            rule__MapType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310027);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5057:1: rule__MapType__Group__13__Impl : ( ( rule__MapType__Alternatives_13 ) ) ;
    public final void rule__MapType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5061:1: ( ( ( rule__MapType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5062:1: ( ( rule__MapType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5062:1: ( ( rule__MapType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5063:1: ( rule__MapType__Alternatives_13 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5064:1: ( rule__MapType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5064:2: rule__MapType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10054);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5074:1: rule__MapType__Group__14 : rule__MapType__Group__14__Impl ;
    public final void rule__MapType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5078:1: ( rule__MapType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5079:2: rule__MapType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410084);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5085:1: rule__MapType__Group__14__Impl : ( '}' ) ;
    public final void rule__MapType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5089:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5090:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5090:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5091:1: '}'
            {
             before(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__MapType__Group__14__Impl10112); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5134:1: rule__MapType__Group_13_2__0 : rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 ;
    public final void rule__MapType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5138:1: ( rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5139:2: rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010173);
            rule__MapType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010176);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5146:1: rule__MapType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5150:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5151:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5151:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5152:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group_13_2__0__Impl10204); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5165:1: rule__MapType__Group_13_2__1 : rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 ;
    public final void rule__MapType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5169:1: ( rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5170:2: rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110235);
            rule__MapType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110238);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5177:1: rule__MapType__Group_13_2__1__Impl : ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__MapType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5181:1: ( ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5182:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5182:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5183:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5184:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5184:2: rule__MapType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10265);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5194:1: rule__MapType__Group_13_2__2 : rule__MapType__Group_13_2__2__Impl ;
    public final void rule__MapType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5198:1: ( rule__MapType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5199:2: rule__MapType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210295);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5205:1: rule__MapType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5209:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5210:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5210:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5211:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group_13_2__2__Impl10323); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5230:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5234:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5235:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010360);
            rule__FixedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010363);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5242:1: rule__FixedType__Group__0__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5246:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5247:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5247:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5248:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__0__Impl10391); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5261:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5265:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5266:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110422);
            rule__FixedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110425);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5273:1: rule__FixedType__Group__1__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5277:1: ( ( 'fixed' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5278:1: ( 'fixed' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5278:1: ( 'fixed' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5279:1: 'fixed'
            {
             before(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__FixedType__Group__1__Impl10453); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5292:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5296:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5297:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210484);
            rule__FixedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210487);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5304:1: rule__FixedType__Group__2__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5308:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5309:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5309:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5310:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__2__Impl10515); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5323:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5327:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5328:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310546);
            rule__FixedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310549);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5335:1: rule__FixedType__Group__3__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5339:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5340:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5340:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5341:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__3__Impl10577); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5354:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5358:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5359:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410608);
            rule__FixedType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410611);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5366:1: rule__FixedType__Group__4__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5370:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5371:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5371:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5372:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__4__Impl10639); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5385:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl rule__FixedType__Group__6 ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5389:1: ( rule__FixedType__Group__5__Impl rule__FixedType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5390:2: rule__FixedType__Group__5__Impl rule__FixedType__Group__6
            {
            pushFollow(FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510670);
            rule__FixedType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510673);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5397:1: rule__FixedType__Group__5__Impl : ( 'name' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5401:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5402:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5402:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5403:1: 'name'
            {
             before(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 
            match(input,10,FOLLOW_10_in_rule__FixedType__Group__5__Impl10701); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5416:1: rule__FixedType__Group__6 : rule__FixedType__Group__6__Impl rule__FixedType__Group__7 ;
    public final void rule__FixedType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5420:1: ( rule__FixedType__Group__6__Impl rule__FixedType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5421:2: rule__FixedType__Group__6__Impl rule__FixedType__Group__7
            {
            pushFollow(FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__610732);
            rule__FixedType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__610735);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5428:1: rule__FixedType__Group__6__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5432:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5433:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5433:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5434:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__6__Impl10763); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5447:1: rule__FixedType__Group__7 : rule__FixedType__Group__7__Impl rule__FixedType__Group__8 ;
    public final void rule__FixedType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5451:1: ( rule__FixedType__Group__7__Impl rule__FixedType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5452:2: rule__FixedType__Group__7__Impl rule__FixedType__Group__8
            {
            pushFollow(FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__710794);
            rule__FixedType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__710797);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5459:1: rule__FixedType__Group__7__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5463:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5464:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5464:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5465:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__7__Impl10825); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5478:1: rule__FixedType__Group__8 : rule__FixedType__Group__8__Impl rule__FixedType__Group__9 ;
    public final void rule__FixedType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5482:1: ( rule__FixedType__Group__8__Impl rule__FixedType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5483:2: rule__FixedType__Group__8__Impl rule__FixedType__Group__9
            {
            pushFollow(FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__810856);
            rule__FixedType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__810859);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5490:1: rule__FixedType__Group__8__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5494:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5495:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5495:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5496:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__8__Impl10887); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5509:1: rule__FixedType__Group__9 : rule__FixedType__Group__9__Impl rule__FixedType__Group__10 ;
    public final void rule__FixedType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5513:1: ( rule__FixedType__Group__9__Impl rule__FixedType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5514:2: rule__FixedType__Group__9__Impl rule__FixedType__Group__10
            {
            pushFollow(FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__910918);
            rule__FixedType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__910921);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5521:1: rule__FixedType__Group__9__Impl : ( ( rule__FixedType__NameAssignment_9 ) ) ;
    public final void rule__FixedType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5525:1: ( ( ( rule__FixedType__NameAssignment_9 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5526:1: ( ( rule__FixedType__NameAssignment_9 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5526:1: ( ( rule__FixedType__NameAssignment_9 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5527:1: ( rule__FixedType__NameAssignment_9 )
            {
             before(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5528:1: ( rule__FixedType__NameAssignment_9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5528:2: rule__FixedType__NameAssignment_9
            {
            pushFollow(FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl10948);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5538:1: rule__FixedType__Group__10 : rule__FixedType__Group__10__Impl rule__FixedType__Group__11 ;
    public final void rule__FixedType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5542:1: ( rule__FixedType__Group__10__Impl rule__FixedType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5543:2: rule__FixedType__Group__10__Impl rule__FixedType__Group__11
            {
            pushFollow(FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1010978);
            rule__FixedType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1010981);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5550:1: rule__FixedType__Group__10__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5554:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5555:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5555:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5556:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__10__Impl11009); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5569:1: rule__FixedType__Group__11 : rule__FixedType__Group__11__Impl rule__FixedType__Group__12 ;
    public final void rule__FixedType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5573:1: ( rule__FixedType__Group__11__Impl rule__FixedType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5574:2: rule__FixedType__Group__11__Impl rule__FixedType__Group__12
            {
            pushFollow(FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111040);
            rule__FixedType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111043);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5581:1: rule__FixedType__Group__11__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5585:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5586:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5586:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5587:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__11__Impl11071); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5600:1: rule__FixedType__Group__12 : rule__FixedType__Group__12__Impl rule__FixedType__Group__13 ;
    public final void rule__FixedType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5604:1: ( rule__FixedType__Group__12__Impl rule__FixedType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5605:2: rule__FixedType__Group__12__Impl rule__FixedType__Group__13
            {
            pushFollow(FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211102);
            rule__FixedType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211105);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5612:1: rule__FixedType__Group__12__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5616:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5617:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5617:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5618:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__12__Impl11133); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5631:1: rule__FixedType__Group__13 : rule__FixedType__Group__13__Impl rule__FixedType__Group__14 ;
    public final void rule__FixedType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5635:1: ( rule__FixedType__Group__13__Impl rule__FixedType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5636:2: rule__FixedType__Group__13__Impl rule__FixedType__Group__14
            {
            pushFollow(FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311164);
            rule__FixedType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311167);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5643:1: rule__FixedType__Group__13__Impl : ( 'size' ) ;
    public final void rule__FixedType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5647:1: ( ( 'size' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5648:1: ( 'size' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5648:1: ( 'size' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5649:1: 'size'
            {
             before(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 
            match(input,36,FOLLOW_36_in_rule__FixedType__Group__13__Impl11195); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5662:1: rule__FixedType__Group__14 : rule__FixedType__Group__14__Impl rule__FixedType__Group__15 ;
    public final void rule__FixedType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5666:1: ( rule__FixedType__Group__14__Impl rule__FixedType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5667:2: rule__FixedType__Group__14__Impl rule__FixedType__Group__15
            {
            pushFollow(FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411226);
            rule__FixedType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411229);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5674:1: rule__FixedType__Group__14__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5678:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5679:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5679:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5680:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__14__Impl11257); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5693:1: rule__FixedType__Group__15 : rule__FixedType__Group__15__Impl rule__FixedType__Group__16 ;
    public final void rule__FixedType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5697:1: ( rule__FixedType__Group__15__Impl rule__FixedType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5698:2: rule__FixedType__Group__15__Impl rule__FixedType__Group__16
            {
            pushFollow(FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511288);
            rule__FixedType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511291);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5705:1: rule__FixedType__Group__15__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5709:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5710:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5710:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5711:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__15__Impl11319); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5724:1: rule__FixedType__Group__16 : rule__FixedType__Group__16__Impl rule__FixedType__Group__17 ;
    public final void rule__FixedType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5728:1: ( rule__FixedType__Group__16__Impl rule__FixedType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5729:2: rule__FixedType__Group__16__Impl rule__FixedType__Group__17
            {
            pushFollow(FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611350);
            rule__FixedType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611353);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5736:1: rule__FixedType__Group__16__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5740:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5741:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5741:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5742:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__16__Impl11381); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5755:1: rule__FixedType__Group__17 : rule__FixedType__Group__17__Impl rule__FixedType__Group__18 ;
    public final void rule__FixedType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5759:1: ( rule__FixedType__Group__17__Impl rule__FixedType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5760:2: rule__FixedType__Group__17__Impl rule__FixedType__Group__18
            {
            pushFollow(FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711412);
            rule__FixedType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711415);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5767:1: rule__FixedType__Group__17__Impl : ( ( rule__FixedType__SizeAssignment_17 ) ) ;
    public final void rule__FixedType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5771:1: ( ( ( rule__FixedType__SizeAssignment_17 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5772:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5772:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5773:1: ( rule__FixedType__SizeAssignment_17 )
            {
             before(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5774:1: ( rule__FixedType__SizeAssignment_17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5774:2: rule__FixedType__SizeAssignment_17
            {
            pushFollow(FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11442);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5784:1: rule__FixedType__Group__18 : rule__FixedType__Group__18__Impl ;
    public final void rule__FixedType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5788:1: ( rule__FixedType__Group__18__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5789:2: rule__FixedType__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811472);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5795:1: rule__FixedType__Group__18__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5799:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5800:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5800:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5801:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__18__Impl11500); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5852:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5856:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5857:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011569);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011572);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5864:1: rule__Primitive__Group__0__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5868:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5869:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5869:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5870:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Primitive__Group__0__Impl11600); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5883:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5887:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5888:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111631);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111634);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5895:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__TypeAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5899:1: ( ( ( rule__Primitive__TypeAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5900:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5900:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5901:1: ( rule__Primitive__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5902:1: ( rule__Primitive__TypeAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5902:2: rule__Primitive__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11661);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5912:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5916:1: ( rule__Primitive__Group__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5917:2: rule__Primitive__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__211691);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5923:1: rule__Primitive__Group__2__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5927:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5928:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5928:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5929:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Primitive__Group__2__Impl11719); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5948:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5952:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5953:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__011756);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__011759);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5960:1: rule__Namespace__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5964:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5965:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5965:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5966:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl11786); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5977:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5981:1: ( rule__Namespace__Group__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5982:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__111815);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5988:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__Group_1__0 )* ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5992:1: ( ( ( rule__Namespace__Group_1__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5993:1: ( ( rule__Namespace__Group_1__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5993:1: ( ( rule__Namespace__Group_1__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5994:1: ( rule__Namespace__Group_1__0 )*
            {
             before(grammarAccess.getNamespaceAccess().getGroup_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5995:1: ( rule__Namespace__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5995:2: rule__Namespace__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl11842);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6009:1: rule__Namespace__Group_1__0 : rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 ;
    public final void rule__Namespace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6013:1: ( rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6014:2: rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__011877);
            rule__Namespace__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__011880);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6021:1: rule__Namespace__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Namespace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6025:1: ( ( '.' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6026:1: ( '.' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6026:1: ( '.' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6027:1: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Namespace__Group_1__0__Impl11908); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6040:1: rule__Namespace__Group_1__1 : rule__Namespace__Group_1__1__Impl ;
    public final void rule__Namespace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6044:1: ( rule__Namespace__Group_1__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6045:2: rule__Namespace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__111939);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6051:1: rule__Namespace__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6055:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6056:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6056:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6057:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl11966); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6073:1: rule__AvroSchema__TypesAssignment : ( ( rule__AvroSchema__TypesAlternatives_0 ) ) ;
    public final void rule__AvroSchema__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6077:1: ( ( ( rule__AvroSchema__TypesAlternatives_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6078:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6078:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6079:1: ( rule__AvroSchema__TypesAlternatives_0 )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6080:1: ( rule__AvroSchema__TypesAlternatives_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6080:2: rule__AvroSchema__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment12004);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6089:1: rule__UnionType__TypesAssignment_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6093:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6094:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6094:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6095:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112037);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6104:1: rule__UnionType__TypesAssignment_2_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6108:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6109:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6109:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6110:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112068);
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


    // $ANTLR start "rule__JsonType__TypeAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6119:1: rule__JsonType__TypeAssignment_6 : ( rulePrimitive ) ;
    public final void rule__JsonType__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6123:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6124:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6124:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6125:1: rulePrimitive
            {
             before(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612099);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6134:1: rule__RecordType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6138:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6139:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6139:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6140:1: RULE_ID
            {
             before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412130); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6149:1: rule__RecordType__NamespaceAssignment_16_6 : ( ruleNamespace ) ;
    public final void rule__RecordType__NamespaceAssignment_16_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6153:1: ( ( ruleNamespace ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6154:1: ( ruleNamespace )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6154:1: ( ruleNamespace )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6155:1: ruleNamespace
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612161);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6164:1: rule__RecordType__FieldsAssignment_23 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6168:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6169:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6169:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6170:1: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_23_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_2312192);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6179:1: rule__RecordType__FieldsAssignment_24_1 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6183:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6184:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6184:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6185:1: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_24_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_24_112223);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6194:1: rule__Field__NameAssignment_6 : ( ( rule__Field__NameAlternatives_6_0 ) ) ;
    public final void rule__Field__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6198:1: ( ( ( rule__Field__NameAlternatives_6_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6199:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6199:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6200:1: ( rule__Field__NameAlternatives_6_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6201:1: ( rule__Field__NameAlternatives_6_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6201:2: rule__Field__NameAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612254);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6210:1: rule__Field__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__Field__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6214:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6215:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6215:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6216:1: rulePrimitive
            {
             before(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012287);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6225:1: rule__Field__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__Field__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6229:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6230:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6230:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6231:1: ruleRecordType
            {
             before(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112318);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6240:1: rule__Field__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6244:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6245:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6245:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6246:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6247:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6248:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112353); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6259:1: rule__Field__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__Field__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6263:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6264:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6264:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6265:1: ruleEnumType
            {
             before(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312388);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6274:1: rule__Field__ArrayAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__Field__ArrayAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6278:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6279:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6279:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6280:1: ruleArrayType
            {
             before(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412419);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6289:1: rule__Field__MapAssignment_13_5 : ( ruleMapType ) ;
    public final void rule__Field__MapAssignment_13_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6293:1: ( ( ruleMapType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6294:1: ( ruleMapType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6294:1: ( ruleMapType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6295:1: ruleMapType
            {
             before(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
            pushFollow(FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512450);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6304:1: rule__Field__FixedAssignment_13_6 : ( ruleFixedType ) ;
    public final void rule__Field__FixedAssignment_13_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6308:1: ( ( ruleFixedType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6309:1: ( ruleFixedType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6309:1: ( ruleFixedType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6310:1: ruleFixedType
            {
             before(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
            pushFollow(FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612481);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6319:1: rule__Field__UnionAssignment_13_7 : ( ruleUnionType ) ;
    public final void rule__Field__UnionAssignment_13_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6323:1: ( ( ruleUnionType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6324:1: ( ruleUnionType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6324:1: ( ruleUnionType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6325:1: ruleUnionType
            {
             before(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 
            pushFollow(FOLLOW_ruleUnionType_in_rule__Field__UnionAssignment_13_712512);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6334:1: rule__EnumType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__EnumType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6338:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6339:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6339:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6340:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412543); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6349:1: rule__EnumType__SymbolsAssignment_22_1 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6353:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6354:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6354:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6355:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112574); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6364:1: rule__EnumType__SymbolsAssignment_23_2 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6368:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6369:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6369:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6370:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212605); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6379:1: rule__ArrayType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__ArrayType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6383:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6384:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6384:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6385:1: rulePrimitive
            {
             before(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_012636);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6394:1: rule__ArrayType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__ArrayType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6398:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6399:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6399:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6400:1: ruleRecordType
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_112667);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6409:1: rule__ArrayType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArrayType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6413:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6414:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6414:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6415:1: ( RULE_ID )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6416:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6417:1: RULE_ID
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_112702); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6428:1: rule__ArrayType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__ArrayType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6432:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6433:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6433:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6434:1: ruleEnumType
            {
             before(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_312737);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6443:1: rule__MapType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__MapType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6447:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6448:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6448:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6449:1: rulePrimitive
            {
             before(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_012768);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6458:1: rule__MapType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__MapType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6462:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6463:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6463:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6464:1: ruleRecordType
            {
             before(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_112799);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6473:1: rule__MapType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6477:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6478:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6478:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6479:1: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6480:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6481:1: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_112834); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6492:1: rule__MapType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__MapType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6496:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6497:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6497:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6498:1: ruleEnumType
            {
             before(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_312869);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6507:1: rule__MapType__AtypeAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__MapType__AtypeAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6511:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6512:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6512:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6513:1: ruleArrayType
            {
             before(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_412900);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6522:1: rule__FixedType__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__FixedType__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6526:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6527:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6527:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6528:1: RULE_ID
            {
             before(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_912931); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6537:1: rule__FixedType__SizeAssignment_17 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6541:1: ( ( RULE_INT ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6542:1: ( RULE_INT )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6542:1: ( RULE_INT )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6543:1: RULE_INT
            {
             before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1712962); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6552:1: rule__Primitive__TypeAssignment_1 : ( ( rule__Primitive__TypeAlternatives_1_0 ) ) ;
    public final void rule__Primitive__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6556:1: ( ( ( rule__Primitive__TypeAlternatives_1_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6557:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6557:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6558:1: ( rule__Primitive__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6559:1: ( rule__Primitive__TypeAlternatives_1_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6559:2: rule__Primitive__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_112993);
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
        "\1\23\1\27\1\uffff\1\30\1\27\1\31\2\27\2\uffff";
    static final String DFA1_maxS =
        "\1\26\1\27\1\uffff\1\30\1\27\1\31\1\27\1\33\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\5\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\2\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\3\uffff\1\11",
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
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\26\1\27\1\13\1\30\2\uffff\1\27\1\31\1\27\1\33\4\uffff";
    static final String DFA2_maxS =
        "\2\27\1\43\1\30\2\uffff\1\27\1\31\1\27\1\42\4\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\6\1\3\4\uffff\1\1\1\4\1\5\1\2";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\10\5\20\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\2\uffff\1\14\1\uffff\1\15\1\uffff\1\13",
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
            return "424:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) );";
        }
    }
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\23\1\4\1\27\4\uffff\1\30\1\27\1\31\1\27\1\33\4\uffff";
    static final String DFA4_maxS =
        "\1\27\1\43\1\27\4\uffff\1\30\1\27\1\31\1\27\1\42\4\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\10\1\3\1\1\1\7\5\uffff\1\5\1\2\1\4\1\6";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\2\1\1",
            "\1\4\6\uffff\10\5\20\uffff\1\6",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\15\2\uffff\1\16\1\uffff\1\14\1\uffff\1\17",
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
            return "494:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );";
        }
    }
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\26\1\4\1\27\2\uffff\1\30\1\27\1\31\1\27\1\33\2\uffff";
    static final String DFA5_maxS =
        "\1\27\1\22\1\27\2\uffff\1\30\1\27\1\31\1\27\1\36\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\3\1\1\5\uffff\1\4\1\2";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\1",
            "\1\3\6\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\2\uffff\1\12",
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
            return "552:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\26\1\4\1\27\2\uffff\1\30\1\27\1\31\1\27\1\33\3\uffff";
    static final String DFA6_maxS =
        "\1\27\1\22\1\27\2\uffff\1\30\1\27\1\31\1\27\1\40\3\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\1\1\5\uffff\1\4\1\2\1\5";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\1",
            "\1\3\6\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\2\uffff\1\12\1\uffff\1\14",
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
            return "586:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );";
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
    public static final BitSet FOLLOW_10_in_rule__Field__NameAlternatives_6_0974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_0993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UnionAssignment_13_7_in_rule__Field__Alternatives_131151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01549 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnionType__Group__0__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11611 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21671 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1701 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UnionType__Group__3__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01799 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__01922 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__01925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__0__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__11984 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__1__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22046 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonType__Group__2__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32108 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__3__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42170 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonType__Group__4__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52232 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__5__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62294 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72354 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__7__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonType__Group__8__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02493 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__0__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12555 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__1__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22617 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group__2__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32679 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__3__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__42741 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__42744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__4__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__52803 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__52806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__5__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__62865 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__62868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordType__Group__6__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__72927 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__72930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__7__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__82989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__82992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__8__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93051 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__9__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103113 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__RecordType__Group__10__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113175 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__11__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123237 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__12__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__13__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143361 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153421 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__15__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163483 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173544 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__17__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183606 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__18__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193668 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RecordType__Group__19__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203730 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__20__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__213792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__213795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__21__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__223854 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__223857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordType__Group__22__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__233916 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__233919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_23_in_rule__RecordType__Group__23__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__243976 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__243979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__0_in_rule__RecordType__Group__24__Impl4006 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254037 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__26_in_rule__RecordType__Group__254040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group__25__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__26__Impl_in_rule__RecordType__Group__264099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RecordType__Group__26__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04212 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14274 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__1__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24336 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34398 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__3__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44460 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__5__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64584 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__7__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__0__Impl_in_rule__RecordType__Group_24__04719 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__1_in_rule__RecordType__Group_24__04722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_24__0__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__1__Impl_in_rule__RecordType__Group_24__14781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_24_1_in_rule__RecordType__Group_24__1__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04842 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__0__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14904 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__1__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24966 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__Group__2__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35028 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__3__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45090 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__4__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55152 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__5__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65214 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75274 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__7__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85336 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group__8__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95398 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__9__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105460 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__10__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115522 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__11__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125584 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__12__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135646 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__145706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__14__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__05795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__05798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_13_2__0__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__15857 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__25917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_13_2__2__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__05982 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__05985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__0__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16044 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__1__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26106 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumType__Group__2__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36168 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__3__Impl6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46230 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__4__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56292 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__5__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66354 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumType__Group__6__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76416 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__7__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86478 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__8__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96540 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__9__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106602 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EnumType__Group__10__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116664 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__11__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__126726 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__126729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__12__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__136788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__136791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__13__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__146850 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__146853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__156910 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__156913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__15__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__166972 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__166975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__16__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177034 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__17__Impl7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumType__Group__18__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197158 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__19__Impl7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207220 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__20__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217282 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumType__Group__21__Impl7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227344 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237404 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7434 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247465 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumType__Group__24__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumType__Group__25__Impl7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_22__0__Impl7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__17700 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__17703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__27760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_22__2__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__07825 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__07828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group_23__0__Impl7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__17887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__17890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_23__1__Impl7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__27949 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__27952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__38009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_23__3__Impl8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08076 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__0__Impl8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18138 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__1__Impl8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28200 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArrayType__Group__2__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38262 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__3__Impl8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__4__Impl8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58386 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__5__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68448 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayType__Group__6__Impl8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__7__Impl8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88572 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayType__Group__8__Impl8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98634 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__9__Impl8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__108696 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__108699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ArrayType__Group__10__Impl8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__118758 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__118761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__11__Impl8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__128820 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__128823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__12__Impl8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__138882 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__138885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__148942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ArrayType__Group__14__Impl8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group_13_2__0__Impl9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19093 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group_13_2__2__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__0__Impl9249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19280 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__1__Impl9311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapType__Group__2__Impl9373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39404 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__3__Impl9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49466 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__4__Impl9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__5__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69590 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MapType__Group__6__Impl9621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79652 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__7__Impl9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__89714 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__89717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapType__Group__8__Impl9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__99776 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__99779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__9__Impl9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__109838 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__109841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MapType__Group__10__Impl9869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__119900 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__119903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__11__Impl9931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__129962 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__129965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__12__Impl9993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310024 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MapType__Group__14__Impl10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group_13_2__0__Impl10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110235 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group_13_2__2__Impl10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010360 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__0__Impl10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110422 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FixedType__Group__1__Impl10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210484 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__2__Impl10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310546 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__3__Impl10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410608 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__4__Impl10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510670 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__FixedType__Group__5__Impl10701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__610732 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__610735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__6__Impl10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__710794 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__710797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__7__Impl10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__810856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__810859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__8__Impl10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__910918 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__910921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1010978 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__10__Impl11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111040 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__11__Impl11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211102 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__12__Impl11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311164 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FixedType__Group__13__Impl11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411226 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__14__Impl11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511288 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__15__Impl11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__16__Impl11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711412 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__18__Impl11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011569 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primitive__Group__0__Impl11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111631 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__211691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primitive__Group__2__Impl11719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__011756 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__011759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__111815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl11842 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__011877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__011880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Namespace__Group_1__0__Impl11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__111939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment12004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_2312192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_24_112223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_rule__Field__UnionAssignment_13_712512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_012636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_112667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_112702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_312737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_012768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_112799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_112834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_312869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_412900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_912931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1712962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_112993 = new BitSet(new long[]{0x0000000000000002L});

}