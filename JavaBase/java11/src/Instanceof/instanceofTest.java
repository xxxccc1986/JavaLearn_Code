package Instanceof;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 22:16
 */
public class instanceofTest {
    public static void main(String[] args) {
        instanceofTest test = new instanceofTest();
        test.method(new Graduate());
        }
        
    public void method(Person e){
        String info = e.getInfo();
        System.out.println(info);
        if (e instanceof  Graduate){
            System.out.println("a graduate student" );
        }
        if (e instanceof Student){
            System.out.println("a student");
        }
        if (e instanceof Person){
            System.out.println("a person");
        }


    }






}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}