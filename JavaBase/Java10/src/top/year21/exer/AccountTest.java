package top.year21.exer;

public class AccountTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000.0,0.0123);
        customer.setAccount(account);//此步是把账号和客户联系起来
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println("Customer[" + customer.getLastName() + "," + customer.getFirstName() + "]has a account:id is "
                + customer.getAccount().getId() + ",annuallnterestRate is " + customer.getAccount().getAnnualInterestRate()
         * 100 + "%,balance is " + customer.getAccount().getBalance());
    }
}
