/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DatacloudEntityType
 */
public enum DatacloudEntityTypeEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2"),
    // 4
    _4("4");

    final String value;

    private DatacloudEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DatacloudEntityTypeEnum fromValue(String value) {
        for (DatacloudEntityTypeEnum e : DatacloudEntityTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
