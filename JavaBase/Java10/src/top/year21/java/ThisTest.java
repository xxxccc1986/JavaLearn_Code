package top.year21.java;

public class ThisTest {
    public static void main(String[] args) {
        Person3 p = new Person3();
        p.setAge(1);
        System.out.println(p.getAge());
    }
}

class Person3{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}