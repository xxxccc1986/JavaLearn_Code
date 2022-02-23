package Exer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/18 0:55
 */
public class ExerTest1 {
    @Test
    public void test(){
        List<String>  list = new ArrayList<>();
        list.add("he");
        list.add("she");
        list.add("they");

        //方式一 迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //方式二 增强for循环
        for (String s : list){
            System.out.println(s);
        }
    }

    @Test
    public void test1(){
        Map<String,String> map = new HashMap<>();
        map.put("陈某","大一");
        map.put("张某","大一");
        map.put("徐某","大一");

        ArrayList<String> list = new ArrayList<>();
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
        System.out.println("value:" + list);
    }

//    public List<String> list(Map<String,String> map){
//
//    }

    @Test
    public void test2(){
        File file = new File("D:\\Javastudy\\a.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.getParent() 获取file文件的当前路径
        File file1 = new File(file.getParent(),"b.txt");
        try {
            boolean newFile = file1.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
