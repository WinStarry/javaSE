package com.yang.test.test03;

/**
 * @data 2020/9/4 -11:56
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("大黑只想吃骨头！");
    }

    public void run(){
        System.out.println("大黑喜欢跑来跑去！");
    }
}
