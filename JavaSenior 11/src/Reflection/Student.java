package Reflection;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/20 15:35
 */
public class Student {
    private String name;
    public int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private  Student(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String get(String nation){
        System.out.println("聚集地" + nation);
        return nation;
    }


    private  static void showDetails(){
        System.out.println("这是一个测试的静态方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
