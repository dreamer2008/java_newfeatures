package com.tom.test.newfeatures.concurrent;

public class SeqPrint1 {
    static final Object lock = new Object();
    static boolean t2run = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (!t2run) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("1");
            }
        }, "t1");

        Thread t2 = new Thread(() -> {

            synchronized (lock) {
                System.out.println("2");
                t2run = true;
                lock.notify();
            }
        }, "t2");

        t1.start();
        t2.start();
    }


}
