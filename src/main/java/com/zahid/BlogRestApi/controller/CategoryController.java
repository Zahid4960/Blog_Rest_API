package com.zahid.BlogRestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/api/categories")
    public String index(){
       return "Here you will find all the categories!!!";
    }

}
