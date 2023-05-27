package com.user.service.UserService.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Function;

import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmOneToManyCollectionElementType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.UserService.Exception.ResourceNotFoundException;
import com.user.service.UserService.entiti.Hotel;
import com.user.service.UserService.entiti.Rating;
import com.user.service.UserService.entiti.User;
import com.user.service.UserService.repository.Repository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	Repository repository;

	@Autowired
	RestTemplate restTemplate;

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override

	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		User user = repository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Resource not found Exception " + "::" + userId));
		String URL = "http://localhost:9093/rating/RatingByUser/" + user.getUserId();
		Rating[] list = restTemplate.getForObject(URL, Rating[].class);
		List<Rating> list2 = Arrays.stream(list).toList();
		logger.info("vvvvvvvv" + list);
		user.setRating(list2);
		// http://localhost:9090/hotel/get/2

				/*
				 * list2.stream().map(rat -> { System.out.println(rat.getHotelId());
				 * ResponseEntity<Hotel> list3 =
				 * restTemplate.getForEntity("http://localhost:9090/hotel/get/2", Hotel.class);
				 * Hotel hotel = list3.getBody();
				 * logger.info("responce status code{}:",list3.getStatusCode());
				 * user.setHotel(hotel); });
				 */
		 return user;
	}

	}
		
	
