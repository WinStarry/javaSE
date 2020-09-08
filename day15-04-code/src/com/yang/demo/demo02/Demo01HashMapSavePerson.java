package com.yang.demo.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合存储自定义键值
HashMap集合保证key唯一：
    作为key的元素，必须重写hashCode()方法和equals()方法，以保证key唯一

 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*
    HashMap集合存储自定义类型键值
    key:Person类型
        Person类必须重写hashCode()方法和equals()方法，以保证key唯一
    value:String类型
        可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //向集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("普京",19),"俄罗斯");
        map.put(new Person("秦始皇",20),"秦国");
        map.put(new Person("女王",18),"毛里求斯");

        //使用entrySet()方法和增强for循环遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--->"+value);
        }
    }

    /*
    HashMap存储自定义类型键值
    key:String类型
        String类重写hashCode()方法和equals()方法，保证key唯一
    value:Person类型
        value可以重复(同名同龄可以视为同一个人)
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //向集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("南京",new Person("王五",20));
        map.put("北京",new Person("赵六",21));
        //使用keySet()方法和增强for循环遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"--->"+value);
        }
    }
}
