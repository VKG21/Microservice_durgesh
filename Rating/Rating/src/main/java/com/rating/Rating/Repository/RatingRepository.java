package com.rating.Rating.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rating.Rating.model.Rating;


@Repository
public interface RatingRepository extends JpaRepository<Rating,Integer>{

	List<Rating> findAllByhotelid(int hotelid);

	List<Rating> findAllByratingid(int ratingid);

	
	
	

	
	
}

