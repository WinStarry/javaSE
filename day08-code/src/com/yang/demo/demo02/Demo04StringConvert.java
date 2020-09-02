package com.yang.demo.demo02;

/**
 * @data 2020/8/28 -15:02
 */
/*
String中与转换相关的常用方法

public char[] toCharArray();将当前字符串拆分成字符数组作为返回值
public byte[] getBytes();获取当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString);
将所有出现的老字符串替换为新字符串，返回替换之后的结果新字符串
备注：CharSequence意思就是说可以接受字符串类型
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
//        转换成为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

//        转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

//        字符串的内容替换
        String str1="How do you do?";
        String str2=str1.replace("o","*");
        System.out.println(str1);//How do you do?
        System.out.println(str2);//H*w d* y*u d*?
    }
}
