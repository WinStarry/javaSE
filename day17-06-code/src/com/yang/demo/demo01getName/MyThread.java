package com.yang.demo.demo01getName;

/*
获取线程的名称：
    1.使用Thread类中的getName()方法
        String getName() 返回线程的名称
    2.可以先获取当前正在执行的线程，使用线程中的getName()方法获取线程的名称
        static Thread currentThread() 返回对当前正在执行的线程对象的索引
 */
//定义一个Thread类的子类
public class MyThread extends Thread {
    //重写Thread类中的run()方法，设置线程任务
    @Override
    public void run() {
        //获取线程名称
        /*String name = getName();
        System.out.println(name);*/

        Thread t = Thread.currentThread();
        System.out.println(t);

        String name = t.getName();
        System.out.println(name);
    }
}
