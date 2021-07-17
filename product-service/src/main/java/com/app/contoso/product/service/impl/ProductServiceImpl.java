package com.app.contoso.product.service.impl;

import com.app.contoso.product.models.dto.ProductDTO;
import com.app.contoso.product.models.entity.ProductEntity;
import com.app.contoso.product.models.enums.ProductType;
import com.app.contoso.product.models.mapper.ProductDTOEntityMapper;
import com.app.contoso.product.repository.ProductCosmosRepository;
import com.app.contoso.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductCosmosRepository productRepository;

    @Autowired
    private ProductDTOEntityMapper productDTOEntityMapper;

    @Override
    public List<ProductDTO> getProductsByType(ProductType productType) {
        return null;
    }

    @Override
    public ProductDTO getProductByIdAndType(ProductType productType, String id) {
        ProductEntity productEntity = productRepository.fetchProductByIdAndType(id, productType).get(0);
        return productDTOEntityMapper.entityToDTO(productEntity);
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        productDTO.setId(UUID.randomUUID());
        return saveProduct(productDTO);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
       return saveProduct(productDTO);
    }

    @Override
    public ProductDTO deleteProduct(UUID productId) {
        return null;
    }

    private ProductDTO saveProduct(ProductDTO productDTO) {
        ProductEntity productEntity = productDTOEntityMapper.dtoToEntity(productDTO);
        ProductEntity updatedProductEntity = productRepository.save(productEntity);
        return productDTOEntityMapper.entityToDTO(updatedProductEntity);
    }
}
