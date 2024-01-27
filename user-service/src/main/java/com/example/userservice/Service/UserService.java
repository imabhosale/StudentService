package com.example.userservice.Service;

import com.example.userservice.Entity.User;
import com.example.userservice.Entity.UserRegistrationRequest;
import com.example.userservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public ResponseEntity<String> ValidateLogin(UserRegistrationRequest request) {

        // Validate the request and perform user registration logic
        if (request.getUsername() == null || request.getPassword() == null || request.getRole() == null) {
            return ResponseEntity.badRequest().body("Invalid registration request");
        }

/// Check if the username is already taken
        Optional<User> existingUser = findByUsername(request.getUsername());
        if (existingUser.isPresent()) {
            return ResponseEntity.badRequest().body("Username is already taken");
        }

        // Create a new user
        User newUser = new User();
        newUser.setUsername(request.getUsername());
        newUser.setPassword(request.getPassword()); // Encode the password
        newUser.setRole(request.getRole());

        // Save the user in the database
        userRepository.save(newUser);
        return ResponseEntity.ok("User registered successfully");
    }


    // Other service methods as needed
}
