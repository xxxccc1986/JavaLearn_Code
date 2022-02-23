package Exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 对图片的复制且进行加密
 * @date 2022/2/19 0:06
 */
public class ExerTest {
    @Test
        public void test(){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            File file = new File("蓝屏.jpg");
            File file1 = new File("蓝屏2.jpg");

            in = new FileInputStream(file);
            out = new FileOutputStream(file1);

            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) != -1){
                for (int i = 0; i < len; i++) {
                    b[i] = (byte) (b[i] * 5) ;//b[i] * 5会自动类型提升为int型，强转其为byte型
                }
                out.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
