package exer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/10 15:28
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank(0);
        Thread t1 = new Thread(b);
        t1.setName("储户1");
        t1.start();
        Thread t2 = new Thread(b);
        t2.setName("储户2");
        t2.start();

    }
}

class Bank implements Runnable{
    private int count;

    public Bank(int count){
        this.count = count;
    }
    public void run(){
            synchronized(this){
                getCount();
            }
        }

    private int getCount(){
            if (count < 6000){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 3; i++){
                    count += 1000;
                    System.out.println(Thread.currentThread().getName() + "开始存钱" + ",账户余额为：" + count);
                }
            }

        return count;
}
}