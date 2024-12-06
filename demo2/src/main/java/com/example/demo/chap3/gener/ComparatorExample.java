package com.example.demo.chap3.gener;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sắp xếp danh sách sinh viên theo tên
        Collections.sort(students, new StudentNameComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
