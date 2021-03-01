package com.zahid.BlogRestApi.service;

import com.zahid.BlogRestApi.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseService {
    public Object responder(List<Category> data){
        Map<String, Object> response = new HashMap<String, Object>();

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
}
