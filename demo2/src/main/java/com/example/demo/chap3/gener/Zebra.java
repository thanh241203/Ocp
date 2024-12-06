package com.example.demo.chap3.gener;

public class Zebra <U>  implements Shippable<U>{
    @Override
    public void ship(U u) {
        System.out.println(u);
    }
}
