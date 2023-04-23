package com.github.huluvu424242.sql.ddl;


import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLBaseVisitor;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;

import java.util.HashMap;
import java.util.Map;
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
        final String tableName = context.IDENTIFIER().getText();
        final TableDefinition.TableDefinitionBuilder tableDefinitionBuilder = TableDefinition
                .builder()
                .tableName(tableName);
        final SqlDDLParser.Create_table_definitionContext tableContextDefinition = context.create_table_definition();
        final Map<String, ColumnDefinition> columns = new HashMap<>();
        tableContextDefinition.table_element().stream().forEach(
                (SqlDDLParser.Table_elementContext tableElement) -> {
                    final SqlDDLParser.Column_elementContext column = tableElement.column_element();
                    final String columnName = column.IDENTIFIER().getText();
                    final String columnDataType = column.column_datatype().getText();
                    final boolean isNullable = !column.column_constraint().contains("notnull");
                    final boolean isPrimary = !column.column_constraint().contains("primarykey");
                    final ColumnDefinition columnDefinition = ColumnDefinition.builder()
                            .columnName(columnName)
                            .dataType(columnDataType)
                            .nullable(isNullable)
                            .primaryKey(isPrimary)
                            .build();

                    columns.put(columnName, columnDefinition);

                });
        tableDefinitionBuilder.columns(columns);
        final TableDefinition tableDefinition = tableDefinitionBuilder.build();

        logger.log(Level.INFO, () -> ">" + tableDefinition.toString() + "<");

        return visitChildren(context);
    }
}