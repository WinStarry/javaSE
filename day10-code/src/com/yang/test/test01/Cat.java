package com.yang.test.test01;

/**
 * @data 2020/9/4 -10:11
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("我是阿猫，我只想吃鱼鱼！");
    }

    @Override
    public void sleep() {
        System.out.println("阿猫酷爱睡懒觉！");
    }

    public static void run(){
        System.out.println("阿猫喜欢酷跑！");
    }
}
