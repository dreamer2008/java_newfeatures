package com.tom.test.newfeatures.concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadTest4 {

    static int r = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1  = new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    r = 10;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        long start = System.currentTimeMillis();
        t1.start();
        t1.join(5000);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "," + r);

    }
}
