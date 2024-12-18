package com.example.demo.chap1.enums;

public class main {
    public static void main(String[] args) {
        /** Enum
         *  là một lớp dùng để chứa các giá trị constant
         *  Được sử dụng khi bạn có các giá trị mặc định và muốn để nó trong một  enum class
         */

        /**
         * Cách gọi
         */
        Season season = Season.SUMMER;
        System.out.println(season);

        /**
         * Cách lấy ra một list enum
         * Mỗi enum đều sẽ có một giá trị int.
         * Các giá trị này tượng trưng cho vị trí khai báo của từng enum value
         * ---------
         * Không thể so sánh các giá trị int với các giá trị enum
         */
        for (Season seasonList : Season.values()) {
            System.out.println(seasonList.name() + " " + seasonList.ordinal()); //WINTER 0
        }
//        System.out.println(2 == Season.SPRING); not compile

        /**
         * Cách khai báo khác
         */
        Season s1 = Season.valueOf("SUMMER");

        /**
         * Không thể extend class enum
         */

        /**
         * Enum with Switch Statements
         */
        Season seasonWithSwitchCase = Season.valueOf("SPRING");
        switch (seasonWithSwitchCase) {
            case FALL:
                System.out.println("warm");
                break;
            case SUMMER:
                System.out.println("hot");
                break;
//          case Season.SPRING:    not compile

//          case 1: not compile
            default:
                System.out.println("don't have");
                // answer : don't have


                /**
                 * Adding Constructors , Fields , Methods (class)
                 */

                /**
                 * call method from enum class
                 */
                Season.SPRING.print();

                /**
                 * note about constructor
                 * Khi bạn yêu cầu gọi giá trị enum lần đầu tiên , java sẽ gọi đến constructor và in tất cả giá trị đấy,
                 * Sau đó java sẽ không gọi đến constructor nữa , mà thay vào đó chỉ in ra các giá trị
                 */

                /**
                 * abstract method (class)
                 *
                 */

        }
    }
}
