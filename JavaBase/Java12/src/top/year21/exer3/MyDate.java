package top.year21.exer3;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 23:41
 */
public class MyDate {
    //属性
    private int year;
    private int month;
    private int day;

    //构造器
    public MyDate(){

    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    //方法
    public String toDateString() {
            return year + "年" + month + "月" + day + "日";
    }
}
