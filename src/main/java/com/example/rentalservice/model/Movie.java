package com.example.rentalservice.model;

public class Movie {

    private Long ID;
    private String name;
    private Category category;
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
