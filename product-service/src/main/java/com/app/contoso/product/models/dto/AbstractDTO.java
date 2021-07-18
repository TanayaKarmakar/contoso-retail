package com.app.contoso.product.models.dto;

import com.app.contoso.common.deserializers.ZonedDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.ZonedDateTime;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public class AbstractDTO {
    private String createdBy;
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    private ZonedDateTime createdTs;
    private String lastUpdatedBy;

    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
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
