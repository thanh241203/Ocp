package com.example.demo.chap3.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.remove(); // xoa phan tu dau tien
//        System.out.println(queue.peek()); //xem phan tu dau tien
//        System.out.println(queue.poll());// xoa phan tu dau tien
//        queue.stream().forEach(System.out::println);


        /**
         * Giống với Stack
         */
        ArrayDeque<Integer> integers=new ArrayDeque<>();
        integers.push(1);
        integers.push(2); // 2,1
        integers.stream().forEach(System.out::println);
        integers.poll(); // xoa phan tu dau tien
        System.out.println(integers.peek()); //2


    }
}
