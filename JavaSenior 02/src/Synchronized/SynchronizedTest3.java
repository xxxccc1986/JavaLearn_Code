package Synchronized;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 使用实现Runnable的方式创建多线程
 * 通过同步方法解决购票线程安全问题
 * @date 2022/2/9 23:53
 */
public class SynchronizedTest3 {
    public static void main(String[] args) {
        Sell12 s1 = new Sell12();

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


class Sell12 implements Runnable{
    private int ticket = 100;
    public  void run(){
        while(true) {
            syn();
            }
    }

    private synchronized void syn(){//同步监视器：this
        if (ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买票，票号是：" + ticket);
            ticket--;
        }
    }
}