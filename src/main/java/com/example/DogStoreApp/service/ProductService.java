package com.example.DogStoreApp.service;

import com.example.DogStoreApp.entity.ProductEntity;
import com.example.DogStoreApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductEntity> getProductList() {
        return productRepository.findAll();
    }
}
