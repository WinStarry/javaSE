package com.yang.test;

import java.util.Random;

/**
 * @data 2020/9/3 -17:39
 */
public class TestDemo01 {
    public static void main(String[] args) {
/*//        打印输出5个0~4的随机数字
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(5);
            System.out.println(num);
        }
        System.out.println("====================");

//        打印输出10个1~21之间的数字
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(20) + 1;
            System.out.println(num);
        }*/

        int[] array=printRandom(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    /**
     * 打印输出10个1~n的随机数字
     * @param n 要打印的随机数字的具体范围
     * @return 打印的10个随机数字存入到数组中，返回该数组的首地址给方法的调用处
     */
    public static int[] printRandom(int n){
        Random r = new Random();
        int[] array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(n)+1;
        }
        return array;
    }
}

