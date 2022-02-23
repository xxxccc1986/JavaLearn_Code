package top.year21.java;

import java.util.Scanner;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/4 21:04
 */
public class EcmDef {
    public static void main(String[] args) {
        try{
             int i = Integer.parseInt(args[0]);
             int j = Integer.parseInt(args[1]);
             int n3 = ecm(i,j);//此处调用了ecm方法，ecm中有异常，因此必须通过try-catch-finally来解决
            System.out.println(n3);
        }catch(NumberFormatException e){
            System.out.println("数据类型不一样");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (EcDef e){
            //下面有输出语句，getMessage()方法在这的作用是返回异常提示语句
            System.out.println(e.getMessage());
        }

    }


public static int ecm(int i,int j) throws EcDef{//仅仅通过throws将异常抛出，并没有真正处理
        if (i < 0 || j < 0){
            throw new RuntimeException("不允许输入负数");//手动抛出一个异常，同时输出一句话
        }
        return i / j;
}


//自定义负数异常类
class EcDef extends Exception{
    static final long serialVersionUID = -7037193246939L;

    public EcDef(){

    }

    public EcDef(String str){
        super(str);
    }

}

}
