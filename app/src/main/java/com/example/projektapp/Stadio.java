package com.example.projektapp;

public class Stadio {
    private String name;
    private int size;
    private String location;

    public Stadio(String name, int size, String location) {
        this.name = name;
        this.size = size;
        this.location = location;
    }

    @Override
    public String toString() {
        return name;

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
