package com.fitness.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.DTOs.User;
import com.fitness.Service.UserService;

@RestController
@Validated
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public User addUser(@Valid @RequestBody com.fitness.DTOs.User user){
        return service.registerNewUser(user);
    }

    @GetMapping("/users")
    public List<User> findAllUser(){
        return service.findAll();
    }
    
    
}
