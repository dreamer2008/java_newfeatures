package com.tom.test.newfeatures.concurrent;

import java.util.concurrent.locks.LockSupport;

public class SeqPrint4 {

    public static void main(String[] args) {
        Thread t3 = new Thread(() -> {
            LockSupport.park();
            System.out.println("3");
        }, "t3");

        Thread t2 = new Thread(() -> {
            LockSupport.park();
            System.out.println("2");
            LockSupport.unpark(t3);
        }, "t2");

        Thread t1 = new Thread(() -> {
            System.out.println("1");
            LockSupport.unpark(t2);
        }, "t1");


        t1.start();
        t2.start();
        t3.start();
    }


}
