package com.yang.demo.demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java.util.LinkedHashSet集合 extends HashSet集合
LinkedHashSet集合特点：
    底层是一个哈希表(数组+链表/红黑树)+链表：多了一条链表(记录元素的顺序)，保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("yang");
        System.out.println(set);//[abc, www, yang]

        LinkedHashSet<String> linked=new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("yang");
        System.out.println(linked);//[www, abc, yang]
    }
}
