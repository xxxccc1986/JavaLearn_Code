package FileReader_FileWriter;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/18 16:37
 */
public class atMomentTest {
    @Test
    public void test(){
        FileReader re = null;
        FileWriter wr = null;
        try {
            //1.提供File类的实例化对象，指明读入和写出的文件
            File f1 = new File("hello.txt");//读入的文件
            File f2= new File("hi1.txt");//写出的文件


            //2.提供具体的输入和输出流
            re = new FileReader(f1);
            wr = new FileWriter(f2);

            //3.数据的读取和写出
            //数据的读入
            char[] c = new char[5];
            int len;//记录每次读到的c数组当中的字符的个数
            while ((len = re.read(c)) != -1){
                for (int i = 0; i < len; i++) {
                    //数据的写出
                    wr.write(c[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.相应流的关闭操作
            try {
                if (re != null){
                    re.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (wr != null){
                wr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }

    }

