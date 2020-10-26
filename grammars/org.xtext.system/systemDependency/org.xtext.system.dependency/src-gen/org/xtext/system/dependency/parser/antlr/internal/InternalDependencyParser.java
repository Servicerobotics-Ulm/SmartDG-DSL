package org.xtext.system.dependency.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UserName'", "':'", "'import'", "'from'", "'Save'", "'@'", "'Dependency'", "'.'", "'--'", "'-->'", "'GUI'", "'('", "','", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDependencyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDependencyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDependencyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDependency.g"; }



     	private DependencyGrammarAccess grammarAccess;

        public InternalDependencyParser(TokenStream input, DependencyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemDependencyObjects";
       	}

       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemDependencyObjects"
    // InternalDependency.g:64:1: entryRuleSystemDependencyObjects returns [EObject current=null] : iv_ruleSystemDependencyObjects= ruleSystemDependencyObjects EOF ;
    public final EObject entryRuleSystemDependencyObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDependencyObjects = null;


        try {
            // InternalDependency.g:64:64: (iv_ruleSystemDependencyObjects= ruleSystemDependencyObjects EOF )
            // InternalDependency.g:65:2: iv_ruleSystemDependencyObjects= ruleSystemDependencyObjects EOF
            {
             newCompositeNode(grammarAccess.getSystemDependencyObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDependencyObjects=ruleSystemDependencyObjects();

            state._fsp--;

             current =iv_ruleSystemDependencyObjects; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystemDependencyObjects"


    // $ANTLR start "ruleSystemDependencyObjects"
    // InternalDependency.g:71:1: ruleSystemDependencyObjects returns [EObject current=null] : ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ( (lv_dependencies_3_0= ruleDependency ) )* ( (lv_guis_4_0= ruleGUI ) )* ) ;
    public final EObject ruleSystemDependencyObjects() throws RecognitionException {
        EObject current = null;

        EObject lv_username_0_0 = null;

        EObject lv_userimport_1_0 = null;

        EObject lv_at_2_0 = null;

        EObject lv_dependencies_3_0 = null;

        EObject lv_guis_4_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:77:2: ( ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ( (lv_dependencies_3_0= ruleDependency ) )* ( (lv_guis_4_0= ruleGUI ) )* ) )
            // InternalDependency.g:78:2: ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ( (lv_dependencies_3_0= ruleDependency ) )* ( (lv_guis_4_0= ruleGUI ) )* )
            {
            // InternalDependency.g:78:2: ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ( (lv_dependencies_3_0= ruleDependency ) )* ( (lv_guis_4_0= ruleGUI ) )* )
            // InternalDependency.g:79:3: ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ( (lv_dependencies_3_0= ruleDependency ) )* ( (lv_guis_4_0= ruleGUI ) )*
            {
            // InternalDependency.g:79:3: ( (lv_username_0_0= ruleUserName ) )
            // InternalDependency.g:80:4: (lv_username_0_0= ruleUserName )
            {
            // InternalDependency.g:80:4: (lv_username_0_0= ruleUserName )
            // InternalDependency.g:81:5: lv_username_0_0= ruleUserName
            {

            					newCompositeNode(grammarAccess.getSystemDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_username_0_0=ruleUserName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDependencyObjectsRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_0_0,
            						"org.xtext.system.dependency.Dependency.UserName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:98:3: ( (lv_userimport_1_0= ruleUserImport ) )
            // InternalDependency.g:99:4: (lv_userimport_1_0= ruleUserImport )
            {
            // InternalDependency.g:99:4: (lv_userimport_1_0= ruleUserImport )
            // InternalDependency.g:100:5: lv_userimport_1_0= ruleUserImport
            {

            					newCompositeNode(grammarAccess.getSystemDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_userimport_1_0=ruleUserImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDependencyObjectsRule());
            					}
            					set(
            						current,
            						"userimport",
            						lv_userimport_1_0,
            						"org.xtext.system.dependency.Dependency.UserImport");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:117:3: ( (lv_at_2_0= ruleAt ) )
            // InternalDependency.g:118:4: (lv_at_2_0= ruleAt )
            {
            // InternalDependency.g:118:4: (lv_at_2_0= ruleAt )
            // InternalDependency.g:119:5: lv_at_2_0= ruleAt
            {

            					newCompositeNode(grammarAccess.getSystemDependencyObjectsAccess().getAtAtParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_at_2_0=ruleAt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDependencyObjectsRule());
            					}
            					set(
            						current,
            						"at",
            						lv_at_2_0,
            						"org.xtext.system.dependency.Dependency.At");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:136:3: ( (lv_dependencies_3_0= ruleDependency ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDependency.g:137:4: (lv_dependencies_3_0= ruleDependency )
            	    {
            	    // InternalDependency.g:137:4: (lv_dependencies_3_0= ruleDependency )
            	    // InternalDependency.g:138:5: lv_dependencies_3_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDependencyObjectsAccess().getDependenciesDependencyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_dependencies_3_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDependencyObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_3_0,
            	    						"org.xtext.system.dependency.Dependency.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDependency.g:155:3: ( (lv_guis_4_0= ruleGUI ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDependency.g:156:4: (lv_guis_4_0= ruleGUI )
            	    {
            	    // InternalDependency.g:156:4: (lv_guis_4_0= ruleGUI )
            	    // InternalDependency.g:157:5: lv_guis_4_0= ruleGUI
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDependencyObjectsAccess().getGuisGUIParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_guis_4_0=ruleGUI();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDependencyObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"guis",
            	    						lv_guis_4_0,
            	    						"org.xtext.system.dependency.Dependency.GUI");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSystemDependencyObjects"


    // $ANTLR start "entryRuleUserName"
    // InternalDependency.g:178:1: entryRuleUserName returns [EObject current=null] : iv_ruleUserName= ruleUserName EOF ;
    public final EObject entryRuleUserName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserName = null;


        try {
            // InternalDependency.g:178:49: (iv_ruleUserName= ruleUserName EOF )
            // InternalDependency.g:179:2: iv_ruleUserName= ruleUserName EOF
            {
             newCompositeNode(grammarAccess.getUserNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserName=ruleUserName();

            state._fsp--;

             current =iv_ruleUserName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserName"


    // $ANTLR start "ruleUserName"
    // InternalDependency.g:185:1: ruleUserName returns [EObject current=null] : (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDependency.g:191:2: ( (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalDependency.g:192:2: (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:192:2: (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalDependency.g:193:3: otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUserNameAccess().getUserNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUserNameAccess().getColonKeyword_1());
            		
            // InternalDependency.g:201:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDependency.g:202:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDependency.g:202:4: (lv_name_2_0= RULE_STRING )
            // InternalDependency.g:203:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUserNameAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUserName"


    // $ANTLR start "entryRuleUserImport"
    // InternalDependency.g:223:1: entryRuleUserImport returns [EObject current=null] : iv_ruleUserImport= ruleUserImport EOF ;
    public final EObject entryRuleUserImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserImport = null;


        try {
            // InternalDependency.g:223:51: (iv_ruleUserImport= ruleUserImport EOF )
            // InternalDependency.g:224:2: iv_ruleUserImport= ruleUserImport EOF
            {
             newCompositeNode(grammarAccess.getUserImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserImport=ruleUserImport();

            state._fsp--;

             current =iv_ruleUserImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserImport"


    // $ANTLR start "ruleUserImport"
    // InternalDependency.g:230:1: ruleUserImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_environment_1_0=null;
        Token otherlv_2=null;
        Token lv_boxpath_3_0=null;


        	enterRule();

        try {
            // InternalDependency.g:236:2: ( (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) ) )
            // InternalDependency.g:237:2: (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:237:2: (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) )
            // InternalDependency.g:238:3: otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUserImportAccess().getImportKeyword_0());
            		
            // InternalDependency.g:242:3: ( (lv_environment_1_0= RULE_STRING ) )
            // InternalDependency.g:243:4: (lv_environment_1_0= RULE_STRING )
            {
            // InternalDependency.g:243:4: (lv_environment_1_0= RULE_STRING )
            // InternalDependency.g:244:5: lv_environment_1_0= RULE_STRING
            {
            lv_environment_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_environment_1_0, grammarAccess.getUserImportAccess().getEnvironmentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"environment",
            						lv_environment_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getUserImportAccess().getFromKeyword_2());
            		
            // InternalDependency.g:264:3: ( (lv_boxpath_3_0= RULE_STRING ) )
            // InternalDependency.g:265:4: (lv_boxpath_3_0= RULE_STRING )
            {
            // InternalDependency.g:265:4: (lv_boxpath_3_0= RULE_STRING )
            // InternalDependency.g:266:5: lv_boxpath_3_0= RULE_STRING
            {
            lv_boxpath_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_boxpath_3_0, grammarAccess.getUserImportAccess().getBoxpathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"boxpath",
            						lv_boxpath_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUserImport"


    // $ANTLR start "entryRuleAt"
    // InternalDependency.g:286:1: entryRuleAt returns [EObject current=null] : iv_ruleAt= ruleAt EOF ;
    public final EObject entryRuleAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAt = null;


        try {
            // InternalDependency.g:286:43: (iv_ruleAt= ruleAt EOF )
            // InternalDependency.g:287:2: iv_ruleAt= ruleAt EOF
            {
             newCompositeNode(grammarAccess.getAtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAt=ruleAt();

            state._fsp--;

             current =iv_ruleAt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAt"


    // $ANTLR start "ruleAt"
    // InternalDependency.g:293:1: ruleAt returns [EObject current=null] : (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDependency.g:299:2: ( (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalDependency.g:300:2: (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:300:2: (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalDependency.g:301:3: otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAtAccess().getSaveKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAtAccess().getCommercialAtKeyword_1());
            		
            // InternalDependency.g:309:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDependency.g:310:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDependency.g:310:4: (lv_name_2_0= RULE_STRING )
            // InternalDependency.g:311:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAt"


    // $ANTLR start "entryRuleDependency"
    // InternalDependency.g:331:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDependency.g:331:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDependency.g:332:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDependency.g:338:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fn_2_0=null;
        Token otherlv_3=null;
        Token lv_fp_4_0=null;
        Token otherlv_5=null;
        Token lv_o_6_0=null;
        Token otherlv_7=null;
        Token lv_tn_8_0=null;
        Token otherlv_9=null;
        Token lv_tp_10_0=null;


        	enterRule();

        try {
            // InternalDependency.g:344:2: ( (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) ) )
            // InternalDependency.g:345:2: (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:345:2: (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) )
            // InternalDependency.g:346:3: otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
            		
            // InternalDependency.g:350:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:351:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:351:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:352:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDependencyAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:368:3: ( (lv_fn_2_0= RULE_STRING ) )
            // InternalDependency.g:369:4: (lv_fn_2_0= RULE_STRING )
            {
            // InternalDependency.g:369:4: (lv_fn_2_0= RULE_STRING )
            // InternalDependency.g:370:5: lv_fn_2_0= RULE_STRING
            {
            lv_fn_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_fn_2_0, grammarAccess.getDependencyAccess().getFnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fn",
            						lv_fn_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getFullStopKeyword_3());
            		
            // InternalDependency.g:390:3: ( (lv_fp_4_0= RULE_STRING ) )
            // InternalDependency.g:391:4: (lv_fp_4_0= RULE_STRING )
            {
            // InternalDependency.g:391:4: (lv_fp_4_0= RULE_STRING )
            // InternalDependency.g:392:5: lv_fp_4_0= RULE_STRING
            {
            lv_fp_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_fp_4_0, grammarAccess.getDependencyAccess().getFpSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fp",
            						lv_fp_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusKeyword_5());
            		
            // InternalDependency.g:412:3: ( (lv_o_6_0= RULE_STRING ) )
            // InternalDependency.g:413:4: (lv_o_6_0= RULE_STRING )
            {
            // InternalDependency.g:413:4: (lv_o_6_0= RULE_STRING )
            // InternalDependency.g:414:5: lv_o_6_0= RULE_STRING
            {
            lv_o_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_o_6_0, grammarAccess.getDependencyAccess().getOSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"o",
            						lv_o_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalDependency.g:434:3: ( (lv_tn_8_0= RULE_STRING ) )
            // InternalDependency.g:435:4: (lv_tn_8_0= RULE_STRING )
            {
            // InternalDependency.g:435:4: (lv_tn_8_0= RULE_STRING )
            // InternalDependency.g:436:5: lv_tn_8_0= RULE_STRING
            {
            lv_tn_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_tn_8_0, grammarAccess.getDependencyAccess().getTnSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tn",
            						lv_tn_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getDependencyAccess().getFullStopKeyword_9());
            		
            // InternalDependency.g:456:3: ( (lv_tp_10_0= RULE_STRING ) )
            // InternalDependency.g:457:4: (lv_tp_10_0= RULE_STRING )
            {
            // InternalDependency.g:457:4: (lv_tp_10_0= RULE_STRING )
            // InternalDependency.g:458:5: lv_tp_10_0= RULE_STRING
            {
            lv_tp_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_tp_10_0, grammarAccess.getDependencyAccess().getTpSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tp",
            						lv_tp_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleGUI"
    // InternalDependency.g:478:1: entryRuleGUI returns [EObject current=null] : iv_ruleGUI= ruleGUI EOF ;
    public final EObject entryRuleGUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUI = null;


        try {
            // InternalDependency.g:478:44: (iv_ruleGUI= ruleGUI EOF )
            // InternalDependency.g:479:2: iv_ruleGUI= ruleGUI EOF
            {
             newCompositeNode(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUI=ruleGUI();

            state._fsp--;

             current =iv_ruleGUI; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalDependency.g:485:1: ruleGUI returns [EObject current=null] : (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDependency.g:491:2: ( (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // InternalDependency.g:492:2: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // InternalDependency.g:492:2: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalDependency.g:493:3: otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGUIAccess().getGUIKeyword_0());
            		
            // InternalDependency.g:497:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:498:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:498:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:499:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGUIAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGUIAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDependency.g:519:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalDependency.g:520:4: (lv_x_3_0= RULE_INT )
            {
            // InternalDependency.g:520:4: (lv_x_3_0= RULE_INT )
            // InternalDependency.g:521:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_x_3_0, grammarAccess.getGUIAccess().getXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getGUIAccess().getCommaKeyword_4());
            		
            // InternalDependency.g:541:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalDependency.g:542:4: (lv_y_5_0= RULE_INT )
            {
            // InternalDependency.g:542:4: (lv_y_5_0= RULE_INT )
            // InternalDependency.g:543:5: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_y_5_0, grammarAccess.getGUIAccess().getYINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGUIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGUIAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleGUI"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}