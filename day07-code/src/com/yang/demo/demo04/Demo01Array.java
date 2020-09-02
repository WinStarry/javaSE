package com.yang.demo.demo04;

/**
 * @data 2020/8/28 -8:06
 */
/*
题目：
定义一个数组，用来存放3个Person对象

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {
    public static void main(String[] args) {
//        首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("小黑", 18);
        Person two = new Person("小红", 19);
        Person three = new Person("小兰", 21);

//        将one中的地址值赋值到数组中的0号元素位置
        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0].getName());
    }
}
