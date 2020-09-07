package com.yang.demo.demo02;

import java.util.HashSet;

/*
HashSet存储自定义类型的元素

Set集合存储元素唯一：
    存储的元素(String,Integer,...Student,...Person,...)必须重写HashCode()方法和equals()方法

要求：
    同名同年龄视为同一个人，只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person对象
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("jack",18);
        Person p2=new Person("jack",18);
        Person p3=new Person("jack",19);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
