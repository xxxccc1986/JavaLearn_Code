package top.year21.exer3;

import java.util.Scanner;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/2 0:04
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入本月月份：");
        int month = scan.nextInt();
        Employee[] staffs = new Employee[2];

        //birthday是MyDate的一个实例，因此需要使用构造器赋值
        staffs[0] = new SalariedEmployee("张三",1000,new MyDate(2000,10,20),10000);
        staffs[1] = new HourlyEmployee("李四",1001,new MyDate(2000,11,12),200,60);
        for (int i = 0;i < staffs.length;i++){
            System.out.println(staffs[i].toString());

            //另外两个类都继承了Employee抽象类，运用多态的特性在执行时到相应的类内调用抽象类的getBirthday()方法获取每个元素的生日，
            //由于birthday此时又是MyDate类的对象，因此通过“对象.方法”方式调用getMonth()获取了成员的生日月份
            if (month == staffs[i].getBirthday().getMonth()){
                System.out.println("本月工资加100");
            }
        }


    }
}
