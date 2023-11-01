package com.tom.test.newfeatures.java8;

import java.util.*;
import java.util.stream.Stream;

public class CollectionTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });

//        Collections.sort(names, (String a, String b) -> {
//            return a.compareTo(b);
//        });
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
//        Collections.sort(names, (a, b) -> b.compareTo(a));
//        Collections.sort(names, String::compareTo);
        System.out.println(names);

//        List names = new ArrayList();
//
//        names.add("Google");
//        names.add("Twle");
//        names.add("Taobao");
//        names.add("Baidu");
//        names.add("Sina");

        names.forEach(System.out::println);

        Stream s = Stream.of(1, 3 , 5);
        System.out.println(s.mapToInt(i -> (Integer) i).sum());
    }
}
