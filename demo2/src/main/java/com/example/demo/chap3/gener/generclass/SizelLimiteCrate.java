package com.example.demo.chap3.gener.generclass;

public class SizelLimiteCrate<T, U> {
    private T object;
    private U number;

    public SizelLimiteCrate(T contents, U sizeLimit) {
        this.object = contents;
        this.number = sizeLimit;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public U getNumber() {
        return number;
    }

    public void setNumber(U number) {
        this.number = number;
    }

    public void saa(){
        System.out.println("in Sizelimited ");
    }
}
