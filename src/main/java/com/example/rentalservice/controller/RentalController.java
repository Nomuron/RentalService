package com.example.rentalservice.controller;

import com.example.rentalservice.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rentalservice.service.RentalService;

@RestController
@RequestMapping("/sample")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public ResponseEntity<Movie> getMovie() {
        return ResponseEntity.ok(rentalService.getMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/{id}/return")
    public ResponseEntity<Movie> returnMovie(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.returnMovie(id));
    }

    @PutMapping("/{id}/rent")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.rentMovie(id));
    }
}
