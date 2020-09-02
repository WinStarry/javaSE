package com.yang.demo.demo02;

/**
 * @data 2020/8/28 -14:17
 */
/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj);参数可以是任何对象，只有参数是一个字符串并且内容相同才会给true，否则返回false
注意事项：
1.任何对象都能用Object进行接收。
2.equals()方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3.如果比较一个常量和一个变量，推荐把常量字符串写在前面
推荐："abc".equals(str);
不推荐：str.equals("abc");

public boolean equalsIgnoreCase(String str);进行比较内容时，忽略大小写。
 */
public class Demo01StringEquals {
    public static void main(String[] args) {

    }
}
