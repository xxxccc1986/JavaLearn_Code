package Exer;

import java.util.Objects;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/15 21:33
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    public int compareTo(Object obj){
        if (obj instanceof Employee){
            Employee e = (Employee)obj;
            return this.name.compareTo(e.name);
        }else{
            throw new RuntimeException("数据不匹配");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}

class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int compareTo(Object o1){
        if (o1 instanceof MyDate ){
            MyDate m1 = (MyDate)o1;
            if (this.getYear() > m1.getYear()){
                return 1;
            }else if (this.getYear() < m1.getYear()){
                return -1;
            }else {
                if (this.getMonth() > m1.getMonth()){
                    return 1;
                }else if (this.getMonth() < m1.getMonth()){
                    return -1;
                }else{
                    if (this.getDay() > m1.getDay()){
                        return 1;
                    }else if (this.getDay() < m1.getDay()){
                        return -1;
                    }else {
                        return 0;
                    }
                }
            }
        }
        throw new RuntimeException("输入的数据类型不匹配");
    }
}