package com.yang.test.test01;

/**
 * @data 2020/9/4 -9:25
 */
public class TestDemo01 {
    public static void main(String[] args) {
        TestFather tf = new TestFather();
        System.out.println(tf.num);//此处毫无疑问是访问父类中的成员变量num

        TestSon ts = new TestSon();
        System.out.println(ts.num);
        /*
            创建子类对象时，等号左边是谁就优先调用谁中的成员变量，没有则想上找！
         */

        ts.test();

    }
}
