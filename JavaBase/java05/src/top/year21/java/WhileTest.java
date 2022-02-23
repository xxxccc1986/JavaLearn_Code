package top.year21.java;

import java.util.Scanner;


public class WhileTest {
    public static void main(String[] args) {
            //遍历100以内的所有偶数
                int i =2;//①
                while (i <=100){//②
                    if(i % 2 == 0){
                        System.out.println(i);//③
                    }
                     i++;//④
                }

                System.out.println("请输入一个整数");
                Scanner scan = new Scanner(System.in);
                    int positiveNumber = 0;//记录正数的个数
                    int negativeNumber = 0;//记录负数的个数
                while(true){
                    int num = scan.nextInt();
                if(num > 0){
                    positiveNumber++;
                }else if(num <0){
                    negativeNumber++;
                }
                else if(num ==0 ){
                    break;
                }
                }

                System.out.println("输入的正数个数为:" +positiveNumber);
                System.out.println("输入的负数个数为:" +negativeNumber);

                /*第二种方式 for循环
                System.out.println("请输入一个整数");
                Scanner scan = new Scanner(System.in);
                int n1 = 0;
                int n2 = 0;
                for(;;) {
                    int num = scan.nextInt();
                    if (num > 0) {
                        n1++;
                    }else if (num <0) {
                        n2++;
                    }
                    else if(num ==0){
                        break;
                    }
                }
                System.out.println("输入的正数个数为:" +n1);
                System.out.println("输入的负数个数为:" +n2);

                 */



    }
}