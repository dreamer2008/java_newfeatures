package com.tom.test.newfeatures.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
        //方法引用：仅当该方法不修改lambda表达式提供的参数
        Comparator<Integer> comparator2 = Integer::compare;

        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("hello");

        String str = "hello";
        for (char c : str.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        //lambda表达式有个限制，那就是只能引用 final 或 final 局部变量
        List<Integer> primes = Arrays.asList(new Integer[]{2, 3, 5, 7});
        int factor = 2;
//        primes.forEach(element -> { factor++; });   //Compilation error
        primes.forEach(element -> {
            System.out.print(factor * element + " ");
        });
    }
}
