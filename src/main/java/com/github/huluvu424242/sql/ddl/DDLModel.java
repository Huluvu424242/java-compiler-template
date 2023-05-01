package com.github.huluvu424242.sql.ddl;

/*-
 * #%L
 * java-compiler-template
 * %%
 * Copyright (C) 2023 Huluvu424242
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

import com.github.huluvu424242.plantuml.BuilderStates;
import com.github.huluvu424242.plantuml.BuilderStates.ColumnTypeState;
import com.github.huluvu424242.plantuml.BuilderStates.EntityState;
import com.github.huluvu424242.plantuml.BuilderStates.LambdaStateHolder;
import com.github.huluvu424242.plantuml.BuilderStates.UmlStartState;
import com.github.huluvu424242.plantuml.PlantumlEntityDiagramBuilder;
import com.github.huluvu424242.sql.ddl.Entity.EntityBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;
import java.util.Map;

@Data
@Builder
class Entity {

    protected String name;

    @Singular
    protected List<Column> columns;

}

@Data
@Builder
class Column {
    protected final String colName;
    protected final String colType;
    protected final Boolean mandatory;
    protected final String colNotes;
}


@Builder
public class DDLModel {


    @Singular
    protected List<Entity> entities;

    public static String of(final Map<String, DDLTableDefinition> schemaDefinition) {
        final DDLModel.DDLModelBuilder diagramBuilder = DDLModel
                .builder();

        schemaDefinition
                .values()
                .stream()
                .map(tableDefinition -> {
                    final EntityBuilder entityBuilder = Entity
                            .builder()
                            .name(tableDefinition.getTableName());
                    // Spalten auswerten und ans entity anhängen
                    tableDefinition
                            .getColumns()
                            .values()
                            .stream()
                            .map((DDLColumnDefinition colDef) -> Column
                                    .builder()
                                    .colName(colDef.getColumnName())
                                    .colType(colDef.getDataType())
                                    .mandatory(Boolean.FALSE.equals(colDef.getNullable()))
                                    .colNotes(Boolean.TRUE.equals(colDef.getPrimaryKey()) ? "<<PK>>" : "")
                                    .build())
                            .forEach(entityBuilder::column);
                    return entityBuilder.build();
                })
                .forEach(diagramBuilder::entity);

        return diagramBuilder.build().toString();
    }


    protected UmlStartState getColumnDefinitionen(final EntityState state, final List<Column> columns) {

        final LambdaStateHolder stateHolder = new LambdaStateHolder();

        columns.forEach((Column colSpec) -> {
            final ColumnTypeState typeState;
            if (Boolean.TRUE.equals(colSpec.getMandatory())) {
                typeState = state.createColumnMandatory(colSpec.getColName());
            } else {
                typeState = state.createColumnNullable(colSpec.getColName());
            }
            stateHolder.entityState = typeState
                    .columnType(colSpec.getColType())
                    .columnNotes(colSpec.getColNotes());
        });
        return stateHolder.entityState.next();
    }

    @Override
    public String toString() {
        final LambdaStateHolder stateHolder = new LambdaStateHolder();
        stateHolder.umlStartState = PlantumlEntityDiagramBuilder
                .builder()
                .createUmlHeader();
        entities.forEach((Entity entity) -> {
            final UmlStartState startState = stateHolder.umlStartState;
            stateHolder.umlStartState = getColumnDefinitionen(startState.createEntity(entity.getName()), entity.getColumns());
        });
        return stateHolder.umlStartState
                .createUmlFooter()
                .build();
    }

}
