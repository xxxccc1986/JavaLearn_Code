package top.year21.java;

public class PersonTest {
    public static void main(String[] args) {
        Person b =new Person();
//        b.setAge(15);
        System.out.println("年龄为：" + b.getAge());

        Person b1 = new Person(15,"Li");
        System.out.print("年龄为：" + b1.getAge() +"\t");
        System.out.println("名字为：" + b1.getName());
    }

}
