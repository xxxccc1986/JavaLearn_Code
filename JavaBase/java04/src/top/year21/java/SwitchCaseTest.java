package top.year21.java;

/*
判读一年是否为闰年的标准
1.可以被4整除，但不能被100整除
2。可以被400整除
 */
import java.util.Scanner;
public class SwitchCaseTest {
    public static void main(String[] args) {

        int number = 2;
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
        }
        //练习1
                Scanner letter = new Scanner(System.in);
                System.out.println("请输入一个小写英文字母");
                String word = letter.next();//用字符串来接收数值，因在scanner没有char类型的
                char c = word.charAt(0);//将接受到的数值强转为char型并提取首字母
                switch (c) {
                case 'a':
                    System.out.println("A");
                    break;
                case 'b':
                    System.out.println("B");
                    break;
                case 'c':
                    System.out.println("C");
                    break;
                case 'd':
                    System.out.println("D");
                    break;
                case 'e':
                    System.out.println("E");
                    break;
                default:
                    System.out.println("Other");
            }

                //练习2
                Scanner score = new Scanner(System.in);
                System.out.println("请输入你的成绩");
                double num = score.nextDouble();
                switch ((int)num / 10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("不合格");
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        System.out.println("合格");
                        break;
                }
                    /*更优解
                    switch ((int)num / 60){
                    case 0：
                        System.out.println("不合格");
                    case 1：
                        System.out.println("合格");
                    }
                     */

                        //练习3
                Scanner scan = new Scanner(System.in);
                System.out.println("请输入year：");
                int y1 = scan.nextInt();
                System.out.println("请输入month：");
                int m1 = scan.nextInt();
                System.out.println("请输入day：");
                int d1 = scan.nextInt();
                //定义一个变量来保存总天数；
                int sumDays =0;
                switch(m1){
                    case 12:
                        sumDays  += 30;//
                    case 11:
                        sumDays  += 31;
                    case 10:
                        sumDays  += 30;
                    case 9:
                        sumDays  += 31;
                    case 8:
                        sumDays  += 31;
                    case 7:
                        sumDays  += 30;
                    case 6:
                        sumDays  += 31;
                    case 5:
                        sumDays  += 30;
                    case 4:
                        sumDays  += 31;
                    case 3:
                        //sumDays  += 28;
                        //判断year是否为闰年
                        if((y1 % 4 == 0 && y1 % 100!=0)|| y1 % 400 ==0) {
                            sumDays += 29;
                        }else{
                            sumDays  += 28;
                        }
                    case 2:
                        sumDays  += 31;
                    case 1:
                        sumDays  += d1;
                }
                System.out.println(y1+"年的"+m1+"月"+d1+"号"+"是当年的第"+sumDays+"天");






    }


    }





