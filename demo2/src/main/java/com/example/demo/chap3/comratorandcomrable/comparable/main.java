package com.example.demo.chap3.comratorandcomrable.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    /** Interface Comparable
     * Chỉ có một phương thức : int compareTo(T o)
     * phương thức return 0 khi current object = argument
     * phương thức return > 0 khi current object > argument
     * phương thức return < 0 khi current object < argument
     */
    public static void main(String[] args) {
        List<Duck> ducks=new ArrayList<>();
        ducks.add(new Duck("B",1));
        ducks.add(new Duck("A",2));
        Collections.sort(ducks);
        ducks.stream().forEach(System.out::println);

        Duck duck1=new Duck("C",3);
        Duck duck2=new Duck("D",4);
        System.out.println(duck1.compareTo(duck2)); //-1
        System.out.println(duck2.compareTo(duck1)); //1
    }
}
