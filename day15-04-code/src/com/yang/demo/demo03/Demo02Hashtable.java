package com.yang.demo.demo03;

import java.util.HashMap;
import java.util.Hashtable;

/*
public class Hashtable<K,V>集合 implements Map<K,V>接口

Hashtable集合底层是哈希表，是一个线程安全的集合，是单线程集合，速度慢
HashMap集合底层是哈希表，是一个线程不安全的集合，是多线程集合，速度快

HashMap集合(之前学过的所有集合)可以存储null键和null值
Hashtable集合不可以存储null键和null值

Hashtable集合和vector集合一样在JDK1.2之后被更先进的集合(HashMap,ArrayList)取代了
Hashtable的子类properties依然活跃在历史舞台上
properties集合是一个唯一和IO流集合的集合

 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"b");
        map.put("a",null);
        map.put(null,null);
        System.out.println(map);//{null=null, a=null}

        Hashtable<String,String> table=new Hashtable<>();
        //table.put(null,"b");//java.lang.NullPointerException
        //table.put("a",null);//java.lang.NullPointerException
        //table.put(null,null);java.lang.NullPointerException
    }
}
