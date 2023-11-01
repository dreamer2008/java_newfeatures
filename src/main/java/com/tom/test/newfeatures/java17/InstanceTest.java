package com.tom.test.newfeatures.java17;

public class InstanceTest {

    public static void main(String[] args) {
        Number x = Integer.valueOf("100");
        if (x instanceof Integer n) {
            System.out.println(x.intValue());
        }
    }
}
