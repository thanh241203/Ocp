package com.example.demo.chap1.equhascodetostring;

import java.util.Objects;

public class Lion {
    private int idNumber;
    private int age;
    private String name;

    public Lion(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return idNumber == lion.idNumber && age == lion.age && Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber, age, name);
    }
}
