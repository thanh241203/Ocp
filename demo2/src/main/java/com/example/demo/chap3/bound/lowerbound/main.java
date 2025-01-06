package com.example.demo.chap3.bound.lowerbound;

import java.util.ArrayList;
import java.util.List;

public class main {
    /**
     * có thể chuyền vào String hoặc các Object là cha của String
     */
    public static void addSound(List<? super String> list) {// lower bound
        list.add("quack");
        list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("ss");
        addSound(list);
    }
}
