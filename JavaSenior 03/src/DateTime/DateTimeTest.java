package DateTime;

import org.junit.Test;

import java.util.Date;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: Date类的说明
 * @date 2022/2/11 16:49
 */
public class DateTimeTest {

    @Test
    public void Test(){
        //构造器1：Date()；创建一个对应当前时间的Date的对象
         Date date = new Date();
        System.out.println(date.toString());//Fri Feb 11 16:58:08 CST 2022
        System.out.println(date.getTime());//1644569910695

        //构造器2：Date()；创建指定毫秒数的Date的对象
        Date date1 = new Date(1644569910695L);
        System.out.println(date1.toString());


        //创建java.sql.Date的对象
        Date date2 = new java.sql.Date(1644569910695L);
        System.out.println(date2.toString());
        //将java.util.Date 对象转换为java.sql.Date 的对象
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
    }
    
}
