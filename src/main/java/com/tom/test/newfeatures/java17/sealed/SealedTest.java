package com.tom.test.newfeatures.java17.sealed;

public class SealedTest {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Pear pear = new Pear();
        Fruit fruit = apple;
        class Avocado extends Apple {};
//        class Banana extends Fruit {};

    }
}


