package com.user.service.UserService.entiti;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	
	@Id
	private int ratingId;
	
	private int userId;
	
	private int hotelId;
	
	private int rating;
	
	private String feedback;
	
	

}
