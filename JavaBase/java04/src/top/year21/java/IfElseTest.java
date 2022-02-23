package top.year21.java;

import java.util.Scanner;

public class IfElseTest {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的成绩");
        double score = scan.nextDouble();
        //方式一：if-else结构
        if(score >= 90){
            System.out.println("等级：A");
        }else if(70<=score && score < 90) {
            System.out.println("等级：B");
        }else if(60 <=score && score <70) {
            System.out.println("等级：C");
        }
        else{
            System.out.println("等级：D");
        }

        //方式二：switch-case结构
        switch((int)score /10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("等级：D");
                break;
            case 6:
                System.out.println("等级：C");
                break;
            case 7:
                System.out.println("等级：B");
                break;
            case 8:
                System.out.println("等级：B");
                break;
            case 9:
                System.out.println("等级：A");
                break;
            case 10:
                System.out.println("等级：A");
                break;
        }



        }
}
