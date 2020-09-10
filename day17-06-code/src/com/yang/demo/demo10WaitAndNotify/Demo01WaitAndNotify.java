package com.yang.demo.demo10WaitAndNotify;

/*
等待唤醒案例：线程之间的通信
    创建一个顾客线程(消费者)：告知老板要的包子的种类和数量，调用wait()方法，放弃cpu的执行，进入到WAITING状态(无限等待)
    创建一个老板线程(生产者)：花了5秒做包子，做好包子之后，调用notify()方法，唤醒顾客吃包子
注意：
 */
public class Demo01WaitAndNotify {
}
