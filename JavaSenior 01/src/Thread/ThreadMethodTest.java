package Thread;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试Thread类中的常用方法
 * @date 2022/2/9 17:26
 */

class MyThead extends Thread{
   public void run(){
       for (int i = 0; i < 100; i++) {
           if (i % 2 == 0){
               try {
                   sleep(10);//线程阻塞0.01秒
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(Thread.currentThread().getName() + ":"
                       + Thread.currentThread().getPriority() + ":" + i);
           }

//           if (i % 20 == 0 ){
//               this.yield();//释放当前cpu的执行权，但下一刻还有可能执行此线程
//           }
       }
   }

   public MyThead(String name){
       super(name);
   }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
       MyThead t1 = new MyThead("thread：1 ");
        //线程更名需要在启动start方法之前设置
//       t1.setName("线程1");

        //线程优先级设置也要在start方法之前设置
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

       //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + ":"
                        + Thread.currentThread().getPriority() + ":" + i);
            }

            if (i == 20){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(t1.isAlive());
    }

}
