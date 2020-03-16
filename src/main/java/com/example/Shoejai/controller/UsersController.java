package com.example.Shoejai.controller;

import com.example.Shoejai.model.User;
import com.example.Shoejai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class UsersController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity createUser(@Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
//    @GetMapping("/users")
//    public List<User> post(){
//        return null;
//    }
}
