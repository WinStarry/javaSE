package com.yang.demo.demo01getName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
遍历集合的第二种方式：使用Entry对象遍历
Map集合的方法
    Set<Map.entry<k,v>> entrySet() 返回此映射中所包含的映射关系的Set视图
遍历Map集合的实现步骤
    1.使用Map集合中的entrySet()方法，把集合中所有的entry对象取出来，存储到Set集合。
    2.遍历Set集合，获取每一个entry对象
    3.使用entry中的getKey()方法和getValue()方法获取键和值。
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        //创建HashMap集合
        Map<String,Integer> map=new HashMap<>();
        map.put("拿破仑",168);
        map.put("李小龙",173);
        map.put("李四",158);

        //1.使用Map集合中的entrySet()方法，把集合中所有的entry对象取出来，存储到Set集合。
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //2.遍历Set集合，获取每一个entry对象
        //使用迭代器遍历Map集合
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("========================");

        //使用增强for循环遍历Map集合
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
