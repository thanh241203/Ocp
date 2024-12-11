package com.example.demo.chap1.equhascodetostring;

public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight;
    }

}
