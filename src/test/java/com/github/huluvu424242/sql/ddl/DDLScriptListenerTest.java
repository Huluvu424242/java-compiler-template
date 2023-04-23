package com.github.huluvu424242.sql.ddl;

/*-
 * #%L
 * java-compiler-template
 * %%
 * Copyright (C) 2023 PIUG
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLLexer;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;
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
    void createOneTable() {

        final String ddlScriptContent =
                """
                        create table Mitarbeiter (
                            id int not null primary key,
                            vorname varchar(200),
                            name varchar(2300)
                        );
                         """;
        //
        final SqlDDLLexer ddlLexer = new SqlDDLLexer(CharStreams.fromString(ddlScriptContent));
        final CommonTokenStream tokens = new CommonTokenStream(ddlLexer);
        final SqlDDLParser parser = new SqlDDLParser(tokens);
        final ParseTree tree = parser.parse();

        // instantiate the lexer, the parser, and the walker
        final DDLScriptListener listener = new DDLScriptListener();
        walker.walk(listener, tree);
        final Map<String, DDLTableDefinition> ddlObjects = listener.getDDLObjectMap();

        assertEquals(1, ddlObjects.size());
        assertEquals("Mitarbeiter", ddlObjects.keySet().stream().findFirst().orElseThrow(() -> new RuntimeException("Falsch")));
    }
}
