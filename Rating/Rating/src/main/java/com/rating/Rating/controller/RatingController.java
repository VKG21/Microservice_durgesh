package com.rating.Rating.controller;

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

import com.rating.Rating.Service.RatingService;
import com.rating.Rating.model.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping("/create")
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Rating>> getRatings(){
		System.out.println("miiii");
		return ResponseEntity.ok(ratingService.getRating());
	}
	
	
	@GetMapping("/RatingByUser/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int userId){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}
	
	@GetMapping("/RatingByHotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable int hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}

}
