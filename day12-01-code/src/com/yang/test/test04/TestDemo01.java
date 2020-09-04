package com.yang.test.test04;

/**
 * @data 2020/9/4 -21:13
 */
public class TestDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        sb.append(12);
        sb.append("hello");
        sb.append('p');
        sb.append(false);
        sb.append(18.8);
        String s = sb.toString();
        System.out.println(s);

    }
}
