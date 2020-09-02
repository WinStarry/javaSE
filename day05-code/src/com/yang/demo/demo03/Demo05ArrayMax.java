package com.yang.demo.demo03;

/**
 * @data 2020/8/27 -16:59
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {2, 7, 3, 1, 5, 8, 6, 9, 4};
        System.out.println("这个数组中最大的数是："+getMax(array));
    }

    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
