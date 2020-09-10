package com.yang.demo.demo08Synchronized;

/*
卖票案例出现了线程安全问题
卖出了不存在的票和重复的票

解决线程安全的第二种方案：使用同步方法
使用步骤：
    1.把访问了共享数据的代码抽取出来，放到一个方法中
    2.在方法上添加synchronized修饰符

格式：
    修饰符 synchronized 返回值类型 方法名(参数列表){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享票源
    private int ticket = 100;

    //设置线程任务卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while(true){
            payTicket();
        }
    }

    /*
    定义一个同步方法
    同步方法也会把方法内部的代码锁住，只让一个线程执行
    同步方法的锁对象也就是实现类对象 new RunnableImpl(), 也就是this
     */
    public synchronized void payTicket(){
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
