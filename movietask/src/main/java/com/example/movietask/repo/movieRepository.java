package com.example.movietask.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.movietask.model.Movie;


@Repository
public interface movieRepository extends JpaRepository<Movie, Integer> {

	@Query("from Movie where movieName=?1")
	List findByMovieName(String moviename);

	


	

}
