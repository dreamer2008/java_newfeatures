package com.tom.test.newfeatures.concurrent;

public class ThreadTest5 {

    public static void main(String[] args) {

        synchronized (ThreadTest5.class) {

        }
        m();

    }

    public static synchronized void m() {
    }
}
