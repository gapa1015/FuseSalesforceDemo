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
 * Salesforce DTO for SObject ProcessDefinition
 */
@XStreamAlias("ProcessDefinition")
public class ProcessDefinition extends AbstractSObjectBase {

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // TableEnumOrId
    @XStreamConverter(PicklistEnumConverter.class)
    private TableEnumOrIdEnum TableEnumOrId;

    @JsonProperty("TableEnumOrId")
    public TableEnumOrIdEnum getTableEnumOrId() {
        return this.TableEnumOrId;
    }

    @JsonProperty("TableEnumOrId")
    public void setTableEnumOrId(TableEnumOrIdEnum TableEnumOrId) {
        this.TableEnumOrId = TableEnumOrId;
    }

    // LockType
    @XStreamConverter(PicklistEnumConverter.class)
    private LockTypeEnum LockType;

    @JsonProperty("LockType")
    public LockTypeEnum getLockType() {
        return this.LockType;
    }

    @JsonProperty("LockType")
    public void setLockType(LockTypeEnum LockType) {
        this.LockType = LockType;
    }

    // State
    @XStreamConverter(PicklistEnumConverter.class)
    private StateEnum State;

    @JsonProperty("State")
    public StateEnum getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(StateEnum State) {
        this.State = State;
    }

}
