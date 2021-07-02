package com.example.rentalservice.rental.controller;

import com.example.rentalservice.rental.model.Movie;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rentalservice.rental.service.RentalService;

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

    @ApiOperation(value = "Get movie for given ID",
                response = Movie.class,
                notes = "This method will return movie found by given ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Movie not found"),
            @ApiResponse(code = 500, message = "Unexpected error")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(
            @ApiParam(name = "id",
                    type = "Long",
                    value = "ID of movie which you try to find",
                    example = "1",
                    required = true,
                    defaultValue = "1")
            @PathVariable Long id) {
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
