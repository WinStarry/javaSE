# day17-06-notes

### 多线程运行原理-随机性打印结果

![多线程随机性打印结果](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911091513611-731204315.png)



---



### 多线程原理-多线程内存图解

![多线程内存图解](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911091552722-905662140.png)



---



### Thread类的常用方法

#### 获取线程名称的方法

1. 使用Thread类中的`getName()`方法；`String getName()` 返回线程的名称。

```java
//定义一个Thread类的子类
public class MyThread extends Thread {
    //重写Thread类中的run()方法，设置线程任务
    @Override
    public void run() {
        //获取线程名称
        String name = getName();
        System.out.println(name);
    }
}

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
Thread-0
Thread-2
Thread-1
 */
```



2. 可以先获取当前正在执行的线程，使用线程中的`getName()`方法获取线程的名称
       `static Thread currentThread()` 返回对当前正在执行的线程对象的索引

```java
//定义一个Thread类的子类
public class MyThread extends Thread {
    //重写Thread类中的run()方法，设置线程任务
    @Override
    public void run() {
        //获取线程名称

        Thread t = Thread.currentThread();
        System.out.println(t);

        String name = t.getName();
        System.out.println(name);
    }
}


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
```

#### 设置线程的名称(了解)

1. 使用Thread类中的`setName`(名字)

   ​	`void setName(String name)` 改变线程名称，使之与参数 `name `相同。

```java
public class MyThread extends Thread{
    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}


public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("这里是设置线程名字的地方！");
        mt.start();
    }
}
/*
这里是设置线程名字的地方！
 */
```



1. 创建一个带参数的构造方法，参数传递线程的名称；在这个构造方法中调用父类的带参构造方法，把线程名称传递给父类，让父类(`Thread`)给子类线程起一个名字。

   ​	`Thread(String name) `分配新的 Thread 对象。

```java
public class MyThread extends Thread{
    public MyThread(){
    }

    public MyThread(String name){
        super(name);//把线程名称传递给父类，让父类(Thread)给子类线程起一个名字
    }
    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}


public class Demo01SetThreadName {
    public static void main(String[] args) {       
        //开启多线程
        new MyThread("这是设置线程名称的第二种方式").start();//这里是设置线程名字的地方！
    }
}
```



#### sleep()方法

- static void sleep(long millis)  在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）

  ​	毫秒数结束之后，线程继续执行

```java
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                //使用Thread类的sleep()方法让程序睡眠1秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```



---

### 创建线程的第二种方式-实现Runnable接口

```
创建多线程程序的第二种方式：实现Runnable接口
    java.lang.Runnable
        Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法
    java.lang.Thread类的构造方法
        Thread(Runnable target) 分配新的 Thread 对象。
        Thread(Runnable target, String name) 分配新的 Thread 对象。

实现步骤：
    1.创建一个Runnable类接口的实现类
    2.在实现类中重写Runnable接口的run()方法，设置线程任务
    3.创建一个Runnable接口的实现类对象
    4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象。
    5.调用Thread类中的start()方法，开启新的线程执行run()方法。
```



```java
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


public class Demo01Runnable {
    public static void main(String[] args) {
        //3.创建一个Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象。
        Thread t = new Thread(run);
        //5.调用Thread类中的start()方法，开启新的线程执行run()方法。
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
```

```
实现Runnable接口创建多线程程序的好处
    1.避免了单继承的局限性
        一个类只能继承一个父类，一个类继承了Thread类之后就不能继承其他类了
        实现了Runnable接口,还可以继承其他类，实现其他接口
    2.增强了程序的扩展性，降低了程序的耦合性(解耦)
        实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离(解耦)
        实现类中重写了run()方法：用来设置线程任务
        创建Thread类对象，调用start()方法
        
推荐使用第二种方式开启多线程任务
```

---

#### 匿名内部类方式实现线程的创建

