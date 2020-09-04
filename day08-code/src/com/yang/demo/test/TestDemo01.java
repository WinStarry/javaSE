package com.yang.demo.test;

/**
 * @data 2020/9/4 -7:40
 */
public class TestDemo01 {
    public static void main(String[] args) {
//        创建一个空参数组
        String s1 = new String();
        System.out.println("这是空参数组:" + s1);

//        创建一个字符数组
        char[] array2 = {'A', 'B', 'C'};
        String s2 = new String(array2);
        System.out.println("这是一个字符数组：" + s2);

//        创建一个字节数组
        byte[] array3 = {97, 98, 99};
        String s3 = new String(array3);
        System.out.println("这是一个字节数组：" + s3);
    }
}
