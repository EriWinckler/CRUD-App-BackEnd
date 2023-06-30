package com.project.crud.controllers;

import com.project.crud.models.User;
import com.project.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp (@RequestBody User user) {
        //Validate and save user to the database
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }
}
