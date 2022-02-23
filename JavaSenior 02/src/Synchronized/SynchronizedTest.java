package Synchronized;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 使用实现Runnable的方式创建多线程
 * 通过同步代码块解决线程安全问题
 * @date 2022/2/9 23:16
 */
public class SynchronizedTest {
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


class Sell1 implements Runnable{
    private int ticket = 100;
    Object obj = new Object();

    public void run(){
        while(true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买票，票号是：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}