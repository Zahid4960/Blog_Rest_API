package com.zahid.BlogRestApi.service;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
}
