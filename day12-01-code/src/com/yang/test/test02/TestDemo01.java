package com.yang.test.test02;

import java.util.Date;

/**
 * @data 2020/9/4 -17:22
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        Date date1 = new Date(0L);
        System.out.println(date1);
        System.out.println(date1.getTime());
    }
}
