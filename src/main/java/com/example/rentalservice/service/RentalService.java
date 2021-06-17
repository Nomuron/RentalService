package com.example.rentalservice.service;

import com.example.rentalservice.model.Movie;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovies() {
        Movie movie = restTemplate.getForEntity("http://localhost:8080/movies/", Movie.class).getBody();
        return movie;
    }

    public Movie getMovie(Long id) {
        Movie movie = restTemplate.getForEntity("http://localhost:8080/movies/" + id, Movie.class).getBody();
        return movie;
    }

    public Movie returnMovie(Long id) {
        Movie movie = restTemplate.exchange("http://localhost:8080/movies/" + id + "/true", HttpMethod.PUT, null, Movie.class).getBody();
        return movie;
    }

    public Movie rentMovie(Long id) {
        Movie movie = restTemplate.exchange("http://localhost:8080/movies/" + id + "/false", HttpMethod.PUT, null, Movie.class).getBody();
        return movie;
    }
}
