package exer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 使用两个线程打印 1-100。线程1,线程2 交替打印
 * @date 2022/2/10 20:03
 */
public class ThreadExchange {
    public static void main(String[] args) {
        Run r = new Run();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}


class Run implements Runnable {
    private int num = 1;
    public void run() {
        for(int i = 0; i < 100;i++){
            synchronized (this) {
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


