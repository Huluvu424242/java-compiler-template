package com.github.huluvu424242.plantuml;

import com.github.huluvu424242.sql.ddl.DDLColumnDefinition;
import com.github.huluvu424242.sql.ddl.DDLTableDefinition;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
public class PlantumlDiagram {

    public static String of(final Map<String, DDLTableDefinition> schemaDefinition) {
        final EntityModel.EntityModelBuilder diagramBuilder = EntityModel
                .builder();

        schemaDefinition
                .entrySet()
                .stream()
                .map((Map.Entry<String, DDLTableDefinition> entry) -> {
                    final DDLTableDefinition tableDefinition = entry.getValue();

                    final Entity.EntityBuilder entityBuilder = Entity
                            .builder()
                            .name(tableDefinition.getTableName());
                    // Spalten auswerten und ans entity anhängen
                    tableDefinition
                            .getColumns()
                            .values()
                            .stream()
                            .map((DDLColumnDefinition colDef) -> ColumnSpec
                                    .builder()
                                    .colName(colDef.getColumnName())
                                    .colType(colDef.getDataType())
                                    .mandatory(Boolean.FALSE.equals(colDef.getNullable()))
                                    .colNotes(Boolean.TRUE.equals(colDef.getPrimaryKey()) ? "PK" : "")
                                    .build())
                            .forEach(entityBuilder::column);
                    return entityBuilder.build();
                })
                .forEach(diagramBuilder::entity);

        return diagramBuilder.build().toString();
    }


}
