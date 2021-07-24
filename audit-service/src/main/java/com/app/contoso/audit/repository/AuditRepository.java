package com.app.contoso.audit.repository;

import com.app.contoso.audit.models.entity.AuditEntity;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

/**
 * @author t0k02w6 on 23/07/21
 * @project contoso-retail
 */
public interface AuditRepository extends CosmosRepository<AuditEntity, String> {
}
