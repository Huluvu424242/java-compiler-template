package com.github.huluvu424242.plantuml;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantumlEntityDiagramBuilderTest {

    @Test
    @DisplayName("simple entity model with relation ship")
    void createSimpleModelWithRelation() {
        final String plantumlEntityDiagram = PlantumlEntityDiagramBuilder
                .builder()
                .createUmlHeader()
                .createEntity("Mitarbeiter")
                .build();
        assertEquals("""
                @startuml
                           
                entity Mitarbeiter{
                """, plantumlEntityDiagram);
    }

}