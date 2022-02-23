package top.year21.project;

public class FamilyAccountTest {
    public static void main(String[] args) {
        Boolean isFlag = true;
        int balance = 10000;
        String details = "收支\t      账户金额      收支金额           说\t明 ";
        while (isFlag) {
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println();
            System.out.println("                   1 收支明细                         ");
            System.out.println("                   2 登记收入                         ");
            System.out.println("                   3 登记支出                         ");
            System.out.println("                   4 退   出                          ");
            System.out.println();
            System.out.print("                   请选择(1-4): ");

            char choose = Utility.readMenuSelection();
            switch (choose) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int in = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String inExplain = Utility.readString();
                    System.out.println("----------------------登记完成------------------");
                    balance += in;
                    details = details + "\n" + "收入"+ "\t\t  " + balance + "\t\t    " + in
                            +  "        \t\t" + inExplain;
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int out = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String outExplain = Utility.readString();
                    System.out.println("----------------------登记完成------------------");
                    balance -= out;
                    details = details + "\n" + "支出"+ "\t\t  " + balance + "\t\t    " + out
                            +  "        \t\t" + outExplain;
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N):");
                    char ensure = Utility.readConfirmSelection();
                    if (ensure == 'Y'){
                        isFlag = false;
                        break ;
                    }
            }
        }
    }
}