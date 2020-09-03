package com.yang.test;

import java.util.ArrayList;

/**
 * @data 2020/9/3 -18:14
 */
/*
public boolean add(E e); 向集合中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合来说，add添加动作不一定会成功。
public E get(int index); 从集合中获取元素，参数是索引编号 ，返回值就是对应位置的元素。
public E remove(int index); 从集合中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size(); 获取集合的尺寸长度，返回值是集合中包含的元素的个数。
 */
public class TestDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        System.out.println(list);
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("xiaoliu");
        list.add("tianqi");
//        System.out.println(list);
//        System.out.println(list.get(0));
        System.out.println("该集合中的元素个数是："+list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("集合中被删除的元素是："+list.remove(2));
    }
}
