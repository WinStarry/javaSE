package com.yang.demo.demo05;


/*
Debug调试程序
    可以让代码逐行执行，便于查看代码的执行过程，有效的的调试程序中的bug
使用方式：
    在行号的右边，鼠标左键单击，添加断点(每个方法的第一行，哪里有bug就添加到哪里)
    右键选择Debug执行程序
    程序就会停留在添加的第一断点处
执行程序：
    f8:逐行执行程序
    f7:进入方法中
    shift+f8:跳出方法
    f9:跳到下一个断点，如果没有下一个断点，程序就此结束。
    ctrl+f2:跳出Debug模式，停止程序
    Console:切换到控制台
 */
public class Demo01Debug {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        Print();
    }

    private static void Print() {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
    }
}
