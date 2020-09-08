package com.yang.demo.demo04;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
JDK9的新特性：
    Set接口、List接口、Map接口：里面增加了一个静态方法of,可以给集合一次性添加多个元素
    static<E> List<E> of (E ...elements)
    该方法的使用前提：
        当集合中存储的元素个数已经确定了，不会改变了的时候可以使用此方法
    注意：
        1.of方法只适用于Set接口、List接口、Map接口，不适用于接口的实现类。
        2.of方法的返回值是一个不能改变的集合，集合不能再使用add()方法,put()方法添加元素，会抛出异常
        3.Set接口和Map接口在调用of方法的时，不能有重复的元素，否则会抛出异常。
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);
        //list.add("w");//UnsupportedOperationException:不支持操作异常

        //Set<String> set = Set.of("a", "b", "a", "c", "d");//IllegalArgumentException:非法操作异常，有重复元素
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);
        //set.add("w");//UnsupportedOperationException:不支持操作异常

        //Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20, "张三", 18);////IllegalArgumentException:非法操作异常，有重复元素
        Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20);
        System.out.println(map);
        //map.put("赵六",21);//UnsupportedOperationException:不支持操作异常
    }
}
