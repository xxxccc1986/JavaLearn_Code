package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/27 18:42
 */
public class Mankind {
    //属性
    private int sex;
    private int salary;

    public Mankind(){

    }

    public Mankind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }

    //方法

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWomen(){
        if (sex == 1){
            System.out.println("man");
        }else if (sex ==0){
            System.out.println("women");
        }
    }

    public void employeed(){
        if (salary == 0){
            System.out.println("no job");
        }else if (salary != 0 ){
            System.out.println("job");
        }
    }

}


