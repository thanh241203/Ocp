package com.example.demo.chap3.collection.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    /**
     * Set
     * Sử dụng khi bạn không muốn giá trị trùng lặp
     */

    public static void main(String[] args) {
        /** Hash Set
         * lưu trữ các dữ liệu trong bảng hash table , các dữ liệu sẽ được chuyển thành hash value
         */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(0);
        set.add(2);
        set.add(2);
        set.stream().forEach(System.out::println); //012

        /** Tree Set
         * Lữu trữ dữ liệu trong sorted tree structure
         * Lợi ích chính  là việc các giá trị luôn luôn ở vị trí sorted
         */
        Set<Integer> setTree = new TreeSet<>();
        setTree.add(1);
        setTree.add(0);
        setTree.add(2);
        setTree.add(2);
        setTree.stream().forEach(System.out::println); // 012

        /** NavigableSet interface
         *  là interface được treeSet implemented
         */
        NavigableSet<Integer> setNavi = new TreeSet<>();
        for (int i = 0; i <= 10; i++) {
            setNavi.add(i);
        }
        //trả về giá trị nhỏ và gần nhất với tham số truyền vào
        System.out.println("lower"+setNavi.lower(10)); // 9

        //trả về giá trị (nhỏ || gần) nhất hoặc chính giá trị đó với tham số truyền vào
        System.out.println("floor"+setNavi.floor(10)); //10


        /**
         * trả về giá trị lớn và gần nhất hoặc chính nó với tham số truyền vào
         * Nếu vượt quá => null
         */
        System.out.println("ceiling: "+setNavi.ceiling(11)); //null

        /**
         * trả về giá trị lớn và gần nhất với tham số truyền vào
         * Nếu vượt quá => null
         */
        System.out.println("higher: "+setNavi.higher(9)); //10
    }
}
