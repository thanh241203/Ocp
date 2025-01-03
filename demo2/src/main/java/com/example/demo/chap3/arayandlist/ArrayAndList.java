package com.example.demo.chap3.arayandlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndList {
    public static void main(String[] args) {
        /** là một object mà chứa object khác
         * Không thể chứa kiểu dữ liệu nguyên thủy
         */
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        String[] array = new String[list.size()];
        Arrays.stream(array).forEach(System.out::println); //null
        array[0] = list.get(0);
        array[1] = list.get(1);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "-");

        /**
         * review the created khi converting giữa array và ArrayList
         */
        String[] array1 = {"ger", "than"};
        List<String> list1 = Arrays.asList(array1); // convert array to ArrayList
        list1.set(1, "dd");
        Arrays.stream(array1).forEach(System.out::println); // ger , dd
        array1[0] = "aa";
        Arrays.stream(array1).forEach(System.out::println); // aa ,dd
        String[] array2 = (String[]) list1.toArray(); // can not  convert ArrayList to array
        System.out.println(array2);

    }
}
