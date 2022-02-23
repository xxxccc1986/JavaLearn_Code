package JavaExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 16:06
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount overCout = new CheckAccount(1122,20000,0.045,5000);
        overCout.withdraw(5000);
        System.out.println("您的账户余额为：" + overCout.balance + "\n"
                + "您的可透支余额为" + overCout.getOverdraft()+ "\n");
        overCout.withdraw(18000);
        System.out.println("您的账户余额为：" + overCout.balance + "\n"
                + "您的可透支余额为" + overCout.getOverdraft()+ "\n");
        overCout.withdraw(3000);
        System.out.println("您的账户余额为：" + overCout.balance + "\n"
                + "您的可透支余额为" + overCout.getOverdraft()+ "\n");
    }





}
