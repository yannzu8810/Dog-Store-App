package com.example.DogStoreApp.controller;

import com.example.DogStoreApp.entity.ProductEntity;
import com.example.DogStoreApp.service.ProductService;
import io.micrometer.common.lang.Nullable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ProductControllerクラス
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger("ProductController");

    /**
     * showProductsListメソッド
     * /listにアクセスすると/product/list.htmlに遷移する
     */
    @GetMapping("/list")
    public String showProductsList(Model model){
        logger.info("showProductsList");
        List<ProductEntity> productList = productService.getProductList();
        model.addAttribute("productList" , productList);
        System.out.println(productList);
        return "/product/list";
    }

    @GetMapping("/detail")
    public String showProductDetail(@RequestParam("id") @Nullable Integer id , Model model) {
        ProductEntity productEntity = productService.getProductFindById(id);
        model.addAttribute("product" , productEntity);
        return "/product/detail";
    }


}
