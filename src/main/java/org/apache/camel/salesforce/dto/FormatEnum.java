/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Format
 */
public enum FormatEnum {

    // Matrix
    MATRIX("Matrix"),
    // MultiBlock
    MULTIBLOCK("MultiBlock"),
    // Summary
    SUMMARY("Summary"),
    // Tabular
    TABULAR("Tabular");

    final String value;

    private FormatEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
        for (FormatEnum e : FormatEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
