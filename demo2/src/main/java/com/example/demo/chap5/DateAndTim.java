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
    }
}
