package com.socialbot.controller;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.socialbot.model.User;
import com.socialbot.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api")  
public class AuthUserController {

    private final UserRepository userRepository;

    public AuthUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 1. POST /login → return "Login successful"
    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("Login successful");
    }

    // 2. POST /logout → return "Logout successful"
    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("Logout successful");
    }

    // 3. POST /users → Create a new user
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // 4. GET /users → Fetch all users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }
}
