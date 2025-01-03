package com.example.demo.chap3.gener.generclass;

public class Crate<T> {
    private T content;

    public T emptyCrate() {
        return content;
    }

    public void packCrate(T contents) {
        this.content = contents;
    }
}
