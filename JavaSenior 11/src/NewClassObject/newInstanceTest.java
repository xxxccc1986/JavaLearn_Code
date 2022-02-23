package NewClassObject;

import Reflection.Student;
import org.junit.Test;

import java.util.Random;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 通过反射创建运行时类的对象
 * @date 2022/2/20 16:47
 */
public class newInstanceTest {
    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Student> s = Student.class;
        Student s1 = s.newInstance();
        System.out.println(s1);
    }


    @Test
    public void test1(){
        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(3);
            String path  = "";
            switch (num){
                case 1:
                    path = "java.util.Date";
                    break;
                case 2:
                    path = "java.lang.Object";
                    break;
                case 3:
                    path = "java.lang.Enum";
                    break;
            }


            Object o = null;
            try {
                o = newInst(path);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(o);
        }



    }


    public Object newInst(String path) throws Exception {
        Class cl = Class.forName(path);
        return cl.newInstance();
    }
}
