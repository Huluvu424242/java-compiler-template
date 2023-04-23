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


import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLBaseVisitor;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Getter
public class DDLScriptVisitor extends SqlDDLBaseVisitor<String> {

    protected final Map<String, DDLTableDefinition> schemaDefinition = new HashMap<>();

    @Override
    public String visitCreate_table(SqlDDLParser.Create_tableContext context) {
        final String tableName = context.IDENTIFIER().getText();
        final DDLTableDefinition.DDLTableDefinitionBuilder tableDefinitionBuilder = DDLTableDefinition
                .builder()
                .tableName(tableName);
        final SqlDDLParser.Create_table_definitionContext tableContextDefinition = context.create_table_definition();
        final Map<String, DDLColumnDefinition> columns = new HashMap<>();
        tableContextDefinition.table_element().stream().forEach(
                (SqlDDLParser.Table_elementContext tableElement) -> {
                    final SqlDDLParser.Column_elementContext column = tableElement.column_element();
                    final String columnName = column.IDENTIFIER().getText();
                    final String columnDataType = column.column_datatype().getText();
                    final boolean isNullable = !meetsCondition(column.column_constraint(), "notnull");
                    final boolean isPrimary = meetsCondition(column.column_constraint(), "primarykey");
                    final DDLColumnDefinition columnDefinition = DDLColumnDefinition.builder()
                            .columnName(columnName)
                            .dataType(columnDataType)
                            .nullable(isNullable)
                            .primaryKey(isPrimary)
                            .build();

                    columns.put(columnName, columnDefinition);

                });
        tableDefinitionBuilder.columns(columns);
        final DDLTableDefinition tableDefinition = tableDefinitionBuilder.build();
        schemaDefinition.put(tableDefinition.getTableName(), tableDefinition);

        log.info(">" + tableDefinition.toString() + "<");

        return visitChildren(context);
    }

    protected boolean meetsCondition(final List<SqlDDLParser.Column_constraintContext> colContents, final String anyMatchString) {
        return colContents.stream().anyMatch((SqlDDLParser.Column_constraintContext ctx) -> ctx.getText().equals(anyMatchString));
    }
}
