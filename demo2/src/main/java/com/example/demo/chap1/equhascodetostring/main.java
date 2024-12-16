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

        /** equal
         * Dùng để xem hai đối tượng có tương đương nhau không
         * Trong StringBuilder , method equal() dùng để check xem 2 đối tượng có đang trỏ đến cùng một chỗ hay không
         *
         */
        StringBuilder s1 = new StringBuilder("a");
        StringBuilder s2 = new StringBuilder("a");
        System.out.println("s1 equal s2 : " + s1.equals(s2));

        /** HashCode
         * Được sử dụng khi một lớp override lại phương thức equals()
         * Được sử dụng khi chứa một object là một key trong map , và trả về kiểu int
         */

        /**
         Nếu hai Object trả về equal = true => phải trả về hashcode giống nhau
         */
        //equal trả về false
        Hippo hippo1 = new Hippo("d", 12);
        Hippo hippo2 = new Hippo("d", 12);
        boolean a = hippo1.equals(hippo2);
        System.out.println("equal return false: " + a);
        System.out.println("equal : " + hippo1.hashCode());
        System.out.println("equal : " + hippo2.hashCode());
        //equal trả về true
        Hippo hippo3 = hippo1;
        boolean b = hippo1.equals(hippo3);
        System.out.println("equal return true : " + b);
        System.out.println("equal : " + hippo1.hashCode());
        System.out.println("equal : " + hippo3.hashCode());

        /**
         *  Nếu hai Object trả về equal = false => hashcode() từ mỗi object không nhất thiết phải
         *  trả về 2 kết quả khác nhau
         */

        /**
         * Trong một chương trình , kết quả trả về của hashCode() không được thay đổi, không nên để các biến có thể thay
         * đổi trong phương thức hashCode()
         */
    }
}
