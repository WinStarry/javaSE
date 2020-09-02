package com.yang.demo.demo04;

import java.util.ArrayList;

/**
 * @data 2020/8/28 -8:44
 */
/*
ArrayList当中的常用方法有：

public boolean add(E e); 向集合中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合来说，add添加动作不一定会成功。
public E get(int index); 从集合中获取元素，参数是索引编号 ，返回值就是对应位置的元素。
public E remove(int index); 从集合中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size(); 获取集合的尺寸长度，返回值是集合中包含的元素的个数。
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

//        向集合中添加元素：add
        list.add("小黑");
        list.add("小兰");
        list.add("小红");
        System.out.println(list);

//        从集合中获取元素：get.索引值从0开始
        String name = list.get(1);
        System.out.println("第1号索引位置："+name);

//        从集合中删除元素：remove 索引从0开始
        String whoRemove = list.remove(2);
        System.out.println("被删除的元素："+whoRemove);

//        获取集合中的长度，也就是集合中元素的个数
        int size = list.size();
        System.out.println("集合的长度："+size);

    }
}
