package com.fitness.DTOs;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString		
@EqualsAndHashCode
public class Location {

	private Integer addressId;

	@NotBlank
	private String addressLine1;

	@NotBlank
	private String addressLine2;

	@NotBlank
	private int pinCode;

}
