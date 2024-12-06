package com.example.demo.chap4;

import java.util.List;

public class Human {
    private String name;
    private List<Dog> list;

    public Human() {
    }

    public Human(String name, List<Dog> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dog> getList() {
        return list;
    }

    public void setList(List<Dog> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
