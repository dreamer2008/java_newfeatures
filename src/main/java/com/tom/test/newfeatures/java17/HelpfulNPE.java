package com.tom.test.newfeatures.java17;

public class HelpfulNPE {

    public static void main(String[] args) {
        String str = null;
        int len = str.substring(0,5).length();
        System.out.println(len);
    }


}
