package com.yang.demo.demo07Synchronized;

/*
卖票案例出现了线程安全问题
卖出了不存在的票和重复的票

解决线程安全问题的第一种方式：使用同步代码块
格式：
    synchronized(锁对象){
        可能出现线程安全的代码块(访问了共享数据的代码块)
    }

注意：
    1.通过代码块中的锁对象，可以使用任意对象
    2.但是保证多个线程使用的锁对象是同一个
    3.锁对象的作用：
        把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj=new Object();

    //设置线程任务卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while(true){
            //同步代码块
            synchronized (obj){
                //先判断票是否存在
                if(ticket>0){
                    try {
                        //提高安全问题出现的概率，让程序睡眠
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //票存在则卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }
}
