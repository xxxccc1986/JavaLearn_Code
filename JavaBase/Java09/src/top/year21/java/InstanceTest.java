package top.year21.java;

public class InstanceTest {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.playGame();
        p.sendEmail();

        //匿名对象示例
        new Phone().showPrice();

        PhoneMall mall = new PhoneMall();
        //匿名对象的使用
        mall.show(new Phone());


    }
}

class PhoneMall{
        public void show(Phone Phone){
            Phone.sendEmail();
            Phone.playGame();
        }

}

class Phone{
    //属性
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }


    public void playGame(){
        System.out.println("玩游戏");
    }

    public  void  showPrice(){
        System.out.println("手机的价格为：" + price);
    }

}