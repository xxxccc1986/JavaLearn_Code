package top.year21.exer3;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 23:56
 */
public class HourlyEmployee  extends Employee{
    //属性
    private double wage;
    private int hour;

    //构造器
    public HourlyEmployee(){

    }
    public HourlyEmployee(double wage, int hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name,int number,MyDate birthday,double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }
    //方法
    public  double earnings(){
        return wage * hour;
    }
    public String toString(){
        return "HourlyEmployee:[" + super.toString() + "]";
    }
}
