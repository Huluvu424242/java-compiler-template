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
		T__0=1, T__1=2, T__2=3, T__3=4, CreateTableKey=5, Identifier=6, CREATE=7, 
		TABLE=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "CreateTableKey", "Identifier", "LETTER", 
		"CREATE", "TABLE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'todo table constraint'", null, null, "'create'", 
		"'table'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "CreateTableKey", "Identifier", "CREATE", 
		"TABLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\6\78\n"+
		"\7\r\7\16\79\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\6\13L\n\13\r\13\16\13M\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\2\21\t\23\n\25\13\3\2\4\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\2Q\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7"+
		"\33\3\2\2\2\t\35\3\2\2\2\13\63\3\2\2\2\r\67\3\2\2\2\17;\3\2\2\2\21=\3"+
		"\2\2\2\23D\3\2\2\2\25K\3\2\2\2\27\30\7*\2\2\30\4\3\2\2\2\31\32\7+\2\2"+
		"\32\6\3\2\2\2\33\34\7.\2\2\34\b\3\2\2\2\35\36\7v\2\2\36\37\7q\2\2\37 "+
		"\7f\2\2 !\7q\2\2!\"\7\"\2\2\"#\7v\2\2#$\7c\2\2$%\7d\2\2%&\7n\2\2&\'\7"+
		"g\2\2\'(\7\"\2\2()\7e\2\2)*\7q\2\2*+\7p\2\2+,\7u\2\2,-\7v\2\2-.\7t\2\2"+
		"./\7c\2\2/\60\7k\2\2\60\61\7p\2\2\61\62\7v\2\2\62\n\3\2\2\2\63\64\5\21"+
		"\t\2\64\65\5\23\n\2\65\f\3\2\2\2\668\5\17\b\2\67\66\3\2\2\289\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:\16\3\2\2\2;<\t\2\2\2<\20\3\2\2\2=>\7e\2\2>?\7"+
		"t\2\2?@\7g\2\2@A\7c\2\2AB\7v\2\2BC\7g\2\2C\22\3\2\2\2DE\7v\2\2EF\7c\2"+
		"\2FG\7d\2\2GH\7n\2\2HI\7g\2\2I\24\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\13\2\2P\26\3\2\2\2\5\29M\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}