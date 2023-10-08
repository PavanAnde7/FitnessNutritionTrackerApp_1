package com.fitness.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class LoginCredential {

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer srNo;
	
	@Id
	private String userName;
	
	private String password;
	
}
