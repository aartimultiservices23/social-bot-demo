package com.socialbot.controller;

import java.util.HashMap; 
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialbot.model.User;
import com.socialbot.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	  private final UserRepository userRepository;

	    public UserController(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }
	    
	    
	  @PostMapping("/users")
	    public ResponseEntity<User> createUser(@RequestBody User user) {
	        User savedUser = userRepository.save(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }

	    @GetMapping("/users")
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = userRepository.findAll();
	        return ResponseEntity.ok(users);
	    }
	    
	   
	    @GetMapping("users/{id}")
	    public ResponseEntity<Map<String, Object>> getUserById(@PathVariable Long id) {
	        Map<String, Object> response = new HashMap<>();

	        Optional<User> user = userRepository.findById(id);

	            System.out.println(" User found: " + user.get().getName());
	            response.put("data", user.get());
	            return ResponseEntity.ok(response);   

	    }

	    @DeleteMapping("users/{id}")
	    public Map<String, Object> deleteUser(@PathVariable Long id) {
	        Map<String, Object> response = new HashMap<>();

	        System.out.println("Deleting user with ID: " + id);

	        userRepository.deleteById(id);

	        response.put("message", "User deleted successfully");
	        return response;
	    }

	    
	    

	    
	    
	    
	    
}
