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

//    public Object findById(Integer id){
//
//
//        JSONObject response = new JSONObject();
////        JSONObject json_obj = new JSONObject();
//        String status;
//
//        Optional<Category> check_category_exists_or_not = categoryRepository.findById(id);
//
//        if(check_category_exists_or_not.isEmpty()){
//            status = "Category does not found!!";
//            response.put("status", status);
//            return response;
//        }else {
//            status = "Category found!!";
//            response.put("status", status);
////            return categoryRepository.findById(id).get();
//            return response;
//        }
//    }
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
