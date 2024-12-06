package com.example.demo.chap3.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample implements Comparable<ComparableExample> {
    private String name;

    public ComparableExample(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableExample o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "ComparableExample{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<ComparableExample> comparableExampleList = new ArrayList<>();
        comparableExampleList.add(new ComparableExample("v"));
        comparableExampleList.add(new ComparableExample("b"));
        Collections.sort(comparableExampleList);
        comparableExampleList.stream().forEach(System.out::println);

    }


}
