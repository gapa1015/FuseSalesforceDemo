/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PeriodPrefix
 */
public enum PeriodPrefixEnum {

    // FP
    FP("FP"),
    // Month
    MONTH("Month"),
    // P
    P("P"),
    // Period
    PERIOD("Period");

    final String value;

    private PeriodPrefixEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PeriodPrefixEnum fromValue(String value) {
        for (PeriodPrefixEnum e : PeriodPrefixEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
