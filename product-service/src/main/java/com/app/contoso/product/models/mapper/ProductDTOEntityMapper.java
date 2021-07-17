package com.app.contoso.product.models.mapper;

import com.app.contoso.product.models.dto.ProductDTO;
import com.app.contoso.product.models.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
@Mapper(componentModel = "spring")
public interface ProductDTOEntityMapper {
    @Mapping(target = "id", expression = "java(java.util.UUID.fromString(productEntity.getId()))")
    ProductDTO entityToDTO(ProductEntity productEntity);

    @Mapping(target = "id", expression = "java(productDTO.getId().toString())")
    ProductEntity dtoToEntity(ProductDTO productDTO);
}
