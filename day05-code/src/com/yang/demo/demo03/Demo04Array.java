package com.yang.demo.demo03;

/**
 * @data 2020/8/27 -16:50
 */
/*
遍历数组，说的就是对数组中的每一个元素进行逐一、挨个儿处理。默认的处理方式就是打印输出。
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array={5,15,25,35,45,55,65};

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("===============");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
