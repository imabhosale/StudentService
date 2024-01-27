package com.example.ApiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public  String heeoiej(){
        return  "heelo api gateway";
    }
}
