package TeamMangerProject.domain;

import TeamMangerProject.service.Status;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:52
 */
public class Programmer extends Employee{
    //属性
    private int memberId;
    Status status = Status.FREE;
    Equipment equipment;

    //构造器
    public Programmer(int id,String name,int age,double salary,Equipment equipment) {
        super(id,name,age,salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    //用于输出选项一中的团队列表的成员信息
    public String getDetails(){
        return memberId + "/" + getId() + "\t\t" + getName() + "\t" + getAge() + "\t\t" + getSalary() + "\t程序员\t";
    }

    @Override
    //用于开始界面的信息输出
    public String toString() {
        //equipment.getDescription()利用多态，根据equ传入的实现类实例对象决定调用该实现类中的toString方法
        return getInfo() + "\t程序员\t" + getStatus() + "\t\t\t\t\t" + getEquipment().getDescription();
    }
}
