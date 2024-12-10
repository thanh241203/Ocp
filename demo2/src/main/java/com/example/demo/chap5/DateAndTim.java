package com.example.demo.chap5;

import java.time.*;

public class DateAndTim {
    public static void main(String[] args) {
        //local date : chỉ chứa ngày
        System.out.println("local date : " + LocalDate.now());

        //local date time : chứa ngày và giờ
        System.out.println("local Date Time : " + LocalDateTime.now());

        //local time : chứa giờ
        System.out.println("local time :" + LocalTime.now());

        //Zone date time : chứa ngày , giờ , vùng hiện tại
        System.out.println("zone date time : " + ZonedDateTime.now());

        /**
         * How UTC works
         */
        //create ZoneDateTime
        ZonedDateTime localDateTime = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh")); // Vietnam Time
        System.out.println("Local Time: " + localDateTime); // Viet Nam :2024-12-06T16:13:20

        //convert to UTC
        ZonedDateTime zonedDateTime = localDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("time in UTC:" + zonedDateTime); // Europe : 2024-12-06T09:13:20

        /**
         * Specific dates and times
         */
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        // có thể chuyền số kiểu int
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        /**
         *  Month :  là một lớp enum không phải là int , nên không thể so sánh được với dạng số
         */
        Month month = Month.MAY;
//        boolean b1 = month == 1; // Don't complie
        boolean b2 = month == Month.AUGUST;
        System.out.println(b2); // false

        /**
         * Mặc dù java bắt đầu từ 0 . Nhưng month là một exception , sẽ bắt đầu từ 1
         */
        LocalDate localDateYear = LocalDate.of(0, 1, 1);
        System.out.println(localDateYear); //0000-01-01
        LocalTime localTime123 = LocalTime.of(0, 0, 0, 0);
        System.out.println(localTime123);
        LocalDate localDateMonth = LocalDate.of(0, 1, 1);
//        System.out.println(localDateMonth); //Exception : Invalid value for MonthOfYear (valid values 1 - 12): 0
        LocalDate localDateDay = LocalDate.of(0, 1, 0);
//        System.out.println(localDateDay); //Exception :  Invalid value for DayOfMonth (valid values 1 - 28/31): 0

        /**
         * khi tạo mới một time, bạn có thể chỉ định chi tiết bạn muốn, thậm chí đến cả nano giây
         */
        // public static LocalTime of(int hour, int minute, int second, int nanos)

        LocalTime localTime = LocalTime.of(1, 1, 1, 1);
        LocalDateTime dateTime = LocalDateTime.of(1, 1, 1, 1, 1, 1, 1);
        LocalDate localDate = LocalDate.of(1, 1, 1); // chi áp dụng đến ngày
        /**
         * Combine dates và time trong cùng một object:
         */
        //cách 1
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime1); //2015-01-20T06:15:30
        //cách 2
        LocalDate localDate1 = LocalDate.of(2025, 1, 20);
        LocalTime localTime1 = LocalTime.of(6, 15, 30);
        LocalDateTime dateTime12 = LocalDateTime.of(localDate1, localTime1);
        System.out.println(dateTime12);//2015-01-20T06:15:30

        /**
         * time zone
         */
        ZoneId zoneId = ZoneId.of("US/Eastern");
        //khai báo trực tiếp
        ZonedDateTime time = ZonedDateTime.of(2025, 1, 20, 6,
                15, 30, 200, zoneId);
        // khai báo localDate , localTime , ZoneId vào trong
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date1, localTime, zoneId);
        //khai báo localDateTime
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(dateTime1, zoneId);

        /**
         * finding time zone
         */

    }
}
