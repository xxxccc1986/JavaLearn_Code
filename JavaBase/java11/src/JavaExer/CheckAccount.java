package JavaExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 15:43
 */
public class CheckAccount extends Account{
        private double overdraft;

        public CheckAccount(int id,double balance,double annualInterestRate,double overdraft){
            super(id,balance,annualInterestRate);
            this.overdraft = overdraft;
        }


       public double getOverdraft(){
            return overdraft;
       }

       public void withdraw(double amount) {
            if (amount < balance) {
                balance -= amount;
                System.out.println("取款成功" + amount);
            } else if (amount > balance) {
                double lack = amount - balance;
                if (overdraft > lack) {
                    balance = 0;
                    overdraft -= lack;
                }else {
                    System.out.println("超过可透支限额！");
                }
        }
        }
    }

