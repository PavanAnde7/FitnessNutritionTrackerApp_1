package com.fitness.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fitness.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    
}
