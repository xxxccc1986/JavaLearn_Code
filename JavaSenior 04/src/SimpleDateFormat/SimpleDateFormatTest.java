package SimpleDateFormat;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/12 15:36
 */
public class SimpleDateFormatTest {

    @Test
    public void test() throws Exception{
        //字符串"2020-09-08"转换为java.sql.Date
        String birthday = "2020-09-08";
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s1.parse(birthday);
        System.out.println(date);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);

    }


}

