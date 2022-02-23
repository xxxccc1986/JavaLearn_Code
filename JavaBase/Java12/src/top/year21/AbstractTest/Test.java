package top.year21.AbstractTest;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/1 21:17
 */
public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("张万",1,4000,2000);
        m.work();
        System.out.println(m.toString());
        CommonEmployee c = new CommonEmployee("李四",2,2000);
        c.work();
        System.out.println(c.toString());
    }
}
