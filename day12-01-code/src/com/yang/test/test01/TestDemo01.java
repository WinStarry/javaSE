package com.yang.test.test01;

import com.yang.test.test01.Person;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * @data 2020/9/4 -13:39
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Person p = new Person("xiaolong",18);
        System.out.println(p);
        System.out.println(p.toString());
        /*
            在我们直接使用输出语句输出对象名的时候,其实通过该对象调用了其toString()方法。
         */

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//覆盖重写了toString()方法



        Random r = new Random();
        System.out.println(r);//没有覆盖重写toString()方法
        System.out.println("=================================");


        Person p2 = new Person("xiaolong", 18);
        System.out.println(p.equals(p2));

        System.out.println(Objects.equals(p,p2));
    }
}
