package com.tom.test.newfeatures.concurrent;

public class OddEvenPrinter2 {

    private final Object monitor = new Object();
    private final int limit;
    private volatile int count = 0;

    public OddEvenPrinter2(int limit) {
        this.limit = limit;
    }

    public void print() {
        synchronized (monitor) {
            while (count < limit) {
                try {
                    System.out.println(String.format("线程[%s]打印数字:%d", Thread.currentThread().getName(), ++count));
                    monitor.notify();
                    monitor.wait();
                } catch (InterruptedException e) {
                    //ignore
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        OddEvenPrinter2 printer = new OddEvenPrinter2(10);
        Thread thread1 = new Thread(printer::print, "thread-1");
        Thread thread2 = new Thread(printer::print, "thread-2");
        thread1.start();
        thread2.start();
    }
}