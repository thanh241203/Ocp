package com.example.demo.chap1.equhascodetostring;

public class main {

    public static void main(String[] args) {
        /**
         * toString
         * Dùng khi print out ra một Object
         * khi một class override the toString() method , bạn có thể cung cấp tt tùy thích
         */
        // dùng toString để in ra name
        Hippo hippo = new Hippo("s", 12);
        System.out.println("With toString method : " + hippo);

        /** ToStringBuilder
         * Dùng để return tất cả instance variables
         */
        HippoFather hippoFather = new HippoFather("s", 12);
        System.out.println("With toStringBuilder method : " + hippoFather);
    }
}
