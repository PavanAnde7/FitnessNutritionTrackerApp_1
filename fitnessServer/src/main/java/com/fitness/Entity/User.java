package com.fitness.Entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Table(name = "user_info")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column(name = "display_name")
	private String displayName;

	private String password;
	
	private String email;
	
	@Column(name = "DOB")
	private Date dateOfBirth;
	
	private char gender;
	
	private String fitnessGoal;
	
	private int weight;
	
	@Column(name = "PROVIDERS_USER_ID")
	private String providersUserId;
	
	@Column(name = "enables", columnDefinition = "BIT", length = 1)
	private boolean enabled;
	
	@Column(name = "created_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
    protected Date modifiedDate;
	
	private String provider;
	
	
	 @JsonIgnore
	    @ManyToMany
	    @JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	    private Set<Role> roles;
	
}
