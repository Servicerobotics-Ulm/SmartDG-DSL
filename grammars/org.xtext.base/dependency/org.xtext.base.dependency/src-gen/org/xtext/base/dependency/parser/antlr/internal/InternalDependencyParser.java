package org.xtext.base.dependency.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.base.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'new'", "'@'", "'UserName'", "':'", "'import'", "'from'", "'Environment'", "'Wiki'", "'{'", "'}'", "'Object'", "'isMulti'", "'Component'", "'InputPorts'", "','", "'OutputPorts'", "'['", "']'", "'Connector'", "'SystemProject'", "'Dependency'", "'.'", "'--'", "'-->'", "'GUI'", "'('", "')'", "'CIM'", "'is'", "'BoxLocation'", "'Import'", "'Build'", "'Launch'", "'Detach'", "'ComponentDevelopment'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "Model";
       	}

       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDependency.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDependency.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDependency.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDependency.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_username_0_0= ruleUserName ) )? ( (lv_userimport_1_0= ruleUserImport ) )? ( (lv_new_2_0= ruleNew ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_systemProjects_4_0= ruleSystemProject ) )* ( (lv_componentDevelopments_5_0= ruleComponentDevelopment ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_username_0_0 = null;

        EObject lv_userimport_1_0 = null;

        EObject lv_new_2_0 = null;

        EObject lv_environments_3_0 = null;

        EObject lv_systemProjects_4_0 = null;

        EObject lv_componentDevelopments_5_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:77:2: ( ( ( (lv_username_0_0= ruleUserName ) )? ( (lv_userimport_1_0= ruleUserImport ) )? ( (lv_new_2_0= ruleNew ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_systemProjects_4_0= ruleSystemProject ) )* ( (lv_componentDevelopments_5_0= ruleComponentDevelopment ) )* ) )
            // InternalDependency.g:78:2: ( ( (lv_username_0_0= ruleUserName ) )? ( (lv_userimport_1_0= ruleUserImport ) )? ( (lv_new_2_0= ruleNew ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_systemProjects_4_0= ruleSystemProject ) )* ( (lv_componentDevelopments_5_0= ruleComponentDevelopment ) )* )
            {
            // InternalDependency.g:78:2: ( ( (lv_username_0_0= ruleUserName ) )? ( (lv_userimport_1_0= ruleUserImport ) )? ( (lv_new_2_0= ruleNew ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_systemProjects_4_0= ruleSystemProject ) )* ( (lv_componentDevelopments_5_0= ruleComponentDevelopment ) )* )
            // InternalDependency.g:79:3: ( (lv_username_0_0= ruleUserName ) )? ( (lv_userimport_1_0= ruleUserImport ) )? ( (lv_new_2_0= ruleNew ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_systemProjects_4_0= ruleSystemProject ) )* ( (lv_componentDevelopments_5_0= ruleComponentDevelopment ) )*
            {
            // InternalDependency.g:79:3: ( (lv_username_0_0= ruleUserName ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDependency.g:80:4: (lv_username_0_0= ruleUserName )
                    {
                    // InternalDependency.g:80:4: (lv_username_0_0= ruleUserName )
                    // InternalDependency.g:81:5: lv_username_0_0= ruleUserName
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getUsernameUserNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_username_0_0=ruleUserName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"username",
                    						lv_username_0_0,
                    						"org.xtext.base.dependency.Dependency.UserName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDependency.g:98:3: ( (lv_userimport_1_0= ruleUserImport ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDependency.g:99:4: (lv_userimport_1_0= ruleUserImport )
                    {
                    // InternalDependency.g:99:4: (lv_userimport_1_0= ruleUserImport )
                    // InternalDependency.g:100:5: lv_userimport_1_0= ruleUserImport
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getUserimportUserImportParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_userimport_1_0=ruleUserImport();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"userimport",
                    						lv_userimport_1_0,
                    						"org.xtext.base.dependency.Dependency.UserImport");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDependency.g:117:3: ( (lv_new_2_0= ruleNew ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDependency.g:118:4: (lv_new_2_0= ruleNew )
            	    {
            	    // InternalDependency.g:118:4: (lv_new_2_0= ruleNew )
            	    // InternalDependency.g:119:5: lv_new_2_0= ruleNew
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getNewNewParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_new_2_0=ruleNew();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"new",
            	    						lv_new_2_0,
            	    						"org.xtext.base.dependency.Dependency.New");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDependency.g:136:3: ( (lv_environments_3_0= ruleEnvironment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDependency.g:137:4: (lv_environments_3_0= ruleEnvironment )
            	    {
            	    // InternalDependency.g:137:4: (lv_environments_3_0= ruleEnvironment )
            	    // InternalDependency.g:138:5: lv_environments_3_0= ruleEnvironment
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEnvironmentsEnvironmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_environments_3_0=ruleEnvironment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"environments",
            	    						lv_environments_3_0,
            	    						"org.xtext.base.dependency.Dependency.Environment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDependency.g:155:3: ( (lv_systemProjects_4_0= ruleSystemProject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDependency.g:156:4: (lv_systemProjects_4_0= ruleSystemProject )
            	    {
            	    // InternalDependency.g:156:4: (lv_systemProjects_4_0= ruleSystemProject )
            	    // InternalDependency.g:157:5: lv_systemProjects_4_0= ruleSystemProject
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSystemProjectsSystemProjectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_systemProjects_4_0=ruleSystemProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systemProjects",
            	    						lv_systemProjects_4_0,
            	    						"org.xtext.base.dependency.Dependency.SystemProject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDependency.g:174:3: ( (lv_componentDevelopments_5_0= ruleComponentDevelopment ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDependency.g:175:4: (lv_componentDevelopments_5_0= ruleComponentDevelopment )
            	    {
            	    // InternalDependency.g:175:4: (lv_componentDevelopments_5_0= ruleComponentDevelopment )
            	    // InternalDependency.g:176:5: lv_componentDevelopments_5_0= ruleComponentDevelopment
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentDevelopmentsComponentDevelopmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_componentDevelopments_5_0=ruleComponentDevelopment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentDevelopments",
            	    						lv_componentDevelopments_5_0,
            	    						"org.xtext.base.dependency.Dependency.ComponentDevelopment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNew"
    // InternalDependency.g:197:1: entryRuleNew returns [EObject current=null] : iv_ruleNew= ruleNew EOF ;
    public final EObject entryRuleNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNew = null;


        try {
            // InternalDependency.g:197:44: (iv_ruleNew= ruleNew EOF )
            // InternalDependency.g:198:2: iv_ruleNew= ruleNew EOF
            {
             newCompositeNode(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNew=ruleNew();

            state._fsp--;

             current =iv_ruleNew; 
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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // InternalDependency.g:204:1: ruleNew returns [EObject current=null] : ( ( (lv_name_0_0= 'new' ) ) ( (lv_object_1_0= ruleDependencyObject ) )? ( (lv_component_2_0= ruleDependencyComponent ) )? ( (lv_connector_3_0= ruleDependencyConnectors ) )? ( (lv_location_4_0= ruleAt ) ) ) ;
    public final EObject ruleNew() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_object_1_0 = null;

        EObject lv_component_2_0 = null;

        EObject lv_connector_3_0 = null;

        EObject lv_location_4_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:210:2: ( ( ( (lv_name_0_0= 'new' ) ) ( (lv_object_1_0= ruleDependencyObject ) )? ( (lv_component_2_0= ruleDependencyComponent ) )? ( (lv_connector_3_0= ruleDependencyConnectors ) )? ( (lv_location_4_0= ruleAt ) ) ) )
            // InternalDependency.g:211:2: ( ( (lv_name_0_0= 'new' ) ) ( (lv_object_1_0= ruleDependencyObject ) )? ( (lv_component_2_0= ruleDependencyComponent ) )? ( (lv_connector_3_0= ruleDependencyConnectors ) )? ( (lv_location_4_0= ruleAt ) ) )
            {
            // InternalDependency.g:211:2: ( ( (lv_name_0_0= 'new' ) ) ( (lv_object_1_0= ruleDependencyObject ) )? ( (lv_component_2_0= ruleDependencyComponent ) )? ( (lv_connector_3_0= ruleDependencyConnectors ) )? ( (lv_location_4_0= ruleAt ) ) )
            // InternalDependency.g:212:3: ( (lv_name_0_0= 'new' ) ) ( (lv_object_1_0= ruleDependencyObject ) )? ( (lv_component_2_0= ruleDependencyComponent ) )? ( (lv_connector_3_0= ruleDependencyConnectors ) )? ( (lv_location_4_0= ruleAt ) )
            {
            // InternalDependency.g:212:3: ( (lv_name_0_0= 'new' ) )
            // InternalDependency.g:213:4: (lv_name_0_0= 'new' )
            {
            // InternalDependency.g:213:4: (lv_name_0_0= 'new' )
            // InternalDependency.g:214:5: lv_name_0_0= 'new'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNewAccess().getNameNewKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "new");
            				

            }


            }

            // InternalDependency.g:226:3: ( (lv_object_1_0= ruleDependencyObject ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDependency.g:227:4: (lv_object_1_0= ruleDependencyObject )
                    {
                    // InternalDependency.g:227:4: (lv_object_1_0= ruleDependencyObject )
                    // InternalDependency.g:228:5: lv_object_1_0= ruleDependencyObject
                    {

                    					newCompositeNode(grammarAccess.getNewAccess().getObjectDependencyObjectParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_object_1_0=ruleDependencyObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNewRule());
                    					}
                    					add(
                    						current,
                    						"object",
                    						lv_object_1_0,
                    						"org.xtext.base.dependency.Dependency.DependencyObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDependency.g:245:3: ( (lv_component_2_0= ruleDependencyComponent ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDependency.g:246:4: (lv_component_2_0= ruleDependencyComponent )
                    {
                    // InternalDependency.g:246:4: (lv_component_2_0= ruleDependencyComponent )
                    // InternalDependency.g:247:5: lv_component_2_0= ruleDependencyComponent
                    {

                    					newCompositeNode(grammarAccess.getNewAccess().getComponentDependencyComponentParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_component_2_0=ruleDependencyComponent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNewRule());
                    					}
                    					add(
                    						current,
                    						"component",
                    						lv_component_2_0,
                    						"org.xtext.base.dependency.Dependency.DependencyComponent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDependency.g:264:3: ( (lv_connector_3_0= ruleDependencyConnectors ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDependency.g:265:4: (lv_connector_3_0= ruleDependencyConnectors )
                    {
                    // InternalDependency.g:265:4: (lv_connector_3_0= ruleDependencyConnectors )
                    // InternalDependency.g:266:5: lv_connector_3_0= ruleDependencyConnectors
                    {

                    					newCompositeNode(grammarAccess.getNewAccess().getConnectorDependencyConnectorsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_connector_3_0=ruleDependencyConnectors();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNewRule());
                    					}
                    					add(
                    						current,
                    						"connector",
                    						lv_connector_3_0,
                    						"org.xtext.base.dependency.Dependency.DependencyConnectors");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDependency.g:283:3: ( (lv_location_4_0= ruleAt ) )
            // InternalDependency.g:284:4: (lv_location_4_0= ruleAt )
            {
            // InternalDependency.g:284:4: (lv_location_4_0= ruleAt )
            // InternalDependency.g:285:5: lv_location_4_0= ruleAt
            {

            					newCompositeNode(grammarAccess.getNewAccess().getLocationAtParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_4_0=ruleAt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"org.xtext.base.dependency.Dependency.At");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleAt"
    // InternalDependency.g:306:1: entryRuleAt returns [EObject current=null] : iv_ruleAt= ruleAt EOF ;
    public final EObject entryRuleAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAt = null;


        try {
            // InternalDependency.g:306:43: (iv_ruleAt= ruleAt EOF )
            // InternalDependency.g:307:2: iv_ruleAt= ruleAt EOF
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
    // InternalDependency.g:313:1: ruleAt returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDependency.g:319:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDependency.g:320:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:320:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDependency.g:321:3: otherlv_0= '@' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAtAccess().getCommercialAtKeyword_0());
            		
            // InternalDependency.g:325:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:326:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:326:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:327:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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


    // $ANTLR start "entryRuleUserName"
    // InternalDependency.g:347:1: entryRuleUserName returns [EObject current=null] : iv_ruleUserName= ruleUserName EOF ;
    public final EObject entryRuleUserName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserName = null;


        try {
            // InternalDependency.g:347:49: (iv_ruleUserName= ruleUserName EOF )
            // InternalDependency.g:348:2: iv_ruleUserName= ruleUserName EOF
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
    // InternalDependency.g:354:1: ruleUserName returns [EObject current=null] : (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDependency.g:360:2: ( (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalDependency.g:361:2: (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:361:2: (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalDependency.g:362:3: otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUserNameAccess().getUserNameKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUserNameAccess().getColonKeyword_1());
            		
            // InternalDependency.g:370:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDependency.g:371:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDependency.g:371:4: (lv_name_2_0= RULE_STRING )
            // InternalDependency.g:372:5: lv_name_2_0= RULE_STRING
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
    // InternalDependency.g:392:1: entryRuleUserImport returns [EObject current=null] : iv_ruleUserImport= ruleUserImport EOF ;
    public final EObject entryRuleUserImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserImport = null;


        try {
            // InternalDependency.g:392:51: (iv_ruleUserImport= ruleUserImport EOF )
            // InternalDependency.g:393:2: iv_ruleUserImport= ruleUserImport EOF
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
    // InternalDependency.g:399:1: ruleUserImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_environment_1_0=null;
        Token otherlv_2=null;
        Token lv_boxpath_3_0=null;


        	enterRule();

        try {
            // InternalDependency.g:405:2: ( (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) ) )
            // InternalDependency.g:406:2: (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:406:2: (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) )
            // InternalDependency.g:407:3: otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUserImportAccess().getImportKeyword_0());
            		
            // InternalDependency.g:411:3: ( (lv_environment_1_0= RULE_STRING ) )
            // InternalDependency.g:412:4: (lv_environment_1_0= RULE_STRING )
            {
            // InternalDependency.g:412:4: (lv_environment_1_0= RULE_STRING )
            // InternalDependency.g:413:5: lv_environment_1_0= RULE_STRING
            {
            lv_environment_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getUserImportAccess().getFromKeyword_2());
            		
            // InternalDependency.g:433:3: ( (lv_boxpath_3_0= RULE_STRING ) )
            // InternalDependency.g:434:4: (lv_boxpath_3_0= RULE_STRING )
            {
            // InternalDependency.g:434:4: (lv_boxpath_3_0= RULE_STRING )
            // InternalDependency.g:435:5: lv_boxpath_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleEnvironment"
    // InternalDependency.g:455:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalDependency.g:455:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalDependency.g:456:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalDependency.g:462:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'Environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_objects_6_0= ruleDependencyObject ) )* ( (lv_components_7_0= ruleDependencyComponent ) )* ( (lv_connectors_8_0= ruleDependencyConnectors ) )* ( (lv_location_9_0= ruleAt ) )+ otherlv_10= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_wiki_4_0=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_objects_6_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_location_9_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:468:2: ( (otherlv_0= 'Environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_objects_6_0= ruleDependencyObject ) )* ( (lv_components_7_0= ruleDependencyComponent ) )* ( (lv_connectors_8_0= ruleDependencyConnectors ) )* ( (lv_location_9_0= ruleAt ) )+ otherlv_10= '}' ) )
            // InternalDependency.g:469:2: (otherlv_0= 'Environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_objects_6_0= ruleDependencyObject ) )* ( (lv_components_7_0= ruleDependencyComponent ) )* ( (lv_connectors_8_0= ruleDependencyConnectors ) )* ( (lv_location_9_0= ruleAt ) )+ otherlv_10= '}' )
            {
            // InternalDependency.g:469:2: (otherlv_0= 'Environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_objects_6_0= ruleDependencyObject ) )* ( (lv_components_7_0= ruleDependencyComponent ) )* ( (lv_connectors_8_0= ruleDependencyConnectors ) )* ( (lv_location_9_0= ruleAt ) )+ otherlv_10= '}' )
            // InternalDependency.g:470:3: otherlv_0= 'Environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_objects_6_0= ruleDependencyObject ) )* ( (lv_components_7_0= ruleDependencyComponent ) )* ( (lv_connectors_8_0= ruleDependencyConnectors ) )* ( (lv_location_9_0= ruleAt ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalDependency.g:474:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependency.g:475:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDependency.g:475:4: (lv_name_1_0= RULE_ID )
            // InternalDependency.g:476:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDependency.g:492:3: (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDependency.g:493:4: otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getWikiKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1());
                    			
                    // InternalDependency.g:501:4: ( (lv_wiki_4_0= RULE_STRING ) )
                    // InternalDependency.g:502:5: (lv_wiki_4_0= RULE_STRING )
                    {
                    // InternalDependency.g:502:5: (lv_wiki_4_0= RULE_STRING )
                    // InternalDependency.g:503:6: lv_wiki_4_0= RULE_STRING
                    {
                    lv_wiki_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_wiki_4_0, grammarAccess.getEnvironmentAccess().getWikiSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDependency.g:524:3: ( (lv_objects_6_0= ruleDependencyObject ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDependency.g:525:4: (lv_objects_6_0= ruleDependencyObject )
            	    {
            	    // InternalDependency.g:525:4: (lv_objects_6_0= ruleDependencyObject )
            	    // InternalDependency.g:526:5: lv_objects_6_0= ruleDependencyObject
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsDependencyObjectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_objects_6_0=ruleDependencyObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_6_0,
            	    						"org.xtext.base.dependency.Dependency.DependencyObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDependency.g:543:3: ( (lv_components_7_0= ruleDependencyComponent ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDependency.g:544:4: (lv_components_7_0= ruleDependencyComponent )
            	    {
            	    // InternalDependency.g:544:4: (lv_components_7_0= ruleDependencyComponent )
            	    // InternalDependency.g:545:5: lv_components_7_0= ruleDependencyComponent
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getComponentsDependencyComponentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_components_7_0=ruleDependencyComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_7_0,
            	    						"org.xtext.base.dependency.Dependency.DependencyComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalDependency.g:562:3: ( (lv_connectors_8_0= ruleDependencyConnectors ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDependency.g:563:4: (lv_connectors_8_0= ruleDependencyConnectors )
            	    {
            	    // InternalDependency.g:563:4: (lv_connectors_8_0= ruleDependencyConnectors )
            	    // InternalDependency.g:564:5: lv_connectors_8_0= ruleDependencyConnectors
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getConnectorsDependencyConnectorsParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_connectors_8_0=ruleDependencyConnectors();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_8_0,
            	    						"org.xtext.base.dependency.Dependency.DependencyConnectors");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalDependency.g:581:3: ( (lv_location_9_0= ruleAt ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDependency.g:582:4: (lv_location_9_0= ruleAt )
            	    {
            	    // InternalDependency.g:582:4: (lv_location_9_0= ruleAt )
            	    // InternalDependency.g:583:5: lv_location_9_0= ruleAt
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getLocationAtParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_location_9_0=ruleAt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"location",
            	    						lv_location_9_0,
            	    						"org.xtext.base.dependency.Dependency.At");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleDependencyObject"
    // InternalDependency.g:608:1: entryRuleDependencyObject returns [EObject current=null] : iv_ruleDependencyObject= ruleDependencyObject EOF ;
    public final EObject entryRuleDependencyObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyObject = null;


        try {
            // InternalDependency.g:608:57: (iv_ruleDependencyObject= ruleDependencyObject EOF )
            // InternalDependency.g:609:2: iv_ruleDependencyObject= ruleDependencyObject EOF
            {
             newCompositeNode(grammarAccess.getDependencyObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyObject=ruleDependencyObject();

            state._fsp--;

             current =iv_ruleDependencyObject; 
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
    // $ANTLR end "entryRuleDependencyObject"


    // $ANTLR start "ruleDependencyObject"
    // InternalDependency.g:615:1: ruleDependencyObject returns [EObject current=null] : (otherlv_0= 'Object' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) ) )? (otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDependencyObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_isMulti_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_wiki_7_0=null;


        	enterRule();

        try {
            // InternalDependency.g:621:2: ( (otherlv_0= 'Object' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) ) )? (otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) ) )? ) )
            // InternalDependency.g:622:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) ) )? (otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) ) )? )
            {
            // InternalDependency.g:622:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) ) )? (otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) ) )? )
            // InternalDependency.g:623:3: otherlv_0= 'Object' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) ) )? (otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyObjectAccess().getObjectKeyword_0());
            		
            // InternalDependency.g:627:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:628:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:628:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:629:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDependencyObjectAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:645:3: (otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDependency.g:646:4: otherlv_2= 'isMulti' otherlv_3= ':' ( (lv_isMulti_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDependencyObjectAccess().getIsMultiKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getDependencyObjectAccess().getColonKeyword_2_1());
                    			
                    // InternalDependency.g:654:4: ( (lv_isMulti_4_0= RULE_STRING ) )
                    // InternalDependency.g:655:5: (lv_isMulti_4_0= RULE_STRING )
                    {
                    // InternalDependency.g:655:5: (lv_isMulti_4_0= RULE_STRING )
                    // InternalDependency.g:656:6: lv_isMulti_4_0= RULE_STRING
                    {
                    lv_isMulti_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_isMulti_4_0, grammarAccess.getDependencyObjectAccess().getIsMultiSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependencyObjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"isMulti",
                    							lv_isMulti_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDependency.g:673:3: (otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDependency.g:674:4: otherlv_5= 'Wiki' otherlv_6= ':' ( (lv_wiki_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDependencyObjectAccess().getWikiKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getDependencyObjectAccess().getColonKeyword_3_1());
                    			
                    // InternalDependency.g:682:4: ( (lv_wiki_7_0= RULE_STRING ) )
                    // InternalDependency.g:683:5: (lv_wiki_7_0= RULE_STRING )
                    {
                    // InternalDependency.g:683:5: (lv_wiki_7_0= RULE_STRING )
                    // InternalDependency.g:684:6: lv_wiki_7_0= RULE_STRING
                    {
                    lv_wiki_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_wiki_7_0, grammarAccess.getDependencyObjectAccess().getWikiSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependencyObjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDependencyObject"


    // $ANTLR start "entryRuleDependencyComponent"
    // InternalDependency.g:705:1: entryRuleDependencyComponent returns [EObject current=null] : iv_ruleDependencyComponent= ruleDependencyComponent EOF ;
    public final EObject entryRuleDependencyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyComponent = null;


        try {
            // InternalDependency.g:705:60: (iv_ruleDependencyComponent= ruleDependencyComponent EOF )
            // InternalDependency.g:706:2: iv_ruleDependencyComponent= ruleDependencyComponent EOF
            {
             newCompositeNode(grammarAccess.getDependencyComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyComponent=ruleDependencyComponent();

            state._fsp--;

             current =iv_ruleDependencyComponent; 
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
    // $ANTLR end "entryRuleDependencyComponent"


    // $ANTLR start "ruleDependencyComponent"
    // InternalDependency.g:712:1: ruleDependencyComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )* )? (otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )* )? (otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleDependencyComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_wiki_15_0=null;
        Token otherlv_16=null;
        EObject lv_inputPorts_5_0 = null;

        EObject lv_inputPorts_7_0 = null;

        EObject lv_outputPorts_10_0 = null;

        EObject lv_outputPorts_12_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:718:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )* )? (otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )* )? (otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // InternalDependency.g:719:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )* )? (otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )* )? (otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // InternalDependency.g:719:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )* )? (otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )* )? (otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // InternalDependency.g:720:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )* )? (otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )* )? (otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyComponentAccess().getComponentKeyword_0());
            		
            // InternalDependency.g:724:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:725:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:725:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:726:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDependencyComponentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDependency.g:746:3: (otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDependency.g:747:4: otherlv_3= 'InputPorts' otherlv_4= ':' ( (lv_inputPorts_5_0= ruleDependencyPort ) ) (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )*
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getDependencyComponentAccess().getInputPortsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getDependencyComponentAccess().getColonKeyword_3_1());
                    			
                    // InternalDependency.g:755:4: ( (lv_inputPorts_5_0= ruleDependencyPort ) )
                    // InternalDependency.g:756:5: (lv_inputPorts_5_0= ruleDependencyPort )
                    {
                    // InternalDependency.g:756:5: (lv_inputPorts_5_0= ruleDependencyPort )
                    // InternalDependency.g:757:6: lv_inputPorts_5_0= ruleDependencyPort
                    {

                    						newCompositeNode(grammarAccess.getDependencyComponentAccess().getInputPortsDependencyPortParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_inputPorts_5_0=ruleDependencyPort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependencyComponentRule());
                    						}
                    						add(
                    							current,
                    							"inputPorts",
                    							lv_inputPorts_5_0,
                    							"org.xtext.base.dependency.Dependency.DependencyPort");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDependency.g:774:4: (otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDependency.g:775:5: otherlv_6= ',' ( (lv_inputPorts_7_0= ruleDependencyPort ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDependencyComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDependency.g:779:5: ( (lv_inputPorts_7_0= ruleDependencyPort ) )
                    	    // InternalDependency.g:780:6: (lv_inputPorts_7_0= ruleDependencyPort )
                    	    {
                    	    // InternalDependency.g:780:6: (lv_inputPorts_7_0= ruleDependencyPort )
                    	    // InternalDependency.g:781:7: lv_inputPorts_7_0= ruleDependencyPort
                    	    {

                    	    							newCompositeNode(grammarAccess.getDependencyComponentAccess().getInputPortsDependencyPortParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_inputPorts_7_0=ruleDependencyPort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDependencyComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputPorts",
                    	    								lv_inputPorts_7_0,
                    	    								"org.xtext.base.dependency.Dependency.DependencyPort");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDependency.g:800:3: (otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDependency.g:801:4: otherlv_8= 'OutputPorts' otherlv_9= ':' ( (lv_outputPorts_10_0= ruleDependencyPort ) ) (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )*
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getDependencyComponentAccess().getOutputPortsKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getDependencyComponentAccess().getColonKeyword_4_1());
                    			
                    // InternalDependency.g:809:4: ( (lv_outputPorts_10_0= ruleDependencyPort ) )
                    // InternalDependency.g:810:5: (lv_outputPorts_10_0= ruleDependencyPort )
                    {
                    // InternalDependency.g:810:5: (lv_outputPorts_10_0= ruleDependencyPort )
                    // InternalDependency.g:811:6: lv_outputPorts_10_0= ruleDependencyPort
                    {

                    						newCompositeNode(grammarAccess.getDependencyComponentAccess().getOutputPortsDependencyPortParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_outputPorts_10_0=ruleDependencyPort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependencyComponentRule());
                    						}
                    						add(
                    							current,
                    							"outputPorts",
                    							lv_outputPorts_10_0,
                    							"org.xtext.base.dependency.Dependency.DependencyPort");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDependency.g:828:4: (otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDependency.g:829:5: otherlv_11= ',' ( (lv_outputPorts_12_0= ruleDependencyPort ) )
                    	    {
                    	    otherlv_11=(Token)match(input,25,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDependencyComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDependency.g:833:5: ( (lv_outputPorts_12_0= ruleDependencyPort ) )
                    	    // InternalDependency.g:834:6: (lv_outputPorts_12_0= ruleDependencyPort )
                    	    {
                    	    // InternalDependency.g:834:6: (lv_outputPorts_12_0= ruleDependencyPort )
                    	    // InternalDependency.g:835:7: lv_outputPorts_12_0= ruleDependencyPort
                    	    {

                    	    							newCompositeNode(grammarAccess.getDependencyComponentAccess().getOutputPortsDependencyPortParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_outputPorts_12_0=ruleDependencyPort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDependencyComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputPorts",
                    	    								lv_outputPorts_12_0,
                    	    								"org.xtext.base.dependency.Dependency.DependencyPort");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDependency.g:854:3: (otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDependency.g:855:4: otherlv_13= 'Wiki' otherlv_14= ':' ( (lv_wiki_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getDependencyComponentAccess().getWikiKeyword_5_0());
                    			
                    otherlv_14=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getDependencyComponentAccess().getColonKeyword_5_1());
                    			
                    // InternalDependency.g:863:4: ( (lv_wiki_15_0= RULE_STRING ) )
                    // InternalDependency.g:864:5: (lv_wiki_15_0= RULE_STRING )
                    {
                    // InternalDependency.g:864:5: (lv_wiki_15_0= RULE_STRING )
                    // InternalDependency.g:865:6: lv_wiki_15_0= RULE_STRING
                    {
                    lv_wiki_15_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_wiki_15_0, grammarAccess.getDependencyComponentAccess().getWikiSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependencyComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDependencyComponentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDependencyComponent"


    // $ANTLR start "entryRuleDependencyPort"
    // InternalDependency.g:890:1: entryRuleDependencyPort returns [EObject current=null] : iv_ruleDependencyPort= ruleDependencyPort EOF ;
    public final EObject entryRuleDependencyPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyPort = null;


        try {
            // InternalDependency.g:890:55: (iv_ruleDependencyPort= ruleDependencyPort EOF )
            // InternalDependency.g:891:2: iv_ruleDependencyPort= ruleDependencyPort EOF
            {
             newCompositeNode(grammarAccess.getDependencyPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyPort=ruleDependencyPort();

            state._fsp--;

             current =iv_ruleDependencyPort; 
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
    // $ANTLR end "entryRuleDependencyPort"


    // $ANTLR start "ruleDependencyPort"
    // InternalDependency.g:897:1: ruleDependencyPort returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '[' ( (lv_objinstances_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleDependencyPort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_objinstances_2_0=null;
        Token otherlv_3=null;
        Token lv_objinstances_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDependency.g:903:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '[' ( (lv_objinstances_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // InternalDependency.g:904:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '[' ( (lv_objinstances_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // InternalDependency.g:904:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '[' ( (lv_objinstances_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // InternalDependency.g:905:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '[' ( (lv_objinstances_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // InternalDependency.g:905:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalDependency.g:906:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalDependency.g:906:4: (lv_name_0_0= RULE_STRING )
            // InternalDependency.g:907:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDependencyPortAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyPortAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDependency.g:927:3: ( (lv_objinstances_2_0= RULE_STRING ) )
            // InternalDependency.g:928:4: (lv_objinstances_2_0= RULE_STRING )
            {
            // InternalDependency.g:928:4: (lv_objinstances_2_0= RULE_STRING )
            // InternalDependency.g:929:5: lv_objinstances_2_0= RULE_STRING
            {
            lv_objinstances_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_objinstances_2_0, grammarAccess.getDependencyPortAccess().getObjinstancesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyPortRule());
            					}
            					addWithLastConsumed(
            						current,
            						"objinstances",
            						lv_objinstances_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:945:3: (otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDependency.g:946:4: otherlv_3= ',' ( (lv_objinstances_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDependencyPortAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDependency.g:950:4: ( (lv_objinstances_4_0= RULE_STRING ) )
            	    // InternalDependency.g:951:5: (lv_objinstances_4_0= RULE_STRING )
            	    {
            	    // InternalDependency.g:951:5: (lv_objinstances_4_0= RULE_STRING )
            	    // InternalDependency.g:952:6: lv_objinstances_4_0= RULE_STRING
            	    {
            	    lv_objinstances_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    						newLeafNode(lv_objinstances_4_0, grammarAccess.getDependencyPortAccess().getObjinstancesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDependencyPortRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"objinstances",
            	    							lv_objinstances_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyPortAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDependencyPort"


    // $ANTLR start "entryRuleDependencyConnectors"
    // InternalDependency.g:977:1: entryRuleDependencyConnectors returns [EObject current=null] : iv_ruleDependencyConnectors= ruleDependencyConnectors EOF ;
    public final EObject entryRuleDependencyConnectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyConnectors = null;


        try {
            // InternalDependency.g:977:61: (iv_ruleDependencyConnectors= ruleDependencyConnectors EOF )
            // InternalDependency.g:978:2: iv_ruleDependencyConnectors= ruleDependencyConnectors EOF
            {
             newCompositeNode(grammarAccess.getDependencyConnectorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyConnectors=ruleDependencyConnectors();

            state._fsp--;

             current =iv_ruleDependencyConnectors; 
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
    // $ANTLR end "entryRuleDependencyConnectors"


    // $ANTLR start "ruleDependencyConnectors"
    // InternalDependency.g:984:1: ruleDependencyConnectors returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_objinstances_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleDependencyConnectors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_objinstances_3_0=null;
        Token otherlv_4=null;
        Token lv_objinstances_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDependency.g:990:2: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_objinstances_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) ) )* otherlv_6= ']' ) )
            // InternalDependency.g:991:2: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_objinstances_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) ) )* otherlv_6= ']' )
            {
            // InternalDependency.g:991:2: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_objinstances_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) ) )* otherlv_6= ']' )
            // InternalDependency.g:992:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_objinstances_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyConnectorsAccess().getConnectorKeyword_0());
            		
            // InternalDependency.g:996:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:997:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:997:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:998:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDependencyConnectorsAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyConnectorsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyConnectorsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDependency.g:1018:3: ( (lv_objinstances_3_0= RULE_STRING ) )
            // InternalDependency.g:1019:4: (lv_objinstances_3_0= RULE_STRING )
            {
            // InternalDependency.g:1019:4: (lv_objinstances_3_0= RULE_STRING )
            // InternalDependency.g:1020:5: lv_objinstances_3_0= RULE_STRING
            {
            lv_objinstances_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_objinstances_3_0, grammarAccess.getDependencyConnectorsAccess().getObjinstancesSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyConnectorsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"objinstances",
            						lv_objinstances_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:1036:3: (otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDependency.g:1037:4: otherlv_4= ',' ( (lv_objinstances_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDependencyConnectorsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDependency.g:1041:4: ( (lv_objinstances_5_0= RULE_STRING ) )
            	    // InternalDependency.g:1042:5: (lv_objinstances_5_0= RULE_STRING )
            	    {
            	    // InternalDependency.g:1042:5: (lv_objinstances_5_0= RULE_STRING )
            	    // InternalDependency.g:1043:6: lv_objinstances_5_0= RULE_STRING
            	    {
            	    lv_objinstances_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    						newLeafNode(lv_objinstances_5_0, grammarAccess.getDependencyConnectorsAccess().getObjinstancesSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDependencyConnectorsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"objinstances",
            	    							lv_objinstances_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDependencyConnectorsAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDependencyConnectors"


    // $ANTLR start "entryRuleSystemProject"
    // InternalDependency.g:1068:1: entryRuleSystemProject returns [EObject current=null] : iv_ruleSystemProject= ruleSystemProject EOF ;
    public final EObject entryRuleSystemProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemProject = null;


        try {
            // InternalDependency.g:1068:54: (iv_ruleSystemProject= ruleSystemProject EOF )
            // InternalDependency.g:1069:2: iv_ruleSystemProject= ruleSystemProject EOF
            {
             newCompositeNode(grammarAccess.getSystemProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemProject=ruleSystemProject();

            state._fsp--;

             current =iv_ruleSystemProject; 
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
    // $ANTLR end "entryRuleSystemProject"


    // $ANTLR start "ruleSystemProject"
    // InternalDependency.g:1075:1: ruleSystemProject returns [EObject current=null] : (otherlv_0= 'SystemProject' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) ( (lv_cims_10_0= ruleCIM ) )* ( (lv_dependencies_11_0= ruleDependency ) )* ( (lv_gui_12_0= ruleGUI ) )* ( (lv_location_13_0= ruleBoxLocation ) )+ otherlv_14= '}' ) ;
    public final EObject ruleSystemProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_wiki_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_environment_7_0=null;
        Token otherlv_8=null;
        Token lv_boxpath_9_0=null;
        Token otherlv_14=null;
        EObject lv_cims_10_0 = null;

        EObject lv_dependencies_11_0 = null;

        EObject lv_gui_12_0 = null;

        EObject lv_location_13_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:1081:2: ( (otherlv_0= 'SystemProject' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) ( (lv_cims_10_0= ruleCIM ) )* ( (lv_dependencies_11_0= ruleDependency ) )* ( (lv_gui_12_0= ruleGUI ) )* ( (lv_location_13_0= ruleBoxLocation ) )+ otherlv_14= '}' ) )
            // InternalDependency.g:1082:2: (otherlv_0= 'SystemProject' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) ( (lv_cims_10_0= ruleCIM ) )* ( (lv_dependencies_11_0= ruleDependency ) )* ( (lv_gui_12_0= ruleGUI ) )* ( (lv_location_13_0= ruleBoxLocation ) )+ otherlv_14= '}' )
            {
            // InternalDependency.g:1082:2: (otherlv_0= 'SystemProject' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) ( (lv_cims_10_0= ruleCIM ) )* ( (lv_dependencies_11_0= ruleDependency ) )* ( (lv_gui_12_0= ruleGUI ) )* ( (lv_location_13_0= ruleBoxLocation ) )+ otherlv_14= '}' )
            // InternalDependency.g:1083:3: otherlv_0= 'SystemProject' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) ( (lv_cims_10_0= ruleCIM ) )* ( (lv_dependencies_11_0= ruleDependency ) )* ( (lv_gui_12_0= ruleGUI ) )* ( (lv_location_13_0= ruleBoxLocation ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemProjectAccess().getSystemProjectKeyword_0());
            		
            // InternalDependency.g:1087:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependency.g:1088:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDependency.g:1088:4: (lv_name_1_0= RULE_ID )
            // InternalDependency.g:1089:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDependency.g:1105:3: (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDependency.g:1106:4: otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSystemProjectAccess().getWikiKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemProjectAccess().getColonKeyword_2_1());
                    			
                    // InternalDependency.g:1114:4: ( (lv_wiki_4_0= RULE_STRING ) )
                    // InternalDependency.g:1115:5: (lv_wiki_4_0= RULE_STRING )
                    {
                    // InternalDependency.g:1115:5: (lv_wiki_4_0= RULE_STRING )
                    // InternalDependency.g:1116:6: lv_wiki_4_0= RULE_STRING
                    {
                    lv_wiki_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_wiki_4_0, grammarAccess.getSystemProjectAccess().getWikiSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemProjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemProjectAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemProjectAccess().getImportKeyword_4());
            		
            // InternalDependency.g:1141:3: ( (lv_environment_7_0= RULE_STRING ) )
            // InternalDependency.g:1142:4: (lv_environment_7_0= RULE_STRING )
            {
            // InternalDependency.g:1142:4: (lv_environment_7_0= RULE_STRING )
            // InternalDependency.g:1143:5: lv_environment_7_0= RULE_STRING
            {
            lv_environment_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_environment_7_0, grammarAccess.getSystemProjectAccess().getEnvironmentSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"environment",
            						lv_environment_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemProjectAccess().getFromKeyword_6());
            		
            // InternalDependency.g:1163:3: ( (lv_boxpath_9_0= RULE_STRING ) )
            // InternalDependency.g:1164:4: (lv_boxpath_9_0= RULE_STRING )
            {
            // InternalDependency.g:1164:4: (lv_boxpath_9_0= RULE_STRING )
            // InternalDependency.g:1165:5: lv_boxpath_9_0= RULE_STRING
            {
            lv_boxpath_9_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_boxpath_9_0, grammarAccess.getSystemProjectAccess().getBoxpathSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"boxpath",
            						lv_boxpath_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:1181:3: ( (lv_cims_10_0= ruleCIM ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDependency.g:1182:4: (lv_cims_10_0= ruleCIM )
            	    {
            	    // InternalDependency.g:1182:4: (lv_cims_10_0= ruleCIM )
            	    // InternalDependency.g:1183:5: lv_cims_10_0= ruleCIM
            	    {

            	    					newCompositeNode(grammarAccess.getSystemProjectAccess().getCimsCIMParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_cims_10_0=ruleCIM();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cims",
            	    						lv_cims_10_0,
            	    						"org.xtext.base.dependency.Dependency.CIM");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalDependency.g:1200:3: ( (lv_dependencies_11_0= ruleDependency ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDependency.g:1201:4: (lv_dependencies_11_0= ruleDependency )
            	    {
            	    // InternalDependency.g:1201:4: (lv_dependencies_11_0= ruleDependency )
            	    // InternalDependency.g:1202:5: lv_dependencies_11_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getSystemProjectAccess().getDependenciesDependencyParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_dependencies_11_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_11_0,
            	    						"org.xtext.base.dependency.Dependency.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalDependency.g:1219:3: ( (lv_gui_12_0= ruleGUI ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDependency.g:1220:4: (lv_gui_12_0= ruleGUI )
            	    {
            	    // InternalDependency.g:1220:4: (lv_gui_12_0= ruleGUI )
            	    // InternalDependency.g:1221:5: lv_gui_12_0= ruleGUI
            	    {

            	    					newCompositeNode(grammarAccess.getSystemProjectAccess().getGuiGUIParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_gui_12_0=ruleGUI();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"gui",
            	    						lv_gui_12_0,
            	    						"org.xtext.base.dependency.Dependency.GUI");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalDependency.g:1238:3: ( (lv_location_13_0= ruleBoxLocation ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDependency.g:1239:4: (lv_location_13_0= ruleBoxLocation )
            	    {
            	    // InternalDependency.g:1239:4: (lv_location_13_0= ruleBoxLocation )
            	    // InternalDependency.g:1240:5: lv_location_13_0= ruleBoxLocation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemProjectAccess().getLocationBoxLocationParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_location_13_0=ruleBoxLocation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"location",
            	    						lv_location_13_0,
            	    						"org.xtext.base.dependency.Dependency.BoxLocation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSystemProjectAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSystemProject"


    // $ANTLR start "entryRuleDependency"
    // InternalDependency.g:1265:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDependency.g:1265:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDependency.g:1266:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalDependency.g:1272:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) (otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) ) )? ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_wiki_13_0=null;


        	enterRule();

        try {
            // InternalDependency.g:1278:2: ( (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) (otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) ) )? ) )
            // InternalDependency.g:1279:2: (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) (otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) ) )? )
            {
            // InternalDependency.g:1279:2: (otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) (otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) ) )? )
            // InternalDependency.g:1280:3: otherlv_0= 'Dependency' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_fn_2_0= RULE_STRING ) ) otherlv_3= '.' ( (lv_fp_4_0= RULE_STRING ) ) otherlv_5= '--' ( (lv_o_6_0= RULE_STRING ) ) otherlv_7= '-->' ( (lv_tn_8_0= RULE_STRING ) ) otherlv_9= '.' ( (lv_tp_10_0= RULE_STRING ) ) (otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
            		
            // InternalDependency.g:1284:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:1285:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:1285:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:1286:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            // InternalDependency.g:1302:3: ( (lv_fn_2_0= RULE_STRING ) )
            // InternalDependency.g:1303:4: (lv_fn_2_0= RULE_STRING )
            {
            // InternalDependency.g:1303:4: (lv_fn_2_0= RULE_STRING )
            // InternalDependency.g:1304:5: lv_fn_2_0= RULE_STRING
            {
            lv_fn_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getFullStopKeyword_3());
            		
            // InternalDependency.g:1324:3: ( (lv_fp_4_0= RULE_STRING ) )
            // InternalDependency.g:1325:4: (lv_fp_4_0= RULE_STRING )
            {
            // InternalDependency.g:1325:4: (lv_fp_4_0= RULE_STRING )
            // InternalDependency.g:1326:5: lv_fp_4_0= RULE_STRING
            {
            lv_fp_4_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusKeyword_5());
            		
            // InternalDependency.g:1346:3: ( (lv_o_6_0= RULE_STRING ) )
            // InternalDependency.g:1347:4: (lv_o_6_0= RULE_STRING )
            {
            // InternalDependency.g:1347:4: (lv_o_6_0= RULE_STRING )
            // InternalDependency.g:1348:5: lv_o_6_0= RULE_STRING
            {
            lv_o_6_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_7=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalDependency.g:1368:3: ( (lv_tn_8_0= RULE_STRING ) )
            // InternalDependency.g:1369:4: (lv_tn_8_0= RULE_STRING )
            {
            // InternalDependency.g:1369:4: (lv_tn_8_0= RULE_STRING )
            // InternalDependency.g:1370:5: lv_tn_8_0= RULE_STRING
            {
            lv_tn_8_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_9=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getDependencyAccess().getFullStopKeyword_9());
            		
            // InternalDependency.g:1390:3: ( (lv_tp_10_0= RULE_STRING ) )
            // InternalDependency.g:1391:4: (lv_tp_10_0= RULE_STRING )
            {
            // InternalDependency.g:1391:4: (lv_tp_10_0= RULE_STRING )
            // InternalDependency.g:1392:5: lv_tp_10_0= RULE_STRING
            {
            lv_tp_10_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalDependency.g:1408:3: (otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==18) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDependency.g:1409:4: otherlv_11= 'Wiki' otherlv_12= ':' ( (lv_wiki_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getDependencyAccess().getWikiKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getDependencyAccess().getColonKeyword_11_1());
                    			
                    // InternalDependency.g:1417:4: ( (lv_wiki_13_0= RULE_STRING ) )
                    // InternalDependency.g:1418:5: (lv_wiki_13_0= RULE_STRING )
                    {
                    // InternalDependency.g:1418:5: (lv_wiki_13_0= RULE_STRING )
                    // InternalDependency.g:1419:6: lv_wiki_13_0= RULE_STRING
                    {
                    lv_wiki_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_wiki_13_0, grammarAccess.getDependencyAccess().getWikiSTRINGTerminalRuleCall_11_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependencyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // InternalDependency.g:1440:1: entryRuleGUI returns [EObject current=null] : iv_ruleGUI= ruleGUI EOF ;
    public final EObject entryRuleGUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUI = null;


        try {
            // InternalDependency.g:1440:44: (iv_ruleGUI= ruleGUI EOF )
            // InternalDependency.g:1441:2: iv_ruleGUI= ruleGUI EOF
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
    // InternalDependency.g:1447:1: ruleGUI returns [EObject current=null] : (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_wiki_9_0=null;


        	enterRule();

        try {
            // InternalDependency.g:1453:2: ( (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) ) )? ) )
            // InternalDependency.g:1454:2: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) ) )? )
            {
            // InternalDependency.g:1454:2: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) ) )? )
            // InternalDependency.g:1455:3: otherlv_0= 'GUI' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGUIAccess().getGUIKeyword_0());
            		
            // InternalDependency.g:1459:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:1460:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:1460:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:1461:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getGUIAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDependency.g:1481:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalDependency.g:1482:4: (lv_x_3_0= RULE_INT )
            {
            // InternalDependency.g:1482:4: (lv_x_3_0= RULE_INT )
            // InternalDependency.g:1483:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

            otherlv_4=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getGUIAccess().getCommaKeyword_4());
            		
            // InternalDependency.g:1503:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalDependency.g:1504:4: (lv_y_5_0= RULE_INT )
            {
            // InternalDependency.g:1504:4: (lv_y_5_0= RULE_INT )
            // InternalDependency.g:1505:5: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_33); 

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

            otherlv_6=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getGUIAccess().getRightParenthesisKeyword_6());
            		
            // InternalDependency.g:1525:3: (otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDependency.g:1526:4: otherlv_7= 'Wiki' otherlv_8= ':' ( (lv_wiki_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getGUIAccess().getWikiKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getGUIAccess().getColonKeyword_7_1());
                    			
                    // InternalDependency.g:1534:4: ( (lv_wiki_9_0= RULE_STRING ) )
                    // InternalDependency.g:1535:5: (lv_wiki_9_0= RULE_STRING )
                    {
                    // InternalDependency.g:1535:5: (lv_wiki_9_0= RULE_STRING )
                    // InternalDependency.g:1536:6: lv_wiki_9_0= RULE_STRING
                    {
                    lv_wiki_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_wiki_9_0, grammarAccess.getGUIAccess().getWikiSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGUIRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleCIM"
    // InternalDependency.g:1557:1: entryRuleCIM returns [EObject current=null] : iv_ruleCIM= ruleCIM EOF ;
    public final EObject entryRuleCIM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCIM = null;


        try {
            // InternalDependency.g:1557:44: (iv_ruleCIM= ruleCIM EOF )
            // InternalDependency.g:1558:2: iv_ruleCIM= ruleCIM EOF
            {
             newCompositeNode(grammarAccess.getCIMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCIM=ruleCIM();

            state._fsp--;

             current =iv_ruleCIM; 
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
    // $ANTLR end "entryRuleCIM"


    // $ANTLR start "ruleCIM"
    // InternalDependency.g:1564:1: ruleCIM returns [EObject current=null] : (otherlv_0= 'CIM' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_source_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCIM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_source_3_0=null;


        	enterRule();

        try {
            // InternalDependency.g:1570:2: ( (otherlv_0= 'CIM' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_source_3_0= RULE_STRING ) ) ) )
            // InternalDependency.g:1571:2: (otherlv_0= 'CIM' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_source_3_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:1571:2: (otherlv_0= 'CIM' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_source_3_0= RULE_STRING ) ) )
            // InternalDependency.g:1572:3: otherlv_0= 'CIM' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_source_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCIMAccess().getCIMKeyword_0());
            		
            // InternalDependency.g:1576:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:1577:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:1577:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:1578:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCIMAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCIMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCIMAccess().getIsKeyword_2());
            		
            // InternalDependency.g:1598:3: ( (lv_source_3_0= RULE_STRING ) )
            // InternalDependency.g:1599:4: (lv_source_3_0= RULE_STRING )
            {
            // InternalDependency.g:1599:4: (lv_source_3_0= RULE_STRING )
            // InternalDependency.g:1600:5: lv_source_3_0= RULE_STRING
            {
            lv_source_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_source_3_0, grammarAccess.getCIMAccess().getSourceSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCIMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_3_0,
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
    // $ANTLR end "ruleCIM"


    // $ANTLR start "entryRuleBoxLocation"
    // InternalDependency.g:1620:1: entryRuleBoxLocation returns [EObject current=null] : iv_ruleBoxLocation= ruleBoxLocation EOF ;
    public final EObject entryRuleBoxLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxLocation = null;


        try {
            // InternalDependency.g:1620:52: (iv_ruleBoxLocation= ruleBoxLocation EOF )
            // InternalDependency.g:1621:2: iv_ruleBoxLocation= ruleBoxLocation EOF
            {
             newCompositeNode(grammarAccess.getBoxLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoxLocation=ruleBoxLocation();

            state._fsp--;

             current =iv_ruleBoxLocation; 
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
    // $ANTLR end "entryRuleBoxLocation"


    // $ANTLR start "ruleBoxLocation"
    // InternalDependency.g:1627:1: ruleBoxLocation returns [EObject current=null] : (otherlv_0= 'BoxLocation' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) ) )? (otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) ) )? (otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) ) )? (otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBoxLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_importflag_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_buildflag_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_launchflag_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_detachflag_13_0=null;


        	enterRule();

        try {
            // InternalDependency.g:1633:2: ( (otherlv_0= 'BoxLocation' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) ) )? (otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) ) )? (otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) ) )? (otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) ) )? ) )
            // InternalDependency.g:1634:2: (otherlv_0= 'BoxLocation' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) ) )? (otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) ) )? (otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) ) )? (otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) ) )? )
            {
            // InternalDependency.g:1634:2: (otherlv_0= 'BoxLocation' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) ) )? (otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) ) )? (otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) ) )? (otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) ) )? )
            // InternalDependency.g:1635:3: otherlv_0= 'BoxLocation' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) ) )? (otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) ) )? (otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) ) )? (otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxLocationAccess().getBoxLocationKeyword_0());
            		
            // InternalDependency.g:1639:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDependency.g:1640:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDependency.g:1640:4: (lv_name_1_0= RULE_STRING )
            // InternalDependency.g:1641:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBoxLocationAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:1657:3: (otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDependency.g:1658:4: otherlv_2= 'Import' otherlv_3= ':' ( (lv_importflag_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getBoxLocationAccess().getImportKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoxLocationAccess().getColonKeyword_2_1());
                    			
                    // InternalDependency.g:1666:4: ( (lv_importflag_4_0= RULE_STRING ) )
                    // InternalDependency.g:1667:5: (lv_importflag_4_0= RULE_STRING )
                    {
                    // InternalDependency.g:1667:5: (lv_importflag_4_0= RULE_STRING )
                    // InternalDependency.g:1668:6: lv_importflag_4_0= RULE_STRING
                    {
                    lv_importflag_4_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    						newLeafNode(lv_importflag_4_0, grammarAccess.getBoxLocationAccess().getImportflagSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxLocationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"importflag",
                    							lv_importflag_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDependency.g:1685:3: (otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDependency.g:1686:4: otherlv_5= 'Build' otherlv_6= ':' ( (lv_buildflag_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBoxLocationAccess().getBuildKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoxLocationAccess().getColonKeyword_3_1());
                    			
                    // InternalDependency.g:1694:4: ( (lv_buildflag_7_0= RULE_STRING ) )
                    // InternalDependency.g:1695:5: (lv_buildflag_7_0= RULE_STRING )
                    {
                    // InternalDependency.g:1695:5: (lv_buildflag_7_0= RULE_STRING )
                    // InternalDependency.g:1696:6: lv_buildflag_7_0= RULE_STRING
                    {
                    lv_buildflag_7_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    						newLeafNode(lv_buildflag_7_0, grammarAccess.getBoxLocationAccess().getBuildflagSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxLocationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"buildflag",
                    							lv_buildflag_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDependency.g:1713:3: (otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDependency.g:1714:4: otherlv_8= 'Launch' otherlv_9= ':' ( (lv_launchflag_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getBoxLocationAccess().getLaunchKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getBoxLocationAccess().getColonKeyword_4_1());
                    			
                    // InternalDependency.g:1722:4: ( (lv_launchflag_10_0= RULE_STRING ) )
                    // InternalDependency.g:1723:5: (lv_launchflag_10_0= RULE_STRING )
                    {
                    // InternalDependency.g:1723:5: (lv_launchflag_10_0= RULE_STRING )
                    // InternalDependency.g:1724:6: lv_launchflag_10_0= RULE_STRING
                    {
                    lv_launchflag_10_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

                    						newLeafNode(lv_launchflag_10_0, grammarAccess.getBoxLocationAccess().getLaunchflagSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxLocationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"launchflag",
                    							lv_launchflag_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDependency.g:1741:3: (otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDependency.g:1742:4: otherlv_11= 'Detach' otherlv_12= ':' ( (lv_detachflag_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getBoxLocationAccess().getDetachKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getBoxLocationAccess().getColonKeyword_5_1());
                    			
                    // InternalDependency.g:1750:4: ( (lv_detachflag_13_0= RULE_STRING ) )
                    // InternalDependency.g:1751:5: (lv_detachflag_13_0= RULE_STRING )
                    {
                    // InternalDependency.g:1751:5: (lv_detachflag_13_0= RULE_STRING )
                    // InternalDependency.g:1752:6: lv_detachflag_13_0= RULE_STRING
                    {
                    lv_detachflag_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_detachflag_13_0, grammarAccess.getBoxLocationAccess().getDetachflagSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxLocationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"detachflag",
                    							lv_detachflag_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBoxLocation"


    // $ANTLR start "entryRuleComponentDevelopment"
    // InternalDependency.g:1773:1: entryRuleComponentDevelopment returns [EObject current=null] : iv_ruleComponentDevelopment= ruleComponentDevelopment EOF ;
    public final EObject entryRuleComponentDevelopment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDevelopment = null;


        try {
            // InternalDependency.g:1773:61: (iv_ruleComponentDevelopment= ruleComponentDevelopment EOF )
            // InternalDependency.g:1774:2: iv_ruleComponentDevelopment= ruleComponentDevelopment EOF
            {
             newCompositeNode(grammarAccess.getComponentDevelopmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDevelopment=ruleComponentDevelopment();

            state._fsp--;

             current =iv_ruleComponentDevelopment; 
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
    // $ANTLR end "entryRuleComponentDevelopment"


    // $ANTLR start "ruleComponentDevelopment"
    // InternalDependency.g:1780:1: ruleComponentDevelopment returns [EObject current=null] : (otherlv_0= 'ComponentDevelopment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) otherlv_10= 'Component' ( (lv_component_11_0= RULE_STRING ) ) ( (lv_location_12_0= ruleBoxLocation ) )+ otherlv_13= '}' ) ;
    public final EObject ruleComponentDevelopment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_wiki_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_environment_7_0=null;
        Token otherlv_8=null;
        Token lv_boxpath_9_0=null;
        Token otherlv_10=null;
        Token lv_component_11_0=null;
        Token otherlv_13=null;
        EObject lv_location_12_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:1786:2: ( (otherlv_0= 'ComponentDevelopment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) otherlv_10= 'Component' ( (lv_component_11_0= RULE_STRING ) ) ( (lv_location_12_0= ruleBoxLocation ) )+ otherlv_13= '}' ) )
            // InternalDependency.g:1787:2: (otherlv_0= 'ComponentDevelopment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) otherlv_10= 'Component' ( (lv_component_11_0= RULE_STRING ) ) ( (lv_location_12_0= ruleBoxLocation ) )+ otherlv_13= '}' )
            {
            // InternalDependency.g:1787:2: (otherlv_0= 'ComponentDevelopment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) otherlv_10= 'Component' ( (lv_component_11_0= RULE_STRING ) ) ( (lv_location_12_0= ruleBoxLocation ) )+ otherlv_13= '}' )
            // InternalDependency.g:1788:3: otherlv_0= 'ComponentDevelopment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )? otherlv_5= '{' otherlv_6= 'import' ( (lv_environment_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_boxpath_9_0= RULE_STRING ) ) otherlv_10= 'Component' ( (lv_component_11_0= RULE_STRING ) ) ( (lv_location_12_0= ruleBoxLocation ) )+ otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDevelopmentAccess().getComponentDevelopmentKeyword_0());
            		
            // InternalDependency.g:1792:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependency.g:1793:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDependency.g:1793:4: (lv_name_1_0= RULE_ID )
            // InternalDependency.g:1794:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentDevelopmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDevelopmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDependency.g:1810:3: (otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDependency.g:1811:4: otherlv_2= 'Wiki' otherlv_3= ':' ( (lv_wiki_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentDevelopmentAccess().getWikiKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentDevelopmentAccess().getColonKeyword_2_1());
                    			
                    // InternalDependency.g:1819:4: ( (lv_wiki_4_0= RULE_STRING ) )
                    // InternalDependency.g:1820:5: (lv_wiki_4_0= RULE_STRING )
                    {
                    // InternalDependency.g:1820:5: (lv_wiki_4_0= RULE_STRING )
                    // InternalDependency.g:1821:6: lv_wiki_4_0= RULE_STRING
                    {
                    lv_wiki_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_wiki_4_0, grammarAccess.getComponentDevelopmentAccess().getWikiSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentDevelopmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wiki",
                    							lv_wiki_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentDevelopmentAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentDevelopmentAccess().getImportKeyword_4());
            		
            // InternalDependency.g:1846:3: ( (lv_environment_7_0= RULE_STRING ) )
            // InternalDependency.g:1847:4: (lv_environment_7_0= RULE_STRING )
            {
            // InternalDependency.g:1847:4: (lv_environment_7_0= RULE_STRING )
            // InternalDependency.g:1848:5: lv_environment_7_0= RULE_STRING
            {
            lv_environment_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_environment_7_0, grammarAccess.getComponentDevelopmentAccess().getEnvironmentSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDevelopmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"environment",
            						lv_environment_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentDevelopmentAccess().getFromKeyword_6());
            		
            // InternalDependency.g:1868:3: ( (lv_boxpath_9_0= RULE_STRING ) )
            // InternalDependency.g:1869:4: (lv_boxpath_9_0= RULE_STRING )
            {
            // InternalDependency.g:1869:4: (lv_boxpath_9_0= RULE_STRING )
            // InternalDependency.g:1870:5: lv_boxpath_9_0= RULE_STRING
            {
            lv_boxpath_9_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_boxpath_9_0, grammarAccess.getComponentDevelopmentAccess().getBoxpathSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDevelopmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"boxpath",
            						lv_boxpath_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentDevelopmentAccess().getComponentKeyword_8());
            		
            // InternalDependency.g:1890:3: ( (lv_component_11_0= RULE_STRING ) )
            // InternalDependency.g:1891:4: (lv_component_11_0= RULE_STRING )
            {
            // InternalDependency.g:1891:4: (lv_component_11_0= RULE_STRING )
            // InternalDependency.g:1892:5: lv_component_11_0= RULE_STRING
            {
            lv_component_11_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_component_11_0, grammarAccess.getComponentDevelopmentAccess().getComponentSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDevelopmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"component",
            						lv_component_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDependency.g:1908:3: ( (lv_location_12_0= ruleBoxLocation ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==40) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDependency.g:1909:4: (lv_location_12_0= ruleBoxLocation )
            	    {
            	    // InternalDependency.g:1909:4: (lv_location_12_0= ruleBoxLocation )
            	    // InternalDependency.g:1910:5: lv_location_12_0= ruleBoxLocation
            	    {

            	    					newCompositeNode(grammarAccess.getComponentDevelopmentAccess().getLocationBoxLocationParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_location_12_0=ruleBoxLocation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentDevelopmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"location",
            	    						lv_location_12_0,
            	    						"org.xtext.base.dependency.Dependency.BoxLocation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getComponentDevelopmentAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleComponentDevelopment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000200040028802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200040020802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200040020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200040000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020A01000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020B01000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000005140000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006140000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002140000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000014880000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000014880100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800000L});

}