package top.year21.AbstractTest;

import java.util.Enumeration;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 21:08
 */
abstract class Employee {
    //属性
    private String name;
    private int id;
    private int salary;

    //构造器
    public Employee() {

    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

}

