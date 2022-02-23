package top.year21.java;

public class MethodTest {
    public static void main(String[] args) {

    }
}

//客户类
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void sleep(int hours){
        System.out.println("客户睡了" + hours + "个小时");
    }
    public void eat(){
        System.out.println("客户晚餐吃了" );
        return;
    }

    public String getName(){
        return name;
    }

    public  String getNation(String Nation){
        String info = "我的国籍是" + Nation;
        return info;
    }


}