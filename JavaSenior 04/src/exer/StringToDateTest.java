package exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;


/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/12 19:33
 */
public class StringToDateTest {
    public static void main(String[] args) throws ParseException {
        String date = "2017-08-16";
        //方式一 simpleDateFormat
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date s2 = s1.parse(date);
        java.sql.Date s3 = new java.sql.Date(s2.getTime());
        System.out.println(s3);

        //方式二 DateTimeFormat
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TemporalAccessor parse = d1.parse(date);
        System.out.println(parse);
    }
}
