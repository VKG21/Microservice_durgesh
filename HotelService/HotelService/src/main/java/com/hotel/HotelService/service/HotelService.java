package com.hotel.HotelService.service;

import java.util.List;

import com.hotel.HotelService.entiti.Hotel;

public interface HotelService {

	Hotel CreateHotel(Hotel hotel);

	Hotel getSingleHotel(int id);

	List<Hotel> getAllHotel();

}
