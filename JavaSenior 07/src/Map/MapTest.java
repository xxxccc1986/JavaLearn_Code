package Map;

import org.junit.Test;

import java.util.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/15 23:05
 */
public class MapTest {

    @Test
    public void mapTest(){
        Map map = new HashMap();

        //put() 添加元素
        map.put("AA",123);
        map.put("bb",123);
        //key值相同，此处将下方的value值替换上方key相同的value值
        map.put("AA",78);
        System.out.println(map);

        //putAll() 添加所有元素
        Map map1 = new HashMap();
        map1.put("CC",145);
        map1.put("DD",165);

        map.putAll(map1);
        System.out.println(map);

        //remove() 移除指定元素
        Object Value = map.remove("CC");
        System.out.println(Value);
        System.out.println(map);

        //clear() 清空map中的所有元素
        map.clear();
        System.out.println(map.size());

    }


    /*
元素查询的操作：
Object get(Object key)：获取指定key对应的value
boolean containsKey(Object key)：是否包含指定的key
boolean containsValue(Object value)：是否包含指定的value
int size()：返回map中key-value对的个数
boolean isEmpty()：判断当前map是否为空
boolean equals(Object obj)：判断当前map和参数对象obj是否相等
   */
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        // Object get(Object key)
        System.out.println(map.get(45));
        //containsKey(Object key)
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        isExist = map.containsValue(123);
        System.out.println(isExist);

        map.clear();

        System.out.println(map.isEmpty());

    }

    @Test
        public void test2(){
  /*
 元视图操作的方法：
 Set keySet()：返回所有key构成的Set集合
 Collection values()：返回所有value构成的Collection集合
 Set entrySet()：返回所有key-value对构成的Set集合

     */


            Map map = new HashMap();
            map.put("AA", 123);
            map.put(45, 1234);
            map.put("BB", 56);

            //遍历所有的key集：keySet()
            Set set = map.keySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println();
            //遍历所有的value集：values()
            Collection values = map.values();
            for (Object obj : values) {
                System.out.println(obj);
            }
            System.out.println();
            //遍历所有的key-value
            //方式一：entrySet()
            Set entrySet = map.entrySet();
            Iterator iterator1 = entrySet.iterator();
            while (iterator1.hasNext()) {
                Object obj = iterator1.next();
                //entrySet集合中的元素都是entry
                Map.Entry entry = (Map.Entry) obj;
                System.out.println(entry.getKey() + "---->" + entry.getValue());

            }
            System.out.println();
            //方式二：
            Set keySet = map.keySet();
            Iterator iterator2 = keySet.iterator();
            while (iterator2.hasNext()) {
                Object key = iterator2.next();
                Object value = map.get(key);
                System.out.println(key + "=====" + value);

            }

        }
    }


