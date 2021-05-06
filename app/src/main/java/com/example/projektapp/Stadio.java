package com.example.projektapp;

public class Stadio {
    private String name;
    private int size;
    private String location;
    private String company;

    public Stadio(String name, int size, String location, String company) {
        this.name = name;
        this.size = size;
        this.location = location;
        this.company = company;
    }

    @Override
    public String toString() {
        return name;

    }

    public String getCompany() {
        return company;
    }

    public String getName(String name) {
        return this.name;
    }

    public int getSize(String size) {
        return this.size;
    }

    public String getLocation(String location) {
        return this.location;
    }
}
