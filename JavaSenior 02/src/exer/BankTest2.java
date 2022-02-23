package exer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/10 15:51
 */
public class BankTest2 {
    public static void main(String[] args) {
        Bank2 b1 = new Bank2();
        Bank2 b2 = new Bank2();
        b1.setName("储户1");
        b1.start();

        b2.setName("储户2");
        b2.start();
    }
}

class Bank2 extends Thread{
    private static int count = 0;

    public void run(){
        synchronized (Bank2.class){
            if (count < 6000){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 3; i++) {
                    count += 1000;
                    System.out.println(Thread.currentThread().getName() + "开始存钱" + ",账户余额为：" + count);
                }
            }
        }
    }

}