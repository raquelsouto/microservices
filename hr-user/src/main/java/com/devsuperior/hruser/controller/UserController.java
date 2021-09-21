package com.devsuperior.hruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> indById(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        return ResponseEntity.ok(user);
    }
    
    @GetMapping(value = "/search")
    public ResponseEntity<User> indById(@RequestParam String email) {
        User user = userRepository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
