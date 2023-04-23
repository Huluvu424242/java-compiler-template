// Generated from com\github\huluvu424242\sql\ddl\antlr4\SqlDDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql.ddl.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlDDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, KW_CREATE=5, KW_TABLE=6, KW_NOT=7, KW_NULL=8, 
		KW_PRIMARY=9, KW_KEY=10, NUMBER=11, DIGIT=12, IDENTIFIER=13, WS=14, UNEXPECTED_CHAR=15;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_ddl_statements = 2, RULE_ddl_statement = 3, 
		RULE_create_table = 4, RULE_create_table_definition = 5, RULE_table_element = 6, 
		RULE_column_element = 7, RULE_column_datatype = 8, RULE_column_constraint = 9;
	public static final String[] ruleNames = {
		"parse", "error", "ddl_statements", "ddl_statement", "create_table", "create_table_definition", 
		"table_element", "column_element", "column_datatype", "column_constraint"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "KW_CREATE", "KW_TABLE", "KW_NOT", "KW_NULL", 
		"KW_PRIMARY", "KW_KEY", "NUMBER", "DIGIT", "IDENTIFIER", "WS", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SqlDDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlDDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlDDLParser.EOF, 0); }
		public List<Ddl_statementsContext> ddl_statements() {
			return getRuleContexts(Ddl_statementsContext.class);
		}
		public Ddl_statementsContext ddl_statements(int i) {
			return getRuleContext(Ddl_statementsContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << KW_CREATE) | (1L << UNEXPECTED_CHAR))) != 0)) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case KW_CREATE:
					{
					setState(20);
					ddl_statements();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(21);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlDDLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Ddl_statementsContext extends ParserRuleContext {
		public Ddl_statementContext ddl_statement() {
			return getRuleContext(Ddl_statementContext.class,0);
		}
		public List<Ddl_statementsContext> ddl_statements() {
			return getRuleContexts(Ddl_statementsContext.class);
		}
		public Ddl_statementsContext ddl_statements(int i) {
			return getRuleContext(Ddl_statementsContext.class,i);
		}
		public Ddl_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterDdl_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitDdl_statements(this);
		}
	}

	public final Ddl_statementsContext ddl_statements() throws RecognitionException {
		Ddl_statementsContext _localctx = new Ddl_statementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddl_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(32);
				match(T__0);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			ddl_statement();
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(39);
							match(T__0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(42); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(44);
					ddl_statements();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					match(T__0);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Ddl_statementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Ddl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterDdl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitDdl_statement(this);
		}
	}

	public final Ddl_statementContext ddl_statement() throws RecognitionException {
		Ddl_statementContext _localctx = new Ddl_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ddl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			create_table();
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

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(SqlDDLParser.KW_CREATE, 0); }
		public TerminalNode KW_TABLE() { return getToken(SqlDDLParser.KW_TABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlDDLParser.IDENTIFIER, 0); }
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(KW_CREATE);
			setState(59);
			match(KW_TABLE);
			setState(60);
			match(IDENTIFIER);
			setState(61);
			match(T__1);
			setState(62);
			create_table_definition();
			setState(63);
			match(T__2);
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

	public static class Create_table_definitionContext extends ParserRuleContext {
		public List<Table_elementContext> table_element() {
			return getRuleContexts(Table_elementContext.class);
		}
		public Table_elementContext table_element(int i) {
			return getRuleContext(Table_elementContext.class,i);
		}
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitCreate_table_definition(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			table_element();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(66);
				match(T__3);
				setState(67);
				table_element();
				}
				}
				setState(72);
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

	public static class Table_elementContext extends ParserRuleContext {
		public Column_elementContext column_element() {
			return getRuleContext(Column_elementContext.class,0);
		}
		public Table_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterTable_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitTable_element(this);
		}
	}

	public final Table_elementContext table_element() throws RecognitionException {
		Table_elementContext _localctx = new Table_elementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			column_element();
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

	public static class Column_elementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlDDLParser.IDENTIFIER, 0); }
		public Column_datatypeContext column_datatype() {
			return getRuleContext(Column_datatypeContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterColumn_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitColumn_element(this);
		}
	}

	public final Column_elementContext column_element() throws RecognitionException {
		Column_elementContext _localctx = new Column_elementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IDENTIFIER);
			setState(76);
			column_datatype();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_NOT) | (1L << KW_NULL) | (1L << KW_PRIMARY))) != 0)) {
				{
				{
				setState(77);
				column_constraint();
				}
				}
				setState(82);
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

	public static class Column_datatypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlDDLParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SqlDDLParser.NUMBER, 0); }
		public Column_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterColumn_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitColumn_datatype(this);
		}
	}

	public final Column_datatypeContext column_datatype() throws RecognitionException {
		Column_datatypeContext _localctx = new Column_datatypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IDENTIFIER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(84);
				match(T__1);
				setState(85);
				match(NUMBER);
				setState(86);
				match(T__2);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(SqlDDLParser.KW_NULL, 0); }
		public TerminalNode KW_NOT() { return getToken(SqlDDLParser.KW_NOT, 0); }
		public TerminalNode KW_PRIMARY() { return getToken(SqlDDLParser.KW_PRIMARY, 0); }
		public TerminalNode KW_KEY() { return getToken(SqlDDLParser.KW_KEY, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlDDLListener ) ((SqlDDLListener)listener).exitColumn_constraint(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column_constraint);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NOT:
			case KW_NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(89);
					match(KW_NOT);
					}
				}

				setState(92);
				match(KW_NULL);
				}
				break;
			case KW_PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(KW_PRIMARY);
				setState(94);
				match(KW_KEY);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\7\7G\n\7\f\7\16\7J\13\7\3\b\3\b\3\t\3\t\3\t\7\tQ\n\t\f\t\16"+
		"\tT\13\t\3\n\3\n\3\n\3\n\5\nZ\n\n\3\13\5\13]\n\13\3\13\3\13\3\13\5\13"+
		"b\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2d\2\32\3\2\2\2\4\37\3\2"+
		"\2\2\6%\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\fC\3\2\2\2\16K\3\2\2\2\20M\3\2\2"+
		"\2\22U\3\2\2\2\24a\3\2\2\2\26\31\5\6\4\2\27\31\5\4\3\2\30\26\3\2\2\2\30"+
		"\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34"+
		"\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\21\2\2 !\b\3\1\2!\5\3\2\2"+
		"\2\"$\7\3\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3"+
		"\2\2\2(\61\5\b\5\2)+\7\3\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-"+
		".\3\2\2\2.\60\5\6\4\2/*\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\67\3\2\2\2\63\61\3\2\2\2\64\66\7\3\2\2\65\64\3\2\2\2\669\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2\2:;\5\n\6\2;\t\3\2\2\2"+
		"<=\7\7\2\2=>\7\b\2\2>?\7\17\2\2?@\7\4\2\2@A\5\f\7\2AB\7\5\2\2B\13\3\2"+
		"\2\2CH\5\16\b\2DE\7\6\2\2EG\5\16\b\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2I\r\3\2\2\2JH\3\2\2\2KL\5\20\t\2L\17\3\2\2\2MN\7\17\2\2NR\5\22\n"+
		"\2OQ\5\24\13\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\21\3\2\2\2TR\3"+
		"\2\2\2UY\7\17\2\2VW\7\4\2\2WX\7\r\2\2XZ\7\5\2\2YV\3\2\2\2YZ\3\2\2\2Z\23"+
		"\3\2\2\2[]\7\t\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\7\n\2\2_`\7\13\2"+
		"\2`b\7\f\2\2a\\\3\2\2\2a_\3\2\2\2b\25\3\2\2\2\r\30\32%,\61\67HRY\\a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}