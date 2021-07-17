package com.app.contoso.product.models.dto;

import com.app.contoso.product.models.enums.ProductType;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public class ProductDTO {
    private UUID id;
    private String name;
    private String description;
    private ProductType productType;
    private BigDecimal price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
