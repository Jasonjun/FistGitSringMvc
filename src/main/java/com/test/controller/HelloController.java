package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class HelloController {
    
 
   
    @RequestMapping("/hello")
    public ResponseEntity<Object> showMessage() {
    	String message = "Welcome to Spring MVC!";
        return new ResponseEntity<Object>(message, HttpStatus.OK);
    }
}