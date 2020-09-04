package com.yang.demo.test;

import java.util.Arrays;

/**
 * @data 2020/9/4 -9:00
 */
public class TestDemo06 {
    public static void main(String[] args) {

        /*

        java.util.Arrays 是一个与数组相关地工具类，里面提供了大量静态方法，用来实现数组常见地操作。

            public static String toString(数组);将参数数组变成字符串（按照默认格式：[元素1,元素2,元素3,...]）
            public static void sort(数组);按照默认升序（从小到大）对数组的元素进行排序
         */

        int[] arr = {1, 3, 5, 7, 9};
        String s = Arrays.toString(arr);
        System.out.println(s);
        System.out.println("==============");

        int[] arr2 = {9, 4, 7, 6, 3, 2, 8, 1};
        for (int i = 0; i < arr2.length; i++) {
        Arrays.sort(arr2);
        System.out.println(arr2[i]);
        }
    }
}
