package com.yang.demo.test;

import java.sql.SQLOutput;

/**
 * @data 2020/9/4 -7:57
 */
/*

public int length();获取字符串中含有的字符串个数，拿到字符串长度
public String concat(String str);将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index);获取指定索引位置的单个字符。（索引从0开始）
Public int indexOf(String str);查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值。
 */
public class TestDemo03 {

    public static void main(String[] args) {
        String s1 = "hefkdsbivlyuavasxgjefw";
        System.out.println("该字符串长度是：" + s1.length());

        String s2 = "hello";
        System.out.println(s2.concat(s1));

        System.out.println("1号索引的字符是：" + s2.charAt(1));

        System.out.println(s2.indexOf("el"));
        System.out.println("=============================");

        /*
        字符串的截取方法

            public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串。
            public String substring(int begin,int end);截取从begin开始，一直到end结束，中间的字符串
            备注：[begin,end) 包含左边，不包含右边。
         */
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3, 5));

        System.out.println("===========================");

        /*
        String中与转换相关的常用方法

            public char[] toCharArray();将当前字符串拆分成字符数组作为返回值
            public byte[] getBytes();获取当前字符串底层的字节数组
            public String replace(CharSequence oldString,CharSequence newString);
            将所有出现的老字符串替换为新字符串，返回替换之后的结果新字符串
            备注：CharSequence意思就是说可以接受字符串类型
         */

        char[] chars = s2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        byte[] bytes = s2.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String s = s2.replace("ll", "*");
        System.out.println(s);
        System.out.println("======================");


        /*
        分割字符串的方法
            public String[] split(String regex);根据参数的规则，将字符串切分成若干部分

            注意事项：
            split()方法的参数其实是一个“正则表达式”
            如果想要用英文句点"."进行切分，必须写"\\."(两个分斜杠)
         */

        String s3="aaa,bbb,ccc";
        String[] strings = s3.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        String s4="AAA.BBB.CCC";
        String[] strings1 = s4.split("\\.");
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }
        System.out.println("============================");





    }
}
