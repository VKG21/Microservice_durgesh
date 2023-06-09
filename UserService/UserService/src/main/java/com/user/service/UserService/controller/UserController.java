package com.user.service.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.UserService.entiti.User;
import com.user.service.UserService.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// save user
	@PostMapping("/createUser")
	public ResponseEntity<User> CreateUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}

	// get sigle user
	@GetMapping("/get/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable int userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);

	}

	// get All User
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> userList=userService.getAllUser();
		return ResponseEntity.ok(userList);
	
}}
