package com.yang.demo.test;

/**
 * @data 2020/9/4 -8:36
 */
public class TestDemo05 {
    static{
        System.out.println("这是一个静态代码块！");
    }
    public static void main(String[] args) {
        Person p = new Person("xiaoyang",18);

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(Person.guoji);

        p.print2();
        Person.print1();

    }
}
/*
static修饰的成员变量不再属于某个对象，而是属于一个类，调用时需要使用类名进行调用
static修饰的成员方法，需要使用类名进行调用，不推荐使用对象名进行调用
静态代码块的执行优先于非静态代码块！
 */