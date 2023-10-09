package com.fitness.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.fitness.DTOs.User;
import com.fitness.GlobalExceptionHandler.UserAlreadyExistException;
import com.fitness.Service.UserService;
import com.fitness.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public User registerNewUser(User user) throws UserAlreadyExistException {

		Optional<com.fitness.Entity.User> userFromRepo = Optional.of(userRepository.findByEmail(user.getEmail()));
		if (userFromRepo.isPresent()) {
			throw new UserAlreadyExistException("This Email Id is Used");
		}
		com.fitness.Entity.User entityUser = mapper.map(user, com.fitness.Entity.User.class);
		userRepository.save(entityUser);
		return user;

	}

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
