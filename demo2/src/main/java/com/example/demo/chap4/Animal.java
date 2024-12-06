package com.example.demo.chap4;

public class Animal {
   private Human human;

    public Animal(Human human) {
        this.human = human;
    }

    public Animal() {
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
