package com.example.demo.Controllers;

import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Exceptions.MovieNotFoundException;
import com.example.demo.Exceptions.TitleNotFoundException;
import com.example.demo.model.Movie;
import com.example.demo.service.IMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
//		@RequestMapping(value="addMovie", method=RequestMethod.POST)
		
		@Autowired
		private IMovieService movieService;
	
	
//		@PostMapping
//		public String addMovieDetails(@RequestBody Movie movie) {
//			System.out.println(movie);
//			movieService.addMovie(movie);
//			 
//			return "Movie Added Successfully!";
//		}
		
		
//		@GetMapping("{movieID}")
//		public Movie getMovieById(@PathVariable int movieID) {
//			Movie movie = movieService.getMovieById(movieID);
//			if(movie==null)
//					throw new MovieNotFoundException("The Movie you are looking for doesn't Exist!");
//			return movie;
//				
//		}
		
		
		@GetMapping("{movieID}")
		public ResponseEntity<Movie> deleteMovieById(@PathVariable int movieID) {
			Movie movie = movieService.getMovieById(movieID);
			if(movie==null)
					throw new MovieNotFoundException("The Movie you are looking for doesn't Exist!");
			movieService.deleteMovie(movie);
			
			ResponseEntity<Movie> responseEntity = new ResponseEntity(movie, HttpStatus.OK);
			return responseEntity;
				
		}
		
		
		
		
		@PostMapping
		public ResponseEntity<Movie> updateMovie(@RequestBody Movie movieDetails) {
			Movie movie = movieService.getMovieById(movieDetails.getMovieID());
			if(movie==null) {
				movie=movieService.getMovieByTitle(movieDetails.getTitle());
			}
			if(movie!=null) {
				movie.setTitle(movieDetails.getTitle());
				movie.setBudget(movieDetails.getBudget());
				movieService.addMovie(movie);
			}else {
				movieService.addMovie(movieDetails);
				throw new TitleNotFoundException("Since the ID you provided doesnt exist, so we are adding another record to the table");
			}
			
			ResponseEntity<Movie> responseEntity = new ResponseEntity(movie, HttpStatus.OK);
			return responseEntity;
		}
		
		@GetMapping("getAll")
		public ResponseEntity<Movie> getAll() {
			List<Movie> list = new ArrayList<Movie>();
			list =movieService.getAllMovies();
			
			ResponseEntity<Movie> responseEntity = new ResponseEntity(list, HttpStatus.OK);
			return responseEntity;
			
		}
		
		
		@GetMapping("{title}/{leadRole}")
		public ResponseEntity<Movie> getspecific(@PathVariable String title, @PathVariable String leadRole) {
			Movie movie = movieService.getByRoleAndTitle(title, leadRole);
			ResponseEntity<Movie> responseEntity=null;
			if(movie==null)
					throw new MovieNotFoundException("The Movie you are looking for doesn't Exist!");
			else {
				responseEntity = new ResponseEntity(movie, HttpStatus.OK);
			}
			
			return responseEntity;
			
		}
		
}
