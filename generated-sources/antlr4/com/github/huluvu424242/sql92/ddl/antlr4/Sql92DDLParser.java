// Generated from com\github\huluvu424242\sql92\ddl\antlr4\Sql92DDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql92.ddl.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql92DDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CreateTableKey=5, Identifier=6;
	public static final int
		RULE_ddlScript = 0, RULE_createTable = 1, RULE_createTableDefinition = 2, 
		RULE_createTableKeywords = 3, RULE_tableElement = 4, RULE_columnElement = 5, 
		RULE_tableConstraint = 6;
	public static final String[] ruleNames = {
		"ddlScript", "createTable", "createTableDefinition", "createTableKeywords", 
		"tableElement", "columnElement", "tableConstraint"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'todo table constraint'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "CreateTableKey", "Identifier"
	};
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
	public String getGrammarFileName() { return "Sql92DDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Sql92DDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DdlScriptContext extends ParserRuleContext {
		public List<CreateTableContext> createTable() {
			return getRuleContexts(CreateTableContext.class);
		}
		public CreateTableContext createTable(int i) {
			return getRuleContext(CreateTableContext.class,i);
		}
		public DdlScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterDdlScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitDdlScript(this);
		}
	}

	public final DdlScriptContext ddlScript() throws RecognitionException {
		DdlScriptContext _localctx = new DdlScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ddlScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				createTable();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CreateTableKey );
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

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableKeywordsContext createTableKeywords() {
			return getRuleContext(CreateTableKeywordsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Sql92DDLParser.Identifier, 0); }
		public CreateTableDefinitionContext createTableDefinition() {
			return getRuleContext(CreateTableDefinitionContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitCreateTable(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			createTableKeywords();
			setState(20);
			match(Identifier);
			setState(21);
			match(T__0);
			setState(22);
			createTableDefinition();
			setState(23);
			match(T__1);
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

	public static class CreateTableDefinitionContext extends ParserRuleContext {
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public CreateTableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterCreateTableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitCreateTableDefinition(this);
		}
	}

	public final CreateTableDefinitionContext createTableDefinition() throws RecognitionException {
		CreateTableDefinitionContext _localctx = new CreateTableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createTableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			tableElement();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(26);
				match(T__2);
				setState(27);
				tableElement();
				}
				}
				setState(32);
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

	public static class CreateTableKeywordsContext extends ParserRuleContext {
		public TerminalNode CreateTableKey() { return getToken(Sql92DDLParser.CreateTableKey, 0); }
		public CreateTableKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterCreateTableKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitCreateTableKeywords(this);
		}
	}

	public final CreateTableKeywordsContext createTableKeywords() throws RecognitionException {
		CreateTableKeywordsContext _localctx = new CreateTableKeywordsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTableKeywords);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(CreateTableKey);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnElementContext columnElement() {
			return getRuleContext(ColumnElementContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitTableElement(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableElement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				columnElement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				tableConstraint();
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

	public static class ColumnElementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Sql92DDLParser.Identifier, 0); }
		public ColumnElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterColumnElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitColumnElement(this);
		}
	}

	public final ColumnElementContext columnElement() throws RecognitionException {
		ColumnElementContext _localctx = new ColumnElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(Identifier);
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql92DDLListener ) ((Sql92DDLListener)listener).exitTableConstraint(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\3"+
		"\5\3\6\3\6\5\6(\n\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2)\2"+
		"\21\3\2\2\2\4\25\3\2\2\2\6\33\3\2\2\2\b#\3\2\2\2\n\'\3\2\2\2\f)\3\2\2"+
		"\2\16+\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2"+
		"\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5\b\5\2\26\27\7\b\2\2\27\30\7\3\2\2"+
		"\30\31\5\6\4\2\31\32\7\4\2\2\32\5\3\2\2\2\33 \5\n\6\2\34\35\7\5\2\2\35"+
		"\37\5\n\6\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2"+
		"\2\" \3\2\2\2#$\7\7\2\2$\t\3\2\2\2%(\5\f\7\2&(\5\16\b\2\'%\3\2\2\2\'&"+
		"\3\2\2\2(\13\3\2\2\2)*\7\b\2\2*\r\3\2\2\2+,\7\6\2\2,\17\3\2\2\2\5\23 "+
		"\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}