package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/31 20:41
 */
public class BankSystem {
    //属性
    private int id;
    private String password;
    private int coutBalance;
    private static double liLv;
    private static double minBalance;
    private  static int cout;
    private static int total;

    //构造器
    public BankSystem(){
        id = cout++;
        total++;
    }
    public BankSystem(String password,int coutBalance){
        this();
        this.password = password;
        this.coutBalance = coutBalance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getCoutBalance() {
        return coutBalance;
    }

    public void setCoutBalance(int coutBalance) {
        this.coutBalance = coutBalance;
    }

    public static double getLiLv() {
        return liLv;
    }

    public static void setLiLv(double liLv) {
        BankSystem.liLv = liLv;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        BankSystem.minBalance = minBalance;
    }

    public static int getCout() {
        return cout;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "BankSystem{" + "id=" + id + ", password='" + password + '\'' + ", coutBalance=" + coutBalance + '}';
    }
}
