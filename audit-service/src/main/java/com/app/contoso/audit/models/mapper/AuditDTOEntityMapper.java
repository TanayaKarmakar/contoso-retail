package com.app.contoso.audit.models.mapper;

import com.app.contoso.audit.models.dto.AuditDTO;
import com.app.contoso.audit.models.entity.AuditEntity;
import org.mapstruct.Mapper;

/**
 * @author t0k02w6 on 23/07/21
 * @project contoso-retail
 */
@Mapper(componentModel = "Spring")
public interface AuditDTOEntityMapper {
    AuditDTO entityToDto(AuditEntity auditEntity);

    AuditEntity dtoToEntity(AuditDTO auditDTO);
}
