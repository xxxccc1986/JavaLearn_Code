package Synchronized;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 使用继承Thread类的方式创建多线程
 * 通过同步代码块解决购票线程安全问题
 * @date 2022/2/9 23:20
 */
public class SynchronizedTest2 {
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
class Sell extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();
    public void run(){
        while(true){
            synchronized (obj){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":" + "票号：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}