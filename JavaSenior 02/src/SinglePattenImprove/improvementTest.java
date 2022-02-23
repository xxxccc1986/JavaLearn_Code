package SinglePattenImprove;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 使用同步机制解决单例模式中懒汉式的线程安全问题
 * @date 2022/2/10 14:18
 */
public class improvementTest {
}


class Improvement{
    //1.私有化构造器
    private Improvement(){

    }

    //2.创建类的对象，赋予空值
    //3.要求类的对象也必须是静态的
    private static Improvement im = null;

    //4.提供公共的静态查询方法
        //同步方法
//    public static synchronized Improvement getIm(){
//        if (im == null){
//            im = new Improvement();
//        }
//            return im;
//    }

    //同步代码块   高效率的线程安全
    public static Improvement getIm(){
        if (im == null){
            synchronized(Improvement.class){
                if (im == null){
                    im = new Improvement();
                }
            }
        }
        return im;
    }
}