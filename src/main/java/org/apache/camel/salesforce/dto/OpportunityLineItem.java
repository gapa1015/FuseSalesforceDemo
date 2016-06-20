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
 * Salesforce DTO for SObject OpportunityLineItem
 */
@XStreamAlias("OpportunityLineItem")
public class OpportunityLineItem extends AbstractSObjectBase {

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

    // PricebookEntryId
    private String PricebookEntryId;

    @JsonProperty("PricebookEntryId")
    public String getPricebookEntryId() {
        return this.PricebookEntryId;
    }

    @JsonProperty("PricebookEntryId")
    public void setPricebookEntryId(String PricebookEntryId) {
        this.PricebookEntryId = PricebookEntryId;
    }

    // Product2Id
    private String Product2Id;

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return this.Product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String Product2Id) {
        this.Product2Id = Product2Id;
    }

    // ProductCode
    private String ProductCode;

    @JsonProperty("ProductCode")
    public String getProductCode() {
        return this.ProductCode;
    }

    @JsonProperty("ProductCode")
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    // Quantity
    private Double Quantity;

    @JsonProperty("Quantity")
    public Double getQuantity() {
        return this.Quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Double Quantity) {
        this.Quantity = Quantity;
    }

    // TotalPrice
    private Double TotalPrice;

    @JsonProperty("TotalPrice")
    public Double getTotalPrice() {
        return this.TotalPrice;
    }

    @JsonProperty("TotalPrice")
    public void setTotalPrice(Double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    // UnitPrice
    private Double UnitPrice;

    @JsonProperty("UnitPrice")
    public Double getUnitPrice() {
        return this.UnitPrice;
    }

    @JsonProperty("UnitPrice")
    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    // ListPrice
    private Double ListPrice;

    @JsonProperty("ListPrice")
    public Double getListPrice() {
        return this.ListPrice;
    }

    @JsonProperty("ListPrice")
    public void setListPrice(Double ListPrice) {
        this.ListPrice = ListPrice;
    }

    // ServiceDate
    private org.joda.time.DateTime ServiceDate;

    @JsonProperty("ServiceDate")
    public org.joda.time.DateTime getServiceDate() {
        return this.ServiceDate;
    }

    @JsonProperty("ServiceDate")
    public void setServiceDate(org.joda.time.DateTime ServiceDate) {
        this.ServiceDate = ServiceDate;
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

    // Einsatzbeginn__c
    private org.joda.time.DateTime Einsatzbeginn__c;

    @JsonProperty("Einsatzbeginn__c")
    public org.joda.time.DateTime getEinsatzbeginn__c() {
        return this.Einsatzbeginn__c;
    }

    @JsonProperty("Einsatzbeginn__c")
    public void setEinsatzbeginn__c(org.joda.time.DateTime Einsatzbeginn__c) {
        this.Einsatzbeginn__c = Einsatzbeginn__c;
    }

    // Einsatzende__c
    private org.joda.time.DateTime Einsatzende__c;

    @JsonProperty("Einsatzende__c")
    public org.joda.time.DateTime getEinsatzende__c() {
        return this.Einsatzende__c;
    }

    @JsonProperty("Einsatzende__c")
    public void setEinsatzende__c(org.joda.time.DateTime Einsatzende__c) {
        this.Einsatzende__c = Einsatzende__c;
    }

    // Mitarbeiter__c
    @XStreamConverter(PicklistEnumConverter.class)
    private MitarbeiterEnum Mitarbeiter__c;

    @JsonProperty("Mitarbeiter__c")
    public MitarbeiterEnum getMitarbeiter__c() {
        return this.Mitarbeiter__c;
    }

    @JsonProperty("Mitarbeiter__c")
    public void setMitarbeiter__c(MitarbeiterEnum Mitarbeiter__c) {
        this.Mitarbeiter__c = Mitarbeiter__c;
    }

    // Verf_gbarkeit__c
    @XStreamConverter(PicklistEnumConverter.class)
    private Verf_gbarkeitEnum Verf_gbarkeit__c;

    @JsonProperty("Verf_gbarkeit__c")
    public Verf_gbarkeitEnum getVerf_gbarkeit__c() {
        return this.Verf_gbarkeit__c;
    }

    @JsonProperty("Verf_gbarkeit__c")
    public void setVerf_gbarkeit__c(Verf_gbarkeitEnum Verf_gbarkeit__c) {
        this.Verf_gbarkeit__c = Verf_gbarkeit__c;
    }

    // Tagespreis__c
    private Double Tagespreis__c;

    @JsonProperty("Tagespreis__c")
    public Double getTagespreis__c() {
        return this.Tagespreis__c;
    }

    @JsonProperty("Tagespreis__c")
    public void setTagespreis__c(Double Tagespreis__c) {
        this.Tagespreis__c = Tagespreis__c;
    }

}