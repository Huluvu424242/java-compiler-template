package com.github.huluvu424242.sql.ddl;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ColumnDefinition {

    protected String columnName;
    protected String dataType;
    protected Boolean nullable;
    protected Boolean primaryKey;
}
