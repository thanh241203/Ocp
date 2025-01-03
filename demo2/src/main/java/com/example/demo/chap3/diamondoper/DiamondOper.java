package com.example.demo.chap3.diamondoper;

import java.util.ArrayList;
import java.util.List;

public class DiamondOper {
    public static void main(String[] args) {
        /**
         * Before java 5
         */
        List list=new ArrayList();
        list.add("ss");
        list.add(123);
        list.add(12.3);
        list.stream().forEach(System.out::println);

        /**
         * In ,after java 5
         */
        List<String> names = new ArrayList<>();
        names.add("2");
//        names.add(3); not compile

    }
}
