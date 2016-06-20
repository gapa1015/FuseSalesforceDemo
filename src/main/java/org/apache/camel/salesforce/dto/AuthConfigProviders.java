/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject AuthConfigProviders
 */
@XStreamAlias("AuthConfigProviders")
public class AuthConfigProviders extends AbstractSObjectBase {

    // AuthConfigId
    private String AuthConfigId;

    @JsonProperty("AuthConfigId")
    public String getAuthConfigId() {
        return this.AuthConfigId;
    }

    @JsonProperty("AuthConfigId")
    public void setAuthConfigId(String AuthConfigId) {
        this.AuthConfigId = AuthConfigId;
    }

    // AuthProviderId
    private String AuthProviderId;

    @JsonProperty("AuthProviderId")
    public String getAuthProviderId() {
        return this.AuthProviderId;
    }

    @JsonProperty("AuthProviderId")
    public void setAuthProviderId(String AuthProviderId) {
        this.AuthProviderId = AuthProviderId;
    }

}
