package com.fitness.DTOs;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Set<Location> getLocation() {
		return location;
	}

	public void setLocation(Set<Location> location) {
		this.location = location;
	}

	public String getFitnessGoal() {
		return fitnessGoal;
	}

	public void setFitnessGoal(String fitnessGoal) {
		this.fitnessGoal = fitnessGoal;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public User(@NotBlank String firstName, @NotNull @NotBlank String password, @NotNull @NotBlank Date dateOfBirth,
			@Email @NotBlank String email, @NotBlank char gender, @NotBlank Set<Location> location,
			@NotBlank String fitnessGoal, @NotBlank int weight) {
		super();
		this.firstName = firstName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.gender = gender;
		this.location = location;
		this.fitnessGoal = fitnessGoal;
		this.weight = weight;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + ", gender=" + gender + ", location=" + location + ", fitnessGoal=" + fitnessGoal + ", weight="
				+ weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, email, firstName, fitnessGoal, gender, location, password, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(fitnessGoal, other.fitnessGoal)
				&& gender == other.gender && Objects.equals(location, other.location)
				&& Objects.equals(password, other.password) && weight == other.weight;
	}
	
	
	
}
