package com.tom.test.newfeatures.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread3Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> f = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("running");
                Thread.sleep(2000);
                return 2021;
            }
        });
        System.out.println("main thread");
        Thread t = new Thread(f,"tt");
        t.start();

        System.out.println(f.get());
    }
}
