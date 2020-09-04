package com.yang.test.test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @data 2020/9/4 -20:32
 */
public class TestDemo02 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        String s1="2020-09-04 20:36:33";
        Date date1 = simpleDateFormat.parse(s1);
        System.out.println(date1);
    }
}
