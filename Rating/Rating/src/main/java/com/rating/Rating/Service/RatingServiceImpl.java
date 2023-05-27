package com.rating.Rating.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.Rating.Repository.RatingRepository;
import com.rating.Rating.model.Rating;


@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
     return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRating() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(int userId) {
		return ratingRepository.findAllByratingid(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(int ratingid) {
		// TODO Auto-generated method stub
		return ratingRepository.findAllByratingid(ratingid);
	}

}
