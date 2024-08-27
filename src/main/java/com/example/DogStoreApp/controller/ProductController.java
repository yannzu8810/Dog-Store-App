package com.example.DogStoreApp.controller;

import com.example.DogStoreApp.entity.ProductEntity;
import com.example.DogStoreApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;

/**
 * ProductControllerクラス
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger("ProductController");

    @GetMapping("/list")
    public String showProductsList(Model model){
        logger.info("showProductsList");
        List<ProductEntity> productList = productService.getProductList();
        model.addAttribute("productList" , productList);
        return "/product/list";
    }
}
