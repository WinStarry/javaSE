package com.yang.demo.demo05;

/*
主线程：执行主(main)方法的线程
单线程程序：Java程序中只有一个线程
执行从main方法开始，从上到下一次执行

JVM执行main方法，main方法会进入到栈内存
JVM会找操作系统开辟一条main方法进入CPU的执行路径
CPU就可以通过这个路径来执行main方法
而这个路径有一个名字叫做main(主)路径
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        p1.run();

        Person p2 = new Person("李四");
        p2.run();

    }

}
