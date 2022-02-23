package top.year21.AbstractTest;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 21:16
 */
public class CommonEmployee extends  Employee {


    public CommonEmployee(String name,int id,int salary){
        super(name, id, salary);
    }
    @Override
    public void work() {
        System.out.println("公司的劳动力");
    }
    public String toString(){
        return "工号是" + getId() + "，名字是" + getName()
                + "，收入是" + getSalary() ;
    }
}


