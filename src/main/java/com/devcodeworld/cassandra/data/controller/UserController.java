package com.devcodeworld.cassandra.data.controller;

import com.devcodeworld.cassandra.data.model.User;
import com.devcodeworld.cassandra.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")

    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> all = userRepository.findAll();
        return ResponseEntity.ok(all);
    }
}
