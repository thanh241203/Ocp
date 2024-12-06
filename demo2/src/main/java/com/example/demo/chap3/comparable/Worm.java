package com.example.demo.chap3.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Worm {

    public static int compare(ComparatorExample o1, ComparatorExample o2) {
        Comparator<ComparatorExample> comparator = Comparator.comparing(s -> s.getName());
        comparator = comparator.thenComparing(s -> s.getWeight());
        return comparator.compare(o1, o2);
    }

    public static void main(String[] args) {
        List<ComparatorExample> comparatorExampleList = new ArrayList<>();
        comparatorExampleList.add(new ComparatorExample("b", 1));
        comparatorExampleList.add(new ComparatorExample("a", 12));
        comparatorExampleList.add(new ComparatorExample("d", 16));
        comparatorExampleList.add(new ComparatorExample("c", 17));
        comparatorExampleList.sort(Worm::compare);



        comparatorExampleList.stream().
                sorted(Worm :: compare).
                forEach(System.out::println);
//        Collections.sort(comparatorExampleList, Worm::compare);
//        comparatorExampleList.stream().forEach(System.out::println);
    }
}
