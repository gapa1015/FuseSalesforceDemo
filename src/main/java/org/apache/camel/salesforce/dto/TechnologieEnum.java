/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Technologie__c
 */
public enum TechnologieEnum {

    // OPENSOURCE
    OPENSOURCE("OPENSOURCE"),
    // ORACLE
    ORACLE("ORACLE"),
    // REDHAT
    REDHAT("REDHAT");

    final String value;

    private TechnologieEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TechnologieEnum fromValue(String value) {
        for (TechnologieEnum e : TechnologieEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
