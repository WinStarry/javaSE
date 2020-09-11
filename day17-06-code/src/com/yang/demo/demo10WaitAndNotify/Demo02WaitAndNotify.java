package com.yang.demo.demo10WaitAndNotify;

/*
进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(Long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait(Long m)方法，wait()方法如果在毫秒值结束之后，还没有被notify()唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

唤醒方法：
    void notify() 唤醒在此对象监视器上等待的单个线程。
    void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class Demo02WaitAndNotify {
}
