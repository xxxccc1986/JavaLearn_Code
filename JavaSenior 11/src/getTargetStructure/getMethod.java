package getTargetStructure;

import Reflection.Student;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 调用运行时类的指定方法
 * @date 2022/2/20 22:02
 */
public class getMethod {
    /**
     * 如何操作运行时类中的指定的方法
     */
    //
    @Test
    public void test3() throws Exception{
        Class st = Student.class;

        //创建运行时类的对象
        Student sd = (Student) st.newInstance();

        //1.获取指定的某个方法
        //getDeclaredMethod():参数1 ：指明获取的方法的名称  参数2：指明获取的方法的形参列表
        Method get = st.getDeclaredMethod("get", String.class);

        //2.保证当前方法是可访问的
        get.setAccessible(true);

        //3.调用方法的invoke():参数1：方法的调用者  参数2：给方法形参赋值的实参
        //invoke()的返回值即为对应类中调用的方法的返回值。
        Object returnGet = get.invoke(sd, "CTB");
        System.out.println(returnGet);


        /**
         * 调用静态方法
         */

        Method showDetails = st.getDeclaredMethod("showDetails");
        showDetails.setAccessible(true);
        //如果调用的运行时类中的方法没有返回值，则此invoke()返回null
        Object returnShow = showDetails.invoke(Student.class);
        System.out.println(returnShow);
    }
}
