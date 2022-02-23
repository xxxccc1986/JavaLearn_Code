package top.year21.exer;

public class Account {
    //属性
    private int id;
    private double balance;
    private double annualInterestRate;

    //构造器
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //方法
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){//取钱
        if (amount < balance){
            balance = balance - amount;
            System.out.println("成功取出:" + amount);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }

    public void deposit (double amount){
        if (amount > 0 ){
        balance += amount;
        System.out.println("成功存入:" + amount );
        }
    }
}