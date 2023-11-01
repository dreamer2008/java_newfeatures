package com.tom.test.newfeatures.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) throws Exception {
//        Predicate<String> predicate = (s) -> s.length() > 0;
//        predicate.test("foo");              // true
//        predicate.negate().test("foo");     // false
//
//        Method method = com.tom.test.newfeatures.java8.PredicateTest.class.getMethod("main", String[].class);
//        for (final Parameter parameter : method.getParameters()) {
//            System.out.println("Parameter: " + parameter.getName());
//
//        }
//
//        Optional< String > fullName = Optional.ofNullable( null );
//        System.out.println( "Full Name is set? " + fullName.isPresent() );
//        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
//        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );

        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("foo"));              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;


        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
