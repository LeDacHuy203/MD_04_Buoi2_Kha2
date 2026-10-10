package com.ecommerce.product.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @Column(name = "sku", nullable = false, unique = true, length = 50)
    private String sku; // Thông tin nội bộ: Mã kho

    @Column(name = "import_price", nullable = false, precision = 12, scale = 2)
    private BigDecimal importPrice; // DỮ LIỆU TỐI MẬT: Giá nhập hàng

    @Column(name = "sell_price", nullable = false, precision = 12, scale = 2)
    private BigDecimal sellPrice; // Thông tin công khai: Giá bán niêm yết

    @Column(name = "stock_quantity", nullable = false)
    private Integer stockQuantity; // Thông tin nội bộ: Số lượng tồn kho
}
