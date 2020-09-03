package com.yang.demo.test.test01;

import com.yang.demo.test.test01.Person;

/**
 * @data 2020/9/3 -17:09
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Person p1= new Person("张三",19);
        System.out.println("我是"+p1.getName()+",今年"+p1.getAge()+"岁了！");
        System.out.println("============================");


        Person p2 = new Person();
        p2.setName("lisi");
        p2.setAge(18);
        System.out.println("我是"+p2.getName()+",今年"+p2.getAge()+"岁了！");
    }

}
