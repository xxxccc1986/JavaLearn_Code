package getTargetStructure;

import Reflection.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 调用运行时类的指定构造器
 * @date 2022/2/20 22:03
 */
public class getCons {
    @Test
    public void test() throws Exception{
        Class studentClass = Student.class;

        //1.获取指定的构造器
        //getDeclaredConstructor():参数：指明构造器的参数列表
        Constructor declaredConstructor = studentClass.getDeclaredConstructor(int.class);

        //2.保证此构造器是可访问的
        declaredConstructor.setAccessible(true);

        //3.调用此构造器创建运行时类的对象
        Student s = (Student) declaredConstructor.newInstance(20);

        System.out.println(s);
    }
}
