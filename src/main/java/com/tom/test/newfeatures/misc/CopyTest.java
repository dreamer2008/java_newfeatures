package com.tom.test.newfeatures.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyTest {

    public static void main(String[] args) {
//        List<String> list1 = List.of("a","b");
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        for (String s: list1) {
            list2.add(s);
        }
        System.out.println(list2);
        list1.add("2");
        System.out.println(list1);
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(list1);
        System.out.println(list3);
        list1.add("3");
        System.out.println(list3);

        List<String> list4 = new ArrayList<>();
        list4.addAll(list1);
        System.out.println(list4);
        list1.add("4");
        System.out.println(list4);

        List<String> list5 = List.copyOf(list1);
        System.out.println(list5);
        list1.add("5");
        System.out.println(list5);

        List<String> list6 = new ArrayList<>(list1.size());
        for(int i = 0; i < list1.size(); i++) {
            list6.add("" + i * 2);
        }
        Collections.copy(list6, list1);
        System.out.println(list6);
        list1.add("5");
        System.out.println(list6);
    }
}
