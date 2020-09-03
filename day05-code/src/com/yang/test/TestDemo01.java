package com.yang.test;

import java.util.Scanner;

/**
 * @data 2020/9/3 -16:41
 */

/**
 * 随机键盘输入10个整型数字，并依次打印输出
 */
public class TestDemo01 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

}
