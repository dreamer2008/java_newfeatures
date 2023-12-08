package com.tom.test.newfeatures.java8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = Integer.parseInt("10");

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);
        if (a.isPresent()) {
            System.out.println(a.get());
        }

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(b.isPresent());
        System.out.println(b.get());

        String name = "Peter";
        Optional<String> c = Optional.of(name);
        c.ifPresent(value -> {
            System.out.println("The length of the value is: " + value.length());
        });
    }
}
