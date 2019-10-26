package javabrains.io.movieInfo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javabrains.io.movieInfo.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@RequestMapping("/info")
	public Movie getMovies(@RequestParam()String movieId)
	{
		
		return Arrays.<Movie>asList(new Movie("M101","Titanic","English Movie"),
				new Movie("M102","Sholeey","Hindi Movie"),
				new Movie("M103","Spiderman","English Movie")
				).stream().filter(movie->movie.getMovieId().equalsIgnoreCase(movieId)).findFirst().get();
	}
}
