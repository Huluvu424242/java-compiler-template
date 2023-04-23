// Generated from com\github\huluvu424242\sql92\ddl\antlr4\Sql92DDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql92.ddl.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql92DDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, KW_CREATE=5, KW_TABLE=6, KW_NOT=7, KW_NULL=8, 
		NUMBER=9, DIGIT=10, IDENTIFIER=11, WS=12, UNEXPECTED_CHAR=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "KW_CREATE", "KW_TABLE", "KW_NOT", "KW_NULL", 
		"NUMBER", "DIGIT", "IDENTIFIER", "WS", "UNEXPECTED_CHAR", "A", "B", "C", 
		"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
		"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "KW_CREATE", "KW_TABLE", "KW_NOT", "KW_NULL", 
		"NUMBER", "DIGIT", "IDENTIFIER", "WS", "UNEXPECTED_CHAR"
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


	public Sql92DDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql92DDL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\nq\n\n\r\n\16\nr\3\13\3\13\3"+
		"\f\6\fx\n\f\r\f\16\fy\3\r\6\r}\n\r\r\r\16\r~\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2"+
		"=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2\3\2\37\3\2\62;\7\2&&\62;C\\aac|\5\2\13"+
		"\f\16\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4"+
		"\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2"+
		"[[{{\4\2\\\\||\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2"+
		"\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r`\3\2\2\2\17f\3\2\2\2\21j\3\2\2\2"+
		"\23p\3\2\2\2\25t\3\2\2\2\27w\3\2\2\2\31|\3\2\2\2\33\u0082\3\2\2\2\35\u0084"+
		"\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2"+
		"\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0096\3"+
		"\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2\2\65\u009c\3\2\2\2\67\u009e\3\2"+
		"\2\29\u00a0\3\2\2\2;\u00a2\3\2\2\2=\u00a4\3\2\2\2?\u00a6\3\2\2\2A\u00a8"+
		"\3\2\2\2C\u00aa\3\2\2\2E\u00ac\3\2\2\2G\u00ae\3\2\2\2I\u00b0\3\2\2\2K"+
		"\u00b2\3\2\2\2M\u00b4\3\2\2\2O\u00b6\3\2\2\2QR\7=\2\2R\4\3\2\2\2ST\7*"+
		"\2\2T\6\3\2\2\2UV\7+\2\2V\b\3\2\2\2WX\7.\2\2X\n\3\2\2\2YZ\5!\21\2Z[\5"+
		"? \2[\\\5%\23\2\\]\5\35\17\2]^\5C\"\2^_\5%\23\2_\f\3\2\2\2`a\5C\"\2ab"+
		"\5\35\17\2bc\5\37\20\2cd\5\63\32\2de\5%\23\2e\16\3\2\2\2fg\5\67\34\2g"+
		"h\59\35\2hi\5C\"\2i\20\3\2\2\2jk\5\67\34\2kl\5E#\2lm\5\63\32\2mn\5\63"+
		"\32\2n\22\3\2\2\2oq\5\25\13\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"s\24\3\2\2\2tu\t\2\2\2u\26\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z\30\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\r\2\2\u0081\32\3\2\2\2\u0082"+
		"\u0083\13\2\2\2\u0083\34\3\2\2\2\u0084\u0085\t\5\2\2\u0085\36\3\2\2\2"+
		"\u0086\u0087\t\6\2\2\u0087 \3\2\2\2\u0088\u0089\t\7\2\2\u0089\"\3\2\2"+
		"\2\u008a\u008b\t\b\2\2\u008b$\3\2\2\2\u008c\u008d\t\t\2\2\u008d&\3\2\2"+
		"\2\u008e\u008f\t\n\2\2\u008f(\3\2\2\2\u0090\u0091\t\13\2\2\u0091*\3\2"+
		"\2\2\u0092\u0093\t\f\2\2\u0093,\3\2\2\2\u0094\u0095\t\r\2\2\u0095.\3\2"+
		"\2\2\u0096\u0097\t\16\2\2\u0097\60\3\2\2\2\u0098\u0099\t\17\2\2\u0099"+
		"\62\3\2\2\2\u009a\u009b\t\20\2\2\u009b\64\3\2\2\2\u009c\u009d\t\21\2\2"+
		"\u009d\66\3\2\2\2\u009e\u009f\t\22\2\2\u009f8\3\2\2\2\u00a0\u00a1\t\23"+
		"\2\2\u00a1:\3\2\2\2\u00a2\u00a3\t\24\2\2\u00a3<\3\2\2\2\u00a4\u00a5\t"+
		"\25\2\2\u00a5>\3\2\2\2\u00a6\u00a7\t\26\2\2\u00a7@\3\2\2\2\u00a8\u00a9"+
		"\t\27\2\2\u00a9B\3\2\2\2\u00aa\u00ab\t\30\2\2\u00abD\3\2\2\2\u00ac\u00ad"+
		"\t\31\2\2\u00adF\3\2\2\2\u00ae\u00af\t\32\2\2\u00afH\3\2\2\2\u00b0\u00b1"+
		"\t\33\2\2\u00b1J\3\2\2\2\u00b2\u00b3\t\34\2\2\u00b3L\3\2\2\2\u00b4\u00b5"+
		"\t\35\2\2\u00b5N\3\2\2\2\u00b6\u00b7\t\36\2\2\u00b7P\3\2\2\2\6\2ry~\3"+
		"\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}