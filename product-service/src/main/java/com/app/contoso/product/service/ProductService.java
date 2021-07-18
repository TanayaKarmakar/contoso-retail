package com.app.contoso.product.service;

import com.app.contoso.product.models.dto.ProductDTO;
import com.app.contoso.product.models.enums.ProductType;

import java.util.List;
import java.util.UUID;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
public interface ProductService {
    List<ProductDTO> getProductsByType(ProductType productType);

    ProductDTO getProductByIdAndType(ProductType productType, String id);

    ProductDTO addProduct(ProductDTO productDTO);

    ProductDTO updateProduct(ProductDTO productDTO);

    void deleteProduct(String productId, ProductType productType);
}
