package top.year21.java;

import java.util.Scanner;
public class StudyTest {
        public static void main(String[] args) {
            //if-else练习1
            System.out.println("请输入两个数字");
            Scanner number = new Scanner(System.in);
            int i1 = number.nextInt(), i2 = number.nextInt();
            if (i1 + i2 >= 50) {
                System.out.println("Hello World!");
            } else {
                System.out.println("两数之值未到达要求");
            }


            //if-else练习2
            System.out.println("请输入狗的年龄");
            Scanner dog = new Scanner(System.in);
            int num = dog.nextInt();
            if (num == 1) {
                System.out.println("当前狗的年龄相当于人的：" + 10.5);
            } else if (num == 2) {
                System.out.println("当前狗的年龄相当于人的：" + 21);
            } else if (num > 2) {
                System.out.println("当前狗的年龄相当于人的：" + (21 + (num - 2) * 4));
            } else if (num < 0) {
                System.out.println("对不起，请重新输入");
            }

            //获取一个随机数：10-99
            int value = (int) (Math.random() * 90 + 10);//[0.0，1.0)-->[0.0，90.0）-->[10.0，100.0）-->[10.99）
            System.out.print(value);
            //公式：[a，b]：(int)(Math.random()*(b-a+))+a;


            //if-else练习4
            Scanner condition = new Scanner(System.in);
                System.out.println("请输入你的身高：（cm）");
            int height = condition.nextInt();
                System.out.println("请输入你拥有的财富：（千万）");
            double weight = condition.nextDouble();
                System.out.println("你认为自己帅吗？(True/False)");
                //String smart = condition.next();
                boolean smart = condition.nextBoolean();
            if (height > 180 && weight > 1 && smart ) {
                ////smart还可以这样写 smart.equals("是")
                //smart==之所以不能用是因为用==只会判断两个字符串是否在同一个地址上；
                System.out.println("我一定要嫁给他！！！");
            } else if(height > 1  || weight > 1 || smart ) {
                System.out.println("嫁吧，比上不足，比下有余");
            }
            else {
                System.out.println("我才不嫁");
            }





        }

        }
