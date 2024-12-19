package com.example.demo.chap1.nestedclass.inner;

public class Animal {
    private String a;
    private int b = 31;

    public Animal() {
    }

    public Animal(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * member inner class
     * là class được khai báo giống như một members(methods,constructors) ở bên trong một class
     * Có 4 properties của một inner class :
     * Có thể khai báo public , private , protected , default access
     * Có thể extend và implement interface
     * Có thể là abstract class or final
     * Có thể access đến các member của superclass
     */


    public class Dog
//            extends Ga
//            implements Eat
    {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(b);
            }
        }
    }

    public void callDog() {
        Dog dog = new Dog();
        dog.go();
    }

    /**
     * Inner class's name có thể giống với tên biến
     */
    public class A {
        private int c = 10;

        public class C {
            private int d = 20;

            public class D {
                private int e = 15;

                public void print() {
                    System.out.println(e);
                    System.out.println(d);
                    System.out.println(c);
                }
            }
        }
    }

    /**
     * declare an interface
     */
    private interface As {
        void hihi();
    }

    public class donTell implements As {

        @Override
        public void hihi() {

        }
    }
}


