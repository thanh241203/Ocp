package com.example.demo.chap1.nestedclass.localinner;

public class Outer {
    /**
     * Local inner classes
     * là một lớp được khai báo bên trong một phương thức , giống như local variables
     * 4 tính chất :
     * không có phương thức truy cập
     * không thể khai báo static , static field || static methods
     * không thể truy cập đến local variables trừ khi đó là final
     * Có thể truy cập đến các fields và phương thức của lớp ngoài
     */
    private int age = 5;

    public void as() {

    }

    public void calculate() {
        int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(age * width);
                as();
            }
        }
        // cách để chạy local inner class
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
