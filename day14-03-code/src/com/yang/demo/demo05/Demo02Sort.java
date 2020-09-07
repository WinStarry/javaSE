package com.yang.demo.demo05;

import java.util.ArrayList;
import java.util.Collections;

/*
java.utils.Collections是集合工具类，用来对集合进行操作。
public static <T> void sort(List<T> list):将集合中的元素按默认规则进行排序
注意：
    sort(List<T> list)的使用前提：
        被排序的集合里边的元素必须实现Comparable,重写接口中的CompareTo()方法定义排序的规则

Comparable接口的排序规则：
    自己(this)-参数：升序；反之降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("张三",19));
        list.add(new Person("李四",17));
        list.add(new Person("王五",20));
        System.out.println(list);//[Person{name='张三', age=18}, Person{name='李四', age=19}, Person{name='王五', age=20}]

        Collections.sort(list);
        System.out.println(list);
    }
}
