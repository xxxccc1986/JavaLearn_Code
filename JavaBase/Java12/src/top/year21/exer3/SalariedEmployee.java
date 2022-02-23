package top.year21.exer3;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 23:48
 */
public class SalariedEmployee extends Employee {
    //属性
    private double monthLySalary;

    //构造器
    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }
    public SalariedEmployee(String name, int number, MyDate birthday, double monthLySalary) {
        super(name, number, birthday);
        this.monthLySalary = monthLySalary;
    }

    //方法
    public double earnings(){
        return monthLySalary;
    }
    public String toString(){
        return "SalariedEmployee:[" + super.toString() + "]";
    }
}
