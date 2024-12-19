package com.example.demo.chap1.nestedclass.inner;

public class main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.callDog();
        /**
         * another way to call
         */
        Animal animal = new Animal();
        Animal.Dog dog1 = animal.new Dog();
        dog1.go();

        Animal.A a = animal.new A();
        Animal.A.C c = a.new C();
        Animal.A.C.D d = c.new D();
        d.print();
    }
}
