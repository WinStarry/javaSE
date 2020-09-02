package com.yang.demo.demo03;

/**
 * @data 2020/8/27 -16:38
 */
/*
如何获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {

        int[] arrayA = new int[]{1, 3, 5, 62, 5, 5, 8, 3, 5, 8, 32, 7, 8, 3,};
        int len=arrayA.length;
        System.out.println("arrayA数组的长度是："+len);
    }
}
