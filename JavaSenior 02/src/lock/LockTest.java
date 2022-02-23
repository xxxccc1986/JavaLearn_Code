package lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 解决线程安全问题的方式三：lock锁 --- jdk5.0新增
 * @date 2022/2/10 15:04
 */
public class LockTest {
    public static void main(String[] args) {
        Tick t1 = new Tick();

        Thread s1 = new Thread(t1);
        Thread s2 = new Thread(t1);
        Thread s3 = new Thread(t1);

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }
}

class Tick implements Runnable{
    private static int ticket = 100;
    //实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock(true);
    public void run(){
        while(true){
            try {

                //2.调用lock()方法
                lock.lock();

                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + "票号：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally {
                //3.调用解锁的方法
                lock.unlock();
            }

        }
    }
}