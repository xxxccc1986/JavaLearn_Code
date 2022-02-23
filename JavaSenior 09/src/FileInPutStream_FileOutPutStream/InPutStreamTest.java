package FileInPutStream_FileOutPutStream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 通过字节输入流以及字节输出流对非文本文件进行了复制
 * @date 2022/2/18 17:04
 */
public class InPutStreamTest {

    @Test
    public void test(){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //1.实例化File类
            File file= new File("蓝屏.jpg");
            File file1= new File("蓝屏1.jpg");
            //2.提供具体的流
            in = new FileInputStream(file);
            out = new FileOutputStream(file1);
            //3.非文本文件的处理
            byte[] b = new byte[5];
            int len;//记录每次读到的b数组当中的字符的个数
            while ((len = in.read(b)) != -1){
                out.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.相应流的关闭
            try {
                if (in != null)
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (out != null)
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
