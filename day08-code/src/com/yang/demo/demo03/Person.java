package com.yang.demo.demo03;

/**
 * @data 2020/8/28 -18:06
 */
public class Person {
    static{
        System.out.println("静态代码块执行！");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
