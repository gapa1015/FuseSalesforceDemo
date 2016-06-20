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
 * Salesforce DTO for SObject DatacloudContact
 */
@XStreamAlias("DatacloudContact")
public class DatacloudContact extends AbstractSObjectBase {

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // CompanyId
    private String CompanyId;

    @JsonProperty("CompanyId")
    public String getCompanyId() {
        return this.CompanyId;
    }

    @JsonProperty("CompanyId")
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // CompanyName
    private String CompanyName;

    @JsonProperty("CompanyName")
    public String getCompanyName() {
        return this.CompanyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // IsInactive
    private Boolean IsInactive;

    @JsonProperty("IsInactive")
    public Boolean getIsInactive() {
        return this.IsInactive;
    }

    @JsonProperty("IsInactive")
    public void setIsInactive(Boolean IsInactive) {
        this.IsInactive = IsInactive;
    }

    // FirstName
    private String FirstName;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return this.FirstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    // LastName
    private String LastName;

    @JsonProperty("LastName")
    public String getLastName() {
        return this.LastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Email
    private String Email;

    @JsonProperty("Email")
    public String getEmail() {
        return this.Email;
    }

    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Street
    private String Street;

    @JsonProperty("Street")
    public String getStreet() {
        return this.Street;
    }

    @JsonProperty("Street")
    public void setStreet(String Street) {
        this.Street = Street;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Zip
    private String Zip;

    @JsonProperty("Zip")
    public String getZip() {
        return this.Zip;
    }

    @JsonProperty("Zip")
    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    // Department
    @XStreamConverter(PicklistEnumConverter.class)
    private DepartmentEnum Department;

    @JsonProperty("Department")
    public DepartmentEnum getDepartment() {
        return this.Department;
    }

    @JsonProperty("Department")
    public void setDepartment(DepartmentEnum Department) {
        this.Department = Department;
    }

    // Level
    @XStreamConverter(PicklistEnumConverter.class)
    private LevelEnum Level;

    @JsonProperty("Level")
    public LevelEnum getLevel() {
        return this.Level;
    }

    @JsonProperty("Level")
    public void setLevel(LevelEnum Level) {
        this.Level = Level;
    }

    // IsOwned
    private Boolean IsOwned;

    @JsonProperty("IsOwned")
    public Boolean getIsOwned() {
        return this.IsOwned;
    }

    @JsonProperty("IsOwned")
    public void setIsOwned(Boolean IsOwned) {
        this.IsOwned = IsOwned;
    }

    // UpdatedDate
    private org.joda.time.DateTime UpdatedDate;

    @JsonProperty("UpdatedDate")
    public org.joda.time.DateTime getUpdatedDate() {
        return this.UpdatedDate;
    }

    @JsonProperty("UpdatedDate")
    public void setUpdatedDate(org.joda.time.DateTime UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

}
