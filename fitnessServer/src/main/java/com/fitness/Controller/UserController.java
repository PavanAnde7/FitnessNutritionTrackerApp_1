package com.fitness.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.Entity.User;
import com.fitness.Service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public User addUser(@Valid @RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> findAllUser(){
        return service.getUsers();
    }
}
