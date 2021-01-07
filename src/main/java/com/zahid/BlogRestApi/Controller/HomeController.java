package com.zahid.BlogRestApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to my blog project which is developed by using Java, Spring & Mysql";
    }
}
