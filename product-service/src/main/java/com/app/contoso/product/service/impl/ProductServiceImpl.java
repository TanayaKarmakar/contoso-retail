package com.app.contoso.product.service.impl;

import com.app.contoso.product.models.dto.ProductDTO;
import com.app.contoso.product.models.entity.ProductEntity;
import com.app.contoso.product.models.enums.ProductType;
import com.app.contoso.product.models.mapper.ProductDTOEntityMapper;
import com.app.contoso.product.repository.ProductCosmosRepository;
import com.app.contoso.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
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
        productDTO.setCreatedTs(ZonedDateTime.now());
        return saveProduct(productDTO);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        ProductEntity productEntity = productRepository.fetchProductByIdAndType(productDTO.getId().toString(), productDTO.getProductType()).get(0);
        productDTO.setCreatedTs(ZonedDateTime.parse(productEntity.getCreatedTs()));
        return saveProduct(productDTO);
    }

    @Override
    public void deleteProduct(String productId, ProductType productType) {
        ProductEntity productEntity = productRepository.fetchProductByIdAndType(productId, productType).get(0);
        productRepository.delete(productEntity);
    }

    private ProductDTO saveProduct(ProductDTO productDTO) {
        ProductEntity productEntity = productDTOEntityMapper.dtoToEntity(productDTO);
        ProductEntity updatedProductEntity = productRepository.save(productEntity);
        return productDTOEntityMapper.entityToDTO(updatedProductEntity);
    }
}
