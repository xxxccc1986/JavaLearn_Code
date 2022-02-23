package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/31 20:50
 */
public class BankSystemTest {
    public static void main(String[] args) {
        BankSystem user = new BankSystem("Aa123",2000);
        BankSystem user1 = new BankSystem("CHEN",3000);
        BankSystem.setLiLv(0.045);
        BankSystem.setMinBalance(100.0);
        System.out.println(user.toString());
        System.out.println(user1 + "\t" + "利率是： " + BankSystem.getLiLv());//在BankSystem中重写了toString的方法
        System.out.println("客户的个数为" + BankSystem.getTotal());
    }
}
