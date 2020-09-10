package com.yang.demo.demo01getName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的第一种遍历方式：通过键找值的方式
Map集合中的方法：
    Set<k> keySet() 返回此映射中包含的键的Set视图
遍历的实现步骤
    1.使用Map集合中的keySet()方法，把Map集合中所有的key取出来，存储到Set集合中
    2.遍历Set集合，获取Map集合中的每一个key
    3.使用Map集合中的get(key)方法，通过key找到value
 */
public class Demo02keySet {
    public static void main(String[] args) {
        //创建HashMap集合
        Map<String,Integer> map=new HashMap<>();
        map.put("拿破仑",168);
        map.put("李小龙",173);
        map.put("李四",158);

        //1.使用Map集合中的keySet()方法，把Map集合中所有的key取出来，存储到Set集合中
        Set<String> set = map.keySet();
        //2.遍历Set集合，获取Map集合中的每一个key
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.使用Map集合中的get(key)方法，通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("==========================");
        //使用增强for循环遍历Map集合
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
