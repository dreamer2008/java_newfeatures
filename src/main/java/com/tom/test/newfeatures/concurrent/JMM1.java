package com.tom.test.newfeatures.concurrent;

public class JMM1 {

    static boolean flag = true;
    public static void main(String[] args) {

        new Thread(()->{
           while(flag){
               System.out.println("...");
            }
        }).start();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
        System.out.println("end");
    }
}
