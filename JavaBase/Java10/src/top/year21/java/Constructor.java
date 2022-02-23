package top.year21.java;

public class Constructor {
    public static void main(String[] args) {
        //创建类的对象：new + 构造器
        Person1 p = new Person1();
        p.age = 0;
        Person1 p1 = new Person1("Tom");
        System.out.println(p1.name);
    }
}

class Person1{
    //属性
    String name;
    int age;

    //构造器
    public Person1(){
        System.out.println("111");
    }
    public Person1(String n){
        name = n;
    }


}