package com.cisco.movieapp.controller;

import com.cisco.movieapp.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value(value = "${movie.url}")
    private String url;

    private final static String GET_PATH = "/movie";

    @RequestMapping(method = RequestMethod.GET, value = "/movie")
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movieList = restTemplate.getForObject(url+GET_PATH, List.class);

        return new ResponseEntity(movieList, movieList.size() > 0 ? HttpStatus.OK: HttpStatus.NOT_FOUND);
    }
}
