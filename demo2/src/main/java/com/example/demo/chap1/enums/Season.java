package com.example.demo.chap1.enums;

public enum Season {
    /**
     * khai bao với Uppercase
     */
    WINTER("Low") {
        @Override
        public void print() {

        }

        @Override
        public void prints() {

        }
    }, SPRING("Medium") {
        @Override
        public void print() {

        }
    }, SUMMER("High") {
        @Override
        public void print() {

        }
    }, FALL("Medium") {
        @Override
        public void print() {

        }
    };

    /**
     * Adding Constructors , Fields , Methods
     */

    private String type;

    Season(String type) {
        System.out.println("hi");
        this.type = type;
    }

    public void printType() {
        System.out.println(type);
    }

    /**
     * abstract method
     * tất cả các giá trị trong enum class đều phải override lại
     * các phương thức đấy, nếu không sẽ bị lỗi compile
     */
    public abstract void print();

    /**
     * method bình thường
     * Một vài các giá trị trong enum class override lại .
     */
    public void prints() {

    }

    ;

    /**
     * khai bao với lowercase */
    // winter  compile

}
