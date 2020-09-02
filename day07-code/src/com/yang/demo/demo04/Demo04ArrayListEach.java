package com.yang.demo.demo04;

import java.util.ArrayList;

/**
 * @data 2020/8/28 -9:04
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小黑");
        list.add("小兰");
        list.add("小白");

//        遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
