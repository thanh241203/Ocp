package com.example.demo.chap1.instance;

public class main {
    public static void main(String[] args) {
        /** Instance of
         * Trả về kiểu boolean
         * Xác định một đối tượng có phải là một subclass của lớp cha hay chính nó hay không
         * Xác định một class có đang kế thừa interface B hay không
         */
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;
        System.out.println("b1:" + b1);
        boolean b2 = hippo instanceof HeavyAnimal;
        System.out.println("b2:" + b2);
        boolean b3 = hippo instanceof Elephant;
        System.out.println("b3:" + b3);

        /** inherit Object
         * Tất cả các class trong java đều kế thừa class Object => class instance of Object return true
         * Nếu như đối tượng là Null or reference to null => return false
         */
        HeavyAnimal heavyAnimal = null;
        System.out.println("null instance of Object :" + (heavyAnimal instanceof Object));
        HeavyAnimal heavyAnimal1 = new HeavyAnimal();
        boolean a = heavyAnimal1 instanceof Object;
        System.out.println("heavyAnimal instanceof Object :" + a);

        /**
         * Trường hợp superclass implement an interface , vậy subclass of the superclass có phải là một
         * instanceof của interface có không ?
         */
        Hippo hippo1 = new Hippo();
        boolean v = hippo1 instanceof Mother;
        System.out.println("hippo" + v);



    }
}
