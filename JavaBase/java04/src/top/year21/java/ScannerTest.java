package top.year21.java;


import java.util.Scanner;

public class ScannerTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //输出一个提示完成一个更好的交互
        System.out.println("请输入你的信息");
        String  information = scan.nextLine();
        System.out.println(information);
        //对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别：（男/女）");
        String gender = scan.next();
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符；
        System.out.println(genderChar);
    }


}