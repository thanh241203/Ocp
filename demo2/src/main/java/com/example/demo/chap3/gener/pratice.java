package com.example.demo.chap3.gener;

import java.util.Arrays;
import java.util.List;

public class pratice {

    /**
     * bai 1
     */
    public static <T> boolean method(T[] array1, T[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (!(array1[i].equals(array2[i]))) return false;
        }
        return true;
    }

    /**
     * bai 2
     */
    public static <T> void countSum(List<T> list1) {
        double sumEvenNumber = 0;
        double sumOddNumber = 0;
        for (int i = 0; i <= list1.size(); i++) {
            if (i % 2 == 0) {
                sumEvenNumber += i;
            } else {
                sumOddNumber += i;
            }
        }
        System.out.println("sum even : " + sumEvenNumber);
        System.out.println("Odd even : " + sumOddNumber);
    }

    public static void main(String[] args) {
        //bai1
        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {1, 2, 3, 4};
        boolean a = method(array1, array2);
        System.out.println("compare " + a);

        //bai 2
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        countSum(list);
    }
}
