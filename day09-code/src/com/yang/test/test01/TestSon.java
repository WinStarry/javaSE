package com.yang.test.test01;

/**
 * @data 2020/9/4 -9:24
 */
public class TestSon extends TestFather {
    int num=4;

    public TestSon(){
        System.out.println("这是子类无参构造！");
    }

    @Override
    public void test(){
//        int num=5;
        System.out.println(num);
//        System.out.println(this.num);
//        System.out.println(super.num);
    }
}
