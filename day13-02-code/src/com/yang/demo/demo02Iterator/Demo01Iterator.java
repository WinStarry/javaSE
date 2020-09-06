package com.yang.demo.demo02Iterator;


/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法：
        boolean hasNext():如果仍有元素可以迭代，返回true值
            判断集合中还有没有下一个元素，有就返回true,没有就返回false
        E next():返回迭代的下一个元素，
            取出集合中的下一个元素

    Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，
    获取实现类对象的方式比较特殊。Collection接口中有一个iterator()方法，
    这个方法的返回值就是迭代器的实现类对象。
        Iterator<E> iterator() 返回在此 Collection 的元素上进行迭代的迭代器

    迭代器的使用步骤：
        1.使用Collection集合中的iterator()方法获取迭代器的实现类对象，使用Iterator接口接收（多态）。
        2.使用Iterator接口中的hasNext()方法去判断还有没有下一个元素。
        3.使用Iterator接口中的next()方法获取集合中的下一个元素。


 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *迭代器的使用
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll=new ArrayList<>();
        //向集合中添加元素
        coll.add("中国 ");
        coll.add("美国");
        coll.add("英国");
        coll.add("法国");

        /*
          1.使用Collection集合中的iterator()方法获取迭代器的实现类对象，使用Iterator接口接收（多态）。
          注意：
              Iterator接口也是有泛型的，迭代器的泛型接口跟着集合走，集合是什么泛型，迭代器就是什么泛型。
         */

        //多态 接口         实现类对象
        Iterator<String> it =coll.iterator();

        /*//2.使用Iterator接口中的hasNext()方法去判断还有没有下一个元素。
        boolean b = it.hasNext();
        System.out.println(b);

        //3.使用Iterator接口中的next()方法获取集合中的下一个元素。
        String s = it.next();
        System.out.println(s);*/

        //简化后的代码
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
}
