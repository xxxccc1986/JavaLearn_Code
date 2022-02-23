package Exer3;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/29 22:57
 */
public class Exer3Test {
    public static void main(String[] args) {
        //1.实例化Scanner，用于从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);
        //2.创建Vector对象：Vector v=new Vector();相当于原来的数组
        Vector v = new Vector();
        //3.通过for(;;)或while(true)方式，给Vector中添加数组
        int maxscore = 0;
        while(true){
            System.out.println("请输入学生的成绩(负数代表输入结束)：");
            int score = scan.nextInt();
            if (score < 0){
                break;
            }if(score > 100){
                System.out.println("输入的数据非法，请重新输入");
                continue;
            }
            //自动装箱 基本数据类型  --->> 包装类
            Integer score1 = score;
            v.addElement(score1);//将成绩添加进Vector（集合）里面
            //4.找出Vector的最大值
            if (maxscore < score){
                maxscore = score;
            }
        }
        //5.遍历Vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级。
        char lever;
        for (int i =0; i < v.size();i++){
            Object obj = v.elementAt(i);
            //包装的是Object类，取出来的也是Object类
            //所以要向下强转为Integer类才能进一步自动拆箱转为基本数据类型
            Integer obj1 =(Integer)obj;//自动拆箱 包装类 --->> 基本数据类型
            int score = obj1;
            //int score = （int）obj
            if (maxscore - score <= 10){
                    lever  = 'A';
            }if (maxscore - score <= 20){
                lever  = 'B';
            }if (maxscore - score <= 30){
                lever  = 'C';
            }else {
                lever  = 'D';
            }
            System.out.println("学生" + i + "成绩是" + score + "等级是" + lever);
        }
        System.out.println("成绩最大值是" + maxscore);


    }
}
