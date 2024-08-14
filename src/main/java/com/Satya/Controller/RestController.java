package com.Satya.Controller;

import org.springframework.web.bind.annotation.GetMapping;





@org.springframework.web.bind.annotation.RestController
public class RestController {
    
    @GetMapping("/")
    public String hello() {
        return "Hi I am Satyabrata Dhir and I am a Software Engineer and I am working with Cognizant";
    }
}