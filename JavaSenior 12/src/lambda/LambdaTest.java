package lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: lambda表达式的使用举例
 * @date 2022/2/21 14:15
 */
public class LambdaTest {

    @Test
    public void test(){
        Runnable r = () -> System.out.println("这是一个测试语句");

        r.run();
    }


    @Test
    public void test1(){
        //lambda表达式
        Comparator<Integer> c = (o1,o2) -> Integer.compare(o1,o2);

        int compare = c.compare(12, 20);
        System.out.println(compare);
    }

    @Test
    public void test2(){
        //方法引用
        Comparator<Integer> c = Integer::compareTo;

        int compare = c.compare(12, 20);
        System.out.println(compare);
    }
}
