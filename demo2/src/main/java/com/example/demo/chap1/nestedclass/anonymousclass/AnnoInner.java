package com.example.demo.chap1.nestedclass.anonymousclass;

public class AnnoInner {
    /**
     * Anonymous inner class
     * là một local inner class mà không có tên .
     * Lớp được khai báo và thực thi trong một khối block = từ khóa "new"
     * lớp được yêu cầu phải extend/implement một lớp/interface
     */
    abstract class SaleToday {
        abstract int dollar();
    }

    public void ss() {
        SaleToday saleToday = new SaleToday() {
            @Override
            int dollar() {
                return 3;
            }
        };

    }

    public static void main(String[] args) {

    }
}
