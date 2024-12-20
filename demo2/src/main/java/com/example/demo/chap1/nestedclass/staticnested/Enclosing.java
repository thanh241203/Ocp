package com.example.demo.chap1.nestedclass.staticnested;

public class Enclosing {
    /**
     * static nested class
     * là một lớp static giống với các members
     * Về cơ bản là giống với inner class , khác về cách gọi
     */

    static class Open {
        private int price = 6;

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Open open = new Open();
        open.getPrice();
    }
}
