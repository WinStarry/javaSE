package com.yang.demo.demo02;

/**
 * @data 2020/8/28 -15:19
 */
/*
分割字符串的方法
public String[] split(String regex);根据参数的规则，将字符串切分成若干部分

注意事项：
split()方法的参数其实是一个“正则表达式”
如果想要用英文句点"."进行切分，必须写"\\."(两个分斜杠)
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc,d";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===========================");


        String str2="aa bb cc d";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===========================");

        String str3="xxx.yyy.zzz";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
