package com.zahid.BlogRestApi.Controller;

import com.zahid.BlogRestApi.model.Category;
import com.zahid.BlogRestApi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Validated
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    Validator validator;

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
    public ResponseEntity<Map<String, Object>> store(@Valid @RequestBody(required = true) Category category) throws Exception{

        Map<String, Object> response = new HashMap<String, Object>();
        try {
            Category saveCategory = categoryService.saveCategory(category);
            response.put("status", "success");
            response.put("message", "Category Saved!!!");
            response.put("data", saveCategory);

            return new ResponseEntity(response, HttpStatus.OK);

        }catch (Exception ex){
            ex.printStackTrace();
            response.put("status", "error");
            response.put("message", "Category Does Not Save Exception Appear");

            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
