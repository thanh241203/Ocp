package com.example.demo.chap3.gener;

import java.sql.Ref;
import java.util.*;
import java.util.function.*;

public class Refernces {
    public static String add(String a, int b) {
        return a + b;
    }

    public static void printMessage(String mesaage) {
        System.out.println(mesaage);
    }

    public static void main(String[] args) {
        BiFunction<String, Integer, String> integerIntegerIntegerBiFunction = Refernces::add;

        String result = integerIntegerIntegerBiFunction.apply("1", 2);
        System.out.println(result);

        List<String> message = Arrays.asList("Hello", "SS");
        message.forEach(Refernces::printMessage);

        String gr = "thanh";
        Supplier<Integer> stringPredicate = gr::length;
        int lengthCase = stringPredicate.get();
        System.out.println(lengthCase);

        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().
                map(String::toUpperCase).
                forEach(System.out::println);

        Messageable messageable = Duck::new;

        System.out.println(messageable.getMessage());
    }
}
