/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Reason
 */
public enum ReasonEnum {

    // Breakdown
    BREAKDOWN("Breakdown"),
    // Equipment Complexity
    EQUIPMENT_COMPLEXITY("Equipment Complexity"),
    // Equipment Design
    EQUIPMENT_DESIGN("Equipment Design"),
    // Feedback
    FEEDBACK("Feedback"),
    // Installation
    INSTALLATION("Installation"),
    // Other
    OTHER("Other"),
    // Performance
    PERFORMANCE("Performance");

    final String value;

    private ReasonEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ReasonEnum fromValue(String value) {
        for (ReasonEnum e : ReasonEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
