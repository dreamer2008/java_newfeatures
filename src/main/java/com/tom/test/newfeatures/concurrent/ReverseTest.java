package com.tom.test.newfeatures.concurrent;

public class ReverseTest {

    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("001"));
        int[] arr = {10, 20, 30, 40, 50};
            reverse2(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
        }
    }

    public static void reverse2(int[] a) {
        int temp, len = a.length;
        for (int i = 0; i < len/2; i++) {
            temp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = temp;
        }
//        System.out.println("in ");
//        for (int i = 0; i < len; i++) {
//            System.out.print(a[i]);
//        }
    }
}
