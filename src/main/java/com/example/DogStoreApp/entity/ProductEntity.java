package com.example.DogStoreApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductEntity {

    @Id
    private Integer productId;

    private String productName;

    private String productDescription;

    private Integer productPrice;
}
