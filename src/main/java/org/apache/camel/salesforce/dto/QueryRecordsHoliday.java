/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Holiday
 */
public class QueryRecordsHoliday extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Holiday> records;

    public List<Holiday> getRecords() {
        return records;
    }

    public void setRecords(List<Holiday> records) {
        this.records = records;
    }
}
