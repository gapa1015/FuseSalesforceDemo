/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LanguageLocaleKey
 */
public enum LanguageLocaleKeyEnum {

    // da
    DA("da"),
    // de
    DE("de"),
    // en_US
    EN_US("en_US"),
    // es
    ES("es"),
    // es_MX
    ES_MX("es_MX"),
    // fi
    FI("fi"),
    // fr
    FR("fr"),
    // it
    IT("it"),
    // ja
    JA("ja"),
    // ko
    KO("ko"),
    // nl_NL
    NL_NL("nl_NL"),
    // no
    NO("no"),
    // pt_BR
    PT_BR("pt_BR"),
    // ru
    RU("ru"),
    // sv
    SV("sv"),
    // th
    TH("th"),
    // zh_CN
    ZH_CN("zh_CN"),
    // zh_TW
    ZH_TW("zh_TW");

    final String value;

    private LanguageLocaleKeyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LanguageLocaleKeyEnum fromValue(String value) {
        for (LanguageLocaleKeyEnum e : LanguageLocaleKeyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
