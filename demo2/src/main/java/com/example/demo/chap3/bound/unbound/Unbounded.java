package com.example.demo.chap3.bound.unbound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unbounded {

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        List b = Arrays.asList(a);
        print(b);
        List<String> list = new ArrayList<>();
        list.add("2");
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        print(list);
        print(list1);


    }
}
