package com.fitness.Entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role implements Serializable {

	public static final String USER = "USER";
    public static final String ROLE_USER = "ROLE_USER";
 
    @Id
    @Column(name = "ROLE_ID")
    private int roleId;
 
    private String name;
 
    // bi-directional many-to-many association to User
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
