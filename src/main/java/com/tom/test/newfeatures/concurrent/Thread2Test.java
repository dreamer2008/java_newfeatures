package com.tom.test.newfeatures.concurrent;

public class Thread2Test {

    public static void main(String[] args) {

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread 2");
//            }
//        };
        Runnable r = () -> {
            System.out.println("thread 2");
        };
        Thread t2 = new Thread(r);
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());


    }
}
