package com.github.huluvu424242.sql.ddl;


import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLBaseVisitor;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;


public class DDLScriptVisitor extends SqlDDLBaseVisitor<String> {
    @Override
    public String visitParse(SqlDDLParser.ParseContext context) {
        visitChildren(context);

        System.out.println("");

        return null;
    }

    @Override
    public String visitCreate_table(SqlDDLParser.Create_tableContext context) {
        System.out.print(context.getText());

        return visitChildren(context);
    }
}