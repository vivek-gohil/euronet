package com.euronet.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.euronet.main.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		Movie movie = new Movie(movieId, "Transformers " );
		return movie;
	}

}
