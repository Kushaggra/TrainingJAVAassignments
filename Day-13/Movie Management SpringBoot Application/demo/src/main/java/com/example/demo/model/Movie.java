package com.example.demo.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="movie_ID")
	private int movieID;
	
	private String title;
	
	@Column(name="lead_role")
	private String leadRole;
	
	private double budget;
	
	@Column(name="release_date")
	private LocalDate releaseDate;
	
	public Movie(int movieID, String title, String leadRole, double budget, LocalDate releaseDate) {
		super();
		this.movieID = movieID;
		this.title = title;
		this.leadRole = leadRole;
		this.budget = budget;
		this.releaseDate = releaseDate;
	}

	public Movie() {
		
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", title=" + title + ", leadRole=" + leadRole + ", budget=" + budget
				+ ", releaseDate=" + releaseDate + "]";
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLeadRole() {
		return leadRole;
	}

	public void setLeadRole(String leadRole) {
		this.leadRole = leadRole;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
}

//{
//    "movieID" : 934,
//    "title" : "Harry Potter and the Prisoner of Askaban",
//    "leadRole" : "Harry Potter",
//    "budget" : 560000000,
//	"releaseDate" : "2009-12-12"
//}