package com.zahid.BlogRestApi.service;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category findById(Integer id){
        return categoryRepository.findById(id).get();
    }
}
