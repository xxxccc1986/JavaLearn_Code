package top.year21.exer3;

import java.util.Enumeration;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 23:33
 */
public abstract class Employee {
    //属性
    private String name;
    private int number;
    private MyDate birthday;//声明MyDate类的一个实例对象birthda

    //构造器
    public Employee(){

    }
    public Employee(String name,int number,MyDate birthday){
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    //方法
    public abstract double earnings();

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public String toString(){
        return "该员工名字是：" + name + "，工号是：" + number
                + "，生日是：" + birthday.toDateString();//通过实例对象birthday-->下一行
        // 调用MyDate类中的方法输出该实例的信息，不能直接调用birthday，否则输出的则是默认初始胡值0
    }
}
