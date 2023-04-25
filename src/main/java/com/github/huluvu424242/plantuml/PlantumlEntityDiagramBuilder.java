package com.github.huluvu424242.plantuml;

interface States {
    StringBuilder builder = new StringBuilder();

    interface NewState extends States {
        default UmlState createUmlHeader() {
            builder.append("@startuml\n");
            return new UmlState() {
            };
        }
    }

    interface UmlState extends States {
        default EntityState createEntity(final String name) {
            builder.append(String.format("\nentity %s{\n", name));
            return new EntityState() {
            };
        }
    }

    interface EntityState extends States {
        default String build() {
            return builder.toString();
        }
    }

    interface BuildState extends States {
        default String build() {
            return builder.toString();
        }
    }
}

public class PlantumlEntityDiagramBuilder implements States.NewState {

    /**
     * default constructor for build new instances
     */
    private PlantumlEntityDiagramBuilder() {
    }


    public static NewState builder() {
        return new NewState() {
        };
    }


}
