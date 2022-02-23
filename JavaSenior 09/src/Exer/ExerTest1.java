package Exer;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 0:16
 */
public class ExerTest1 {
    @Test
    public void test(){
        FileReader f = null;
        BufferedWriter f1 = null;
        try {
            //1.创建File类的实例对象
            //2.创建流的对象
            File file = new File("hello.txt");
            File file1 = new File("hello11.txt");

            f = new FileReader(file);
            f1 = new BufferedWriter(new FileWriter(file1));

            //3.遍历当前文件
            Map<Character,Integer> map = new HashMap<>();
            int date;//记录当前read()方法的得到的
            while ((date = f.read()) != -1){
                char d = (char) date;//将int还原为char类型
                //通过d所代表的key查询value的值，为空值代表没在map中出现过
                if ((map.get(d)) == null){
                    map.put(d,1);//没出现过，因此添加进map集合中
                }else {
                    map.put(d,map.get(d)+1);//出现过，此时map的value应该+1
                }
            }

            //遍历map集合中的entry键值对的数据
            Set<Map.Entry<Character, Integer>> entry = map.entrySet();
            Iterator<Map.Entry<Character, Integer>> iterator = entry.iterator();
            while (iterator.hasNext()){
                Map.Entry<Character, Integer> map1 = iterator.next();
                switch (map1.getKey()){//通过key判断除了文字以外的情况
                    case ' ':
                        f1.write("空格" + map1.getValue() + "\n");
                        break;
                    case '\n':
                        f1.write("换行=" + map1.getValue() + "\n");
                        break;
                    case '\t'://\t表示tab 键字符
                        f1.write("tab键=" + map1.getValue() + "\n");
                        break;
                    case '\r'://
                        f1.write("回车=" + map1.getValue() + "\n");
                        break;
                    default:
                        f1.write(map1.getKey()+ "=" + map1.getValue() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (f1 != null) {
                try {
                    f1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        }


    }


