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
 * Salesforce DTO for SObject OpportunityPartner
 */
@XStreamAlias("OpportunityPartner")
public class OpportunityPartner extends AbstractSObjectBase {

    // OpportunityId
    private String OpportunityId;

    @JsonProperty("OpportunityId")
    public String getOpportunityId() {
        return this.OpportunityId;
    }

    @JsonProperty("OpportunityId")
    public void setOpportunityId(String OpportunityId) {
        this.OpportunityId = OpportunityId;
    }

    // AccountToId
    private String AccountToId;

    @JsonProperty("AccountToId")
    public String getAccountToId() {
        return this.AccountToId;
    }

    @JsonProperty("AccountToId")
    public void setAccountToId(String AccountToId) {
        this.AccountToId = AccountToId;
    }

    // Role
    @XStreamConverter(PicklistEnumConverter.class)
    private RoleEnum Role;

    @JsonProperty("Role")
    public RoleEnum getRole() {
        return this.Role;
    }

    @JsonProperty("Role")
    public void setRole(RoleEnum Role) {
        this.Role = Role;
    }

    // IsPrimary
    private Boolean IsPrimary;

    @JsonProperty("IsPrimary")
    public Boolean getIsPrimary() {
        return this.IsPrimary;
    }

    @JsonProperty("IsPrimary")
    public void setIsPrimary(Boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }

    // ReversePartnerId
    private String ReversePartnerId;

    @JsonProperty("ReversePartnerId")
    public String getReversePartnerId() {
        return this.ReversePartnerId;
    }

    @JsonProperty("ReversePartnerId")
    public void setReversePartnerId(String ReversePartnerId) {
        this.ReversePartnerId = ReversePartnerId;
    }

}
