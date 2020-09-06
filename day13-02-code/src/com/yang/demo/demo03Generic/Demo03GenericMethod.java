package com.yang.demo.demo03Generic;

/**
 * 测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm=new GenericMethod();

        /*
        调用含有泛型的方法method01
        传递什么类型，泛型就是什么类型
         */
        gm.method01(12);
        gm.method01("java");
        gm.method01(16.8);
        gm.method01('h');


        //静态方法不建议创建对象使用
        //静态方法通过：类名.方法名(参数);
        GenericMethod.method02(123);
        GenericMethod.method02("hello");
        GenericMethod.method02('a');
        GenericMethod.method02(12.3);
    }
}
