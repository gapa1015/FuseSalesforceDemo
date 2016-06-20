/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Level
 */
public enum LevelEnum {

    // C-Level
    C_LEVEL("C-Level"),
    // Director
    DIRECTOR("Director"),
    // Manager
    MANAGER("Manager"),
    // Other
    OTHER("Other"),
    // Staff
    STAFF("Staff"),
    // VP
    VP("VP");

    final String value;

    private LevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LevelEnum fromValue(String value) {
        for (LevelEnum e : LevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
