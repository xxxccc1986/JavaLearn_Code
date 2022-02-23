package Thread;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/9 18:39
 */

class MyThread1 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        Thread thread = new Thread(m1);
        thread.setName("线程1");
        thread.start();//启动当前线程；调用当前线程的run方法
        Thread thread1 = new Thread(m1);
        thread1.setName("线程2");
        thread1.start();
    }
}
