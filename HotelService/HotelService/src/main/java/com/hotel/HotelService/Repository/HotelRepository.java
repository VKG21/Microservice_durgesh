package com.hotel.HotelService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.HotelService.entiti.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Integer>{

}
