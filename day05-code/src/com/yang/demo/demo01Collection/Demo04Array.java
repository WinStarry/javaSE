package com.yang.demo.demo01Collection;

/**
 * @data 2020/8/27 -15:48
 */
/*
直接打印数组的名称，得到的是数组对应的：内存地址的哈希值。

访问数组元素的格式：数组名称[索引值];
索引值：就是一个int数字，代表数组中元素的编号
【注意】：索引值从0开始，一直到数组的长度-1为止。
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30};

        System.out.println(array);
        System.out.println("===============");

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("===============");

        int num=array[1];
        System.out.println(num);
    }
}
