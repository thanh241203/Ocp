package com.example.demo.chap4;


import java.util.stream.Stream;

public class Strea {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(1, (s, n) -> s + n));

    }
}
