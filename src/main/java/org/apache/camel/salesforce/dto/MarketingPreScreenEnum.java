/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MarketingPreScreen
 */
public enum MarketingPreScreenEnum {

    // H
    H("H"),
    // L
    L("L"),
    // M
    M("M");

    final String value;

    private MarketingPreScreenEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MarketingPreScreenEnum fromValue(String value) {
        for (MarketingPreScreenEnum e : MarketingPreScreenEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
