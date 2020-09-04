package com.yang.demo.test;

/**
 * @data 2020/9/4 -7:48
 */
public class TestDemo02 {
    public static void main(String[] args) {
        String s1="hello";

        char[] array={'h','e','l','l','o'};
        String s2 = new String(array);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("hello".equals(s2));
        System.out.println("hello".equals(s1));
        System.out.println("Hello".equalsIgnoreCase(s2));
    }
}
