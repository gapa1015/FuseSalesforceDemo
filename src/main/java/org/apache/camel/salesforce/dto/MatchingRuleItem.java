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
 * Salesforce DTO for SObject MatchingRuleItem
 */
@XStreamAlias("MatchingRuleItem")
public class MatchingRuleItem extends AbstractSObjectBase {

    // MatchingRuleId
    private String MatchingRuleId;

    @JsonProperty("MatchingRuleId")
    public String getMatchingRuleId() {
        return this.MatchingRuleId;
    }

    @JsonProperty("MatchingRuleId")
    public void setMatchingRuleId(String MatchingRuleId) {
        this.MatchingRuleId = MatchingRuleId;
    }

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private FieldEnum Field;

    @JsonProperty("Field")
    public FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(FieldEnum Field) {
        this.Field = Field;
    }

    // MatchingMethod
    @XStreamConverter(PicklistEnumConverter.class)
    private MatchingMethodEnum MatchingMethod;

    @JsonProperty("MatchingMethod")
    public MatchingMethodEnum getMatchingMethod() {
        return this.MatchingMethod;
    }

    @JsonProperty("MatchingMethod")
    public void setMatchingMethod(MatchingMethodEnum MatchingMethod) {
        this.MatchingMethod = MatchingMethod;
    }

    // BlankValueBehavior
    @XStreamConverter(PicklistEnumConverter.class)
    private BlankValueBehaviorEnum BlankValueBehavior;

    @JsonProperty("BlankValueBehavior")
    public BlankValueBehaviorEnum getBlankValueBehavior() {
        return this.BlankValueBehavior;
    }

    @JsonProperty("BlankValueBehavior")
    public void setBlankValueBehavior(BlankValueBehaviorEnum BlankValueBehavior) {
        this.BlankValueBehavior = BlankValueBehavior;
    }

}
