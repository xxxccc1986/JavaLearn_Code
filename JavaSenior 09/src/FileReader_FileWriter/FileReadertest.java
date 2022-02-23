package FileReader_FileWriter;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 字符流的测试
 * @date 2022/2/18 15:29
 */
public class FileReadertest {

    @Test
    public void test()  {
        FileReader f = null;
        try {
            //1.实例化File类的对象
            File file = new File("hello.txt");//相较于当前module

            //2.提供具体的流
            f = new FileReader(file);

            //3.数据的读入
            //read():返回读入的一个字符。如果文件返回-1，则文件读取结束

            //方式一
//        int read = f.read();
//        while (read != -1){
//            System.out.print((char) read);
//            read = f.read();
//        }

            //方式二：仅仅是语法上的区别，效率没有提升
            int read;
            while((read = f.read()) != -1){
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if (f != null)
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test1() {
        FileReader f = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");

            //2.提供具体的流
            f = new FileReader(file);

            //3.数据的读入
            //read()方法的升级
            char[] c = new char[5];
            int len;
            while ((len = f.read(c)) != -1){
                //方式一
                for (int i = 0; i < len ; i++) {
                    System.out.print(c[i]);
                }

//                //方式二
//                String str = new String(c,0,len);
//                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
