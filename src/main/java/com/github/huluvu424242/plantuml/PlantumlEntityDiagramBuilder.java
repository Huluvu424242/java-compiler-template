package com.github.huluvu424242.plantuml;

interface States {
    StringBuilder builder = new StringBuilder();


//    static <T> T newState(Class<? extends States> clazz) {
//        try {
//            return (T) clazz.getDeclaredConstructor().newInstance();
//        } catch (Exception ex) {
//            return null;
//        }
//    }

//    static <S> S newState(Class<S> clazz) {
//        try {
//            return (S) Class.forName(clazz.getName());
//        } catch (ClassNotFoundException ex) {
//            return null;
//        }
//    }


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

public class PlantumlEntityDiagramBuilder implements States {

    public PlantumlEntityDiagramBuilder self() {
        return this;
    }


    /**
     * default constructor for build new instances
     */
    private PlantumlEntityDiagramBuilder() {
    }

//    static <T> T newState(Class<? extends States> clazz) {
//        try {
////            return (T) clazz.getDeclaredConstructor().newInstance();
//            return (T) Class.forName(clazz.getName());
//        } catch (Exception ex) {
//            return null;
//        }
//    }

    public static NewState builder() {
        return new NewState() {
        };
    }


}
