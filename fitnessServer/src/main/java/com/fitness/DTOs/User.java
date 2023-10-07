package com.fitness.DTOs;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User implements Serializable {

	@NotBlank
	private String firstName;

	@NotNull
	@NotBlank
	private String password;

	@NotNull
	@NotBlank
	private Date dateOfBirth;

	@Email
	@NotBlank
	private String email;
	
	@NotBlank
	private char gender;

	@NotBlank
	private Set<Location> location = new HashSet<>();

	@NotBlank
	private String fitnessGoal;

	@NotBlank
	private int weight;
	
}
