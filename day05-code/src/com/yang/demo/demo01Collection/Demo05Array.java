package com.yang.demo.demo01Collection;

/**
 * @data 2020/8/27 -15:59
 */
/*
使用动态初始化数组的时候，其中的元素会自动拥有一个默认值。规则如下：
如果是整数类型，那么默认值为0；
如果是浮点类型，那么默认值为0.0；
如果是字符类型，那么默认值为'\u0000'；
如果是布尔类型，那么默认为false；
如果是引用类型，那么默认为null

注意事项：
静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号中的具体数值。
 */
public class Demo05Array {
    public static void main(String[] args) {
        int[] array=new int[3];

        System.out.println(array);//[I@50cbc42f
        System.out.println("==================");

        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("==================");

        array[1]=123;
        System.out.println(array[0]);//0
        System.out.println(array[1]);//123
        System.out.println(array[2]);//0
    }
}
