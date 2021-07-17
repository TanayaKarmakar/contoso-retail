package com.app.contoso.product.web;

import com.app.contoso.product.models.dto.ProductDTO;
import com.app.contoso.product.models.enums.ProductType;
import com.app.contoso.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author t0k02w6 on 17/07/21
 * @project contoso-retail
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO newProductDTO = productService.addProduct(productDTO);
        return ResponseEntity.ok(newProductDTO);
    }

    @GetMapping("/{id}/types/{type}")
    public ResponseEntity<ProductDTO> fetchProductByIdAndType(@PathVariable String id, @PathVariable ProductType type) {
        ProductDTO productDTO = productService.getProductByIdAndType(type, id);
        return ResponseEntity.ok(productDTO);
    }


}
