package com.tom.test.newfeatures.concurrent;

import java.util.UUID;

public class StringTest {

    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().replace("-","");
        System.out.println(s);
        int b = 'a' + 1;
        System.out.println(b);
        System.out.println(reverse(s));
        String str1 = "ABBA";
        System.out.println(isHuiwen(str1));
        String str2 = "ABBCC";
        System.out.println(isHuiwen(str2));
        String str3 = "CABAC";
        System.out.println(isHuiwen(str3));
    }

    public static String reverse(String str) {
        int len = str.length();
        String s = "";
        for (int i = len - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }



    public static boolean isHuiwen(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
