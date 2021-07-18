package com.app.contoso.product.models.entity;

import java.time.ZonedDateTime;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public class AbstractAttributes {
    private String createdBy;
    private String createdTs;
    private String lastUpdatedBy;
    private String lastUpdatedTs;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    public String getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    public void setLastUpdatedTs(String lastUpdatedTs) {
        this.lastUpdatedTs = lastUpdatedTs;
    }
}
