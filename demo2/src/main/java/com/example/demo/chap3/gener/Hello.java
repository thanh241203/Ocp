package com.example.demo.chap3.gener;

import com.example.demo.chap4.Animal;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Hello implements Comparator<String> {


    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (d1, d2) -> d1.length() == d2.length();
        System.out.println(biPredicate.test("1","2"));

    }
}
