/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Gesch_ftsbereich__c
 */
public enum Gesch_ftsbereichEnum {

    // IT
    IT("IT"),
    // Landwirtschaft
    LANDWIRTSCHAFT("Landwirtschaft");

    final String value;

    private Gesch_ftsbereichEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Gesch_ftsbereichEnum fromValue(String value) {
        for (Gesch_ftsbereichEnum e : Gesch_ftsbereichEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
