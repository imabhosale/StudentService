package com.example.userservice.Controller;

import com.example.userservice.Entity.UserRegistrationRequest;
import com.example.userservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addstudent")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest request) {
        return userService.ValidateLogin(request);
    }

    @GetMapping("/getstudent")
    public String hello() {
        return "hello kunal";
    }

    // Other user-related endpoints
}
