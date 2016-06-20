/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist State
 */
public enum StateEnum {

    // Analyzed
    ANALYZED("Analyzed"),
    // Analyzing
    ANALYZING("Analyzing"),
    // Collected
    COLLECTED("Collected"),
    // Collecting
    COLLECTING("Collecting"),
    // Committing
    COMMITTING("Committing"),
    // Completed
    COMPLETED("Completed"),
    // Failed
    FAILED("Failed"),
    // Manually Completed
    MANUALLY_COMPLETED("Manually Completed"),
    // New
    NEW("New"),
    // Requested
    REQUESTED("Requested"),
    // Retried
    RETRIED("Retried");

    final String value;

    private StateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
        for (StateEnum e : StateEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}