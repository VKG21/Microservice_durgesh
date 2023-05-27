package com.hotel.HotelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.HotelService.Exception.ResourceNotFoundException;
import com.hotel.HotelService.Repository.HotelRepository;
import com.hotel.HotelService.entiti.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel CreateHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getSingleHotel(int id) {
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found Exception " + "::" + id));
	}
	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

}
