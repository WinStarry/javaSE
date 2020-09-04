package com.yang.demo.test;

/**
 * @data 2020/9/4 -8:25
 */
public class TestDemo04 {
    public static void main(String[] args) {
        print();
        TestDemo04.print();
    }

    public static void print(){
        System.out.println("这是一个非静态方法！");
    }
}
/*
静态方法不能调用非静态方法，可以调用静态方法；非静态方法可以调用非静态方法，也可以调用静态方法
在一个类中调用静态方法可以省略类名不写，直接写方法名即可调用静态方法
 */