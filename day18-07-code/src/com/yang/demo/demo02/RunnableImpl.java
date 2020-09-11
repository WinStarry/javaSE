package com.yang.demo.demo02;

/*
2.创建一个类实现Runnable接口，重写run()方法，设置线程池任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行！");
    }
}
