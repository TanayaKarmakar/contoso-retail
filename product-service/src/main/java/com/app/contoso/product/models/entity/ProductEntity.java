package com.app.contoso.product.models.entity;

import com.app.contoso.product.models.enums.ProductType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
@Container(containerName = "contoso-retail")
public class ProductEntity extends AbstractAttributes{
    @Id
    private String id;
    private String name;
    private String description;

    @PartitionKey
    private ProductType productType;
    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
