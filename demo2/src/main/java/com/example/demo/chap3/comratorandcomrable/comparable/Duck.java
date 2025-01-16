package com.example.demo.chap3.comratorandcomrable.comparable;

public class Duck implements Comparable<Duck> {
    private String name;
    private int id;

    public Duck(String name,int id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck o) {
        return id-o.id;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
