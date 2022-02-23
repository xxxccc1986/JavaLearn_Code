package trasnforStream;

import org.junit.Test;

import java.io.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/18 18:54
 */
public class InPutWithOutPut {
    @Test
    public void test(){
        InputStreamReader in = null;
        OutputStreamWriter out = null;
        try {
            //1.创建File类的对象
            //2.创建具体的流
            //变量in里面的参数2指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt保存时使用的字符集
            in = new InputStreamReader(new FileInputStream("dbcp.txt"), "UTF-8");

            out = new OutputStreamWriter(new FileOutputStream("dbcp1.txt"),"UTF-8");


            //3.具体数据的读取和写入的操作
            char[] c = new char[10];
            int len;
            while ((len = in.read(c)) != -1){
                out.write(c,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

