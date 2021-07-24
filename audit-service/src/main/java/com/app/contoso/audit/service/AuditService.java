package com.app.contoso.audit.service;

import com.app.contoso.audit.models.dto.AuditDTO;

/**
 * @author t0k02w6 on 23/07/21
 * @project contoso-retail
 */
public interface AuditService {
    AuditDTO saveAudit(AuditDTO auditDTO);
}
