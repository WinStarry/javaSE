package com.yang.test.test03;

import java.util.Calendar;

/**
 * @data 2020/9/4 -20:46
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);

        calendar.set(Calendar.YEAR, 2021);//设定年为：2021年
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
