package TeamMangerProject.domain;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:50
 */
public class Employee {
    //属性
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }
    //构造器
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //用于输出开始界面中普通员工的信息
    public String getInfo(){
        return id + "\t" + name + "\t" + age + "\t\t" + salary;
    }
    @Override
    public String toString() {
        return getInfo();
    }
}
