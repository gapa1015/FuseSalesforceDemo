/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject PackageLicense
 */
@XStreamAlias("PackageLicense")
public class PackageLicense extends AbstractSObjectBase {

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // IsProvisioned
    private Boolean IsProvisioned;

    @JsonProperty("IsProvisioned")
    public Boolean getIsProvisioned() {
        return this.IsProvisioned;
    }

    @JsonProperty("IsProvisioned")
    public void setIsProvisioned(Boolean IsProvisioned) {
        this.IsProvisioned = IsProvisioned;
    }

    // AllowedLicenses
    private Integer AllowedLicenses;

    @JsonProperty("AllowedLicenses")
    public Integer getAllowedLicenses() {
        return this.AllowedLicenses;
    }

    @JsonProperty("AllowedLicenses")
    public void setAllowedLicenses(Integer AllowedLicenses) {
        this.AllowedLicenses = AllowedLicenses;
    }

    // UsedLicenses
    private Integer UsedLicenses;

    @JsonProperty("UsedLicenses")
    public Integer getUsedLicenses() {
        return this.UsedLicenses;
    }

    @JsonProperty("UsedLicenses")
    public void setUsedLicenses(Integer UsedLicenses) {
        this.UsedLicenses = UsedLicenses;
    }

    // ExpirationDate
    private org.joda.time.DateTime ExpirationDate;

    @JsonProperty("ExpirationDate")
    public org.joda.time.DateTime getExpirationDate() {
        return this.ExpirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(org.joda.time.DateTime ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

}
