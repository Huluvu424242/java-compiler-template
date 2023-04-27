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

import java.util.HashMap;
import java.util.Map;

class FluentAppender {

    private static final Map<Integer, FluentAppender> appenders = new HashMap<>();
    final StringBuilder builder;

    private FluentAppender() {
        builder = new StringBuilder();
    }

    static FluentAppender getAppender(final int id) {
        final FluentAppender appender = appenders.getOrDefault(id, new FluentAppender());
        appenders.put(id, appender);
        return appender;
    }
}

interface States {
    int getId();

    private static StringBuilder getBuilder(final int id) {
        return FluentAppender.getAppender(id).builder;
    }

    interface NewState extends States {

        default UmlState createUmlHeader() {
            final StringBuilder builder = States.getBuilder(getId());
            builder.append("@startuml\n");
            return this::getId;
        }
    }

    interface UmlState extends States {
        default EntityState createEntity(final String name) {
            final StringBuilder builder = States.getBuilder(getId());
            builder.append(String.format("\nentity %s{\n", name));
            return this::getId;
        }
    }

    interface EntityState extends States {
        default BuildState addColumn() {
            final StringBuilder builder = States.getBuilder(getId());
            builder.append(String.format("colDef %s{\n", "col"));
            return this::getId;
        }
    }

    interface BuildState extends States {
        default String build() {
            return States.getBuilder(getId()).toString();
        }
    }

}

abstract class PlantumlEntityDiagramBuilder implements States.NewState {
    private static int initId = 0;

    private PlantumlEntityDiagramBuilder() {
    }

    public static NewState builder() {
        // return cur value, then ++
        final int id = initId++;
        // derefered via local var is important!
        return () -> id;
    }
}

