package RandomAccessFile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: RandomAccessFile的使用说明
 * @date 2022/2/19 14:59
 */
public class RondomTest {
    @Test
    public void test(){
        RandomAccessFile file = null;
        RandomAccessFile file1 = null;
        try {
            file = new RandomAccessFile(new File("蓝屏.jpg"),"r");
            file1 = new RandomAccessFile(new File("蓝屏3.jpg"),"rw");


            byte[] b = new byte[1024];
            int len;
            while ((len = file.read(b)) != -1){
                file1.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (file1 != null) {
                try {
                    file1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Test
    public void test1(){
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(new File("hi1.txt"),"rw");

//            file.seek(4);//将指针调到角标为4的位置
            file.write("123".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {

                }
            }
        }

    }

    @Test
    //使用RandomAccessFile实现数据的插入效果
    public void test2() throws IOException {
        RandomAccessFile file = new RandomAccessFile("hi1.txt","rw");

        file.seek(3);//将指针调到角标为3的位置
        //保存指针3后面的所有数据到StringBuilder中
        StringBuilder builder = new StringBuilder((int)new File("hi1.txt").length());
        byte[] b = new byte[20];
        int len;
        while ((len = file.read(b)) != -1){
            builder.append(new String(b,0,len));
        }
        //调回指针，写入“xyz”
        file.seek(3);
        file.write("123".getBytes());

        //将StringBuilder中的数据写入到文件中
        file.write(builder.toString().getBytes());

        file.close();
    }
}
