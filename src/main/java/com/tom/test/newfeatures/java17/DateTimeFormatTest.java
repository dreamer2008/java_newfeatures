package com.tom.test.newfeatures.java17;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatTest {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B").withLocale(Locale.ENGLISH);
        System.out.println(dtf.format(LocalTime.of(3, 0)));
        System.out.println(dtf.format(LocalTime.of(5, 0)));
        System.out.println(dtf.format(LocalTime.of(6, 0)));     //morning
        System.out.println(dtf.format(LocalTime.of(8, 0)));
        System.out.println(dtf.format(LocalTime.of(11, 0)));
        System.out.println(dtf.format(LocalTime.of(12, 0)));    //noon
        System.out.println(dtf.format(LocalTime.of(12, 30)));
        System.out.println(dtf.format(LocalTime.of(13, 0)));
        System.out.println(dtf.format(LocalTime.of(18, 0)));    //evening
        System.out.println(dtf.format(LocalTime.of(20, 0)));
        System.out.println(dtf.format(LocalTime.of(23, 0)));    //night
        System.out.println(dtf.format(LocalTime.of(0, 0)));     //midnight
        System.out.println(dtf.format(LocalTime.of(0, 10)));
    }
}
