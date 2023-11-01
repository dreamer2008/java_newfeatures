package com.tom.test.newfeatures.concurrent;

public class ThreadsTest {

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread("a");
        print(a);
        Thread b = new Thread("b");
        print(b);
        Thread c = new Thread("c");
        print(c);
    }

    public static void print(Thread t) throws InterruptedException {
        t.start();
        t.join();
        System.out.println("success " + t.getName());
    }
}
