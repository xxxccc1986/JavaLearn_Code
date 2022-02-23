package exer2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("jane","Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(900);
        System.out.println("客户[" + bank.getCustomer(0).getFirstName() + " " + bank.getCustomer(0).getLastName()
        + "]的账户余额为：" + bank.getCustomer(0).getAccount().getBalance() );

        System.out.println("************************");
        Account balance = new Account(1000);
        bank.addCustomer("徐","公");
        bank.getCustomer(1).setAccount(balance);
        bank.getCustomer(1).getAccount().deposit(200);
        double money = bank.getCustomer(1).getAccount().getBalance();
        System.out.println("客户[" + bank.getCustomer(1).getFirstName() + " " + bank.getCustomer(1).getLastName()
                + "]的账户余额为：" + money);
        System.out.println(bank.getNumberOfCustomer());
    }
}
