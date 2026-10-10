package com.ecommerce.product.controller;

import com.ecommerce.product.dto.response.BaseResponse;
import com.ecommerce.product.dto.response.ProductResponseDTO;
import com.ecommerce.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * API Lấy chi tiết thông tin sản phẩm cho khách hàng
     * URL: GET /api/v1/products/{id}
     * Kết quả: Chỉ trả về ProductResponseDTO (id, name, sellPrice)
     * Bảo mật tuyệt đối: importPrice, sku, stockQuantity không xuất hiện trong JSON
     */
    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<ProductResponseDTO>> getProductById(@PathVariable Long id) {
        ProductResponseDTO responseDTO = productService.getProductById(id);
        return ResponseEntity.ok(BaseResponse.ok("Lấy thông tin sản phẩm thành công", responseDTO));
    }

    /**
     * API Lấy danh sách sản phẩm cho khách hàng
     * URL: GET /api/v1/products
     */
    @GetMapping
    public ResponseEntity<BaseResponse<List<ProductResponseDTO>>> getAllProducts() {
        List<ProductResponseDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(BaseResponse.ok("Lấy danh sách sản phẩm thành công", products));
    }
}
