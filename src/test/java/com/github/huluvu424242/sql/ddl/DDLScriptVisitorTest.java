package com.github.huluvu424242.sql.ddl;

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
                            name varchar(2300)
                        );
                         """;
        final CharStream inputStream = CharStreams.fromString(ddlScriptContent);
        final SqlDDLLexer markupLexer = new SqlDDLLexer(inputStream);
        final CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        final SqlDDLParser markupParser = new SqlDDLParser(commonTokenStream);
        SqlDDLParser.ParseContext fileContext = markupParser.parse();
        final DDLScriptVisitor visitor = new DDLScriptVisitor() {
        };
        visitor.visit(fileContext);
    }
}