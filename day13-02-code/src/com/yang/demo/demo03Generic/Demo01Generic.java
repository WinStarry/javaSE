package com.yang.demo.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *使用泛型的好处
 */
public class Demo01Generic {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
    创建集合对象，不使用泛型
    好处：
        集合不使用泛型，默认的类型就是Object类型，可以存储任意的类型的数据
    弊端：
        不安全，会引发异常
     */
    private static void show01(){
        ArrayList list=new ArrayList();
        list.add("abc");
        list.add(11);

        //使用迭代器遍历集合
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);


            /*
            想要使用String类特有的方法，length获取字符串的长度
            需要向下转型
            会抛出ClassCastException类型转换异常，不能使用Integer类型转换成String类型
             */
            String s=(String)obj;
            System.out.println(s);
        }
    }


    /*
    创建集合对象，使用泛型
    好处：
        1.避免了类型转换的麻烦，存储的是什么类型，取出来就是什么类型
        2.把运行期异常（代码运行之后抛出的异常），提升到编译期写代码的时候的报错（）
    弊端：
        泛型是什么类型，就只能存储什么类型的数据
     */
    private static void show02(){
        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");

        //使用迭代器遍历list集合
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+"--->"+s.length());
        }
    }


}
