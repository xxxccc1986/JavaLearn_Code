package top.year21.java;

import java.util.Scanner;

public class ProcessTest {
    public static void main(String[] args) {
       /* //new一个scanner的对象 从键盘中获取一个数值
        Scanner score = new Scanner(System.in);
        //更好的进行交互体验
        System.out.println("请输入的你的考试成绩");
        double num = score.nextDouble();//读取什么类型的值就定义什么类型
        if (num == 100) {
            System.out.println("真棒，奖励一辆BMW");
        } else if (num > 80 && num <= 99) {
            System.out.println("很不错，奖励一台iphone xs max");
        } else if (num >= 60 && num <= 80) {
            System.out.println("下次继续努力，奖励一个Pad");
        } else {
            System.out.println("考的啥玩意，还想要奖励？");
        }
*/

        Scanner number1 = new Scanner(System.in);
        System.out.println("请分别输入三个不同的数字");
        int num1 = number1.nextInt();
        int num2 = number1.nextInt();
        int num3 = number1.nextInt();
        if (num1 > num2 && num1 > num3 && num2 > num3 ) {
            System.out.println("三个数字从小到大分别是:" + num3 + "\t" + num2 + "\t" + num1);
        } else if (num2 > num1 && num2 > num3 && num1 > num3 ) {
            System.out.println("三个数字从小到大分别是:" + num3 + "\t" + num1 + "\t" + num2);
        }else if (num3 > num1 && num3 > num2 && num1 > num2 ){
            System.out.println("三个数字从小到大分别是:" + num2 + "\t" + num1 + "\t" + num3);
        }
        else if (num1 < num2 && num1 < num3 && num2 < num3 ){
            System.out.println("三个数字从小到大分别是:" + num1 + "\t" + num2 + "\t" + num3);
        }
        else if (num3 < num1 && num3 < num2 && num1 < num2){
            System.out.println("三个数字从小到大分别是:" + num3 + "\t" + num1 + "\t" + num2);
        }
        else {
            System.out.println("输出完成");
        }




    }
}
