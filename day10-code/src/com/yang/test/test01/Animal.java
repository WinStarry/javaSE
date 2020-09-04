package com.yang.test.test01;

/**
 * @data 2020/9/4 -10:11
 */
public abstract interface Animal {
    public abstract void eat();
    public default void sleep(){
        System.out.println("动物也要休息呀！");
    }
    public static void run(){
        System.out.println("动物也经常运动呀！");
    }
}
