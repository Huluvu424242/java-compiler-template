package com.github.huluvu424242.sql.ddl;


import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLBaseListener;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DDLScriptListener extends SqlDDLBaseListener {

    final Logger logger = Logger.getLogger(DDLScriptListener.class.getName());

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
        logger.log(Level.SEVERE, node.toString());
    }


}
