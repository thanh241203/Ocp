package com.example.demo.chap3.searchandsort;


import com.example.demo.chap3.comparable.ComparatorExample;
import com.example.demo.chap3.comparable.Worm;

import java.util.*;

public class SearchAndSort {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<ComparatorExample> worms = new TreeSet<>(new Comparator<ComparatorExample>() {
            public int compare(ComparatorExample o1, ComparatorExample o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        worms.add(new ComparatorExample("as", 1));
        worms.add(new ComparatorExample("s", 1));
        worms.stream().forEach(System.out::println);
    }
}
