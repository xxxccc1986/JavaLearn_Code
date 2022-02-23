package top.year21.java;

import java.util.Enumeration;

public class ArrayTest {
    public static void main(String[] args) {
        //①一维数组的声明和初始化

        int[] ids;//声明
        //1.1静态初始化：数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        //1.2动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        //②如何调用数组的指定位置的元素：通过角标的方式调用
        //数组的角标（或索引0是从0开始的，到数组的长度-1结束的。
        names[0] = "zhang";
        names[1] = "san";
        names[2] = "li";
        names[3] = "si";
        names[4] = "wu";

        //③如何获取数组的长度
        //属性：length
        System.out.println(names.length);
        System.out.println(ids.length);

        //④如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //⑤数组元素的默认初始化值
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("************");

        short[] arr1 = new short[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("************");

        byte[] arr8 = new byte[5];
        for(int i =0;i< arr8.length;i++){
            System.out.println(arr8[i]);
        }



        System.out.println("************");

        float[] arr2 = new float[5];
        for (int i = 0; i < arr2.length; i++) {
             System.out.println(arr2[i]);
            }

        char [] arr3 =new char[5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("----" + arr3[i] + "******");
        }
        if (arr3[0] ==0){
            System.out.println("你好");
        }

        System.out.println("************");
        boolean [] arr4 =new boolean[5];
            System.out.println(arr4[0]);

        System.out.println("************");
        String [] arr5 =new String[5];
        System.out.println(arr5[0]);
        if(arr5[0] == null) {
            System.out.println("shuchu");
        }


        }

    }
