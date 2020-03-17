package com.example.Shoejai.controller;

import com.example.Shoejai.model.User;
import com.example.Shoejai.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UsersController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity createUser(@Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    //Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<?> readAtIdUser(@PathVariable String id){
        Optional<User> user = userService.getbyId(id);
        if(!user.isPresent()){
            return  ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(user);
    }
}
