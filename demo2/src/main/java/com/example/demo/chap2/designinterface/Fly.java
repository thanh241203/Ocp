package com.example.demo.chap2.designinterface;

public interface Fly {
    /**
     * interface also include :
     * constant public static final variables
     * default methods
     * static methods
     */
    // constant public static final variables
    public static final int c = 2;

    /**
     * default methods
     * private : khai báo body code trong interface , không kế thừa được
     * proteced : interface không hỗ trợ
     * default : khai báo body code trong interface , không kế thừa được
     * public  : đã biết
     */
    public void land();

    /* static methods  */
    static void as() {
        System.out.println("static methods");
    }

}
