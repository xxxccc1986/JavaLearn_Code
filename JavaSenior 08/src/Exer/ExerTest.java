package Exer;

import org.junit.Test;

import java.util.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/17 22:05
 */
public class ExerTest  {
    @Test
    public void test(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Tom",12);
        map.put("Jack",50);
        map.put("Mary",15);
        map.put("Rose",14);

        //遍历key集
        Set<String> key = map.keySet();
        for (String newKey : key) {
            System.out.println(newKey);
        }

        //遍历value集
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator= values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //遍历key-value集
        //方式一
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> entry = iterator1.next();
            String key1 = entry.getKey();
            Integer value = entry.getValue();
//            Object obj = iterator1.next();
//            Map.Entry map1 = (Map.Entry)obj;
            System.out.println("key:" + key1 + ",value:" + value);
        }

        System.out.println();
        //方式二
        Set<String> set = map.keySet();
        Iterator<String> iterator2 = set.iterator();
        while(iterator2.hasNext()){
            String key1 = iterator2.next();
            Integer integer = map.get(key1);
            System.out.println("key:" + key1 + ",value:" + integer);
        }

    }


}
