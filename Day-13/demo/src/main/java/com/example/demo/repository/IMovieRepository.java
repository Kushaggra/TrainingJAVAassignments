package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer>{
//we do not write any method here, because JPA will auto generate a method 
//	findbymovieID because we autogenerated it in Movie class

	public Movie findByTitle(String title);
	
}
