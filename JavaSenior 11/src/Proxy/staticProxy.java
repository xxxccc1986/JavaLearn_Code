package Proxy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 静态代理的举例
 * @date 2022/2/20 23:10
 */
public class staticProxy {
    public static void main(String[] args) {
        NikeFactory nike = new NikeFactory();
        NikeProxy proxy = new NikeProxy(nike);
        proxy.protect();
    }

}

//接口
interface factory{
    void protect();

}

//代理类
class NikeProxy implements factory{
    private NikeFactory fact;

    public NikeProxy(NikeFactory fact) {
        this.fact = fact;
    }

    public void  protect(){
        System.out.println("通知工厂进行生产");
        fact.protect();
        System.out.println("生产完成的结尾工作");
    }
}




//被代理类
class NikeFactory implements factory {

    public void protect(){
        System.out.println("生产产品");
    }
}