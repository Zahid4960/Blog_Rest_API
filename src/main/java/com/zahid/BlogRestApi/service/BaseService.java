package com.zahid.BlogRestApi.service;

import com.zahid.BlogRestApi.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseService {
    @Autowired
    public Object responder(){
        Map<String, Object> response = new HashMap<String, Object>();

        String data = "Zahid";

        if(data.isEmpty()){
            response.put("status", "success");
            response.put("message", "No Data Found!!!");
            response.put("data", data);

            return new ResponseEntity(response, HttpStatus.OK);
        }else{
            response.put("status", "success");
            response.put("message", "Data Found!!!");
            response.put("data", data);

            return new ResponseEntity(response, HttpStatus.OK);
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
