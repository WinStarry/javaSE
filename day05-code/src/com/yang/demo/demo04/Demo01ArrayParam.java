package com.yang.demo.demo04;

/**
 * @data 2020/8/27 -17:21
 */
/*
数组可以作为方法的参数
当调用方法的时候，向方法的小括号中进行传参，传递进去的其实就是数组的地址值。
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {2, 7, 3, 1, 5, 8, 6, 9, 4};

        printArray(array);
        System.out.println("=========AAA===========");
        printArray(array);
        System.out.println("=========BBB================");
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
