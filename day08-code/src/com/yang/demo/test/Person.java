package com.yang.demo.test;

/**
 * @data 2020/9/4 -8:32
 */
public class Person {
    static String guoji="China";
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void print1(){
        System.out.println("这是一个静态的方法");
    }

    public void print2(){
        System.out.println("这是一个非静态的方法！");
    }
}
