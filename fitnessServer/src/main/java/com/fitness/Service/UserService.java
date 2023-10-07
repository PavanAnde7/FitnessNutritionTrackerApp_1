package com.fitness.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.Entity.User;
import com.fitness.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
       return repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
     }

}
