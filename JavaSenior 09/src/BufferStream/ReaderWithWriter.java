package BufferStream;

import org.junit.Test;

import java.io.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 缓冲流  字符输入流和字符输出流的对文本文件的复制操作
 * @date 2022/2/18 18:52
 */
public class ReaderWithWriter {
    @Test
    public void test(){
        long start = System.currentTimeMillis();

    getTest("C:\\Users\\hcxs1986\\Desktop\\day09.txt","C:\\Users\\hcxs1986\\Desktop\\9.txt");

        long end = System.currentTimeMillis();

        System.out.println("所花费的时间：" + (end - start));//0


    }


    public void getTest(String start,String end){
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            //1.创建File类的对象，指明文件的读取 和 写入的位置
            //2.创建相应的流的对象
            reader = new BufferedReader(new FileReader(new File(start)));
            writer = new BufferedWriter(new FileWriter(new File(end)));


            //3.进行读取和写出的具体操作
            //方式一
            char[] c = new char[10];
            int len;
            while ((len = reader.read(c)) != -1) {
                writer.write(c,0,len);
            }

            //方式二
//            String data;
//            while ((data = reader.readLine()) != null){
//                writer.write(data);
//                writer.newLine();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
