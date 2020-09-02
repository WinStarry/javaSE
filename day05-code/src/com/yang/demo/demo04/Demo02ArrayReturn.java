package com.yang.demo.demo04;

/**
 * @data 2020/8/27 -17:28
 */
/*
一个方法可以有0、1、多个参数，但是只能有0个或者1个返回值，不能有多个返回值。
如果希望一个方法中产生多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值类型即可。

总结：
任何数据类型都可以作为方法的参数类型，或者返回值类型。

数组作为方法的参数，传递进去的其实是数组的地址值。
数组作为方法的返回值，传递进去的其实也是数组的地址值。
 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] calculate = calculate(1, 3, 5);
        for (int i = 0; i < calculate.length; i++) {
            System.out.println(calculate[i]);
        }

    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;

        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;

        return array;
    }
}
