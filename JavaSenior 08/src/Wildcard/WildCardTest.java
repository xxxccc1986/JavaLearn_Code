package Wildcard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 通配符的使用
 * @date 2022/2/17 16:14
 */
public class WildCardTest {
    @Test
    public void test(){
        List<String> list = null;
        List<Object> list1 = null;

        List<?> list2 = null;
        list2 = list;
        list2 = list1;

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list2 = list3;

        //添加(写入)：对于List<?>就不能向其内部添加数据。
        //除了添加null之外。
//        list.add("DD");
//        list.add('?');

        list.add(null);

        //获取(读取)：允许读取数据，读取的数据类型为Object。
        Object o = list.get(0);
        System.out.println(o);

    }
}
