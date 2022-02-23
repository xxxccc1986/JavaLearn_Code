package ObejctExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/29 17:04
 */
public class MyDate {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2000,12,1);
        MyDate date2 = new MyDate(2102,12,1);
        System.out.println(date1.equals(date2));
        System.out.println(date1.toString());
    }
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o instanceof MyDate){
            MyDate date = (MyDate)o;
            return this.year == date.year && this.month == date.month && this.day == date.day;
        }else{
            return  false;
        }

    }
}
