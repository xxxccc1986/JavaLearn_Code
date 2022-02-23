package ForeachLoop;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/14 22:29
 */
public class ForeachTest {
    @Test
    public void forTest(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(1234);
        c1.add(456);

        //for(集合中元素的类型 局部变量名 : 集合对象)
        //内部还是调用的迭代器
        for( Object obj : c1){
            System.out.println(obj);
        }

        String[] arr = new String[]{"AA","AA","AA"};
        for (int i = 0; i < arr.length; i++) {
               arr[i] = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] str =new String[]{"AA","BB","MM"};
        for(String s:str){
            s="MM";//s只是一个局部变量，结果并没有影响str元素的值
            System.out.println(s);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }






}
