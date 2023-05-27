package com.user.service.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.UserService.entiti.User;

public interface Repository extends JpaRepository<User,Integer> {

	
	
	
}
