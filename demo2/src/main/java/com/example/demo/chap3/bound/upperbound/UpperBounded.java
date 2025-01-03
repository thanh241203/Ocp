package com.example.demo.chap3.bound.upperbound;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {

    public static long total(List<? extends Number> list) {
        int count = 0;
        for (Number number : list)
            count += number.longValue();
        return count;
    }

    public static long total1(List list) {
        int count = 0;
        for (Object obj : list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }

    private static void anyFlyer(List<Flyer> flyer) {
        flyer.add(new Goose());
        flyer.stream().forEach(System.out::println);
    }

    private static void groupOfFlyers(List<? extends Flyer> flyer) {
//        flyer.add(new Goose()); not complie
        flyer.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        /**
         * khi khai báo kiểu này , thì bạn sẽ không thể add thêm phần tử
         */
        List<? extends Bird> list = new ArrayList<Bird>();
        Sparrow sparrow = new Sparrow();
//    list.add(sparrow); not compile
//    list.add(new Bird()); not compile
/**
 *
 */
        HangGlider hangGlider = new HangGlider();
        List<Flyer> listFlyer = new ArrayList<>();
        listFlyer.add(hangGlider);
        System.out.println("Any Flyer ");
        anyFlyer(listFlyer);
        System.out.println("Group Of Flyers");
        Goose goose = new Goose();
        List<Flyer> listGroupFlyer = new ArrayList<>();
        listGroupFlyer.add(goose);
        groupOfFlyers(listGroupFlyer);
    }
}
