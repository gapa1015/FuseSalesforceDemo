/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ListViewChartInstance
 */
public class QueryRecordsListViewChartInstance extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ListViewChartInstance> records;

    public List<ListViewChartInstance> getRecords() {
        return records;
    }

    public void setRecords(List<ListViewChartInstance> records) {
        this.records = records;
    }
}
