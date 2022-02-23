package top.year21.java;

public class Person {
    //属性
    private int age;
    private String name;

    //构造器
    public  Person(){
        age =18;
    }

    public Person(int i,String n){
        age = i;
        name = n;
    }



    //age的设置
    public void setAge(int i){
        if (i > 0 && i <= 130){
            age = i;
        }else {
            System.out.println("数据异常，请重新尝试");
//            throw new RuntimeException("数据异常，请重新尝试");抛异常的写法
        }
    }
    //age的读取
    public int getAge(){
        return age;
    }

    //name的设置
    public  void setName(String n){
        name = n;
    }
    //name的读取
    public  String getName() {
        return name;
    }
}

