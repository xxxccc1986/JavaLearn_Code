package BufferStream;

import org.junit.Test;

import java.io.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 缓冲流  字节输入流和字节输出流的对非文本文件的复制操作
 * @date 2022/2/18 18:51
 */
public class InOutWithOutPut {
    @Test
    public void test(){
        long start = System.currentTimeMillis();

        getTest("C:\\Users\\hcxs1986\\Desktop\\1.mp4","C:\\Users\\hcxs1986\\Desktop\\2.mp4");

        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println("所花费的时间：" + time);//133

    }


    public void getTest(String start,String end){
        BufferedInputStream bu = null;
        BufferedOutputStream bu1 = null;
        try {
            //1.创建File类的对象，指明文件的读取 和 写入的位置

            File file = new File(start);
            File file1 = new File(end);

            //2.创建相应的流的对象
            FileInputStream f  = new FileInputStream(file);
            FileOutputStream f1 = new FileOutputStream(file1);

            bu = new BufferedInputStream(f);
            bu1 = new BufferedOutputStream(f1);

            //3.进行读取和写出的具体操作
            byte[] b = new byte[1024];
            int len;
            while ((len = bu.read(b)) != -1) {
                bu1.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            if (bu1 != null) {
                try {
                    bu1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bu != null) {
                try {
                    bu.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
