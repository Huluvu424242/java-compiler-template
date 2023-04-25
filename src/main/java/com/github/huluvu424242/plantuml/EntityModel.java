package com.github.huluvu424242.plantuml;

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
                    final StringBuilder sb = new StringBuilder();
                    if (Boolean.TRUE.equals(colSpec.getMandatory())) {
                        sb.append(" *");
                    } else {
                        sb.append("  ");
                    }
                    final String colName = colSpec.getColName();
                    if(colName!=null&& colName.trim().length()>0){
                        sb.append(" ").append(colName);
                    }
                    final String colType = colSpec.getColType();
                    if(colType!=null && colType.trim().length()>0){
                        sb.append(" ").append(colType);
                    }
                    final String colNotes = colSpec.getColNotes();
                    if(colNotes!=null && colNotes.trim().length()>0){
                        sb.append(" ").append(colNotes);
                    }
                    sb.append("\n");
                    return sb.toString();
                })
//                .map(String::trim)
                .forEach(builder::append);


        return builder.toString();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("@startuml\n");
        entities.forEach((Entity entity) -> {
            builder.append(String.format("\nentity %s{\n%s}", entity.getName(), getColumnDefinitionen(entity.getColumns())));
        });

        builder.append("\n@enduml\n");
        return builder.toString();
    }

}
