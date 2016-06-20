/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LockType
 */
public enum LockTypeEnum {

    // Admin
    ADMIN("Admin"),
    // Node
    NODE("Node"),
    // Owner
    OWNER("Owner"),
    // Total
    TOTAL("Total"),
    // Workitem
    WORKITEM("Workitem"),
    // none
    NONE("none");

    final String value;

    private LockTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LockTypeEnum fromValue(String value) {
        for (LockTypeEnum e : LockTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
