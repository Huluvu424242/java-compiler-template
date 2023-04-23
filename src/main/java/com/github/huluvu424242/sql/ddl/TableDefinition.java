package com.github.huluvu424242.sql.ddl;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class TableDefinition {

    protected String tableName;
    protected Map<String, ColumnDefinition> columns;

}
