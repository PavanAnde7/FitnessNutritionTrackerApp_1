package com.fitness.Controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.DTOs.LoginCredentialDTO;
import com.fitness.GlobalExceptionHandler.UserAlreadyExistException;
import com.fitness.Service.LoginCredsService;



@RestController
@RequestMapping("/signUp")
public class UserCredController {

	private final LoginCredsService credsService;
	
   public UserCredController(LoginCredsService credsService) {
	   this.credsService = credsService;
}
	
	@PostMapping("/user")
	public ResponseEntity<LoginCredentialDTO> registerUser(@RequestBody @Valid LoginCredentialDTO loginCreds) throws UserAlreadyExistException {
		
		//start JWT Implmentation or OAuth2
		
		return null;
	}
	
	
}
