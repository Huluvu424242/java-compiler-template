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


import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLBaseListener;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class DDLScriptListener extends SqlDDLBaseListener {

    final Map<String, TableDefinition> ddlObjectMap = new HashMap<>();

    public Map<String, TableDefinition> getDDLObjectMap() {
        return this.ddlObjectMap;
    }

    @Override
    public void exitCreate_table(SqlDDLParser.Create_tableContext ctx) {
        final String tableName = ctx.IDENTIFIER().getText();
        final TableDefinition tableDefinition = TableDefinition.builder().build();
        ddlObjectMap.put(tableName, tableDefinition);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        log.error(node.toString());
    }


}
