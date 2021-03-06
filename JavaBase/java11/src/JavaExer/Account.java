package JavaExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 15:09
 */
public class Account {
        private int id;
        protected double balance;
        private double annualInterestRate;

        public Account(){

        }
        public Account(int id,double balance,double annualInterestRate){
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public double getMonthlyInterest(){
                return annualInterestRate / 12;
        }

        public void withdraw(double amount){
                if (amount > balance){
                    System.out.println("余额不足！");
                }else {
                    balance -= amount;
    //                System.out.println("成功取款：" + amount);
                }
        }

        public void deposit(double amount){
                balance += amount;
    //        System.out.println("成功存入：" + amount);
        }
}
