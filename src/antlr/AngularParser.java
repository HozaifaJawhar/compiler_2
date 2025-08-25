// Generated from C:/Users/pc/IdeaProjects/AngularCompiler/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, NEW=3, COMPONENT=4, SELECTOR=5, STANDALONE=6, TRUE=7, 
		FALSE=8, IMPORTS=9, STYLES=10, TEMPLATE=11, EXPORT=12, CLASS=13, THIS=14, 
		ANY=15, RETURN=16, BREAK=17, IF=18, ELSE=19, FOR=20, WHILE=21, LET=22, 
		LBRACE=23, RBRACE=24, LBRACKET=25, RBRACKET=26, LPAREN=27, RPAREN=28, 
		COLON=29, COMMA=30, SEMI=31, DOT=32, HASH=33, DQUOTE=34, SQUOTE=35, BACKTICK=36, 
		EQUALS=37, INCREMENT=38, ARROW=39, QUESTION=40, PLUS=41, MINUS=42, MULT=43, 
		DIV=44, MOD=45, LT=46, GT=47, LE=48, GE=49, EQ=50, NEQ=51, AND=52, OR=53, 
		NOT=54, STRING_LITERAL=55, BACKTICK_LITERAL=56, NUMBER=57, IDENTIFIER=58, 
		WS=59, COMMENT=60, MULTILINE_COMMENT=61;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importItems = 2, RULE_importItem = 3, 
		RULE_modulePath = 4, RULE_componentDefinition = 5, RULE_componentConfig = 6, 
		RULE_componentProperty = 7, RULE_arrayLiteral = 8, RULE_arrayItem = 9, 
		RULE_classDeclaration = 10, RULE_classBody = 11, RULE_classMember = 12, 
		RULE_fieldDeclaration = 13, RULE_methodDeclaration = 14, RULE_parameterList = 15, 
		RULE_parameter = 16, RULE_typeAnnotation = 17, RULE_typePrimary = 18, 
		RULE_inlineObjectType = 19, RULE_objectTypeMember = 20, RULE_block = 21, 
		RULE_statement = 22, RULE_variableDeclaration = 23, RULE_expressionStatement = 24, 
		RULE_returnStatement = 25, RULE_ifStatement = 26, RULE_forStatement = 27, 
		RULE_breakStatement = 28, RULE_forInit = 29, RULE_whileStatement = 30, 
		RULE_expression = 31, RULE_assignmentExpression = 32, RULE_conditionalExpression = 33, 
		RULE_logicalOrExpression = 34, RULE_logicalAndExpression = 35, RULE_equalityExpression = 36, 
		RULE_relationalExpression = 37, RULE_additiveExpression = 38, RULE_multiplicativeExpression = 39, 
		RULE_unaryExpression = 40, RULE_postfixExpression = 41, RULE_postfixPart = 42, 
		RULE_functionCall = 43, RULE_propertyAccess = 44, RULE_postfixIncrement = 45, 
		RULE_primaryExpression = 46, RULE_newExpression = 47, RULE_arrowFunction = 48, 
		RULE_arrowParams = 49, RULE_objectLiteral = 50, RULE_keyValue = 51, RULE_literal = 52, 
		RULE_booleanLiteral = 53, RULE_qualifiedName = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importItems", "importItem", "modulePath", 
			"componentDefinition", "componentConfig", "componentProperty", "arrayLiteral", 
			"arrayItem", "classDeclaration", "classBody", "classMember", "fieldDeclaration", 
			"methodDeclaration", "parameterList", "parameter", "typeAnnotation", 
			"typePrimary", "inlineObjectType", "objectTypeMember", "block", "statement", 
			"variableDeclaration", "expressionStatement", "returnStatement", "ifStatement", 
			"forStatement", "breakStatement", "forInit", "whileStatement", "expression", 
			"assignmentExpression", "conditionalExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"postfixExpression", "postfixPart", "functionCall", "propertyAccess", 
			"postfixIncrement", "primaryExpression", "newExpression", "arrowFunction", 
			"arrowParams", "objectLiteral", "keyValue", "literal", "booleanLiteral", 
			"qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'new'", "'@Component'", "'selector'", "'standalone'", 
			"'true'", "'false'", "'imports'", "'styles'", "'template'", "'export'", 
			"'class'", "'this'", "'any'", "'return'", "'break'", "'if'", "'else'", 
			"'for'", "'while'", "'let'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"':'", "','", "';'", "'.'", "'#'", "'\"'", "'''", "'`'", "'='", "'++'", 
			"'=>'", "'?'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "NEW", "COMPONENT", "SELECTOR", "STANDALONE", 
			"TRUE", "FALSE", "IMPORTS", "STYLES", "TEMPLATE", "EXPORT", "CLASS", 
			"THIS", "ANY", "RETURN", "BREAK", "IF", "ELSE", "FOR", "WHILE", "LET", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "COLON", 
			"COMMA", "SEMI", "DOT", "HASH", "DQUOTE", "SQUOTE", "BACKTICK", "EQUALS", 
			"INCREMENT", "ARROW", "QUESTION", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"LT", "GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", "NOT", "STRING_LITERAL", 
			"BACKTICK_LITERAL", "NUMBER", "IDENTIFIER", "WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ComponentDefinitionContext> componentDefinition() {
			return getRuleContexts(ComponentDefinitionContext.class);
		}
		public ComponentDefinitionContext componentDefinition(int i) {
			return getRuleContext(ComponentDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(110);
				importStatement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				componentDefinition();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMPONENT );
			setState(121);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends ImportStatementContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportItemsContext importItems() {
			return getRuleContext(ImportItemsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public ModulePathContext modulePath() {
			return getRuleContext(ModulePathContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportStmtContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			_localctx = new ImportStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IMPORT);
			setState(124);
			importItems();
			setState(125);
			match(FROM);
			setState(126);
			modulePath();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(127);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemsContext extends ParserRuleContext {
		public ImportItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItems; }
	 
		public ImportItemsContext() { }
		public void copyFrom(ImportItemsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemListContext extends ImportItemsContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportItemListContext(ImportItemsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemsContext importItems() throws RecognitionException {
		ImportItemsContext _localctx = new ImportItemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importItems);
		int _la;
		try {
			_localctx = new ImportItemListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LBRACE);
			setState(131);
			importItem();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				importItem();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
	 
		public ImportItemContext() { }
		public void copyFrom(ImportItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ImportItemContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ImportNameContext(ImportItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importItem);
		try {
			_localctx = new ImportNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModulePathContext extends ParserRuleContext {
		public ModulePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulePath; }
	 
		public ModulePathContext() { }
		public void copyFrom(ModulePathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulePathStringContext extends ModulePathContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public ModulePathStringContext(ModulePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModulePathString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModulePathString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModulePathString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModulePathContext modulePath() throws RecognitionException {
		ModulePathContext _localctx = new ModulePathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modulePath);
		try {
			_localctx = new ModulePathStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ParserRuleContext {
		public ComponentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDefinition; }
	 
		public ComponentDefinitionContext() { }
		public void copyFrom(ComponentDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefContext extends ComponentDefinitionContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ComponentDefContext(ComponentDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefinitionContext componentDefinition() throws RecognitionException {
		ComponentDefinitionContext _localctx = new ComponentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDefinition);
		try {
			_localctx = new ComponentDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(COMPONENT);
			setState(146);
			match(LPAREN);
			setState(147);
			componentConfig();
			setState(148);
			match(RPAREN);
			setState(149);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigContext extends ParserRuleContext {
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
	 
		public ComponentConfigContext() { }
		public void copyFrom(ComponentConfigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigObjContext extends ComponentConfigContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentConfigObjContext(ComponentConfigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentConfigObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentConfigObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentConfigObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentConfig);
		int _la;
		try {
			_localctx = new ComponentConfigObjContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LBRACE);
			setState(152);
			componentProperty();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				componentProperty();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
	 
		public ComponentPropertyContext() { }
		public void copyFrom(ComponentPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropContext extends ComponentPropertyContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public SelectorPropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropContext extends ComponentPropertyContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StylesPropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropContext extends ComponentPropertyContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StandalonePropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropContext extends ComponentPropertyContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ImportsPropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropContext extends ComponentPropertyContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BACKTICK_LITERAL() { return getToken(AngularParser.BACKTICK_LITERAL, 0); }
		public TemplatePropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentProperty);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(SELECTOR);
				setState(163);
				match(COLON);
				setState(164);
				match(STRING_LITERAL);
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(STANDALONE);
				setState(166);
				match(COLON);
				setState(167);
				booleanLiteral();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsPropContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(IMPORTS);
				setState(169);
				match(COLON);
				setState(170);
				arrayLiteral();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(TEMPLATE);
				setState(172);
				match(COLON);
				setState(173);
				match(BACKTICK_LITERAL);
				}
				break;
			case STYLES:
				_localctx = new StylesPropContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(STYLES);
				setState(175);
				match(COLON);
				setState(176);
				arrayLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExprContext extends ArrayLiteralContext {
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayLiteralExprContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayLiteral);
		int _la;
		try {
			_localctx = new ArrayLiteralExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LBRACKET);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 396316767216992256L) != 0)) {
				{
				setState(180);
				arrayItem();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(181);
					match(COMMA);
					setState(182);
					arrayItem();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(190);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayItemContext extends ParserRuleContext {
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
	 
		public ArrayItemContext() { }
		public void copyFrom(ArrayItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateItemContext extends ArrayItemContext {
		public TerminalNode BACKTICK_LITERAL() { return getToken(AngularParser.BACKTICK_LITERAL, 0); }
		public TemplateItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringItemContext extends ArrayItemContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public StringItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectItemContext extends ArrayItemContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierItemContext extends ArrayItemContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayItem);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK_LITERAL:
				_localctx = new TemplateItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(BACKTICK_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				_localctx = new ObjectItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ClassDeclContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(198);
				match(EXPORT);
				}
			}

			setState(201);
			match(CLASS);
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(LBRACE);
			setState(204);
			classBody();
			setState(205);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyMembersContext extends ClassBodyContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyMembersContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodyMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodyMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodyMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyMembersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(207);
				classMember();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodMemberContext extends ClassMemberContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodMember(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldMemberContext extends ClassMemberContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FieldMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFieldMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFieldMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFieldMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classMember);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FieldMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				fieldDeclaration();
				}
				break;
			case 2:
				_localctx = new MethodMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclContext extends FieldDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public FieldDeclContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldDeclaration);
		int _la;
		try {
			_localctx = new FieldDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IDENTIFIER);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(218);
				match(COLON);
				setState(219);
				typeAnnotation();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(222);
				match(EQUALS);
				setState(223);
				expression();
				}
			}

			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(226);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclContext extends MethodDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENTIFIER);
			setState(230);
			match(LPAREN);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(231);
				parameterList();
				}
			}

			setState(234);
			match(RPAREN);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(235);
				match(COLON);
				setState(236);
				typeAnnotation();
				}
			}

			setState(239);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParameterListContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParamListContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameterList);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			parameter();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				parameter();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParameterContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter);
		try {
			_localctx = new ParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(250);
			match(COLON);
			setState(251);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	 
		public TypeAnnotationContext() { }
		public void copyFrom(TypeAnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotatedContext extends TypeAnnotationContext {
		public TypePrimaryContext typePrimary() {
			return getRuleContext(TypePrimaryContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public TypeAnnotatedContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAnnotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAnnotated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAnnotated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeAnnotation);
		int _la;
		try {
			_localctx = new TypeAnnotatedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			typePrimary();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(254);
				match(LBRACKET);
				setState(255);
				match(RBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypePrimaryContext extends ParserRuleContext {
		public TypePrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePrimary; }
	 
		public TypePrimaryContext() { }
		public void copyFrom(TypePrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentContext extends TypePrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TypeIdentContext(TypePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnyContext extends TypePrimaryContext {
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TypeAnyContext(TypePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAny(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjTypeContext extends TypePrimaryContext {
		public InlineObjectTypeContext inlineObjectType() {
			return getRuleContext(InlineObjectTypeContext.class,0);
		}
		public InlineObjTypeContext(TypePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineObjType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineObjType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePrimaryContext typePrimary() throws RecognitionException {
		TypePrimaryContext _localctx = new TypePrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typePrimary);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TypeIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case ANY:
				_localctx = new TypeAnyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(ANY);
				}
				break;
			case LBRACE:
				_localctx = new InlineObjTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				inlineObjectType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjectTypeContext extends ParserRuleContext {
		public InlineObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineObjectType; }
	 
		public InlineObjectTypeContext() { }
		public void copyFrom(InlineObjectTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjContext extends InlineObjectTypeContext {
		public ObjectTypeMemberContext objectTypeMember;
		public List<ObjectTypeMemberContext> members = new ArrayList<ObjectTypeMemberContext>();
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ObjectTypeMemberContext> objectTypeMember() {
			return getRuleContexts(ObjectTypeMemberContext.class);
		}
		public ObjectTypeMemberContext objectTypeMember(int i) {
			return getRuleContext(ObjectTypeMemberContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public InlineObjContext(InlineObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineObjectTypeContext inlineObjectType() throws RecognitionException {
		InlineObjectTypeContext _localctx = new InlineObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inlineObjectType);
		int _la;
		try {
			int _alt;
			_localctx = new InlineObjContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LBRACE);
			setState(264);
			((InlineObjContext)_localctx).objectTypeMember = objectTypeMember();
			((InlineObjContext)_localctx).members.add(((InlineObjContext)_localctx).objectTypeMember);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(SEMI);
					setState(266);
					((InlineObjContext)_localctx).objectTypeMember = objectTypeMember();
					((InlineObjContext)_localctx).members.add(((InlineObjContext)_localctx).objectTypeMember);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(272);
				match(SEMI);
				}
			}

			setState(275);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeMemberContext extends ParserRuleContext {
		public ObjectTypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeMember; }
	 
		public ObjectTypeMemberContext() { }
		public void copyFrom(ObjectTypeMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeMemberRuleContext extends ObjectTypeMemberContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ObjectTypeMemberRuleContext(ObjectTypeMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectTypeMemberRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectTypeMemberRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectTypeMemberRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeMemberContext objectTypeMember() throws RecognitionException {
		ObjectTypeMemberContext _localctx = new ObjectTypeMemberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objectTypeMember);
		try {
			_localctx = new ObjectTypeMemberRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(IDENTIFIER);
			setState(278);
			match(COLON);
			setState(279);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			_localctx = new CodeBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LBRACE);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558450754171912584L) != 0)) {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public EmptyStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStmtContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VarDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				expressionStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				ifStatement();
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				forStatement();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				whileStatement();
				}
				break;
			case 7:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				breakStatement();
				}
				break;
			case 8:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				block();
				}
				break;
			case 9:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends VariableDeclarationContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LET);
			setState(302);
			match(IDENTIFIER);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(303);
				match(COLON);
				setState(304);
				typeAnnotation();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(307);
				match(EQUALS);
				setState(308);
				expression();
				}
			}

			setState(311);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends ExpressionStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExprStatementContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionStatement);
		try {
			_localctx = new ExprStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expression();
			setState(314);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementExprContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementExprContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnStatementExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(RETURN);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558450752016630152L) != 0)) {
				{
				setState(317);
				expression();
				}
			}

			setState(320);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStmtContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfElseStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		try {
			_localctx = new IfElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(IF);
			setState(323);
			match(LPAREN);
			setState(324);
			expression();
			setState(325);
			match(RPAREN);
			setState(326);
			statement();
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(327);
				match(ELSE);
				setState(328);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FOR);
			setState(332);
			match(LPAREN);
			setState(333);
			forInit();
			setState(334);
			match(SEMI);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558450752016630152L) != 0)) {
				{
				setState(335);
				expression();
				}
			}

			setState(338);
			match(SEMI);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558450752016630152L) != 0)) {
				{
				setState(339);
				expression();
				}
			}

			setState(342);
			match(RPAREN);
			setState(343);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(BREAK);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(346);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	 
		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVarInitContext extends ForInitContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ForVarInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForVarInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyForInitContext extends ForInitContext {
		public EmptyForInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEmptyForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEmptyForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEmptyForInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForExprInitContext extends ForInitContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExprInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForExprInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForExprInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForExprInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forInit);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new ForVarInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				variableDeclaration();
				}
				break;
			case NEW:
			case TRUE:
			case FALSE:
			case THIS:
			case LBRACE:
			case LBRACKET:
			case LPAREN:
			case MINUS:
			case NOT:
			case STRING_LITERAL:
			case BACKTICK_LITERAL:
			case NUMBER:
			case IDENTIFIER:
				_localctx = new ForExprInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				expression();
				}
				break;
			case SEMI:
				_localctx = new EmptyForInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileStatement);
		try {
			_localctx = new WhileLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(WHILE);
			setState(355);
			match(LPAREN);
			setState(356);
			expression();
			setState(357);
			match(RPAREN);
			setState(358);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssignmentContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExprAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExprAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExprAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExprAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			_localctx = new ExprAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignExprContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignmentExpression);
		try {
			_localctx = new AssignExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			conditionalExpression();
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(363);
				match(EQUALS);
				setState(364);
				assignmentExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public CondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalExpression);
		try {
			_localctx = new CondExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			logicalOrExpression();
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(368);
				match(QUESTION);
				setState(369);
				expression();
				setState(370);
				match(COLON);
				setState(371);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExprContext extends LogicalOrExpressionContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AngularParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AngularParser.OR, i);
		}
		public LogicalOrExprContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logicalOrExpression);
		try {
			int _alt;
			_localctx = new LogicalOrExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			logicalAndExpression();
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(376);
					match(OR);
					setState(377);
					logicalAndExpression();
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExprContext extends LogicalAndExpressionContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AngularParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AngularParser.AND, i);
		}
		public LogicalAndExprContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logicalAndExpression);
		try {
			int _alt;
			_localctx = new LogicalAndExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			equalityExpression();
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(AND);
					setState(385);
					equalityExpression();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends EqualityExpressionContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(AngularParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(AngularParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(AngularParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(AngularParser.NEQ, i);
		}
		public EqualityExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			_localctx = new EqualityExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			relationalExpression();
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NEQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(393);
					relationalExpression();
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends RelationalExpressionContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(AngularParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AngularParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(AngularParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(AngularParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(AngularParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AngularParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(AngularParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(AngularParser.GE, i);
		}
		public RelationalExprContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			_localctx = new RelationalExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			additiveExpression();
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(401);
					additiveExpression();
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends AdditiveExpressionContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public AddExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			_localctx = new AddExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			multiplicativeExpression();
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(409);
					multiplicativeExpression();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultExprContext extends MultiplicativeExpressionContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(AngularParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(AngularParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(AngularParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AngularParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(AngularParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(AngularParser.MOD, i);
		}
		public MultExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			_localctx = new MultExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			unaryExpression();
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(417);
					unaryExpression();
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(AngularParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public UnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unaryExpression);
		int _la;
		try {
			_localctx = new UnaryExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NOT) {
				{
				setState(423);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(426);
			postfixExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixPartContext> postfixPart() {
			return getRuleContexts(PostfixPartContext.class);
		}
		public PostfixPartContext postfixPart(int i) {
			return getRuleContext(PostfixPartContext.class,i);
		}
		public PostfixExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_postfixExpression);
		try {
			int _alt;
			_localctx = new PostfixExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			primaryExpression();
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					postfixPart();
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixPartContext extends ParserRuleContext {
		public PostfixPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixPart; }
	 
		public PostfixPartContext() { }
		public void copyFrom(PostfixPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostFixIncrContext extends PostfixPartContext {
		public PostfixIncrementContext postfixIncrement() {
			return getRuleContext(PostfixIncrementContext.class,0);
		}
		public PostFixIncrContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostFixIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostFixIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostFixIncr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccContext extends PostfixPartContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropertyAccContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAcc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends PostfixPartContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixPartContext postfixPart() throws RecognitionException {
		PostfixPartContext _localctx = new PostfixPartContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_postfixPart);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				functionCall();
				}
				break;
			case DOT:
				_localctx = new PropertyAccContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				propertyAccess();
				}
				break;
			case INCREMENT:
				_localctx = new PostFixIncrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				postfixIncrement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctCallContext extends FunctionCallContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FunctCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(LPAREN);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558450752016630152L) != 0)) {
				{
				setState(441);
				expression();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(442);
					match(COMMA);
					setState(443);
					expression();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(451);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ParserRuleContext {
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
	 
		public PropertyAccessContext() { }
		public void copyFrom(PropertyAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessingContext extends PropertyAccessContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public PropertyAccessingContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccessing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccessing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_propertyAccess);
		try {
			_localctx = new PropertyAccessingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(DOT);
			setState(454);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixIncrementContext extends ParserRuleContext {
		public PostfixIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixIncrement; }
	 
		public PostfixIncrementContext() { }
		public void copyFrom(PostfixIncrementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixIncContext extends PostfixIncrementContext {
		public TerminalNode INCREMENT() { return getToken(AngularParser.INCREMENT, 0); }
		public PostfixIncContext(PostfixIncrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostfixInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostfixInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostfixInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixIncrementContext postfixIncrement() throws RecognitionException {
		PostfixIncrementContext _localctx = new PostfixIncrementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_postfixIncrement);
		try {
			_localctx = new PostfixIncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends PrimaryExpressionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public GroupedExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGroupedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGroupedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGroupedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExprContext extends PrimaryExpressionContext {
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public NewExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends PrimaryExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ThisExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends PrimaryExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends PrimaryExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFuncExprContext extends PrimaryExpressionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFuncExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primaryExpression);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				literal();
				}
				break;
			case 2:
				_localctx = new ThisExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(THIS);
				}
				break;
			case 3:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new GroupedExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				match(LPAREN);
				setState(462);
				expression();
				setState(463);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new NewExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				newExpression();
				}
				break;
			case 6:
				_localctx = new ArrowFuncExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(466);
				arrowFunction();
				}
				break;
			case 7:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(467);
				objectLiteral();
				}
				break;
			case 8:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(468);
				arrayLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ParserRuleContext {
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
	 
		public NewExpressionContext() { }
		public void copyFrom(NewExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewCallExprContext extends NewExpressionContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NewCallExprContext(NewExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_newExpression);
		int _la;
		try {
			_localctx = new NewCallExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(NEW);
			setState(472);
			qualifiedName();
			setState(473);
			match(LPAREN);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558450752016630152L) != 0)) {
				{
				setState(474);
				expression();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(475);
					match(COMMA);
					setState(476);
					expression();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(484);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
	 
		public ArrowFunctionContext() { }
		public void copyFrom(ArrowFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionExprContext extends ArrowFunctionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowParamsContext arrowParams() {
			return getRuleContext(ArrowParamsContext.class,0);
		}
		public ArrowFunctionExprContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrowFunction);
		int _la;
		try {
			_localctx = new ArrowFunctionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LPAREN);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(487);
				arrowParams();
				}
			}

			setState(490);
			match(RPAREN);
			setState(491);
			match(ARROW);
			setState(492);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParamsContext extends ParserRuleContext {
		public ArrowParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParams; }
	 
		public ArrowParamsContext() { }
		public void copyFrom(ArrowParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParamsListContext extends ArrowParamsContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrowParamsListContext(ArrowParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowParamsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowParamsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowParamsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowParamsContext arrowParams() throws RecognitionException {
		ArrowParamsContext _localctx = new ArrowParamsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrowParams);
		int _la;
		try {
			_localctx = new ArrowParamsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(IDENTIFIER);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				match(IDENTIFIER);
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	 
		public ObjectLiteralContext() { }
		public void copyFrom(ObjectLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjLiteralContext extends ObjectLiteralContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjLiteralContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_objectLiteral);
		int _la;
		try {
			_localctx = new ObjLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(LBRACE);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(503);
				keyValue();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(504);
					match(COMMA);
					setState(505);
					keyValue();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(513);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyValueContext extends ParserRuleContext {
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
	 
		public KeyValueContext() { }
		public void copyFrom(KeyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePairContext extends KeyValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyValuePairContext(KeyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_keyValue);
		try {
			_localctx = new KeyValuePairContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(IDENTIFIER);
			setState(516);
			match(COLON);
			setState(517);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContext extends LiteralContext {
		public TerminalNode BACKTICK_LITERAL() { return getToken(AngularParser.BACKTICK_LITERAL, 0); }
		public TemplateLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralContext extends LiteralContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends LiteralContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumberLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(STRING_LITERAL);
				}
				break;
			case BACKTICK_LITERAL:
				_localctx = new TemplateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(BACKTICK_LITERAL);
				}
				break;
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(NUMBER);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends BooleanLiteralContext {
		public TerminalNode FALSE() { return getToken(AngularParser.FALSE, 0); }
		public FalseLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends BooleanLiteralContext {
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TrueLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_booleanLiteral);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	 
		public QualifiedNameContext() { }
		public void copyFrom(QualifiedNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameExprContext extends QualifiedNameContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public QualifiedNameExprContext(QualifiedNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterQualifiedNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitQualifiedNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitQualifiedNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedName);
		int _la;
		try {
			_localctx = new QualifiedNameExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(IDENTIFIER);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(530);
				match(DOT);
				setState(531);
				match(IDENTIFIER);
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u021a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0005\u0000p\b\u0000\n\u0000\f\u0000s\t\u0000\u0001\u0000\u0004"+
		"\u0000v\b\u0000\u000b\u0000\f\u0000w\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0081\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0087\b\u0002"+
		"\n\u0002\f\u0002\u008a\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u009c\b\u0006\n\u0006\f\u0006\u009f\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b2\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b8\b\b\n\b\f\b\u00bb\t\b\u0003"+
		"\b\u00bd\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c5"+
		"\b\t\u0001\n\u0003\n\u00c8\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0005\u000b\u00d1\b\u000b\n\u000b\f\u000b\u00d4\t"+
		"\u000b\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00dd\b\r\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001\r\u0003\r\u00e4\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e9\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ee\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f5\b\u000f\n"+
		"\u000f\f\u000f\u00f8\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0101\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0106\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010c\b\u0013\n\u0013\f\u0013"+
		"\u010f\t\u0013\u0001\u0013\u0003\u0013\u0112\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u011c\b\u0015\n\u0015\f\u0015\u011f\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u012c\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0132\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0136\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u013f\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u014a\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0151\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0155\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u015c"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0161\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u016e\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0176\b!\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u017b\b\"\n\"\f\"\u017e\t\"\u0001#\u0001#\u0001#\u0005#\u0183"+
		"\b#\n#\f#\u0186\t#\u0001$\u0001$\u0001$\u0005$\u018b\b$\n$\f$\u018e\t"+
		"$\u0001%\u0001%\u0001%\u0005%\u0193\b%\n%\f%\u0196\t%\u0001&\u0001&\u0001"+
		"&\u0005&\u019b\b&\n&\f&\u019e\t&\u0001\'\u0001\'\u0001\'\u0005\'\u01a3"+
		"\b\'\n\'\f\'\u01a6\t\'\u0001(\u0003(\u01a9\b(\u0001(\u0001(\u0001)\u0001"+
		")\u0005)\u01af\b)\n)\f)\u01b2\t)\u0001*\u0001*\u0001*\u0003*\u01b7\b*"+
		"\u0001+\u0001+\u0001+\u0001+\u0005+\u01bd\b+\n+\f+\u01c0\t+\u0003+\u01c2"+
		"\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01d6"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u01de\b/\n/\f/\u01e1"+
		"\t/\u0003/\u01e3\b/\u0001/\u0001/\u00010\u00010\u00030\u01e9\b0\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00051\u01f2\b1\n1\f1\u01f5"+
		"\t1\u00012\u00012\u00012\u00012\u00052\u01fb\b2\n2\f2\u01fe\t2\u00032"+
		"\u0200\b2\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00034\u020c\b4\u00015\u00015\u00035\u0210\b5\u00016\u00016\u0001"+
		"6\u00056\u0215\b6\n6\f6\u0218\t6\u00016\u0000\u00007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\u0005\u0001\u000023\u0001"+
		"\u0000.1\u0001\u0000)*\u0001\u0000+-\u0002\u0000**66\u0230\u0000q\u0001"+
		"\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004\u0082\u0001\u0000"+
		"\u0000\u0000\u0006\u008d\u0001\u0000\u0000\u0000\b\u008f\u0001\u0000\u0000"+
		"\u0000\n\u0091\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000"+
		"\u000e\u00b1\u0001\u0000\u0000\u0000\u0010\u00b3\u0001\u0000\u0000\u0000"+
		"\u0012\u00c4\u0001\u0000\u0000\u0000\u0014\u00c7\u0001\u0000\u0000\u0000"+
		"\u0016\u00d2\u0001\u0000\u0000\u0000\u0018\u00d7\u0001\u0000\u0000\u0000"+
		"\u001a\u00d9\u0001\u0000\u0000\u0000\u001c\u00e5\u0001\u0000\u0000\u0000"+
		"\u001e\u00f1\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000\""+
		"\u00fd\u0001\u0000\u0000\u0000$\u0105\u0001\u0000\u0000\u0000&\u0107\u0001"+
		"\u0000\u0000\u0000(\u0115\u0001\u0000\u0000\u0000*\u0119\u0001\u0000\u0000"+
		"\u0000,\u012b\u0001\u0000\u0000\u0000.\u012d\u0001\u0000\u0000\u00000"+
		"\u0139\u0001\u0000\u0000\u00002\u013c\u0001\u0000\u0000\u00004\u0142\u0001"+
		"\u0000\u0000\u00006\u014b\u0001\u0000\u0000\u00008\u0159\u0001\u0000\u0000"+
		"\u0000:\u0160\u0001\u0000\u0000\u0000<\u0162\u0001\u0000\u0000\u0000>"+
		"\u0168\u0001\u0000\u0000\u0000@\u016a\u0001\u0000\u0000\u0000B\u016f\u0001"+
		"\u0000\u0000\u0000D\u0177\u0001\u0000\u0000\u0000F\u017f\u0001\u0000\u0000"+
		"\u0000H\u0187\u0001\u0000\u0000\u0000J\u018f\u0001\u0000\u0000\u0000L"+
		"\u0197\u0001\u0000\u0000\u0000N\u019f\u0001\u0000\u0000\u0000P\u01a8\u0001"+
		"\u0000\u0000\u0000R\u01ac\u0001\u0000\u0000\u0000T\u01b6\u0001\u0000\u0000"+
		"\u0000V\u01b8\u0001\u0000\u0000\u0000X\u01c5\u0001\u0000\u0000\u0000Z"+
		"\u01c8\u0001\u0000\u0000\u0000\\\u01d5\u0001\u0000\u0000\u0000^\u01d7"+
		"\u0001\u0000\u0000\u0000`\u01e6\u0001\u0000\u0000\u0000b\u01ee\u0001\u0000"+
		"\u0000\u0000d\u01f6\u0001\u0000\u0000\u0000f\u0203\u0001\u0000\u0000\u0000"+
		"h\u020b\u0001\u0000\u0000\u0000j\u020f\u0001\u0000\u0000\u0000l\u0211"+
		"\u0001\u0000\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0003"+
		"\n\u0005\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0005\u0000\u0000\u0001z\u0001\u0001\u0000\u0000\u0000{|\u0005\u0001"+
		"\u0000\u0000|}\u0003\u0004\u0002\u0000}~\u0005\u0002\u0000\u0000~\u0080"+
		"\u0003\b\u0004\u0000\u007f\u0081\u0005\u001f\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0003\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u0017\u0000\u0000\u0083\u0088\u0003"+
		"\u0006\u0003\u0000\u0084\u0085\u0005\u001e\u0000\u0000\u0085\u0087\u0003"+
		"\u0006\u0003\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u0018\u0000\u0000\u008c\u0005\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005:\u0000\u0000\u008e\u0007\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u00057\u0000\u0000\u0090\t\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0005\u001b\u0000"+
		"\u0000\u0093\u0094\u0003\f\u0006\u0000\u0094\u0095\u0005\u001c\u0000\u0000"+
		"\u0095\u0096\u0003\u0014\n\u0000\u0096\u000b\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0017\u0000\u0000\u0098\u009d\u0003\u000e\u0007\u0000\u0099"+
		"\u009a\u0005\u001e\u0000\u0000\u009a\u009c\u0003\u000e\u0007\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0018\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0005\u0000\u0000\u00a3\u00a4\u0005\u001d\u0000\u0000\u00a4\u00b2"+
		"\u00057\u0000\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6\u00a7\u0005"+
		"\u001d\u0000\u0000\u00a7\u00b2\u0003j5\u0000\u00a8\u00a9\u0005\t\u0000"+
		"\u0000\u00a9\u00aa\u0005\u001d\u0000\u0000\u00aa\u00b2\u0003\u0010\b\u0000"+
		"\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac\u00ad\u0005\u001d\u0000\u0000"+
		"\u00ad\u00b2\u00058\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af"+
		"\u00b0\u0005\u001d\u0000\u0000\u00b0\u00b2\u0003\u0010\b\u0000\u00b1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b2\u000f\u0001\u0000\u0000\u0000\u00b3\u00bc"+
		"\u0005\u0019\u0000\u0000\u00b4\u00b9\u0003\u0012\t\u0000\u00b5\u00b6\u0005"+
		"\u001e\u0000\u0000\u00b6\u00b8\u0003\u0012\t\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\u001a\u0000\u0000\u00bf\u0011\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c5\u00058\u0000\u0000\u00c1\u00c5\u00057\u0000\u0000"+
		"\u00c2\u00c5\u0005:\u0000\u0000\u00c3\u00c5\u0003d2\u0000\u00c4\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u0013"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005\f\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca\u00cb\u0005:"+
		"\u0000\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc\u00cd\u0003\u0016"+
		"\u000b\u0000\u00cd\u00ce\u0005\u0018\u0000\u0000\u00ce\u0015\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d1\u0003\u0018\f\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u0017\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0003\u001a\r\u0000"+
		"\u00d6\u00d8\u0003\u001c\u000e\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u0019\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dc\u0005:\u0000\u0000\u00da\u00db\u0005\u001d\u0000\u0000\u00db"+
		"\u00dd\u0003\"\u0011\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005%\u0000\u0000\u00df\u00e1\u0003>\u001f\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0005\u001f\u0000\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u001b\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005:\u0000\u0000\u00e6\u00e8\u0005\u001b\u0000"+
		"\u0000\u00e7\u00e9\u0003\u001e\u000f\u0000\u00e8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0005\u001c\u0000\u0000\u00eb\u00ec\u0005\u001d\u0000"+
		"\u0000\u00ec\u00ee\u0003\"\u0011\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0003*\u0015\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f6\u0003 \u0010\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f5"+
		"\u0003 \u0010\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u001f\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005:\u0000\u0000\u00fa\u00fb\u0005\u001d"+
		"\u0000\u0000\u00fb\u00fc\u0003\"\u0011\u0000\u00fc!\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0003$\u0012\u0000\u00fe\u00ff\u0005\u0019\u0000\u0000"+
		"\u00ff\u0101\u0005\u001a\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101#\u0001\u0000\u0000\u0000\u0102"+
		"\u0106\u0005:\u0000\u0000\u0103\u0106\u0005\u000f\u0000\u0000\u0104\u0106"+
		"\u0003&\u0013\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106%\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\u0017\u0000\u0000\u0108\u010d\u0003(\u0014"+
		"\u0000\u0109\u010a\u0005\u001f\u0000\u0000\u010a\u010c\u0003(\u0014\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0112\u0005\u001f\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\u0018\u0000\u0000\u0114\'\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005:\u0000\u0000\u0116\u0117\u0005\u001d\u0000\u0000\u0117\u0118"+
		"\u0003\"\u0011\u0000\u0118)\u0001\u0000\u0000\u0000\u0119\u011d\u0005"+
		"\u0017\u0000\u0000\u011a\u011c\u0003,\u0016\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0018"+
		"\u0000\u0000\u0121+\u0001\u0000\u0000\u0000\u0122\u012c\u0003.\u0017\u0000"+
		"\u0123\u012c\u00030\u0018\u0000\u0124\u012c\u00032\u0019\u0000\u0125\u012c"+
		"\u00034\u001a\u0000\u0126\u012c\u00036\u001b\u0000\u0127\u012c\u0003<"+
		"\u001e\u0000\u0128\u012c\u00038\u001c\u0000\u0129\u012c\u0003*\u0015\u0000"+
		"\u012a\u012c\u0005\u001f\u0000\u0000\u012b\u0122\u0001\u0000\u0000\u0000"+
		"\u012b\u0123\u0001\u0000\u0000\u0000\u012b\u0124\u0001\u0000\u0000\u0000"+
		"\u012b\u0125\u0001\u0000\u0000\u0000\u012b\u0126\u0001\u0000\u0000\u0000"+
		"\u012b\u0127\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000"+
		"\u012c-\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0016\u0000\u0000\u012e"+
		"\u0131\u0005:\u0000\u0000\u012f\u0130\u0005\u001d\u0000\u0000\u0130\u0132"+
		"\u0003\"\u0011\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"%\u0000\u0000\u0134\u0136\u0003>\u001f\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005\u001f\u0000\u0000\u0138/\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0003>\u001f\u0000\u013a\u013b\u0005\u001f\u0000\u0000\u013b"+
		"1\u0001\u0000\u0000\u0000\u013c\u013e\u0005\u0010\u0000\u0000\u013d\u013f"+
		"\u0003>\u001f\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		"\u001f\u0000\u0000\u01413\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0012"+
		"\u0000\u0000\u0143\u0144\u0005\u001b\u0000\u0000\u0144\u0145\u0003>\u001f"+
		"\u0000\u0145\u0146\u0005\u001c\u0000\u0000\u0146\u0149\u0003,\u0016\u0000"+
		"\u0147\u0148\u0005\u0013\u0000\u0000\u0148\u014a\u0003,\u0016\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"5\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0014\u0000\u0000\u014c\u014d"+
		"\u0005\u001b\u0000\u0000\u014d\u014e\u0003:\u001d\u0000\u014e\u0150\u0005"+
		"\u001f\u0000\u0000\u014f\u0151\u0003>\u001f\u0000\u0150\u014f\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0154\u0005\u001f\u0000\u0000\u0153\u0155\u0003>\u001f"+
		"\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u001c\u0000"+
		"\u0000\u0157\u0158\u0003,\u0016\u0000\u01587\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u0005\u0011\u0000\u0000\u015a\u015c\u0005\u001f\u0000\u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"9\u0001\u0000\u0000\u0000\u015d\u0161\u0003.\u0017\u0000\u015e\u0161\u0003"+
		">\u001f\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161;\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0015\u0000"+
		"\u0000\u0163\u0164\u0005\u001b\u0000\u0000\u0164\u0165\u0003>\u001f\u0000"+
		"\u0165\u0166\u0005\u001c\u0000\u0000\u0166\u0167\u0003,\u0016\u0000\u0167"+
		"=\u0001\u0000\u0000\u0000\u0168\u0169\u0003@ \u0000\u0169?\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0003B!\u0000\u016b\u016c\u0005%\u0000\u0000"+
		"\u016c\u016e\u0003@ \u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016eA\u0001\u0000\u0000\u0000\u016f\u0175\u0003"+
		"D\"\u0000\u0170\u0171\u0005(\u0000\u0000\u0171\u0172\u0003>\u001f\u0000"+
		"\u0172\u0173\u0005\u001d\u0000\u0000\u0173\u0174\u0003>\u001f\u0000\u0174"+
		"\u0176\u0001\u0000\u0000\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176C\u0001\u0000\u0000\u0000\u0177\u017c"+
		"\u0003F#\u0000\u0178\u0179\u00055\u0000\u0000\u0179\u017b\u0003F#\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017dE\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f"+
		"\u0184\u0003H$\u0000\u0180\u0181\u00054\u0000\u0000\u0181\u0183\u0003"+
		"H$\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185G\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0187\u018c\u0003J%\u0000\u0188\u0189\u0007\u0000\u0000\u0000\u0189\u018b"+
		"\u0003J%\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000"+
		"\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018dI\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u0194\u0003L&\u0000\u0190\u0191\u0007\u0001\u0000\u0000\u0191"+
		"\u0193\u0003L&\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0196\u0001"+
		"\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195K\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0197\u019c\u0003N\'\u0000\u0198\u0199\u0007\u0002\u0000"+
		"\u0000\u0199\u019b\u0003N\'\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019dM\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a4\u0003P(\u0000\u01a0\u01a1\u0007"+
		"\u0003\u0000\u0000\u01a1\u01a3\u0003P(\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5O\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9\u0007\u0004\u0000\u0000"+
		"\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0003R)\u0000\u01abQ"+
		"\u0001\u0000\u0000\u0000\u01ac\u01b0\u0003\\.\u0000\u01ad\u01af\u0003"+
		"T*\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1S\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b7\u0003V+\u0000\u01b4\u01b7\u0003X,\u0000\u01b5\u01b7\u0003"+
		"Z-\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7U\u0001\u0000\u0000\u0000"+
		"\u01b8\u01c1\u0005\u001b\u0000\u0000\u01b9\u01be\u0003>\u001f\u0000\u01ba"+
		"\u01bb\u0005\u001e\u0000\u0000\u01bb\u01bd\u0003>\u001f\u0000\u01bc\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01b9"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u001c\u0000\u0000\u01c4W\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005 \u0000\u0000\u01c6\u01c7\u0005:\u0000"+
		"\u0000\u01c7Y\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005&\u0000\u0000\u01c9"+
		"[\u0001\u0000\u0000\u0000\u01ca\u01d6\u0003h4\u0000\u01cb\u01d6\u0005"+
		"\u000e\u0000\u0000\u01cc\u01d6\u0005:\u0000\u0000\u01cd\u01ce\u0005\u001b"+
		"\u0000\u0000\u01ce\u01cf\u0003>\u001f\u0000\u01cf\u01d0\u0005\u001c\u0000"+
		"\u0000\u01d0\u01d6\u0001\u0000\u0000\u0000\u01d1\u01d6\u0003^/\u0000\u01d2"+
		"\u01d6\u0003`0\u0000\u01d3\u01d6\u0003d2\u0000\u01d4\u01d6\u0003\u0010"+
		"\b\u0000\u01d5\u01ca\u0001\u0000\u0000\u0000\u01d5\u01cb\u0001\u0000\u0000"+
		"\u0000\u01d5\u01cc\u0001\u0000\u0000\u0000\u01d5\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d6]\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u0003\u0000\u0000"+
		"\u01d8\u01d9\u0003l6\u0000\u01d9\u01e2\u0005\u001b\u0000\u0000\u01da\u01df"+
		"\u0003>\u001f\u0000\u01db\u01dc\u0005\u001e\u0000\u0000\u01dc\u01de\u0003"+
		">\u001f\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e2\u01da\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u001c"+
		"\u0000\u0000\u01e5_\u0001\u0000\u0000\u0000\u01e6\u01e8\u0005\u001b\u0000"+
		"\u0000\u01e7\u01e9\u0003b1\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0005\u001c\u0000\u0000\u01eb\u01ec\u0005\'\u0000\u0000\u01ec\u01ed"+
		"\u0003>\u001f\u0000\u01eda\u0001\u0000\u0000\u0000\u01ee\u01f3\u0005:"+
		"\u0000\u0000\u01ef\u01f0\u0005\u001e\u0000\u0000\u01f0\u01f2\u0005:\u0000"+
		"\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f4c\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f6\u01ff\u0005\u0017\u0000\u0000\u01f7\u01fc\u0003f3\u0000\u01f8\u01f9"+
		"\u0005\u001e\u0000\u0000\u01f9\u01fb\u0003f3\u0000\u01fa\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u01f7\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0005\u0018\u0000\u0000\u0202e\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0005:\u0000\u0000\u0204\u0205\u0005\u001d\u0000\u0000"+
		"\u0205\u0206\u0003>\u001f\u0000\u0206g\u0001\u0000\u0000\u0000\u0207\u020c"+
		"\u00057\u0000\u0000\u0208\u020c\u00058\u0000\u0000\u0209\u020c\u00059"+
		"\u0000\u0000\u020a\u020c\u0003j5\u0000\u020b\u0207\u0001\u0000\u0000\u0000"+
		"\u020b\u0208\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000"+
		"\u020b\u020a\u0001\u0000\u0000\u0000\u020ci\u0001\u0000\u0000\u0000\u020d"+
		"\u0210\u0005\u0007\u0000\u0000\u020e\u0210\u0005\b\u0000\u0000\u020f\u020d"+
		"\u0001\u0000\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210k\u0001"+
		"\u0000\u0000\u0000\u0211\u0216\u0005:\u0000\u0000\u0212\u0213\u0005 \u0000"+
		"\u0000\u0213\u0215\u0005:\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000"+
		"\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217m\u0001\u0000\u0000\u0000\u0218"+
		"\u0216\u0001\u0000\u0000\u00007qw\u0080\u0088\u009d\u00b1\u00b9\u00bc"+
		"\u00c4\u00c7\u00d2\u00d7\u00dc\u00e0\u00e3\u00e8\u00ed\u00f6\u0100\u0105"+
		"\u010d\u0111\u011d\u012b\u0131\u0135\u013e\u0149\u0150\u0154\u015b\u0160"+
		"\u016d\u0175\u017c\u0184\u018c\u0194\u019c\u01a4\u01a8\u01b0\u01b6\u01be"+
		"\u01c1\u01d5\u01df\u01e2\u01e8\u01f3\u01fc\u01ff\u020b\u020f\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}