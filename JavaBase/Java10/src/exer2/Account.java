package exer2;

public class Account {
    private double balance;

    public Account(double init_balance){
            balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        if (amt > 0 ){
            balance += amt;
            System.out.println("成功存入:" + amt);
        }
    }
    public void withdraw(double amt){
        if (amt < balance){
            balance -= amt;
            System.out.println("成功取出:" + amt);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }
}
