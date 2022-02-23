package exer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 创建两个分线程，其中一个线程遍历100以内的偶数，
 *               另一个线程遍历100以内的奇数。
 * @date 2022/2/9 17:09
 */

class ThreadTest1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

class ThreadTest2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + i );
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest1 t1 = new ThreadTest1();
        t1.start();
        ThreadTest2 t2 = new ThreadTest2();
        t2.start();

        //创建Thread类的匿名子类的匿名对象
        new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 1){
                        System.out.println(Thread.currentThread().getName() + i );
                    }
                }
            }
        }.start();//创建完对象调用start方法启动线程
    }
}


