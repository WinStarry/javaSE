package com.yang.demo.test.test02;

import com.yang.demo.test.test01.Person;

/**
 * @data 2020/9/3 -17:33
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("tianqi");
        p.setAge(21);
        System.out.println("我是"+p.getName()+",今年"+p.getAge()+"了！");
    }
}
