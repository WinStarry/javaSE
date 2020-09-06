package com.yang.demo.demo01;

/**
 * @data 2020/8/27 -15:22
 */
/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组中元素的个数。
静态初始化（指定内容）：在创建数组的时候，不直接指定数组元素的个数，而是直接将数组的具体内容进行指定。

静态初始化的基本格式：
数据类型[] 数组名称=new 数据类型[]{元素1,元素2,元素3,...};

注意事项：
虽然静态初始化没有直接告诉长度，但是根据大括号里面元素的具体内容，也可以自动推算出来长度。
 */
public class Demo02Array {
    public static void main(String[] args) {
//        直接创建一个数组，里面装的全都是int数字，具体为:5,15,25
        int[] arrayA=new int[]{5,15,25};

//        创建一个数组，用来装字符串："hello"、"world"、"java"
        String[] arrayB=new String[]{"hello","world","java"};
    }
}
