package com.github.huluvu424242.plantuml;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
class ColumnSpec {
    protected final String colName;
    protected final String colType;
    protected final Boolean mandatory;
    protected final String colNotes;
}

@Data
@Builder
class Entity {

    protected String name;

    @Singular
    protected List<ColumnSpec> columns;

}

@Builder
public class EntityModel {

    @Singular
    protected List<Entity> entities = new ArrayList<>();


    protected String getColumnDefinitionen(final List<ColumnSpec> columns) {
        final StringBuilder builder = new StringBuilder();
        columns.stream()
                .map((ColumnSpec colSpec) -> {
                    final String colName = colSpec.getColName();
                    final String colType = colSpec.getColType();
                    final String colNotes = colSpec.getColNotes();
                    final String prefix;
                    if (Boolean.TRUE.equals(colSpec.getMandatory())) {
                        prefix = " *";
                    } else {
                        prefix = "  ";
                    }
                    return String.format("%s %s %s <<%s>>\n", prefix, colName, colType, colNotes);
                })
                .forEach(builder::append);


        return builder.toString();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("\n@startuml\n");
        entities.forEach((Entity entity) -> {
            builder.append(String.format("\nentity %s{\n%s\n}", entity.getName(), getColumnDefinitionen(entity.getColumns())));
        });

        builder.append("\n@enduml\n");
        return builder.toString();
    }

}
