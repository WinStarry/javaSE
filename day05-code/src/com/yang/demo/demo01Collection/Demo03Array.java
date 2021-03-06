package com.yang.demo.demo01Collection;

/**
 * @data 2020/8/27 -15:34
 */
/*
使用静态初始化数组的时候，格式还可以省略一下

标准格式：
数据类型[] 数组名称=new 数据类型[]{元素1,元素2,元素3,...};

省略格式：
数据类型[] 数组名称={元素1,元素2,元素3,...};

注意事项：
1.静态初始化没有直接指定长度，但是仍然会自动推算得到数组的长度。
2.静态初始化的格式可以拆分为两个步骤。
    int[] arrayB;
    arrayB = new int[]{10, 12, 15};
3.动态初始化数组也可以拆成两个步骤
    int[] arrayC;
    arrayC=new int[10];
4.静态初始化一旦使用省略格式，就不能拆分成为两个步骤了

使用建议：
如果不确定数组中的具体内容，使用动态初始化；否则，已经确定了数组中的具体内容，使用静态初始化。
 */
public class Demo03Array {
    public static void main(String[] args) {
//        省略格式的静态初始化
        int[] arrayA = {5, 15, 25};

//        静态初始化的标准数组可以拆分为两个步骤
        int[] arrayB;
        arrayB = new int[]{10, 12, 15};

//        动态初始化数组也可以拆成两个步骤
        int[] arrayC;
        arrayC=new int[10];
    }
}
