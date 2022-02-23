package Exer;

import java.lang.reflect.Method;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/20 22:26
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class userClass = User.class;

        //1.创建运行时类的对象
        User user = (User) userClass.newInstance();

        //2.获得指定的方法
        Method show = userClass.getDeclaredMethod("show");

        //3.确定方法的可访问性
        show.setAccessible(true);

        //4.
        Object invoke = show.invoke(user);
        System.out.println(invoke);
    }
}


class User{
    public void show(){
        System.out.println("这是一个测试方法");
    }
}