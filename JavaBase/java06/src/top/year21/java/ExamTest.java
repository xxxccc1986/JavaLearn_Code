package top.year21.java;


import java.util.Scanner;

public class ExamTest {
        public static void main(String[] args) {
            //1.使用Scanner，读取学生个数
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入学生的人数");
            int people = scan.nextInt();
            //2.创建数组，存储学生成绩，动态初始化
            int[] score = new int[people];
            //3.给数组的元素赋值
            System.out.println("请输入这" + people + "个学生的成绩");
            for (int i = 0; i < score.length; i++) {
                score[i] = scan.nextInt();
            }
            //4.获取数组中的元素最大值:最高分
            int maxScore = 0;
            for (int i = 0; i < score.length; i++) {
                if (maxScore < score[i]) {
                    maxScore = score[i];
                }
            }
            System.out.println("最高分是：" + maxScore);
            //5.根据每个学生的成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩；
            char level;
            for (int i = 0; i < score.length; i++) {
                if (maxScore - score[i] <= 10) {
                    level = 'A';
                } else if (maxScore - score[i] <= 20) {
                    level = 'B';
                } else if (maxScore - score[i] <= 30) {
                    level = 'C';
                } else {
                    level = 'D';
                }

            System.out.println("student " + i + " score is " + score[i] + ",grade is " + level);


        }

        }
}
