package com.github.huluvu424242.sql.ddl;


import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLBaseVisitor;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;

import java.util.logging.Level;
import java.util.logging.Logger;


public class DDLScriptVisitor extends SqlDDLBaseVisitor<String> {
    final Logger logger = Logger.getLogger(DDLScriptVisitor.class.getName());

//    @Override
//    public String visitParse(SqlDDLParser.ParseContext context) {
//        visitChildren(context);
//
//        System.out.println("");
//
//        return null;
//    }

    @Override
    public String visitCreate_table(SqlDDLParser.Create_tableContext context) {
        final TableDefinition tableDefinition = new TableDefinition();
        final String tableName = context.IDENTIFIER().getText();
        final SqlDDLParser.Create_table_definitionContext tableContextDefinition = context.create_table_definition();
        tableContextDefinition.table_element().stream().forEach(
                (SqlDDLParser.Table_elementContext tableElement) -> {
                    final SqlDDLParser.Column_elementContext column = tableElement.column_element();
                    final String columnName = column.IDENTIFIER().getText();
                });

        logger.log(Level.INFO, () -> ">" + tableName +

                "<");

        return visitChildren(context);
    }
}