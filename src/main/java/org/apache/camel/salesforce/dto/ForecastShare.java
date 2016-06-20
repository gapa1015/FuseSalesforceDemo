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
 * Salesforce DTO for SObject ForecastShare
 */
@XStreamAlias("ForecastShare")
public class ForecastShare extends AbstractSObjectBase {

    // UserRoleId
    private String UserRoleId;

    @JsonProperty("UserRoleId")
    public String getUserRoleId() {
        return this.UserRoleId;
    }

    @JsonProperty("UserRoleId")
    public void setUserRoleId(String UserRoleId) {
        this.UserRoleId = UserRoleId;
    }

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // AccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private AccessLevelEnum AccessLevel;

    @JsonProperty("AccessLevel")
    public AccessLevelEnum getAccessLevel() {
        return this.AccessLevel;
    }

    @JsonProperty("AccessLevel")
    public void setAccessLevel(AccessLevelEnum AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    // CanSubmit
    private Boolean CanSubmit;

    @JsonProperty("CanSubmit")
    public Boolean getCanSubmit() {
        return this.CanSubmit;
    }

    @JsonProperty("CanSubmit")
    public void setCanSubmit(Boolean CanSubmit) {
        this.CanSubmit = CanSubmit;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}
