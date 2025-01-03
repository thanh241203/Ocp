package com.example.demo.chap3.gener.genermethods;

public class main {

    /**
     * Thường được sử dụng cho static methods , nhưng cũng có thể khai báo non-static methods
     */
    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }

    public static <T> void sink() {

    }

    public static <T> Crate as() {
        System.out.println("in as");
        return new Crate();
    }

    public static <T> Crate<T> identity() {
        return new Crate();
    }

    public static void main(String[] args) {
        Crate dogCrate = as();
        System.out.println(dogCrate);
    }
}
