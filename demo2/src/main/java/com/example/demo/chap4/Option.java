package com.example.demo.chap4;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Option {
    public static Optional<Integer> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of(sum / scores.length);
    }

    public static void main(String[] args) {
//        Optional<Integer> otp=average();
//        if(otp.isPresent()){
//            System.out.println(otp.get()); //2
//        }
//
//        Optional<Integer> otp1=average();
//        if(otp1.isEmpty()){
//            System.out.println("no value "); // no value
//        }

        Optional<Integer> opt = average(12323);
        System.out.println(opt);
//        int b = opt.orElse(12);
//        int c = opt.orElseGet(() -> Math.abs(3));
//        int d = opt.orElseThrow();
//        System.out.println(b);
    }
}
