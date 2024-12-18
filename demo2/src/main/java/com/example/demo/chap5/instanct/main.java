package com.example.demo.chap5.instanct;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class main {
    public static void main(String[] args) {
        /** Instant
         * là một khoảng khắc nhất định trong UTC time zone
         */
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        Instant instant1 = Instant.now();
//        System.out.println(instant1);
//
//        Duration duration = Duration.between(instant, instant1);
//        System.out.println(duration.toMillis());

        Instant instant = Instant.now();
        System.out.println("instace:"+instant);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("date time:" +dateTime);

        /**
         * Limitations
         */
        Instant beforeLeapSecond = Instant.parse("2016-12-31T23:59:58Z");
        Instant afterLeapSecond = beforeLeapSecond.plusSeconds(2);

        ZonedDateTime beforeLeap = ZonedDateTime.ofInstant(beforeLeapSecond, ZoneId.of("UTC"));
        ZonedDateTime afterLeap = ZonedDateTime.ofInstant(afterLeapSecond, ZoneId.of("UTC"));

        System.out.println("Trước leap second: " + beforeLeap);
        System.out.println("Sau leap second: " + afterLeap);
    }
}
