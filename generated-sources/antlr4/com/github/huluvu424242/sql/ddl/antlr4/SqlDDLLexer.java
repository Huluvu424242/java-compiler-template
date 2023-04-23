// Generated from com\github\huluvu424242\sql\ddl\antlr4\SqlDDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql.ddl.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlDDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, KW_CREATE=5, KW_TABLE=6, KW_NOT=7, KW_NULL=8, 
		KW_PRIMARY=9, KW_KEY=10, NUMBER=11, DIGIT=12, IDENTIFIER=13, WS=14, UNEXPECTED_CHAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "KW_CREATE", "KW_TABLE", "KW_NOT", "KW_NULL", 
		"KW_PRIMARY", "KW_KEY", "NUMBER", "DIGIT", "IDENTIFIER", "WS", "UNEXPECTED_CHAR", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public SqlDDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlDDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u0081\n\f\r\f\16\f\u0082\3\r\3\r"+
		"\3\16\6\16\u0088\n\16\r\16\16\16\u0089\3\17\6\17\u008d\n\17\r\17\16\17"+
		"\u008e\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2)\2+\2-\2"+
		"/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2\3\2"+
		"\37\3\2\62;\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00b0\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2"+
		"\t[\3\2\2\2\13]\3\2\2\2\rd\3\2\2\2\17j\3\2\2\2\21n\3\2\2\2\23s\3\2\2\2"+
		"\25{\3\2\2\2\27\u0080\3\2\2\2\31\u0084\3\2\2\2\33\u0087\3\2\2\2\35\u008c"+
		"\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2"+
		"\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a2\3"+
		"\2\2\2\61\u00a4\3\2\2\2\63\u00a6\3\2\2\2\65\u00a8\3\2\2\2\67\u00aa\3\2"+
		"\2\29\u00ac\3\2\2\2;\u00ae\3\2\2\2=\u00b0\3\2\2\2?\u00b2\3\2\2\2A\u00b4"+
		"\3\2\2\2C\u00b6\3\2\2\2E\u00b8\3\2\2\2G\u00ba\3\2\2\2I\u00bc\3\2\2\2K"+
		"\u00be\3\2\2\2M\u00c0\3\2\2\2O\u00c2\3\2\2\2Q\u00c4\3\2\2\2S\u00c6\3\2"+
		"\2\2UV\7=\2\2V\4\3\2\2\2WX\7*\2\2X\6\3\2\2\2YZ\7+\2\2Z\b\3\2\2\2[\\\7"+
		".\2\2\\\n\3\2\2\2]^\5%\23\2^_\5C\"\2_`\5)\25\2`a\5!\21\2ab\5G$\2bc\5)"+
		"\25\2c\f\3\2\2\2de\5G$\2ef\5!\21\2fg\5#\22\2gh\5\67\34\2hi\5)\25\2i\16"+
		"\3\2\2\2jk\5;\36\2kl\5=\37\2lm\5G$\2m\20\3\2\2\2no\5;\36\2op\5I%\2pq\5"+
		"\67\34\2qr\5\67\34\2r\22\3\2\2\2st\5? \2tu\5C\"\2uv\5\61\31\2vw\59\35"+
		"\2wx\5!\21\2xy\5C\"\2yz\5Q)\2z\24\3\2\2\2{|\5\65\33\2|}\5)\25\2}~\5Q)"+
		"\2~\26\3\2\2\2\177\u0081\5\31\r\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\30\3\2\2\2\u0084\u0085"+
		"\t\2\2\2\u0085\32\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\34\3\2\2"+
		"\2\u008b\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\17\2\2"+
		"\u0091\36\3\2\2\2\u0092\u0093\13\2\2\2\u0093 \3\2\2\2\u0094\u0095\t\5"+
		"\2\2\u0095\"\3\2\2\2\u0096\u0097\t\6\2\2\u0097$\3\2\2\2\u0098\u0099\t"+
		"\7\2\2\u0099&\3\2\2\2\u009a\u009b\t\b\2\2\u009b(\3\2\2\2\u009c\u009d\t"+
		"\t\2\2\u009d*\3\2\2\2\u009e\u009f\t\n\2\2\u009f,\3\2\2\2\u00a0\u00a1\t"+
		"\13\2\2\u00a1.\3\2\2\2\u00a2\u00a3\t\f\2\2\u00a3\60\3\2\2\2\u00a4\u00a5"+
		"\t\r\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\t\16\2\2\u00a7\64\3\2\2\2\u00a8"+
		"\u00a9\t\17\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\t\20\2\2\u00ab8\3\2\2\2\u00ac"+
		"\u00ad\t\21\2\2\u00ad:\3\2\2\2\u00ae\u00af\t\22\2\2\u00af<\3\2\2\2\u00b0"+
		"\u00b1\t\23\2\2\u00b1>\3\2\2\2\u00b2\u00b3\t\24\2\2\u00b3@\3\2\2\2\u00b4"+
		"\u00b5\t\25\2\2\u00b5B\3\2\2\2\u00b6\u00b7\t\26\2\2\u00b7D\3\2\2\2\u00b8"+
		"\u00b9\t\27\2\2\u00b9F\3\2\2\2\u00ba\u00bb\t\30\2\2\u00bbH\3\2\2\2\u00bc"+
		"\u00bd\t\31\2\2\u00bdJ\3\2\2\2\u00be\u00bf\t\32\2\2\u00bfL\3\2\2\2\u00c0"+
		"\u00c1\t\33\2\2\u00c1N\3\2\2\2\u00c2\u00c3\t\34\2\2\u00c3P\3\2\2\2\u00c4"+
		"\u00c5\t\35\2\2\u00c5R\3\2\2\2\u00c6\u00c7\t\36\2\2\u00c7T\3\2\2\2\6\2"+
		"\u0082\u0089\u008e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}