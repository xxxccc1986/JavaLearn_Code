package exer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 创建三个窗口买票，总票数为100张，使用继承Thread类的方式
 * @date 2022/2/9 19:13
 */

class Sell extends Thread{
    private  static int ticket = 100;

    public void run(){
        while(true){
            if(ticket > 0){
                System.out.println(getName() + ":" + "票号：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}


public class SellTicket {
    public static void main(String[] args) {
        Sell s1 = new Sell();
        Sell s2 = new Sell();
        Sell s3 = new Sell();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }


}
