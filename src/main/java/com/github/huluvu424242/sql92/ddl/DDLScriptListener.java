package com.github.huluvu424242.sql92.ddl;


import com.github.huluvu424242.sql92.ddl.antlr4.Sql92DDLBaseListener;
import com.github.huluvu424242.sql92.ddl.antlr4.Sql92DDLParser;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DDLScriptListener extends Sql92DDLBaseListener {

    final Logger logger = Logger.getLogger(DDLScriptListener.class.getName());

    final Map<String, TableDefinition> ddlObjectMap = new HashMap<>();

    public Map<String, TableDefinition> getDDLObjectMap() {
        return this.ddlObjectMap;
    }

    @Override
    public void enterDdlScript(Sql92DDLParser.DdlScriptContext ctx) {
        logger.log(Level.INFO, "Log1");
    }

    @Override
    public void enterCreateTable(Sql92DDLParser.CreateTableContext ctx) {
        final String tableName = ctx.getText();
        final TableDefinition tableDefinition = new TableDefinition();
        ddlObjectMap.put(tableName, tableDefinition);
    }


}
