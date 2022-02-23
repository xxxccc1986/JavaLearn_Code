package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/2 21:18
 */
public class HomeWorkTest extends HomeWork{
    public static void main(String[] args) {
        HomeWorkTest test = new HomeWorkTest();
        test.print();
        HomeWork c = (new HomeWork(){
            public void getMoney() {
                System.out.println("只有努力才能赚到钱，但不努力一定不能赚到钱");
            }
        });
        c.getMoney();
    }
    public void print() {
        getMoney();
    }
        @Override
        public void getMoney() {
            System.out.println("努力才能赚到钱，但不努力一定不能赚到钱");
        }

}
