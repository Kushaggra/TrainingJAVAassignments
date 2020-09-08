package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.IMovieRepository;


@Service
public class Movieservice implements IMovieService {

	
	@Autowired
	private IMovieRepository repository;
	
	@Override
	public void addMovie(Movie movie) {
		repository.save(movie);

	}

	@Override
	public Movie getMovieById(int movieID) {
		return repository.findById(movieID).orElse(null);
		
	}

	@Override
	public Movie getMovieByTitle(String title) {
		return repository.findByTitle(title);
	}
	
	
	
	@Override
	public void deleteMovie(Movie movie) {
		repository.delete(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> list = new ArrayList<Movie>();
		list = repository.findAll();
		return list;
	}
	
	
	@Override
	public Movie getByRoleAndTitle(String title, String leadRole) {
		Movie mObj = getMovieByTitle(title);
		if(leadRole.equals(mObj.getLeadRole())) {
			return mObj;
		}
		else
			return null;
	}
	
	
	

}
