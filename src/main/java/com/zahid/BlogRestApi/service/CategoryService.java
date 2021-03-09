package com.zahid.BlogRestApi.service;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> index(){
        return categoryRepository.findAll();
    }


    public Object store(@Valid Category category){
        return categoryRepository.save(category);
    }


    public Object show(Integer id){
        return categoryRepository.findById(id);
    }


    public Object update(Category category){
        return categoryRepository.save(category);
    }

    public void destroy(Integer id){
        categoryRepository.deleteById(id);
    }
}
