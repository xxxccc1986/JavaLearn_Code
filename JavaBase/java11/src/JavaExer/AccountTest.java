package JavaExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 15:21
 */
public class AccountTest {
    public static void main(String[] args) {
        Account cout  = new Account(1122,20000,0.045 );
        cout.withdraw(30000);
        System.out.println("您的账户余额为：" + cout.getBalance() + "\n");
        cout.withdraw(2500);
        cout.deposit(3000);
        System.out.println("您的账户余额为：" + cout.getBalance());
        System.out.println("月利率为：" + cout.getMonthlyInterest());
    }


}
