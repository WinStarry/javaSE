package com.yang.test;

import java.util.ArrayList;

/**
 * @data 2020/9/3 -20:55
 */
public class TestDemo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println(list);
        System.out.println(list.size());
//        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Integer num = list.remove(2);
        System.out.println("我是被删除的哪个数字："+num);
    }
}
