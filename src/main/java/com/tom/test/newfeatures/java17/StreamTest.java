package com.tom.test.newfeatures.java17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList = stringStream.toList();
        for (String s : stringList) {
            System.out.println(s);
        }

        // old style
        /*
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList =  stringStream.collect(Collectors.toList());
        for(String s : stringList) {
            System.out.println(s);
        }
         */

    }
}
