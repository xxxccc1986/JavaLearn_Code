package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 通过动态代理 实现 代理类不固定 被代理已知问题
 * @date 2022/2/21 0:58
 */

public class ReflectProxy {
    public static void main(String[] args) {
        //创建被代理类的对象
        Student s1 = new Student();

        //调用静态方法生成动态代理类的对象，将被代理类对象填入
        //当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        Person person = (Person) MovingProxy.getProxy(s1);
        String interest = person.interest();
        System.out.println(interest);
        person.read("肖申克的救赎");
    }
}

/*
要想实现动态代理，需要解决的问题？
问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
问题二：当通过代理类的对象调用方法a时，如何动态的去调用被代理类中的同名方法a。
 */
//接口类
interface Person{
    void read(String book);
    String interest();
}


//被代理类
//需要实现接口类中的方法
class Student implements Person{
    public void read(String book){
        System.out.println("喜欢的书籍是：" + book);
    }

    public String interest(){
        return "read book";
    }
}


//动态代理类
class MovingProxy{
    //声明为静态方法，以便生成代理类对象直接调用
    public static Object getProxy(Object obj){//此处的obj是传入的被代理类的对象
        //newProxyInstance的第三个参数是InvocationHandler接口的实现类的对象
        InvocationHand invocation = new InvocationHand();

        //对invocation类的实例对象以传入的被代理类对象赋值，缺少此步将导致空指针异常
        invocation.getObj(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),invocation);
    }
}


class InvocationHand implements InvocationHandler{
    private Object obj;

    public void getObj(Object obj){
        this.obj = obj;
    }

    //当通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    //此处的proxy即为被代理类的对象，method即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        Object invoke = method.invoke(obj, args);
        return invoke;//上述方法的返回值就作为当前类中的invoke()的返回值。
    }
}