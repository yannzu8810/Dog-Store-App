package com.example.DogStoreApp.controller;

import com.example.DogStoreApp.service.HomeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.LogManager;
import java.util.logging.Logger;


/**
 * HomeControllerクラス
 * ホーム画面を表示する
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeService homeService;

    org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger("HomeController");

    /**
     * showHomePageメソッド
     *
     * @param model モデルオブジェクト
     * @return view
     */
    @GetMapping("")
    public String showHomePage(Model model){
        logger.info("showHomePage");
        return "home";
    }

}
