package com.app.contoso.audit.models.dto;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public class AuditDTO {
    private String id;
    private String entityId;
    private String entityDetail;
    private String createdBy;
    private ZonedDateTime createdTs;
    private String updatedBy;
    private ZonedDateTime lastUpdatedTs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityDetail() {
        return entityDetail;
    }

    public void setEntityDetail(String entityDetail) {
        this.entityDetail = entityDetail;
    }

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

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public ZonedDateTime getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    public void setLastUpdatedTs(ZonedDateTime lastUpdatedTs) {
        this.lastUpdatedTs = lastUpdatedTs;
    }
}
