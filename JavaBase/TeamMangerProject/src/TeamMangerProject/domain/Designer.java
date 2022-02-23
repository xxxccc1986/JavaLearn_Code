package TeamMangerProject.domain;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:52
 */
public class Designer extends Programmer {
    //属性
    private double bonus;//公司奖金

    public Designer(int id, String name, int age, double salary,Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //用于输出选项一中的团队列表的成员信息
    public String getDetails(){
        return getMemberId() + "/" + getId() + "\t\t" + getName() + "\t" + getAge() + "\t\t" + getSalary() + "\t设计师\t" + getBonus();
    }

    @Override
    //用于开始界面的信息输出
    public String toString() {
        return getInfo() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t\t" + getEquipment().getDescription();
    }
}
