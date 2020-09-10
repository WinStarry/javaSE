package com.yang.demo.demo01getName;

import java.util.HashMap;
import java.util.Map;

/*
java.util.Map<k,v>集合
Map集合的特点：
    1.Map集合是一个双列集合，一个元素包含两个值(一个是key,一个是value)
    2.Map集合中的元素，Key和value的数据类型可以相同，也可以不同
    3.Map集合中的元素，key是不允许重复的，value的值可以允许重复
    4.Map集合中的元素，key和value是一一对应的。

java.util.HashMap<k,v>集合 implements Map<k,v>接口
HashMap集合的特点：
    1.HashMap集合底层是哈希表：查询的速度特别的快
        Java1.8之前：数组+单向链表
        Java1.8之后：数组+单向链表/红黑树(链表的长度超过8)：提高查询速度
    2.HashMap集合是一个无序集合，存储进去的元素和取出来的元素顺序有可能不一样。

java.util.LinkedHashMap<k,v>集合 implements HashMap<k,v>
LinkedHashMap集合的特点：
    1.LinkedHashMap集合的底层是哈希表+链表(保证迭代的顺序)
    2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序一致
 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    /*
    boolean containsKey(Object key)   判断集合中是否包含指定的键。
        包含指定的键返回true,不包含指定的键返回false
     */
    private static void show04() {
        //创建HashMap集合
        Map<String,Integer> map=new HashMap<>();
        map.put("拿破仑",168);
        map.put("李小龙",173);
        map.put("李四",158);

        boolean v1 = map.containsKey("李小龙");
        System.out.println("v1:"+v1);//v1:true

        boolean v2 = map.containsKey("李大龙");
        System.out.println("v2:"+v2);//v2:false

    }

    /*
    public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
    返回值v：
        key存在，返回值为key对应的元素
        key不存在，返回值为null
     */
    private static void show03() {
        //创建HashMap集合
        Map<String,Integer> map=new HashMap<>();
        map.put("拿破仑",168);
        map.put("李小龙",173);
        map.put("李四",158);

        Integer v1 = map.get("李小龙");
        System.out.println("v1:"+v1);//v1:173

        Integer v2 = map.get("李大龙");
        System.out.println("v2:"+v2);//v2:null
    }

    /*
    public V remove(Object key): 把指定的键所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
    返回值v:
        key存在，v返回被删除的元素
        key不存在，v返回null
     */
    private static void show02() {
        //创建HashMap集合
        Map<String,Integer> map=new HashMap<>();
        map.put("拿破仑",168);
        map.put("李小龙",173);
        map.put("李四",158);
        System.out.println(map);//{李四=158, 李小龙=173, 拿破仑=168}

        Integer v1 = map.remove("李四");
        System.out.println("v1:"+v1);//v1:158

        System.out.println(map);//{李小龙=173, 拿破仑=168}

        Integer v2 = map.remove("李大龙");
        System.out.println("v2:"+v2);//v2:null

    }

    /*
    public V put(K key, V value):  把指定的键与指定的值添加到Map集合中
        返回值v:
            存储键值对的时候，key不重复，返回值v是null
            存储键值对的时候，key重复 ，会使用新的value值替换Map集合中原来的value值，返回值为新的value
     */
    private static void show01() {
        //使用多态创建HashMap集合
        Map<String,String> map=new HashMap<>();

        String v1 = map.put("拿破仑", "约瑟芬1");
        System.out.println("v1:"+v1);//v1:null

        String v2 = map.put("拿破仑", "约瑟芬2");
        System.out.println("v2:"+v2);//v2:约瑟芬1

        System.out.println(map);//{拿破仑=约瑟芬2}

        map.put("郭靖","黄蓉");
        map.put("牛郎","织女");
        map.put("梁山伯","祝英台");
        System.out.println(map);
    }


}
