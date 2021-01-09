package com.zahid.BlogRestApi.Controller;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/v1/category")
    public List<Category> index(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/v1/category")
    public Category store(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping("/api/v1/category/{id}")
    public Category show(@PathVariable Integer id){
        return categoryService.findById(id);
    }
}
