package com.yang.demo.demo01getName;

/*
线程的名称
    主线程：main
    新线程：Thread-0,Thread-1,Thread-2

 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start()方法，开启新线程，执行run()方法
        mt.start();

        new MyThread().start();
        new MyThread().start();
    }
}
/*
Thread[Thread-0,5,main]
Thread-0
Thread[Thread-1,5,main]
Thread-1
Thread[Thread-2,5,main]
Thread-2

 */