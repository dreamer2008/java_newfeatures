package com.tom.test.newfeatures.java8;

public class StripTest {

    public static void main(String[] args) {

        String test1="测试\u0020";//半角unicode
        System.out.println(test1.trim().length());//2
        System.out.println(test1.strip().length());//2

//        String test2="测试\u3000";//全角unicode
        String test2="测试  ";//全角unicode
        System.out.println(test2.trim());//3
        System.out.println(test2.strip());//2

        String test3="测试 ";//半角空白字符
        System.out.println(test3.trim().length());//2
        System.out.println(test3.strip().length());//2

        String test4="测试　";//全角空白字符
        System.out.println(test4.trim().length());//3
        System.out.println(test4.strip().length());//2

        String test5="测试  ";//两个半角空白字符
        System.out.println(test5.trim().length());//2
        System.out.println(test5.strip().length());//2
    }

}
