package com.github.huluvu424242.sql92.ddl;

import com.github.huluvu424242.sql92.ddl.antlr4.Sql92DDLLexer;
import com.github.huluvu424242.sql92.ddl.antlr4.Sql92DDLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DDLScriptListenerTest {

    protected final ParseTreeWalker walker = new ParseTreeWalker();

    @Test
    void createOneTable() throws Exception {

        final String ddlScriptContent = "create table Mitarbeiter ( id)";
        //
        final Sql92DDLLexer ddlLexer = new Sql92DDLLexer(CharStreams.fromString(ddlScriptContent));
        final CommonTokenStream tokens = new CommonTokenStream(ddlLexer);
        final Sql92DDLParser parser = new Sql92DDLParser(tokens);
        final ParseTree tree = parser.ddlScript();

        // instantiate the lexer, the parser, and the walker
        final DDLScriptListener listener = new DDLScriptListener();
        walker.walk(listener, tree);
        final Map<String, TableDefinition> ddlObjects = listener.getDDLObjectMap();

        assertEquals(3, ddlObjects.size());
        assertEquals("Hallo", ddlObjects.keySet().stream().findFirst().orElseThrow(() -> new RuntimeException("Falsch")));
    }
}