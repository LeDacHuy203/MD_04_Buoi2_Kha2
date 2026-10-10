package com.ecommerce.product.service;

import com.ecommerce.product.dto.response.ProductResponseDTO;
import java.util.List;

public interface ProductService {

    /**
     * Lấy thông tin sản phẩm theo ID cho khách hàng
     * Trả về DTO chỉ chứa thông tin công khai (id, name, sellPrice)
     */
    ProductResponseDTO getProductById(Long id);

    /**
     * Lấy danh sách sản phẩm công khai
     */
    List<ProductResponseDTO> getAllProducts();
}
