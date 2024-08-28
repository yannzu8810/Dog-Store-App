package com.example.DogStoreApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Product")
@Data
public class ProductEntity {

    //商品ID
    @Id
    @Column(name = "product_id")
    private Integer productId;

    //商品名
    @Column(name = "product_name")
    private String productName;

    //商品価格
    @Column(name = "product_price")
    private Integer productPrice;

    //商品説明
    @Column(name = "product_description")
    private String productDescription;
}
