/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CustomerPriority__c
 */
public enum CustomerPriorityEnum {

    // High
    HIGH("High"),
    // Low
    LOW("Low"),
    // Medium
    MEDIUM("Medium");

    final String value;

    private CustomerPriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CustomerPriorityEnum fromValue(String value) {
        for (CustomerPriorityEnum e : CustomerPriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
