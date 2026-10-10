package com.ecommerce.product.mapper;

import com.ecommerce.product.dto.response.ProductResponseDTO;
import com.ecommerce.product.entity.ProductEntity;

public class ProductMapper {

    /**
     * Map từ ProductEntity sang ProductResponseDTO
     * Loại bỏ toàn bộ trường nhạy cảm (sku, importPrice, stockQuantity)
     * Chỉ giữ lại: id, name, sellPrice
     */
    public static ProductResponseDTO toResponseDTO(ProductEntity entity) {
        if (entity == null) {
            return null;
        }

        return ProductResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .sellPrice(entity.getSellPrice())
                .build();
    }
}
