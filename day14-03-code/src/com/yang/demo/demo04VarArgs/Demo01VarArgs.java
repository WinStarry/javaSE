package com.yang.demo.demo04VarArgs;

/*
可变参数是JDK1.5之后出现的新特性
使用前提：
    当方法的参数列表数据类型已经确定时，但是参数的个数不确定，就可以使用可变参数
使用格式：定义方法时使用
    修饰符 返回值类型 方法名(数据类型...变量名){}
可变参数的原理：
    可变参数的底层是一个数组，根据传递参数的个数不同，会创建不同长度的数组，来存储这些参数
    传递的参数个数，可以是0个(不传递),1,2,...多个
注意事项：
    1.一个方法的参数列表中只能有一个可变参数
    2.如果方法的参数有多个，那么可变参数必须放在所有参数的最后面，即参数列表的末尾。
可变参数的特殊(终极)写法
    public static void method(Object...obj){}
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("求和结果是："+result);
    }

    //定义一个方法，计算两个int类型的整数和
    public static int add(int a, int b) {
        return a + b;
    }

    //定义一个方法，计算三个int类型的整数和
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /*
    定义计算(0~n)整数和的方法
    已知：计算整数的和，数据类型已经确定为int
    但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
    add();就会创建一个长度为0的数组，new int[0]
    add(10);就会创建一个长度为1的数组 ，存储传递过来的参数 new int[]{10}
    add(10,20);就会创建一个长度为2的数组 ，存储传递过来的参数 new int[]{10,20}
    add(10,20,30);就会创建一个长度为3的数组 ，存储传递过来的参数 new int[]{10,20,30}
     */
    public static int add(int...arr){
        //定义一个初始化的变量，记录类加求和
        int sum=0;
        //遍历数组，获取数组中的每一个元素
        for (int i : arr) {
            sum=+i;
        }
        return sum;
    }
}