```
匿名内部类实现线程的创建
    匿名：没有名字
    内部类：写在其他类内部的类
    匿名内部类的作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象合成一步
        把实现类实现接口，重写接口中的方法，创建实现类对象合成一步完成。
    匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

    格式：
        new 父类/接口(){
            重写父类/接口中的方法
        };
```

```java
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }.start();



        //线程的接口
        Runnable r=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+"hello");
                }
            }
        };
        new Thread(r).start();

        //简化接口的方式
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+"world");
                }
            }
        }).start();
    }
}
```



---

### 线程安全问题

#### 概述

![线程安全问题的概述](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911091651425-9001248.png)

#### 代码实现

```java
/*
实现卖票案例
 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享票源
    private int ticket = 100;

    //设置线程任务卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while(true){
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



/*
模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start()方法开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
```



---

#### 线程安全问题产生的原理

![线程安全问题产生的原理](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911091739701-1335047971.png)

---

#### 解决线程安全问题-同步代码块

```
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
```

```java
//卖票案例出现了线程安全问题
//卖出了不存在的票和重复的票
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


/*
模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start()方法开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
```

---

#### 同步技术的原理

![同步的原理](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911091816006-1870213687.png)

---

#### 解决线程安全问题-同步方法

```
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
```

```java
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



/*
模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start()方法开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
```

---

#### 解决线程安全问题-Lock锁

```
卖票案例出现了线程安全问题
卖出了不存在的票和重复的票
解决线程安全的第三种方案：使用Lock锁

java.util.concurrent.locks.lock接口
Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
Lock接口中的方法：
    void lock() 获取锁。
    void unlock() 释放锁。
java.util.concurrent.locks.ReentrantLock implements Lock接口

使用步骤：
    1.在成员位置创建一个ReentrantLock对象
    2.在可能会出现安全问题的代码前调用Lock接口中调用Lock获取锁
    3.在可能会出现安全问题的代码后调用Lock接口中调用unLock释放锁
```

```java
public class RunnableImpl implements Runnable {
    //定义一个多线程共享票源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    Lock l=new ReentrantLock();

    //设置线程任务卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while(true){
            //2.在可能会出现安全问题的代码前调用Lock接口中调用Lock获取锁
            l.lock();

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

            //3.在可能会出现安全问题的代码后调用Lock接口中调用unLock释放锁

            l.unlock();
        }
    }
}



/*
模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start()方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
```

代码改进

```java
public class RunnableImpl implements Runnable {
    //定义一个多线程共享票源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    Lock l=new ReentrantLock();
    //设置线程任务卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while(true){
            //2.在可能会出现安全问题的代码前调用Lock接口中调用Lock获取锁
            l.lock();

            //先判断票是否存在
            if(ticket>0){
                try {
                    //提高安全问题出现的概率，让程序睡眠
                    Thread.sleep(10);
                    //票存在则卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    //3.在可能会出现安全问题的代码后调用Lock接口中调用unLock释放锁
                    l.unlock();//无论程序是否异常，都会把锁释放
                }
                
            }

           
        }
    }
}



/*
模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start()方法开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
```

---

#### 线程状态概述

![线程的状态图](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911091928477-1279294812.png)

---

#### 等待唤醒案例分析

`Timed Waiting`线程状态图

![计时等待](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911092021838-850242730.png)

`Blocked` 线程状态图
![锁阻塞](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911092056371-610569449.png)

`Waiting`(无限等待)

![无限等待](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911092132769-1002394982.png)

![等待唤醒案例分析](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200911092226157-207848545.png)

#### 等待唤醒案例代码实现

```
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
```

```java
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
```

---

#### Object类中wait()带参方法和notifyAll()方法

```
进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(Long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait(Long m)方法，wait()方法如果在毫秒值结束之后，还没有被notify()唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

唤醒方法：
    void notify() 唤醒在此对象监视器上等待的单个线程。
    void notifyAll() 唤醒在此对象监视器上等待的所有线程。
```







