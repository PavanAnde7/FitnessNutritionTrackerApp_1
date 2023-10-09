package com.fitness.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.DTOs.User;
import com.fitness.GlobalExceptionHandler.UserAlreadyExistException;
import com.fitness.repository.UserRepository;

@Service
public interface UserService {
    
	User registerNewUser(User user) throws UserAlreadyExistException;
	User findUserByEmail(String email);
	List<User> findAll();
}
