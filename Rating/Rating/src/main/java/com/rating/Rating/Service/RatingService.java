package com.rating.Rating.Service;

import java.util.List;

import com.rating.Rating.model.Rating;

public interface RatingService {

	
	Rating create(Rating rating);
	
	List<Rating> getRating();
	
	List<Rating> getRatingByUserId(int userId);
	
	List<Rating> getRatingByHotelId(int ratingid);
}
