package com.example.demo.chap3.gener;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        System.out.println("o1:"+o1.getName());

        System.out.println("o2:"+o2.getName());
        return Integer.compare(o1.getId(), o2.getId());
    }
}
