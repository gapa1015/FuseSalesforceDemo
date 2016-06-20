/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist BackgroundDirection
 */
public enum BackgroundDirectionEnum {

    // Diagonal
    DIAGONAL("Diagonal"),
    // LeftToRight
    LEFTTORIGHT("LeftToRight"),
    // TopToBottom
    TOPTOBOTTOM("TopToBottom");

    final String value;

    private BackgroundDirectionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static BackgroundDirectionEnum fromValue(String value) {
        for (BackgroundDirectionEnum e : BackgroundDirectionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
