package TeamMangerProject.domain;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:53
 */
public class Architect extends Designer {
    //属性
    private int stock;//公司奖励的股票

    //构造器
    public Architect(int id, String name, int age, double salary,Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //用于输出选项一中的团队列表的成员信息
    public String getDetails(){
        return getMemberId() + "/" + getId() + "\t\t" + getName() + "\t" + getAge()
                + "\t\t" + getSalary() + "\t架构师\t" + getBonus() + "\t\t" + stock;
    }

    @Override
    //用于开始界面的信息输出
    public String toString() {
        return getInfo() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }
}
