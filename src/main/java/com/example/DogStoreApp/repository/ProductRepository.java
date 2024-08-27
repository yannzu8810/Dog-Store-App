package com.example.DogStoreApp.repository;

import com.example.DogStoreApp.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity , Integer> {
}
