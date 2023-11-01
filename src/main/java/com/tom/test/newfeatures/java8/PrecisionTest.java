package com.tom.test.newfeatures.java8;

public class PrecisionTest {

    public static void main(String[] args) {
        double d = 114.145;
        String format = String.format("%.2f", d);
        System.out.println(format);
    }
}
