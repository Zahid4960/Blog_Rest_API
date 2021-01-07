package com.zahid.BlogRestApi.Controller;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;



//@RestController
@Controller
public class CategoryController {
//    @Qualifier("CategoryService")
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/v1/category")
    public List<Category> index(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/v1/category")
    public Category store(Category category){
        return categoryService.saveCategory(category);
    }
}
