/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Ownership
 */
public enum OwnershipEnum {

    // Other
    OTHER("Other"),
    // Private
    PRIVATE("Private"),
    // Public
    PUBLIC("Public"),
    // Subsidiary
    SUBSIDIARY("Subsidiary");

    final String value;

    private OwnershipEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OwnershipEnum fromValue(String value) {
        for (OwnershipEnum e : OwnershipEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
