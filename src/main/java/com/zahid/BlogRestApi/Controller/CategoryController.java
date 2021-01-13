package com.zahid.BlogRestApi.Controller;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/v1/category")
    public ResponseEntity<Map<String, Object>> index(){

        List<Category> category_list = categoryService.getAllCategories();
        Map<String, Object> response = new HashMap<String, Object>();

        if(category_list.isEmpty()){
            response.put("status", "success");
            response.put("message", "No Data Found!!!");
            response.put("data", category_list);

            return new ResponseEntity(response, HttpStatus.OK);
        }else{
            response.put("status", "success");
            response.put("message", "Data Found!!!");
            response.put("data", category_list);

            return new ResponseEntity(response, HttpStatus.OK);
        }
    }

    @PostMapping("/api/v1/category")
    public Category store(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping("/api/v1/category/{id}")
    public ResponseEntity<Map<String, Object>> show(@PathVariable Integer id){

        Object category_by_id = categoryService.findById(id);
        Map<String, Object> response = new HashMap<>();

        if(category_by_id == null){
            response.put("status", "success");
            response.put("message", "No Data Found!!!");
            response.put("data", category_by_id);

            return new ResponseEntity(response, HttpStatus.OK);
        }else{
            response.put("status", "success");
            response.put("message", "Data Found!!!");
            response.put("data", category_by_id);

            return new ResponseEntity(response, HttpStatus.OK);
        }
    }

//    @DeleteMapping("/api/v1/category/{id}")
//    public Object destroy(@PathVariable Integer id){
//        return categoryService.deleteById(id);
//    }
}
