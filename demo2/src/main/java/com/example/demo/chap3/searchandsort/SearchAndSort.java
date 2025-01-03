package com.example.demo.chap3.searchandsort;

import java.util.*;

public class SearchAndSort {
    public static void main(String[] args) {
        /** Array
         * Nếu dùng Arrays.binarySearch để tìm phần tử , mà không tìm thấy thì sẽ trả về vị trí index mà
         * phần tử ấy nếu như có trong array
         */
        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println(Arrays.binarySearch(numbers, 0)); //-1

        /** ArrayList
         * Nếu dùng Collections.binarySearch để tìm phần tử , mà không tìm thấy thì sẽ trả về vị trí index mà
         * phần tử ấy nếu như có trong array
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 1);
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println(Collections.binarySearch(list, 4)); // -5

    }
}
