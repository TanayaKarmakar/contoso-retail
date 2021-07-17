package com.app.contoso.product.models.entity;

import java.time.ZonedDateTime;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public class AbstractAttributes {
    private String createdBy;
    private ZonedDateTime createdTs;
    private String lastUpdatedBy;
    private ZonedDateTime lastUpdatedTs;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ZonedDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(ZonedDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public ZonedDateTime getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    public void setLastUpdatedTs(ZonedDateTime lastUpdatedTs) {
        this.lastUpdatedTs = lastUpdatedTs;
    }
}
