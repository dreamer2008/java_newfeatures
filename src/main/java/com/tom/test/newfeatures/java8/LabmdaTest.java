package com.tom.test.newfeatures.java8;

import java.util.Comparator;
import java.util.function.Consumer;

public class LabmdaTest {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("run...");
            }
        };
        Runnable r2 = () -> System.out.println("run2...");
        r2.run();

        Comparator<Integer> comparator = (o1, o2) -> {
            return Integer.compare(o1, o2);
        };
        //Lambda表达式
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o1, o2);
        //方法引用
        Comparator<Integer> comparator2 = Integer::compare;

        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("hello");

        String str = "hello";
        for (char c : str.toCharArray()) {
            System.out.println(c + ", ");
        }
    }
}
