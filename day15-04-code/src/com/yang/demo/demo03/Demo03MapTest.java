package com.yang.demo.demo03;

import java.util.HashMap;
import java.util.Scanner;

/*
练习：
    计算一个字符串中每个字符出现的次数
分析：
    1.使用Scanner获取用户键入的字符串
    2.创建Map集合，key是字符串中的字符，value是该字符在字符串中出现的次数
    3.遍历字符串获取每一个字符
    4.使用获取到的字符，到Map集合中判断key是否存在
        key存在：
            通过字符(key)，获取value(字符个数)
            value++
            put(key,value)把新的字符存到Map集合中
        key不存在：
        put(key,1)
    5.遍历Map集合，输出结果
 */
public class Demo03MapTest {
    public static void main(String[] args) {
        //1.使用Scanner获取用户键入的字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //创建Map集合，key是字符串中的字符，value是该字符在字符串中出现的次数
        HashMap<Character,Integer> map=new HashMap<>();
        //3.遍历字符串获取每一个字符
        for(char c : str.toCharArray()){
            //4.使用获取到的字符，到Map集合中判断key是否存在
            if(map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                //key不存在
                map.put(c,1);
            }
        }
        //遍历Map集合
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"--->"+value);
        }
    }
}
