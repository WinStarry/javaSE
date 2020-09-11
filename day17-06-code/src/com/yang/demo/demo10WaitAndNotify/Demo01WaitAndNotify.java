package com.yang.demo.demo10WaitAndNotify;

/*
等待唤醒案例：线程之间的通信
    创建一个顾客线程(消费者)：告知老板要的包子的种类和数量，调用wait()方法，放弃cpu的执行，进入到WAITING状态(无限等待)
    创建一个老板线程(生产者)：花了5秒做包子，做好包子之后，调用notify()方法，唤醒顾客吃包子
注意：
    顾客和老板线程必须使用同步代码块包裹起来，保证等待与唤醒只能有一个在执行
    同步锁对象必须保证唯一
    只有锁对象才能调用wait()和notify()方法

Object类中的方法
    void wait() 在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
    void notify() 唤醒在此对象监视器上等待的单个线程。会继续执行wait()方法之后的代码
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while(true){
                    //保证等待与唤醒只能有一个在执行,需要使用同步技术
                    synchronized (obj){
                        System.out.println("告知老板要的包子的种类和数量");
                        //调用wait()方法，放弃cpu的执行，进入到WAITING状态(无限等待)
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃！");
                        System.out.println("------------------------------");
                    }
                }
            }
        }.start();

        //创建一个人老板线程(生产者)
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //花5秒做包子
                    try {
                        Thread.sleep(5000);//花5秒做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待与唤醒只能有一个在执行,需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板5秒之后做好包子，告知顾客，可以吃包子了");
                        //做好包子之后，调用notify()方法，唤醒顾客吃包子
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
