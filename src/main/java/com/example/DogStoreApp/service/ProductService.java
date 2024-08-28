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

    /**
     * getProductListメソッド
     * 全ての商品情報をリストで取ってくる
     */
    public List<ProductEntity> getProductList() {
        return productRepository.findAll();
    }

    /**
     * getProductFindByIdメソッド
     * 指定されたidの商品情報を取ってくる
     */
    public ProductEntity getProductFindById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
