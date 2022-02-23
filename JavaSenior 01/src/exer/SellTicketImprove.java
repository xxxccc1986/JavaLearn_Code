package exer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 创建三个窗口买票，总票数为100张，使用实现Runnable的方式
 * @date 2022/2/9 19:23
 */

class Sell1 implements Runnable{
    private int ticket = 100;
    public void run(){
        while(true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "买票，票号是：" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}

public class SellTicketImprove {
    public static void main(String[] args) {
        Sell1 s1 = new Sell1();

        Thread thread = new Thread(s1);
        Thread thread1 = new Thread(s1);
        Thread thread2 = new Thread(s1);

        thread.setName("窗口1");
        thread1.setName("窗口2");
        thread2.setName("窗口3");

        thread.start();
        thread1.start();
        thread2.start();
    }

}
