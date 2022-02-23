package Thread; /**
 * @author year21
 * @create 2022-02-09 16:15
 */

/**
 * @description: 多线程的创建
 * @author hcxs1986
 * @date 2022/2/9 16:15
 * @version 1.0
 */
//1.创建一个继承于Thread类的子类
class Test extends Thread{
    //2.重写Thread类中的run()方法
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        Test test = new Test();
        //4.通过此对象调用父类中的star()方法
        test.start();
        //问题一：我们不能通过直接调用对象.run()方法启动线程
        //test.run()

        //问题二：要想再启动一个线程，不能再调用当前对象的start()的线程去执行，会报IllegalThreadStateException异常
        //只能通过重新创建一个新的线程对象
        Test test1 = new Test();
        test1.start();
        //以下的方法仍然在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(i + "---");
            }
        }
    }
}
