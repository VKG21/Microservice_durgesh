package com.user.service.UserService.service;

import java.util.List;

import com.user.service.UserService.entiti.User;

public interface UserService {
	
	
	///create user
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get single user
	User getUser(int userId);
	
	
	///delete
	
	
	//update
	

}
