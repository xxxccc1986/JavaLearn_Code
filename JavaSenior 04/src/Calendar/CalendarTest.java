package Calendar;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/12 16:17
 */
public class CalendarTest {
    @Test
    public  void CalendarTest(){
        Calendar calendar = Calendar.getInstance();

        //get()
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //getTime():日历类--->Date
        Date time = calendar.getTime();
        System.out.println(time);

        //setTime()：Date--->日历类
        Date date = new Date();
        calendar.setTime(date);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }


}
