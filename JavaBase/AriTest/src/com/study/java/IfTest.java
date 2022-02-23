package com.study.java;

public class IfTest {
    public static void main(String[] args) {
        //第一种格式；
        int heartBeat = 79;
        if (heartBeat < 60 || heartBeat > 120) {
            System.out.println("你需要在医院做进一步的检查");
        }
        System.out.println("检查结束，您的心跳速率正常");

        //第二种格式：二选一
        int heartBeat1 = 80;
        if (heartBeat1 < 60) {
            System.out.println("心率过慢");
        } else {
            System.out.println("一切正常");
        }

        //第三种方式：多选一
        int age = 25;
        if (age < 0) {
            System.out.println("输入的数据无效，请重试提交");
        } else if (age < 18) {
            System.out.println("恁尚未成年");
        } else if (age < 35) {
            System.out.println("您正处于青年时期，请好好努力");
        } else if (age < 55) {
            System.out.println("您正处于中年时期，人生已过半");
        } else if (age < 70) {
            System.out.println("人的一生有多少个10年");
        } else {
            System.out.println("回首过往，记忆里的事情是否已渐渐模糊");
        }
    }


    }



