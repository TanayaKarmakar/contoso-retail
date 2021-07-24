package com.app.contoso.audit.service.impl;

import com.app.contoso.audit.models.dto.AuditDTO;
import com.app.contoso.audit.models.entity.AuditEntity;
import com.app.contoso.audit.models.mapper.AuditDTOEntityMapper;
import com.app.contoso.audit.repository.AuditRepository;
import com.app.contoso.audit.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author t0k02w6 on 23/07/21
 * @project contoso-retail
 */
@Service
public class AuditServiceImpl implements AuditService {
    @Autowired
    private AuditRepository auditRepository;

    @Autowired
    private AuditDTOEntityMapper auditDTOEntityMapper;

    @Override
    public AuditDTO saveAudit(AuditDTO auditDTO) {
        auditDTO.setId(UUID.randomUUID().toString());
        AuditEntity auditEntity = auditDTOEntityMapper.dtoToEntity(auditDTO);
        AuditEntity updatedAuditEntity = auditRepository.save(auditEntity);
        return auditDTOEntityMapper.entityToDto(updatedAuditEntity);
    }
}
