package top.year21.java;

import java.util.Scanner;
public class ArrayTest1 {
    public  static  void main(String[] args) {
        int[] arr1 = new int[6];
        //[0.0,1.0)=>[0.0,30.0)=>[0.0,31.0)=>[1,31)
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (30 - 1 + 1) + 1);
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    i--;
                    break;
                }
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("*************************");
        //定义一组元素为10的数组，并从1-30之间抽取随机字数给数组元素赋值
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr2[i] + "\t" );
        }
        System.out.println();
        //数组的最大值
        int max = arr2[0];
        for(int i =0 ;i < arr2.length;i++){
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println("最大值为：" + max);

        //数组的最小值
        int min = arr2[0];
        for (int i = 0;i < arr2.length;i++){
            if (min >arr2[i]){
                min =arr2[i];
            }
        }
        System.out.println("最小值为：" + min);

        //数组元素的总和
        int sum = 0;
        for (int i =0; i < arr2.length;i++){
            sum +=arr2[i];
        }
        System.out.println("和值为：" + sum);

        //数组的平均数
        int average = sum / arr2.length;
        System.out.println("均值为：" + average);

    }

}


