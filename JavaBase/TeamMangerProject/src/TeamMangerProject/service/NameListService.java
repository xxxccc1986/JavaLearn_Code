package TeamMangerProject.service;

import TeamMangerProject.domain.*;

import static TeamMangerProject.service.Data.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:51
 */
public class NameListService {
    //属性
    private Employee[] employees;

    //构造器
    public NameListService(){
        //== Data.EMPLOYEES.length 数组的长度由Data类中的二维数组长度决定的
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < EMPLOYEES.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);//获取成员的类型
            int id = Integer.parseInt(EMPLOYEES[i][1]);//获取Data二维数组中的成员id
            String name = EMPLOYEES[i][2];//获取Data二维数组中的成员名字
            int age = Integer.parseInt(EMPLOYEES[i][3]);//获取Data二维数组中的成员年龄
            int salary = Integer.parseInt(EMPLOYEES[i][4]);//获取Data二维数组中的成员收入

            //为了避免定义多个变量，先在这声明，switch内重复赋值
            int bonus;
            int stock;
            Equipment e;
            //因题目要求按类型new对象，此处利用switch进行匹配
            switch(type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    e = getEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,e);
                    break;
                case DESIGNER:
                    e = getEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,e,bonus);
                    break;
                case ARCHITECT:
                    e = getEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,e,bonus,stock);
                    break;
            }
        }

    }

    private Equipment getEquipment(int index){
        int num = Integer.parseInt(EQUIPMENTS[index][0]);//获取的是设备的类型
        //因第一个形参实际上都是String类型的，表示的显示器型号和昵称等等
        String name = EQUIPMENTS[index][1];
        for (int i = 0; i < EQUIPMENTS.length; i++) {
            switch(num){
                case PC:
                    String display = EQUIPMENTS[index][2];
                    return new PC(name,display);
                case NOTEBOOK:
                    int price = Integer.parseInt(EQUIPMENTS[index][2]);
                    return new NoteBook(name,price);
                case PRINTER:
                    String type = EQUIPMENTS[index][2];
                    return new Printer(name,type);
            }

        }
        return null;
    }

    //方法
    //输出全部成员信息
    public Employee[] getAllEmployees(){
        return employees;
    }

    //查找数组当中指定的成员
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id){//id相同则返回此id的对象
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }

}
