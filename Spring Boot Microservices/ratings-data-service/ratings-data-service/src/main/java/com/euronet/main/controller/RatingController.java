package com.euronet.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.euronet.main.model.Rating;
import com.euronet.main.model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
//		List<Rating> allRatings = Arrays.asList(
//				new Rating("1", 5), 
//				new Rating("2", 3), 
//				new Rating("3", 4));

		// return allRatings;
		
		List<Rating> allRatings = Arrays.asList(
				new Rating("1", 5), 
				new Rating("2", 3),
				new Rating("3", 4));
		
		
		UserRating userRating = new UserRating();
		
		userRating.setUserRatings(allRatings);
		return userRating;
		
	}

}
