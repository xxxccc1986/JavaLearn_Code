package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/31 16:34
 */
public class SingleTonTest {
    //单例模式一饿汉式
    //1.私有化类的构造器 目的是为了避免外部调用构造器造对象
    private SingleTonTest(){
    }
    //2.内部创建类的对象
    //4.要求类的属性也必须是静态的
    private static SingleTonTest test = new SingleTonTest();
    //3.提供公共的静态方法返回类的对象
    public static SingleTonTest getTest(){
        return test;
    }

}


class Test{
    //单例模式二懒汉式
    //1.私有化类的构造器
    private Test(){
    }
    //2.声明当前类的对象，没有初始化
    //4.要求此对象也必须是静态的
    private static Test test1 = null;
    //3.声明public、static的返回当前类对象的方法
    public static Test getTest1(){
        if (test1 == null){
            test1 = new Test();
        }
        return test1;
    }
}