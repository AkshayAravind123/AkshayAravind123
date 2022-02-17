package com.example.movietask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "movieDetails",schema = "public")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
    private int id;
	@Column(name="movieName")
    private String movieName;
	@Column(name="movieYear")
    private String movieYear;
	@Column(name="movieDirector")
    private String movieDirector;
	@Column(name="movieHero")
    private String movieHero;
	@Column(name="movieProducer")
    private String movieProducer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieHero() {
		return movieHero;
	}
	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}
	public String getMovieProducer() {
		return movieProducer;
	}
	public void setMovieProducer(String movieProducer) {
		this.movieProducer = movieProducer;
	}

	    
}
