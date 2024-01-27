package com.example.userservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRequest {

    private String username;
    private String password;
    private String role; // "ROLE_ADMIN" or "ROLE_STUDENT"

    // Constructors, getters, setters, etc.

    // Constructors, getters, setters, etc.
}
