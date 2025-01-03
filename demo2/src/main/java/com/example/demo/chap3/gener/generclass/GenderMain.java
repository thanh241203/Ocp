package com.example.demo.chap3.gener.generclass;

public class GenderMain {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> elephantCrate = new Crate<>();
        elephantCrate.packCrate(elephant);
        //khai bao kieu du lieu khong phai elephant
        String s = new String();
//        elephantCrate.packCrate(s); not compile
        Elephant elephant1 = elephantCrate.emptyCrate();

        /**
         * Gender class không bị giới hạn kiểu gender
         */
        Elephant elephant2 = new Elephant();
        int a = 3;
        SizelLimiteCrate<Elephant, Integer> sizelLimiteCrat = new SizelLimiteCrate<>(elephant2, a);
        sizelLimiteCrat.getObject().saa();
        sizelLimiteCrat.saa();


    }
}
