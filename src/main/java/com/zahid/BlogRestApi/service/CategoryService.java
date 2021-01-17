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

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category saveCategory(@Valid Category category){
        return categoryRepository.save(category);
    }

    public Object findById(Integer id){
        return categoryRepository.findById(id);
    }
//
//    public Object deleteById(Integer id){
//
//        Optional<Category> check_category_exists_or_not = categoryRepository.findById(id);
//
//        if(check_category_exists_or_not.isEmpty()){
//            return "Category does not found!!";
//        }else {
//            categoryRepository.deleteById(id);
//            return "Category deleted successfully!!!";
//        }
//    }
}
