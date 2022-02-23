package getTargetStructure;

import Reflection.Student;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 调用运行时类的指定属性
 * @date 2022/2/20 21:17
 */
public class getField {

    //通常不采取test的方式  而是采取test2 的方式
    @Test
    public void test() throws Exception {
        Class studentClass = Student.class;

        //创建运行时类的对象
        Student student = (Student) studentClass.newInstance();

        //获取指定的属性:要求运行时类中属性声明为public
        Field age = studentClass.getField("age");

        //设置当前属性的值  set() 参数1：指明设置的是哪个对象的属性  参数2：此属性设置的新值
        age.set(student,20);

        //获取当前属性的值  get() 参数1：指明获取哪个对象的属性值
        int age1 = (int) age.get(student);
        System.out.println(age1);
    }

    //如何操作运行时类中的指定的属性
    @Test
    public void test2() throws Exception {
        Class sd = Student.class;

        //创建运行时类的对象
        Student st = (Student) sd.newInstance();

        //1.获取运行时类中指定变量名的属性:getDeclaredField(String fieldName)
        Field name = sd.getDeclaredField("name");

        //2.保证当前属性是可访问的
        name.setAccessible(true);

        //3.修改指定对象的值
        name.set(st,"zhang");

        System.out.println(name.get(st));

    }




}
