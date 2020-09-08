package com.yang.demo.demo03;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
public class LinkedHashMap<K,V>extends HashMap<K,V>
Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序
底层原理：
    哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("a","d");
        System.out.println(map);//{a=d, b=b, c=c} key不允许重复，无序

        LinkedHashMap<String,String> linked=new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("b","b");
        linked.put("c","c");
        linked.put("a","d");
        System.out.println(linked);//{a=d, b=b, c=c} key不允许重复，有序
    }
}
