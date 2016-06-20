/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DefaultPricebookAccess
 */
public enum DefaultPricebookAccessEnum {

    // None
    NONE("None"),
    // Read
    READ("Read"),
    // ReadSelect
    READSELECT("ReadSelect");

    final String value;

    private DefaultPricebookAccessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DefaultPricebookAccessEnum fromValue(String value) {
        for (DefaultPricebookAccessEnum e : DefaultPricebookAccessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
