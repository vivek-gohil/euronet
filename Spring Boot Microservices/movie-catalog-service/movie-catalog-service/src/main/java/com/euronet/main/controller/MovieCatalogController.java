package com.euronet.main.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.euronet.main.model.CatalogItem;
import com.euronet.main.model.Movie;
import com.euronet.main.model.Rating;
import com.euronet.main.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {
		// RestTemplate restTemplate = new RestTemplate();

		// Call the rating data service
		// List<Rating> allRatings = Arrays.asList(new Rating("1", 5), new Rating("2",
		// 3), new Rating("3", 4));
		UserRating userRating = restTemplate.getForObject("http://rating-data-service/ratingdata/users/" + userId,
				UserRating.class);
		// Call the movie info service to get the movie

		// Movie movie = restTemplate.getForObject("http://localhost:8082/movies/foo",
		// Movie.class);

		// Putting movie info and rating data into catalog
		List<CatalogItem> catalogItems = new ArrayList<CatalogItem>();
		for (Rating rating : userRating.getUserRatings()) {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
					Movie.class);

			CatalogItem catalogItem = new CatalogItem(movie.getName(), "This is sample discription",
					rating.getRating());

			catalogItems.add(catalogItem);

		}

		return catalogItems;
		// return Collections.singletonList(new CatalogItem("Transformers", "Scifi",
		// 4));

	}

}
