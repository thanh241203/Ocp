package com.example.demo.chap3.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample  {

    private String name;
    private int weight;

    public ComparatorExample(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ComparatorExample{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        List<ComparatorExample> comparatorExampleList = new ArrayList<>();
        comparatorExampleList.add(new ComparatorExample("a", 2));
        comparatorExampleList.add(new ComparatorExample("b", 1));
        Collections.sort(comparatorExampleList, Comparator.comparing(o -> o.weight));
        comparatorExampleList.stream().forEach(System.out::println);
    }


}
