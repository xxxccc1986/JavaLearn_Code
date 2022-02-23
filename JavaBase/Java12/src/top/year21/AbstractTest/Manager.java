package top.year21.AbstractTest;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 21:11
 */
public class Manager extends Employee {
    private int bonus;

    public Manager(int bonus){
            super();
            this.bonus = bonus;
    }
    public Manager(String name,int id,int salary,int bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("管理公司" );
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString(){
        return "工号是" + getId() + "，名字是" + getName()
                + "，收入是" + getSalary() + "，奖金是" + getBonus();
    }
}
;