/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject FlowInterview
 */
@XStreamAlias("FlowInterview")
public class FlowInterview extends AbstractSObjectBase {

    // CurrentElement
    private String CurrentElement;

    @JsonProperty("CurrentElement")
    public String getCurrentElement() {
        return this.CurrentElement;
    }

    @JsonProperty("CurrentElement")
    public void setCurrentElement(String CurrentElement) {
        this.CurrentElement = CurrentElement;
    }

    // InterviewLabel
    private String InterviewLabel;

    @JsonProperty("InterviewLabel")
    public String getInterviewLabel() {
        return this.InterviewLabel;
    }

    @JsonProperty("InterviewLabel")
    public void setInterviewLabel(String InterviewLabel) {
        this.InterviewLabel = InterviewLabel;
    }

    // PauseLabel
    private String PauseLabel;

    @JsonProperty("PauseLabel")
    public String getPauseLabel() {
        return this.PauseLabel;
    }

    @JsonProperty("PauseLabel")
    public void setPauseLabel(String PauseLabel) {
        this.PauseLabel = PauseLabel;
    }

}