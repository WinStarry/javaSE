package com.yang.demo.demo04Runnable;

/*

 */
//1.创建一个Runnable类接口的实现类
public class RunnableImpl implements Runnable {
    //2.在实现类中重写Runnable接口的run()方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
