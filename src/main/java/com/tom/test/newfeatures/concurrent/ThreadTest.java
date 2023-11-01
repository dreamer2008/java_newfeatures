package com.tom.test.newfeatures.concurrent;

public class ThreadTest {

    public static void main(String[] args) {
        Thread t1 = new Thread("t1"){
            @Override
            public void run() {
                System.out.println("new thread");
            }
        };
        t1.start();

        System.out.println("main thread");
    }
}
