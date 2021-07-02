package com.example.rentalservice.rental.model;

import com.example.rentalservice.rental.model.Category;
import io.swagger.annotations.ApiModelProperty;

public class Movie {

    @ApiModelProperty(notes = "ID of the movie", required = true, value = "ID of the movie", example = "1")
    private Long ID;
    @ApiModelProperty(notes = "Name of the movie", required = true, value = "Name of the movie", example = "Tora Tora Tora")
    private String name;
    @ApiModelProperty(notes = "Category of the movie from Enum Category", required = true, value = "Category of the movie", example = "Action")
    private Category category;
    @ApiModelProperty(notes = "Status of availability to rent", required = true, value = "Status of availability to rent", example = "false")
    private boolean isAvailable;

    public Movie() {
    }

    public Movie(Long ID, String name, Category category, boolean isAvailable) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
