package com.tom.test.newfeatures.concurrent;

public class SeqPrint5 {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            System.out.println("1");
        }, "t1");

        Thread t2 = new Thread(() -> {
            System.out.println("2");
        }, "t2");

        Thread t3 = new Thread(() -> {
            System.out.println("3");
        }, "t3");


        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }


}
