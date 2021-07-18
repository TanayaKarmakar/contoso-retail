package com.app.contoso.product.models.mapper;

import com.app.contoso.product.models.constants.ContosoRetailConstants;
import com.app.contoso.product.models.dto.ProductDTO;
import com.app.contoso.product.models.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
@Mapper(componentModel = "spring")
public interface ProductDTOEntityMapper {
    @Named("formatDateTimeToString")
    default String formatDateTimeToString(ZonedDateTime zonedDateTime) {
        ZonedDateTime currentTime = ZonedDateTime.now();
        return DateTimeFormatter.ISO_DATE_TIME.format(currentTime);
    }

    @Named("formatStringToZonedDateTime")
    default ZonedDateTime formatStringToZonedDatetime(String dateString) {
        return StringUtils.isEmpty(dateString)? null: ZonedDateTime.parse(dateString);
    }

    @Mappings({
            @Mapping(target = "id", expression = "java(java.util.UUID.fromString(productEntity.getId()))"),
            @Mapping(source = "createdTs", target = "createdTs", qualifiedByName = "formatStringToZonedDateTime"),
            @Mapping(source = "lastUpdatedTs", target = "lastUpdatedTs", qualifiedByName = "formatStringToZonedDateTime")
    })
    ProductDTO entityToDTO(ProductEntity productEntity);

    @Mappings({
            @Mapping(target = "id", expression = "java(productDTO.getId().toString())"),
            @Mapping(source = "createdBy", target = "createdBy", defaultValue = ContosoRetailConstants.USER),
            @Mapping(source = "lastUpdatedBy", target = "lastUpdatedBy", defaultValue = ContosoRetailConstants.USER),
            @Mapping(source = "lastUpdatedTs", target = "lastUpdatedTs", qualifiedByName = "formatDateTimeToString")
    })
    ProductEntity dtoToEntity(ProductDTO productDTO);
}
