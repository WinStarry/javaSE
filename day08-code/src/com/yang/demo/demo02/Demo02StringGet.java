package com.yang.demo.demo02;

/**
 * @data 2020/8/28 -14:33
 */
/*
String中与获取相关的常用方法有：

public int length();获取字符串中含有的字符串个数，拿到字符串长度
public String concat(String str);将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index);获取指定索引位置的单个字符。（索引从0开始）
Public int indexOf(String str);查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值。
 */
public class Demo02StringGet {
    public static void main(String[] args) {
//        获取字符串长度
        int length = "ajdfjsaoxnbwifberysxa".length();
        System.out.println("该字符串的长度："+length);

//        拼接字符串
        String str1="hello";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str1);//hello
        System.out.println(str2);//world
        System.out.println(str3);//helloworld

//        获取指定索引位置的单个字符
        char ch = "hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);

//        查找参数字符串在本来字符串中出现的第一次索引位置
//        如果根本没有，返回-1值。
        String original="helloworld";
        int index = original.indexOf("llo");
        System.out.println("第一次的索引值是："+index);
    }
}
