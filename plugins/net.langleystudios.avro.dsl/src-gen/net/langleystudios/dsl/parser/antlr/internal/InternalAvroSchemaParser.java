package net.langleystudios.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAvroSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "','", "']'", "'\"'", "'{'", "'type'", "':'", "'}'", "'record'", "'name'", "'namespace'", "'fields'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'.'"
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
    public String getGrammarFileName() { return "../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g"; }



     	private AvroSchemaGrammarAccess grammarAccess;
     	
        public InternalAvroSchemaParser(TokenStream input, AvroSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AvroSchema";	
       	}
       	
       	@Override
       	protected AvroSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAvroSchema"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:67:1: entryRuleAvroSchema returns [EObject current=null] : iv_ruleAvroSchema= ruleAvroSchema EOF ;
    public final EObject entryRuleAvroSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvroSchema = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:68:2: (iv_ruleAvroSchema= ruleAvroSchema EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:69:2: iv_ruleAvroSchema= ruleAvroSchema EOF
            {
             newCompositeNode(grammarAccess.getAvroSchemaRule()); 
            pushFollow(FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema75);
            iv_ruleAvroSchema=ruleAvroSchema();

            state._fsp--;

             current =iv_ruleAvroSchema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvroSchema85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvroSchema"


    // $ANTLR start "ruleAvroSchema"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:76:1: ruleAvroSchema returns [EObject current=null] : ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) ) ;
    public final EObject ruleAvroSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_1 = null;

        EObject lv_types_0_2 = null;

        EObject lv_types_0_3 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:79:28: ( ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:80:1: ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:80:1: ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:81:1: ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:81:1: ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:82:1: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:82:1: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:83:3: lv_types_0_1= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleAvroSchema132);
                    lv_types_0_1=ruleJsonType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_0_1, 
                            		"JsonType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:98:8: lv_types_0_2= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleAvroSchema151);
                    lv_types_0_2=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_0_2, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:113:8: lv_types_0_3= ruleUnionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleUnionType_in_ruleAvroSchema170);
                    lv_types_0_3=ruleUnionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_0_3, 
                            		"UnionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvroSchema"


    // $ANTLR start "entryRuleUnionType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:139:1: entryRuleUnionType returns [EObject current=null] : iv_ruleUnionType= ruleUnionType EOF ;
    public final EObject entryRuleUnionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:140:2: (iv_ruleUnionType= ruleUnionType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:141:2: iv_ruleUnionType= ruleUnionType EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_ruleUnionType_in_entryRuleUnionType208);
            iv_ruleUnionType=ruleUnionType();

            state._fsp--;

             current =iv_ruleUnionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionType218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:148:1: ruleUnionType returns [EObject current=null] : (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleUnionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:151:28: ( (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:152:1: (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:152:1: (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:152:3: otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleUnionType255); 

                	newLeafNode(otherlv_0, grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:156:1: ( (lv_types_1_0= ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:157:1: (lv_types_1_0= ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:157:1: (lv_types_1_0= ruleUnionMember )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:158:3: lv_types_1_0= ruleUnionMember
            {
             
            	        newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnionMember_in_ruleUnionType276);
            lv_types_1_0=ruleUnionMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_1_0, 
                    		"UnionMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:174:2: (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:174:4: otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleUnionType289); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0());
            	        
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:178:1: ( (lv_types_3_0= ruleUnionMember ) )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:179:1: (lv_types_3_0= ruleUnionMember )
            	    {
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:179:1: (lv_types_3_0= ruleUnionMember )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:180:3: lv_types_3_0= ruleUnionMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnionMember_in_ruleUnionType310);
            	    lv_types_3_0=ruleUnionMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"UnionMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleUnionType324); 

                	newLeafNode(otherlv_4, grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleUnionMember"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:208:1: entryRuleUnionMember returns [EObject current=null] : iv_ruleUnionMember= ruleUnionMember EOF ;
    public final EObject entryRuleUnionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionMember = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:209:2: (iv_ruleUnionMember= ruleUnionMember EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:210:2: iv_ruleUnionMember= ruleUnionMember EOF
            {
             newCompositeNode(grammarAccess.getUnionMemberRule()); 
            pushFollow(FOLLOW_ruleUnionMember_in_entryRuleUnionMember360);
            iv_ruleUnionMember=ruleUnionMember();

            state._fsp--;

             current =iv_ruleUnionMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionMember370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionMember"


    // $ANTLR start "ruleUnionMember"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:217:1: ruleUnionMember returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) ) ;
    public final EObject ruleUnionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject this_RecordType_0 = null;

        EObject this_ArrayType_1 = null;

        EObject this_Primitive_2 = null;

        EObject this_MapType_3 = null;

        EObject this_EnumType_4 = null;

        EObject this_FixedType_5 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:220:28: ( (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:221:1: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:221:1: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:222:5: this_RecordType_0= ruleRecordType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRecordType_in_ruleUnionMember417);
                    this_RecordType_0=ruleRecordType();

                    state._fsp--;

                     
                            current = this_RecordType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:232:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleUnionMember444);
                    this_ArrayType_1=ruleArrayType();

                    state._fsp--;

                     
                            current = this_ArrayType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:242:5: this_Primitive_2= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleUnionMember471);
                    this_Primitive_2=rulePrimitive();

                    state._fsp--;

                     
                            current = this_Primitive_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:252:5: this_MapType_3= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMapType_in_ruleUnionMember498);
                    this_MapType_3=ruleMapType();

                    state._fsp--;

                     
                            current = this_MapType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:262:5: this_EnumType_4= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleUnionMember525);
                    this_EnumType_4=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:272:5: this_FixedType_5= ruleFixedType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFixedType_in_ruleUnionMember552);
                    this_FixedType_5=ruleFixedType();

                    state._fsp--;

                     
                            current = this_FixedType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:281:6: (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:281:6: (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:281:8: otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleUnionMember570); 

                        	newLeafNode(otherlv_6, grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:285:1: ( (otherlv_7= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:286:1: (otherlv_7= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:286:1: (otherlv_7= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:287:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnionMemberRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnionMember590); 

                    		newLeafNode(otherlv_7, grammarAccess.getUnionMemberAccess().getRecordRefRecordCrossReference_6_1_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleUnionMember602); 

                        	newLeafNode(otherlv_8, grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionMember"


    // $ANTLR start "entryRuleJsonType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:310:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:311:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:312:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType639);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType649); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:319:1: ruleJsonType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:322:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:323:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:323:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:323:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleJsonType686); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleJsonType698); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJsonType710); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleJsonType722); 

                	newLeafNode(otherlv_3, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleJsonType734); 

                	newLeafNode(otherlv_4, grammarAccess.getJsonTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleJsonType746); 

                	newLeafNode(otherlv_5, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:347:1: ( (lv_type_6_0= rulePrimitive ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:348:1: (lv_type_6_0= rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:348:1: (lv_type_6_0= rulePrimitive )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:349:3: lv_type_6_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitive_in_ruleJsonType767);
            lv_type_6_0=rulePrimitive();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"Primitive");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleJsonType779); 

                	newLeafNode(otherlv_7, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleJsonType791); 

                	newLeafNode(otherlv_8, grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleRecordType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:381:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:382:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:383:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType827);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:390:1: ruleRecordType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_namespace_22_0 = null;

        EObject lv_fieldList_30_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:393:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:394:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:394:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:394:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRecordType874); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRecordType886); 

                	newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRecordType898); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRecordType910); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRecordType922); 

                	newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRecordType934); 

                	newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRecordType946); 

                	newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getRecordKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRecordType958); 

                	newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleRecordType970); 

                	newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleRecordType982); 

                	newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleRecordType994); 

                	newLeafNode(otherlv_10, grammarAccess.getRecordTypeAccess().getNameKeyword_10());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1006); 

                	newLeafNode(otherlv_11, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleRecordType1018); 

                	newLeafNode(otherlv_12, grammarAccess.getRecordTypeAccess().getColonKeyword_12());
                
            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1030); 

                	newLeafNode(otherlv_13, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:450:1: ( (lv_name_14_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:451:1: (lv_name_14_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:451:1: (lv_name_14_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:452:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordType1047); 

            			newLeafNode(lv_name_14_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_14_0, 
                    		"ID");
            	    

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1064); 

                	newLeafNode(otherlv_15, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:472:1: (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==20) ) {
                        alt4=1;
                    }
                }
            }
            switch (alt4) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:472:3: otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"'
                    {
                    otherlv_16=(Token)match(input,11,FOLLOW_11_in_ruleRecordType1077); 

                        	newLeafNode(otherlv_16, grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0());
                        
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1089); 

                        	newLeafNode(otherlv_17, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1());
                        
                    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleRecordType1101); 

                        	newLeafNode(otherlv_18, grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2());
                        
                    otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1113); 

                        	newLeafNode(otherlv_19, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3());
                        
                    otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleRecordType1125); 

                        	newLeafNode(otherlv_20, grammarAccess.getRecordTypeAccess().getColonKeyword_16_4());
                        
                    otherlv_21=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1137); 

                        	newLeafNode(otherlv_21, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:496:1: ( (lv_namespace_22_0= ruleNamespace ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:497:1: (lv_namespace_22_0= ruleNamespace )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:497:1: (lv_namespace_22_0= ruleNamespace )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:498:3: lv_namespace_22_0= ruleNamespace
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespace_in_ruleRecordType1158);
                    lv_namespace_22_0=ruleNamespace();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_22_0, 
                            		"Namespace");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1170); 

                        	newLeafNode(otherlv_23, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,11,FOLLOW_11_in_ruleRecordType1184); 

                	newLeafNode(otherlv_24, grammarAccess.getRecordTypeAccess().getCommaKeyword_17());
                
            otherlv_25=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1196); 

                	newLeafNode(otherlv_25, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18());
                
            otherlv_26=(Token)match(input,21,FOLLOW_21_in_ruleRecordType1208); 

                	newLeafNode(otherlv_26, grammarAccess.getRecordTypeAccess().getFieldsKeyword_19());
                
            otherlv_27=(Token)match(input,13,FOLLOW_13_in_ruleRecordType1220); 

                	newLeafNode(otherlv_27, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20());
                
            otherlv_28=(Token)match(input,16,FOLLOW_16_in_ruleRecordType1232); 

                	newLeafNode(otherlv_28, grammarAccess.getRecordTypeAccess().getColonKeyword_21());
                
            otherlv_29=(Token)match(input,10,FOLLOW_10_in_ruleRecordType1244); 

                	newLeafNode(otherlv_29, grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:542:1: ( (lv_fieldList_30_0= ruleFieldList ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:543:1: (lv_fieldList_30_0= ruleFieldList )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:543:1: (lv_fieldList_30_0= ruleFieldList )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:544:3: lv_fieldList_30_0= ruleFieldList
            {
             
            	        newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_23_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldList_in_ruleRecordType1265);
            lv_fieldList_30_0=ruleFieldList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	        }
                   		set(
                   			current, 
                   			"fieldList",
                    		lv_fieldList_30_0, 
                    		"FieldList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_31=(Token)match(input,12,FOLLOW_12_in_ruleRecordType1277); 

                	newLeafNode(otherlv_31, grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_24());
                
            otherlv_32=(Token)match(input,17,FOLLOW_17_in_ruleRecordType1289); 

                	newLeafNode(otherlv_32, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_25());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleFieldList"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:576:1: entryRuleFieldList returns [EObject current=null] : iv_ruleFieldList= ruleFieldList EOF ;
    public final EObject entryRuleFieldList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldList = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:577:2: (iv_ruleFieldList= ruleFieldList EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:578:2: iv_ruleFieldList= ruleFieldList EOF
            {
             newCompositeNode(grammarAccess.getFieldListRule()); 
            pushFollow(FOLLOW_ruleFieldList_in_entryRuleFieldList1325);
            iv_ruleFieldList=ruleFieldList();

            state._fsp--;

             current =iv_ruleFieldList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldList1335); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldList"


    // $ANTLR start "ruleFieldList"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:585:1: ruleFieldList returns [EObject current=null] : ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* ) ;
    public final EObject ruleFieldList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:588:28: ( ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:1: ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:1: ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:2: ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )*
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:2: ( (lv_fields_0_0= ruleField ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:590:1: (lv_fields_0_0= ruleField )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:590:1: (lv_fields_0_0= ruleField )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:591:3: lv_fields_0_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleField_in_ruleFieldList1381);
            lv_fields_0_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldListRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_0_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:607:2: (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:607:4: otherlv_1= ',' ( (lv_fields_2_0= ruleField ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFieldList1394); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFieldListAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:611:1: ( (lv_fields_2_0= ruleField ) )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:612:1: (lv_fields_2_0= ruleField )
            	    {
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:612:1: (lv_fields_2_0= ruleField )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:613:3: lv_fields_2_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleFieldList1415);
            	    lv_fields_2_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_2_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldList"


    // $ANTLR start "entryRuleField"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:637:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:638:2: (iv_ruleField= ruleField EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:639:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1453);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:646:1: ruleField returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_1=null;
        Token lv_name_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;

        EObject lv_array_19_0 = null;

        EObject lv_map_20_0 = null;

        EObject lv_fixed_21_0 = null;

        EObject lv_union_22_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:649:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:650:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:650:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:650:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleField1500); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleField1512); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleField1524); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getNameKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleField1536); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleField1548); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleField1560); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getQuotationMarkKeyword_5());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:674:1: ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:675:1: ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:675:1: ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:676:1: (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:676:1: (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:677:3: lv_name_6_1= 'name'
                    {
                    lv_name_6_1=(Token)match(input,19,FOLLOW_19_in_ruleField1580); 

                            newLeafNode(lv_name_6_1, grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:689:8: lv_name_6_2= RULE_ID
                    {
                    lv_name_6_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1608); 

                    			newLeafNode(lv_name_6_2, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_2, 
                            		"ID");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleField1628); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleField1640); 

                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleField1652); 

                	newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleField1664); 

                	newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getTypeKeyword_10());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleField1676); 

                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleField1688); 

                	newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getColonKeyword_12());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:731:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) )
            int alt7=8;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:731:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:731:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:732:1: (lv_primitive_13_0= rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:732:1: (lv_primitive_13_0= rulePrimitive )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:733:3: lv_primitive_13_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleField1710);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_13_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:750:6: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:750:6: ( (lv_record_14_0= ruleRecordType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:751:1: (lv_record_14_0= ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:751:1: (lv_record_14_0= ruleRecordType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:752:3: lv_record_14_0= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleField1737);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_14_0, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:769:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:769:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:769:8: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleField1756); 

                        	newLeafNode(otherlv_15, grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:773:1: ( (otherlv_16= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:774:1: (otherlv_16= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:774:1: (otherlv_16= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:775:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1776); 

                    		newLeafNode(otherlv_16, grammarAccess.getFieldAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleField1788); 

                        	newLeafNode(otherlv_17, grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:791:6: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:791:6: ( (lv_etype_18_0= ruleEnumType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:792:1: (lv_etype_18_0= ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:792:1: (lv_etype_18_0= ruleEnumType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:793:3: lv_etype_18_0= ruleEnumType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumType_in_ruleField1816);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"etype",
                            		lv_etype_18_0, 
                            		"EnumType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:810:6: ( (lv_array_19_0= ruleArrayType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:810:6: ( (lv_array_19_0= ruleArrayType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:811:1: (lv_array_19_0= ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:811:1: (lv_array_19_0= ruleArrayType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:812:3: lv_array_19_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleField1843);
                    lv_array_19_0=ruleArrayType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_19_0, 
                            		"ArrayType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:829:6: ( (lv_map_20_0= ruleMapType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:829:6: ( (lv_map_20_0= ruleMapType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:830:1: (lv_map_20_0= ruleMapType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:830:1: (lv_map_20_0= ruleMapType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:831:3: lv_map_20_0= ruleMapType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapType_in_ruleField1870);
                    lv_map_20_0=ruleMapType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"map",
                            		lv_map_20_0, 
                            		"MapType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:848:6: ( (lv_fixed_21_0= ruleFixedType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:848:6: ( (lv_fixed_21_0= ruleFixedType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:849:1: (lv_fixed_21_0= ruleFixedType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:849:1: (lv_fixed_21_0= ruleFixedType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:850:3: lv_fixed_21_0= ruleFixedType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFixedType_in_ruleField1897);
                    lv_fixed_21_0=ruleFixedType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"fixed",
                            		lv_fixed_21_0, 
                            		"FixedType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:867:6: ( (lv_union_22_0= ruleUnionType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:867:6: ( (lv_union_22_0= ruleUnionType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:868:1: (lv_union_22_0= ruleUnionType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:868:1: (lv_union_22_0= ruleUnionType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:869:3: lv_union_22_0= ruleUnionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnionType_in_ruleField1924);
                    lv_union_22_0=ruleUnionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"union",
                            		lv_union_22_0, 
                            		"UnionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleField1937); 

                	newLeafNode(otherlv_23, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnumType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:897:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:898:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:899:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1973);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:906:1: ruleEnumType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_symbols_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_symbols_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:909:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:910:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:910:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:910:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2020); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2032); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEnumType2044); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2056); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEnumType2068); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2080); 

                	newLeafNode(otherlv_5, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleEnumType2092); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getEnumKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2104); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleEnumType2116); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2128); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEnumType2140); 

                	newLeafNode(otherlv_10, grammarAccess.getEnumTypeAccess().getNameKeyword_10());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2152); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleEnumType2164); 

                	newLeafNode(otherlv_12, grammarAccess.getEnumTypeAccess().getColonKeyword_12());
                
            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2176); 

                	newLeafNode(otherlv_13, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:966:1: ( (lv_name_14_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:967:1: (lv_name_14_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:967:1: (lv_name_14_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:968:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2193); 

            			newLeafNode(lv_name_14_0, grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_14_0, 
                    		"ID");
            	    

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2210); 

                	newLeafNode(otherlv_15, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15());
                
            otherlv_16=(Token)match(input,11,FOLLOW_11_in_ruleEnumType2222); 

                	newLeafNode(otherlv_16, grammarAccess.getEnumTypeAccess().getCommaKeyword_16());
                
            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2234); 

                	newLeafNode(otherlv_17, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17());
                
            otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleEnumType2246); 

                	newLeafNode(otherlv_18, grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18());
                
            otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2258); 

                	newLeafNode(otherlv_19, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19());
                
            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleEnumType2270); 

                	newLeafNode(otherlv_20, grammarAccess.getEnumTypeAccess().getColonKeyword_20());
                
            otherlv_21=(Token)match(input,10,FOLLOW_10_in_ruleEnumType2282); 

                	newLeafNode(otherlv_21, grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1012:1: (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1012:3: otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"'
            {
            otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2295); 

                	newLeafNode(otherlv_22, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1016:1: ( (lv_symbols_23_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1017:1: (lv_symbols_23_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1017:1: (lv_symbols_23_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1018:3: lv_symbols_23_0= RULE_ID
            {
            lv_symbols_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2312); 

            			newLeafNode(lv_symbols_23_0, grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"symbols",
                    		lv_symbols_23_0, 
                    		"ID");
            	    

            }


            }

            otherlv_24=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2329); 

                	newLeafNode(otherlv_24, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2());
                

            }

            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1038:2: (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1038:4: otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"'
            	    {
            	    otherlv_25=(Token)match(input,11,FOLLOW_11_in_ruleEnumType2343); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0());
            	        
            	    otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2355); 

            	        	newLeafNode(otherlv_26, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1());
            	        
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1046:1: ( (lv_symbols_27_0= RULE_ID ) )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1047:1: (lv_symbols_27_0= RULE_ID )
            	    {
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1047:1: (lv_symbols_27_0= RULE_ID )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1048:3: lv_symbols_27_0= RULE_ID
            	    {
            	    lv_symbols_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2372); 

            	    			newLeafNode(lv_symbols_27_0, grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"symbols",
            	            		lv_symbols_27_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_28=(Token)match(input,13,FOLLOW_13_in_ruleEnumType2389); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_29=(Token)match(input,12,FOLLOW_12_in_ruleEnumType2403); 

                	newLeafNode(otherlv_29, grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24());
                
            otherlv_30=(Token)match(input,17,FOLLOW_17_in_ruleEnumType2415); 

                	newLeafNode(otherlv_30, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleArrayType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1084:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1085:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1086:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType2451);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType2461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1093:1: ruleArrayType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1096:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1097:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1097:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1097:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2498); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2510); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleArrayType2522); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2534); 

                	newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleArrayType2546); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2558); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleArrayType2570); 

                	newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getArrayKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2582); 

                	newLeafNode(otherlv_7, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleArrayType2594); 

                	newLeafNode(otherlv_8, grammarAccess.getArrayTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2606); 

                	newLeafNode(otherlv_9, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleArrayType2618); 

                	newLeafNode(otherlv_10, grammarAccess.getArrayTypeAccess().getItemsKeyword_10());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2630); 

                	newLeafNode(otherlv_11, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleArrayType2642); 

                	newLeafNode(otherlv_12, grammarAccess.getArrayTypeAccess().getColonKeyword_12());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1149:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1149:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1149:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1150:1: (lv_primitive_13_0= rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1150:1: (lv_primitive_13_0= rulePrimitive )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1151:3: lv_primitive_13_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleArrayType2664);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_13_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1168:6: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1168:6: ( (lv_record_14_0= ruleRecordType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1169:1: (lv_record_14_0= ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1169:1: (lv_record_14_0= ruleRecordType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1170:3: lv_record_14_0= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleArrayType2691);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_14_0, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1187:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1187:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1187:8: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2710); 

                        	newLeafNode(otherlv_15, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1191:1: ( (otherlv_16= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1192:1: (otherlv_16= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1192:1: (otherlv_16= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1193:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrayTypeRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrayType2730); 

                    		newLeafNode(otherlv_16, grammarAccess.getArrayTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2742); 

                        	newLeafNode(otherlv_17, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1209:6: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1209:6: ( (lv_etype_18_0= ruleEnumType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1210:1: (lv_etype_18_0= ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1210:1: (lv_etype_18_0= ruleEnumType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1211:3: lv_etype_18_0= ruleEnumType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumType_in_ruleArrayType2770);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"etype",
                            		lv_etype_18_0, 
                            		"EnumType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleArrayType2783); 

                	newLeafNode(otherlv_19, grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleMapType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1239:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1240:2: (iv_ruleMapType= ruleMapType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1241:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType2819);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType2829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1248:1: ruleMapType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;

        EObject lv_atype_19_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1251:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1252:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1252:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1252:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMapType2866); 

                	newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleMapType2878); 

                	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMapType2890); 

                	newLeafNode(otherlv_2, grammarAccess.getMapTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMapType2902); 

                	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMapType2914); 

                	newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMapType2926); 

                	newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleMapType2938); 

                	newLeafNode(otherlv_6, grammarAccess.getMapTypeAccess().getMapKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleMapType2950); 

                	newLeafNode(otherlv_7, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleMapType2962); 

                	newLeafNode(otherlv_8, grammarAccess.getMapTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleMapType2974); 

                	newLeafNode(otherlv_9, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleMapType2986); 

                	newLeafNode(otherlv_10, grammarAccess.getMapTypeAccess().getItemsKeyword_10());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleMapType2998); 

                	newLeafNode(otherlv_11, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleMapType3010); 

                	newLeafNode(otherlv_12, grammarAccess.getMapTypeAccess().getColonKeyword_12());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1304:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) )
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1304:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1304:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1305:1: (lv_primitive_13_0= rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1305:1: (lv_primitive_13_0= rulePrimitive )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1306:3: lv_primitive_13_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleMapType3032);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_13_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1323:6: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1323:6: ( (lv_record_14_0= ruleRecordType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1324:1: (lv_record_14_0= ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1324:1: (lv_record_14_0= ruleRecordType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1325:3: lv_record_14_0= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleMapType3059);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_14_0, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1342:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1342:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1342:8: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleMapType3078); 

                        	newLeafNode(otherlv_15, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1346:1: ( (otherlv_16= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1347:1: (otherlv_16= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1347:1: (otherlv_16= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1348:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapTypeRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapType3098); 

                    		newLeafNode(otherlv_16, grammarAccess.getMapTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleMapType3110); 

                        	newLeafNode(otherlv_17, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1364:6: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1364:6: ( (lv_etype_18_0= ruleEnumType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1365:1: (lv_etype_18_0= ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1365:1: (lv_etype_18_0= ruleEnumType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1366:3: lv_etype_18_0= ruleEnumType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumType_in_ruleMapType3138);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"etype",
                            		lv_etype_18_0, 
                            		"EnumType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1383:6: ( (lv_atype_19_0= ruleArrayType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1383:6: ( (lv_atype_19_0= ruleArrayType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1384:1: (lv_atype_19_0= ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1384:1: (lv_atype_19_0= ruleArrayType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1385:3: lv_atype_19_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleMapType3165);
                    lv_atype_19_0=ruleArrayType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"atype",
                            		lv_atype_19_0, 
                            		"ArrayType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleMapType3178); 

                	newLeafNode(otherlv_20, grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleFixedType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1413:1: entryRuleFixedType returns [EObject current=null] : iv_ruleFixedType= ruleFixedType EOF ;
    public final EObject entryRuleFixedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1414:2: (iv_ruleFixedType= ruleFixedType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1415:2: iv_ruleFixedType= ruleFixedType EOF
            {
             newCompositeNode(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType3214);
            iv_ruleFixedType=ruleFixedType();

            state._fsp--;

             current =iv_ruleFixedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType3224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1422:1: ruleFixedType returns [EObject current=null] : (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' ) ;
    public final EObject ruleFixedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_size_17_0=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1425:28: ( (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1426:1: (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1426:1: (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1426:3: otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3261); 

                	newLeafNode(otherlv_0, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleFixedType3273); 

                	newLeafNode(otherlv_1, grammarAccess.getFixedTypeAccess().getFixedKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3285); 

                	newLeafNode(otherlv_2, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2());
                
            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleFixedType3297); 

                	newLeafNode(otherlv_3, grammarAccess.getFixedTypeAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3309); 

                	newLeafNode(otherlv_4, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFixedType3321); 

                	newLeafNode(otherlv_5, grammarAccess.getFixedTypeAccess().getNameKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3333); 

                	newLeafNode(otherlv_6, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleFixedType3345); 

                	newLeafNode(otherlv_7, grammarAccess.getFixedTypeAccess().getColonKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3357); 

                	newLeafNode(otherlv_8, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1462:1: ( (lv_name_9_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1463:1: (lv_name_9_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1463:1: (lv_name_9_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1464:3: lv_name_9_0= RULE_ID
            {
            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFixedType3374); 

            			newLeafNode(lv_name_9_0, grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFixedTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_9_0, 
                    		"ID");
            	    

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3391); 

                	newLeafNode(otherlv_10, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10());
                
            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleFixedType3403); 

                	newLeafNode(otherlv_11, grammarAccess.getFixedTypeAccess().getCommaKeyword_11());
                
            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3415); 

                	newLeafNode(otherlv_12, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12());
                
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleFixedType3427); 

                	newLeafNode(otherlv_13, grammarAccess.getFixedTypeAccess().getSizeKeyword_13());
                
            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3439); 

                	newLeafNode(otherlv_14, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14());
                
            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleFixedType3451); 

                	newLeafNode(otherlv_15, grammarAccess.getFixedTypeAccess().getColonKeyword_15());
                
            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3463); 

                	newLeafNode(otherlv_16, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1508:1: ( (lv_size_17_0= RULE_INT ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1509:1: (lv_size_17_0= RULE_INT )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1509:1: (lv_size_17_0= RULE_INT )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1510:3: lv_size_17_0= RULE_INT
            {
            lv_size_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFixedType3480); 

            			newLeafNode(lv_size_17_0, grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFixedTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_17_0, 
                    		"INT");
            	    

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleFixedType3497); 

                	newLeafNode(otherlv_18, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRulePrimitive"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1538:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1539:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1540:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive3533);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive3543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1547:1: rulePrimitive returns [EObject current=null] : (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_1_4=null;
        Token lv_type_1_5=null;
        Token lv_type_1_6=null;
        Token lv_type_1_7=null;
        Token lv_type_1_8=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1550:28: ( (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1551:1: (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1551:1: (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1551:3: otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePrimitive3580); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1555:1: ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1556:1: ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1556:1: ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1557:1: (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1557:1: (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            case 34:
                {
                alt11=6;
                }
                break;
            case 35:
                {
                alt11=7;
                }
                break;
            case 36:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1558:3: lv_type_1_1= 'null'
                    {
                    lv_type_1_1=(Token)match(input,29,FOLLOW_29_in_rulePrimitive3600); 

                            newLeafNode(lv_type_1_1, grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1570:8: lv_type_1_2= 'boolean'
                    {
                    lv_type_1_2=(Token)match(input,30,FOLLOW_30_in_rulePrimitive3629); 

                            newLeafNode(lv_type_1_2, grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1582:8: lv_type_1_3= 'int'
                    {
                    lv_type_1_3=(Token)match(input,31,FOLLOW_31_in_rulePrimitive3658); 

                            newLeafNode(lv_type_1_3, grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1594:8: lv_type_1_4= 'long'
                    {
                    lv_type_1_4=(Token)match(input,32,FOLLOW_32_in_rulePrimitive3687); 

                            newLeafNode(lv_type_1_4, grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1606:8: lv_type_1_5= 'float'
                    {
                    lv_type_1_5=(Token)match(input,33,FOLLOW_33_in_rulePrimitive3716); 

                            newLeafNode(lv_type_1_5, grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1618:8: lv_type_1_6= 'double'
                    {
                    lv_type_1_6=(Token)match(input,34,FOLLOW_34_in_rulePrimitive3745); 

                            newLeafNode(lv_type_1_6, grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1630:8: lv_type_1_7= 'bytes'
                    {
                    lv_type_1_7=(Token)match(input,35,FOLLOW_35_in_rulePrimitive3774); 

                            newLeafNode(lv_type_1_7, grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1642:8: lv_type_1_8= 'string'
                    {
                    lv_type_1_8=(Token)match(input,36,FOLLOW_36_in_rulePrimitive3803); 

                            newLeafNode(lv_type_1_8, grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_8, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePrimitive3831); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNamespace"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1669:1: entryRuleNamespace returns [String current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final String entryRuleNamespace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespace = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1670:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1671:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace3868);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace3879); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1678:1: ruleNamespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1681:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1682:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1682:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1682:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespace3919); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1689:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1690:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleNamespace3938); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespace3953); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\12\1\15\1\uffff\1\17\1\15\1\20\2\15\2\uffff";
    static final String DFA1_maxS =
        "\1\16\1\15\1\uffff\1\17\1\15\1\20\1\15\1\22\2\uffff";
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
            return "82:1: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )";
        }
    }
    static final String DFA3_eotS =
        "\17\uffff";
    static final String DFA3_eofS =
        "\17\uffff";
    static final String DFA3_minS =
        "\2\15\1\4\1\17\3\uffff\1\15\1\20\1\15\1\22\4\uffff";
    static final String DFA3_maxS =
        "\1\16\1\15\1\44\1\17\3\uffff\1\15\1\20\1\15\1\32\4\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\7\1\6\1\3\4\uffff\1\2\1\1\1\4\1\5";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\1",
            "\1\3",
            "\1\4\26\uffff\1\5\1\uffff\10\6",
            "\1\7",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\3\uffff\1\16\1\uffff\1\13\1\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "221:1: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) )";
        }
    }
    static final String DFA7_eotS =
        "\20\uffff";
    static final String DFA7_eofS =
        "\20\uffff";
    static final String DFA7_minS =
        "\1\12\1\4\1\15\4\uffff\1\17\1\15\1\20\1\15\1\22\4\uffff";
    static final String DFA7_maxS =
        "\1\16\1\44\1\15\4\uffff\1\17\1\15\1\20\1\15\1\32\4\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\10\1\3\1\1\1\7\5\uffff\1\4\1\5\1\2\1\6";
    static final String DFA7_specialS =
        "\20\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\2\uffff\1\1\1\2",
            "\1\4\26\uffff\1\6\1\uffff\10\5",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\16\3\uffff\1\14\1\uffff\1\15\1\uffff\1\17",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "731:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) )";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\15\1\4\1\15\2\uffff\1\17\1\15\1\20\1\15\1\22\2\uffff";
    static final String DFA9_maxS =
        "\1\16\1\44\1\15\2\uffff\1\17\1\15\1\20\1\15\1\26\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\4\1\2";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2",
            "\1\4\30\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\3\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1149:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) )";
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\15\1\4\1\15\2\uffff\1\17\1\15\1\20\1\15\1\22\3\uffff";
    static final String DFA10_maxS =
        "\1\16\1\44\1\15\2\uffff\1\17\1\15\1\20\1\15\1\30\3\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\2\1\4\1\5";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\2",
            "\1\4\30\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\3\uffff\1\13\1\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1304:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvroSchema85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleAvroSchema132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleAvroSchema151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_ruleAvroSchema170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_entryRuleUnionType208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionType218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleUnionType255 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleUnionMember_in_ruleUnionType276 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleUnionType289 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleUnionMember_in_ruleUnionType310 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_ruleUnionType324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_entryRuleUnionMember360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionMember370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleUnionMember417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleUnionMember444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleUnionMember471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleUnionMember498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleUnionMember525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_ruleUnionMember552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleUnionMember570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnionMember590 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUnionMember602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleJsonType686 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonType698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJsonType710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonType722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonType734 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonType746 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleJsonType767 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonType779 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleJsonType791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRecordType874 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType886 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRecordType898 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType910 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType922 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType934 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecordType946 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType958 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType970 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecordType994 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1006 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType1018 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordType1047 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1064 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType1077 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1089 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecordType1101 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1113 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType1125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleRecordType1158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1170 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType1184 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1196 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRecordType1208 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordType1220 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType1232 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleRecordType1244 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFieldList_in_ruleRecordType1265 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecordType1277 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRecordType1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldList_in_entryRuleFieldList1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldList1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleFieldList1381 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleFieldList1394 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleField_in_ruleFieldList1415 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleField1500 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1512 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1524 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1536 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField1548 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1560 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleField1580 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1608 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1628 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleField1640 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1652 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleField1664 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1676 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField1688 = new BitSet(new long[]{0x0000000000006400L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleField1710 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleField1737 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13_in_ruleField1756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1788 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleField1816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleField1843 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleField1870 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleFixedType_in_ruleField1897 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleUnionType_in_ruleField1924 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleField1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2020 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumType2044 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2056 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumType2068 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2080 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumType2092 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2104 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEnumType2116 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumType2140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2152 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumType2164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2193 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2210 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEnumType2222 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2234 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumType2246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumType2270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleEnumType2282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2312 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2329 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleEnumType2343 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumType2389 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_ruleEnumType2403 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumType2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType2451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2498 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2510 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArrayType2522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2534 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayType2546 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2558 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleArrayType2570 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2582 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleArrayType2594 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2606 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArrayType2618 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2630 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayType2642 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleArrayType2664 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleArrayType2691 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrayType2730 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2742 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleArrayType2770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArrayType2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType2819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMapType2866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType2878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMapType2890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType2902 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapType2914 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType2926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMapType2938 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType2950 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMapType2962 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType2974 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMapType2986 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType2998 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapType3010 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleMapType3032 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleMapType3059 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13_in_ruleMapType3078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapType3098 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType3110 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleMapType3138 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleMapType3165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapType3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType3214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3261 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFixedType3273 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3285 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFixedType3297 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFixedType3321 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3333 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFixedType3345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFixedType3374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFixedType3403 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3415 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFixedType3427 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3439 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFixedType3451 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFixedType3480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFixedType3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrimitive3580 = new BitSet(new long[]{0x0000001FE0000000L});
    public static final BitSet FOLLOW_29_in_rulePrimitive3600 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30_in_rulePrimitive3629 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31_in_rulePrimitive3658 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_32_in_rulePrimitive3687 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33_in_rulePrimitive3716 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_34_in_rulePrimitive3745 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35_in_rulePrimitive3774 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_36_in_rulePrimitive3803 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrimitive3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace3868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespace3919 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleNamespace3938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespace3953 = new BitSet(new long[]{0x0000002000000002L});

}