package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movie;

public interface IMovieService {
	public void addMovie(Movie movie);
	public void deleteMovie(Movie movie);
	public Movie getMovieById(int movie);
	public Movie getMovieByTitle(String title);
	public List<Movie> getAllMovies();
	public Movie getByRoleAndTitle(String title, String leadRole);
}
