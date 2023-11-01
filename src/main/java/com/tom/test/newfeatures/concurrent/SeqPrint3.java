package com.tom.test.newfeatures.concurrent;

import java.util.concurrent.locks.LockSupport;

public class SeqPrint3 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            LockSupport.park();
            System.out.println("1");
        }, "t1");

        Thread t2 = new Thread(() -> {
            System.out.println("2");
            LockSupport.unpark(t1);
        }, "t2");

        t1.start();
        t2.start();
    }


}
