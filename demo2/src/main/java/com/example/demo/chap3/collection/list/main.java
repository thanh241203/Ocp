package com.example.demo.chap3.collection.list;

import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.stream().forEach(System.out::println);
    }
}
