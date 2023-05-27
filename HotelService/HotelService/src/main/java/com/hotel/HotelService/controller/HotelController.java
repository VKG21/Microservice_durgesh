package com.hotel.HotelService.controller;

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

import com.hotel.HotelService.entiti.Hotel;
import com.hotel.HotelService.service.HotelService;


@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	HotelService hotelService;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel hotel2=hotelService.CreateHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel2);
		
	}
		// get sigle user
		@GetMapping("/get/{id}")
		public ResponseEntity<Hotel> getSingleUser(@PathVariable int id) {
			Hotel hotel  = hotelService.getSingleHotel(id);
			return ResponseEntity.ok(hotel);

		}

		// get All User
		@GetMapping("/getAllUser")
		public ResponseEntity<List<Hotel>> getAllUser(){
			List<Hotel> userList=hotelService.getAllHotel();
			return ResponseEntity.ok(userList);
		
	}}
