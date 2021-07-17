package com.app.contoso.product.repository;

import com.app.contoso.product.models.entity.ProductEntity;
import com.app.contoso.product.models.enums.ProductType;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.UUID;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public interface ProductCosmosRepository extends CosmosRepository<ProductEntity, String> {
    @Query("select * from c where c.productType = @productType")
    List<ProductEntity> fetchProductsByType(ProductType productType);

    @Query("select * from c where c.id = @id and c.productType = @productType")
    List<ProductEntity> fetchProductByIdAndType(String id, ProductType productType);
}
