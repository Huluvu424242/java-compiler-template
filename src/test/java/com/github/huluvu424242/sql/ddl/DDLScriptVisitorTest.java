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
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

class DDLScriptVisitorTest {

    @Test
    void visitCreate_table() {
        final String ddlScriptContent =
                """
                        create table Mitarbeiter (
                            id int not null primary key,
                            vorname varchar(200),
                            name varchar(2300),
                            dep_id int
                            );
                           
                            create table Abteilung (
                              id int not null primary key,
                              dep_name varchar(200),
                              description varchar(2300)
                            );
                         """;
        final CharStream inputStream = CharStreams.fromString(ddlScriptContent);
        final SqlDDLLexer markupLexer = new SqlDDLLexer(inputStream);
        final CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        final SqlDDLParser markupParser = new SqlDDLParser(commonTokenStream);
        SqlDDLParser.ParseContext fileContext = markupParser.parse();
        final DDLScriptVisitor visitor = new DDLScriptVisitor();
        visitor.visit(fileContext);
    }
}
