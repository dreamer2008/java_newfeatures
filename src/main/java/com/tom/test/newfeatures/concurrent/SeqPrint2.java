package com.tom.test.newfeatures.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SeqPrint2 {
    static final ReentrantLock lock = new ReentrantLock();
    static final Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            try {
                lock.lock();
                condition.await();
                System.out.println("1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "t1");

        Thread t2 = new Thread(() -> {

            try {
                lock.lock();
                System.out.println("2");
                condition.signal();
            } finally {
                lock.unlock();
            }
        }, "t2");

        t1.start();
        t2.start();
    }


}
