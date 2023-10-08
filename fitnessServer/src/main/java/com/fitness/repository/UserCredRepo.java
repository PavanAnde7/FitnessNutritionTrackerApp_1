package com.fitness.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.fitness.Entity.LoginCredential;

public interface UserCredRepo extends PagingAndSortingRepository<LoginCredential, String> {

}
