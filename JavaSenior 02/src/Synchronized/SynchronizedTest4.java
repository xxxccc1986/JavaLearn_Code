package Synchronized;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 使用继承Thread类的方式创建多线程
 * 通过同步方法解决购票线程安全问题
 * @date 2022/2/10 0:02
 */
public class SynchronizedTest4 {
    public static void main(String[] args) {
        Sell3 s1 = new Sell3();
        Sell3 s2 = new Sell3();
        Sell3 s3 = new Sell3();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }
}

class Sell3 extends Thread{
    private static int ticket = 100;

    public void run(){
        while(true){
            syn();
        }
    }

//    private synchronized void syn(){//同步监视器s1,s2,s3，此方法不可行
    private  static synchronized void syn(){//同步监视器 Sell3.class
        if(ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "票号：" + ticket);
            ticket--;
        }
    }
}
