/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ExecutionsAllowed
 */
public enum ExecutionsAllowedEnum {

    // Once
    ONCE("Once"),
    // OncePerUser
    ONCEPERUSER("OncePerUser"),
    // Unlimited
    UNLIMITED("Unlimited");

    final String value;

    private ExecutionsAllowedEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ExecutionsAllowedEnum fromValue(String value) {
        for (ExecutionsAllowedEnum e : ExecutionsAllowedEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
