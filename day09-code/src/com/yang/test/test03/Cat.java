package com.yang.test.test03;

/**
 * @data 2020/9/4 -11:56
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("我是阿猫，我只想吃鱼鱼！");
    }

    public void sleep(){
        System.out.println("阿猫喜欢睡懒觉！");
    }
}
