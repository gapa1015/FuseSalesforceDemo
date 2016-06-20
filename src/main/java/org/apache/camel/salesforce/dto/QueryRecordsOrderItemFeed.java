/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jun 17 11:02:28 CEST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type OrderItemFeed
 */
public class QueryRecordsOrderItemFeed extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<OrderItemFeed> records;

    public List<OrderItemFeed> getRecords() {
        return records;
    }

    public void setRecords(List<OrderItemFeed> records) {
        this.records = records;
    }
}
