package List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/14 22:51
 */
public class ListTest {
    @Test
    public void ListMethod(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("aa");

        //void add(int index, Object ele):在index位置插入ele元素
        arrayList.add(1,"BB");
        System.out.println(arrayList);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        arrayList.addAll(list1);
        //list.add(list1);
        System.out.println(arrayList.size());//9

        //Object get(int index):获取指定index位置的元素
        System.out.println(arrayList.get(0));
        //int indexOf(Object obj):返回obj在集合中首次出现的位置。如果不存在，返回-1.
        int index = arrayList.indexOf(4567);
        System.out.println(index);

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置。如果不存在，返回-1.
        System.out.println(arrayList.lastIndexOf(456));

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        Object obj = arrayList.remove(0);
        System.out.println(obj);
        System.out.println(arrayList);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        arrayList.set(1,"CC");
        System.out.println(arrayList);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开区间的子集合
        List subList = arrayList.subList(2, 4);
        System.out.println(subList);
        System.out.println(arrayList);
    }



}
