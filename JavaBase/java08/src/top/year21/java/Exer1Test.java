package top.year21.java;

public class Exer1Test {
    public static void main(String[] args) {
    Person1 p1 = new Person1();
    p1.name = "xu";
    p1.age = 18;
    p1.sex = 1;

    p1.study();
    p1.showAge();
    int newage = p1.addAge(2);
        System.out.println(p1.name + "的新年龄为：" + newage);
        System.out.println(p1.age);//20
    }
}


class Person1 {
    //属性
    String name;
    int age;
    /**
     * sex = 1 , 为男性
     * sex = 2 ，为女性
     */
    int sex;

    //方法
    public void study(){
        System.out.println("studying");
    }

    public  void showAge(){
        System.out.println("age:" + age);
    }
    public  int addAge(int i){
        age += i;
        return age;
    }


}