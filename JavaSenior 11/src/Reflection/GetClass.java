package Reflection;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 获取Class实例的方式
 * @date 2022/2/20 15:33
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.运行时类的属性.class
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        //2.运行时类的对象.getClass()方法
        Student s1 = new Student("T", 20);
        Class<? extends Student> aClass = s1.getClass();

        //3.Class的静态方法 forName(String path)
        Class<?> name = Class.forName("Reflection.Student");

        //判断三个Class的实例对象地址是否相同
        System.out.println(studentClass == aClass);
        System.out.println(name == aClass);

    }


}
