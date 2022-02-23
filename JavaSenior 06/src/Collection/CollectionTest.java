package Collection;

import org.junit.Test;

import java.util.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/14 17:41
 */
public class CollectionTest {

    @Test
    public void test(){
        Collection c = new ArrayList();
        //add(Object e);将元素e添加到集合c中
        c.add("he");
        c.add("cost");
        c.add(145);//自动装箱变成了Integer包装类

        //size() 获取添加元素的个数
        System.out.println(c.size());

        //addAll(Collection c) 将另一个集合的元素添加到这个集合当中
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(1234);
        c1.add("hello");
        c.addAll(c1);
        System.out.println(c.size());
        System.out.println(c);

        //clear() 删除集合内的元素
        c1.clear();

        //isEmpty() 判断当前集合是否为空 实际上是判断集合的长度是否为0
        System.out.println(c1.isEmpty());

        System.out.println("---------------------------------------");
        //contains(Object obj) 判断当前集合是否包含obj
        //在判断时会调用obj对象所在类的equals()方法
        System.out.println(c.contains(123));


        //contains(Collection c1) 判断形参c1的所有元素是否都在当前集合中
        Collection c2  = Arrays.asList(123,1234);
        System.out.println(c.containsAll(c2));


        //remove(Object obj) 移除当前集合中的形参元素
        c.remove(123);

        //removeAll(Collection c) 移除当前集合中的另一个集合的所有元素
        System.out.println(c.removeAll(c2));


        //retainAll(Collection c) 获取当前集合和形参列表内的集合的共同元素并返回到当前集合
        Collection c3 = Arrays.asList(145,"hello");
        c.removeAll(c3);

        //equals(Object obj) 形参也必须是集合，用于比较两个集合的元素是否相同
        Collection c4 = new ArrayList();
        c4.add("he");
        c4.add("cost");
        System.out.println(c4.equals(c));
    }


    @Test
    public void test2(){
        //hashCode() 返回当前对象的哈希值
        Collection c4 = new ArrayList();
        c4.add("he");
        c4.add("cost");
        System.out.println(c4.hashCode());

        //toArray()：集合---> 数组
        Object[] array = c4.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        //扩展  数组  ---> 集合 ：调用Arrays类的静态方法asList()
        List<Object> objects = Arrays.asList(new Object[]{123, 456});
        System.out.println(objects);

    }

    @Test
    public void test3(){
        //iterator()：返回iterator接口的实例，用于遍历集合元素，使用迭代器Iterator接口
        //内部方法：1. hasNext() 、 next() 、remove()
        // 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，
        // 默认游标都在集合的第一个元素之前。
        // 3.内部的remove(),可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove()
        Collection c4 = new ArrayList();
        c4.add("he");
        c4.add("cost");
        System.out.println(c4.hashCode());
        Iterator iterator = c4.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    @Test
    public void test4(){
        //Iterator中的remove()方法
        //在未调用next()之前不可调用remove()方法 和
        //已经调用了remove方法，再调用remove两种情况都会报IllegalStateException。
        Collection c4 = new ArrayList();
        c4.add("he");
        c4.add("cost");
        Iterator iterator = c4.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if ("he".equals(obj)){
                iterator.remove();
            }
        }

        iterator = c4.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
