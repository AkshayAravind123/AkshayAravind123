package com.example.movietask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movietask.model.Movie;
import com.example.movietask.repo.movieRepository;

@RestController
public class MovieController {
	
	@Autowired
	movieRepository movrepo;
	
	@PostMapping(value="/addMovie")
    public String saveMovie(@RequestBody Movie movie){

		movrepo.save(movie);
        return "book with id"+movie.getId();

    }	
	
	@GetMapping(value="/findAllMovie")
    public List<Movie> getMovie(){

        return movrepo.findAll();

    }
	
	
    @GetMapping(value = "/findAllMovie/{moviename}")
    public List<Movie> getMovieSearch(@PathVariable("moviename") String moviename){

    	System.out.println("moviename"+moviename);
    	List movieval=movrepo.findByMovieName(moviename);
        return movieval;

    }	

}
