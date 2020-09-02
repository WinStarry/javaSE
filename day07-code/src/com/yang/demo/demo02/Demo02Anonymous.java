package com.yang.demo.demo02;

import java.util.Scanner;

/**
 * @data 2020/8/28 -7:39
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
/*
//        普通使用方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        匿名对象的方式
        int i = new Scanner(System.in).nextInt();
        System.out.println(i);
*/

//        使用一般方法传入参数
        Scanner sc = new Scanner(System.in);
        methodParam(sc);

//        使用匿名对象进行传参
        methodParam(new Scanner(System.in));

        Scanner sc1 = methodReturn();
        int i = sc1.nextInt();
        System.out.println(i);
    }

    public static void methodParam( Scanner sc){
        int i = sc.nextInt();
        System.out.println(i);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;

        return new Scanner(System.in);
    }
}
