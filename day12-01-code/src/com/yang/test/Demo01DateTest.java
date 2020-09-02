package com.yang.test;

import java.util.Date;

/**
 * @data 2020/8/30 -14:40
 */
public class Demo01DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(0L);
        System.out.println(date2);

        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
    }

}
