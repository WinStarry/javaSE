package com.yang.demo.demo01setName;

/*

 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("这里是设置线程名字的地方！");
        mt.start();

        //开启多线程
        new MyThread("这是设置线程名称的第二种方式").start();//这里是设置线程名字的地方！
    }
}
/*
这里是设置线程名字的地方！
 */