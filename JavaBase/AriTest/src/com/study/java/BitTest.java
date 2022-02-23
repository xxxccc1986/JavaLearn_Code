package com.study.java;

//练习：交换两个变量的值
public class BitTest {
    public static void main(String[] args){
       int num1 = 10,num2 = 20;
       //方式一：采取定义临时变量的方式
        //推荐的方式
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        //方式二 ：好处 不用定义临时变量
        //弊端：①相加操作可能超过存储范围；② 有局限性：只能适用于数值；
        //num1 = num1 + num2;
        //num2 = num1 - num2;
        //num1 = num1 - num2;


        //方式三：使用位运算符
        //num1 = num1 ^ num2;
        //num2 = num1 ^ num2;
       // num1 = num1 ^ num2;
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);

    }
}
