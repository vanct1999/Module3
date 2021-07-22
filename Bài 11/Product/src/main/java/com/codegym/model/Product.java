package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private long cost;
    private String location;
    private String description;

    public Product() {

    }

    public Product(int id, String name, long cost, String location, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.location = location;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
