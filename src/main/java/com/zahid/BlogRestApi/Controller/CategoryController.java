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
    private CategoryService categoryService;
    Validator validator;


    @GetMapping("/api/v1/category")
    public ResponseEntity<Map<String, Object>> index(){
        Map<String, Object> response = new HashMap<String, Object>();
        try {
            List<Category> lists = categoryService.index();
            if(lists.isEmpty()){
                response.put("status", "success");
                response.put("message", "Category data not found!!!");
                response.put("data", null);
                return new ResponseEntity(response, HttpStatus.OK);
            }else{
                response.put("status", "success");
                response.put("message", "Category data found!!!");
                response.put("data", lists);
                return new ResponseEntity(response, HttpStatus.OK);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            response.put("status", "error");
            response.put("message", "Exception appear!!!");
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/api/v1/category")
    public ResponseEntity<Map<String, Object>> store(@Valid @RequestBody(required = true) Category category) throws Exception{
        Map<String, Object> response = new HashMap<String, Object>();
        try {
            Object data = categoryService.store(category);
            response.put("status", "success");
            response.put("message", "Category saved successfully!!!");
            response.put("data", data);
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            response.put("status", "error");
            response.put("message", "Category failed to save exception appear!!!");
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/api/v1/category/{id}")
    public ResponseEntity<Map<String, Object>> show(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();
        try{
            Object data = categoryService.show(id);
            response.put("status", "success");
            response.put("message", "Category found!!!");
            response.put("data", data);
            return new ResponseEntity(response, HttpStatus.OK);
        }catch(Exception ex){
            response.put("status", "error");
            response.put("message", "Category not found exception appear!!!");
            return new ResponseEntity(response, HttpStatus.OK);
        }
    }


    @PutMapping("/api/v1/category/{id}")
    public ResponseEntity<Map<String, Object>> update(Category category){
        Map<String, Object> response = new HashMap<String, Object>();
        try{
           Object data =  categoryService.update(category);
           response.put("status", "success");
           response.put("message", "Category updated successfully!!!");
           response.put("data", data);
           return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception ex){
            response.put("status", "error");
            response.put("message", "Category failed update exception appear!!!");
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/api/v1/category/{id}")
    public ResponseEntity<Map<String, Object>> destroy(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<String, Object>();
        try {
            categoryService.destroy(id);
            response.put("status", "success");
            response.put("message", "Category deleted successfully!!!");
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception ex){
            response.put("status", "error");
            response.put("message", "Category failed to delete exception appears");
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


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
