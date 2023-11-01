package com.tom.test.newfeatures.concurrent;

public class AltPrinter {

    private int state;
    private static final Object LOCK = new Object();
    private final int limit = 100;


    public static void main(String[] args) {
        AltPrinter printABC = new AltPrinter();
        new Thread(() -> {
            printABC.printLetter("A", 0);
        }, "A").start();
        new Thread(() -> {
            printABC.printLetter("B", 1);
        }, "B").start();
        new Thread(() -> {
            printABC.printLetter("C", 2);
        }, "C").start();
    }

    private void printLetter(String name, int targetState) {
        while (true) {
            synchronized (LOCK) {
                while (state % 3 != targetState) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (state == limit) {
                    System.exit(0);
                    break;
                }
                state++;
                System.out.println(state);
                LOCK.notifyAll();
            }
        }
    }
}
