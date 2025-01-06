package com.example.demo.chap3.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    /** Linked list
     * có thể chứa các phần tử trùng lặp
     * có các index theo thứ tự phần tử được thêm vào
     * có thể được sử dụng như list,stack,queue
     * Thương được sử dụng khi thường xuyên remove/add phần tử đầu và cuối
     */
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.addFirst("X"); // Thêm nhanh ở đầu
        linkedList.removeFirst();
        System.out.println(linkedList); // [X, A, B, C]
    }
}
