package FileReader_FileWriter;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/18 16:24
 */
public class fileWriterTest {
    @Test
    public void test() throws IOException {
        //1.File类的实例化
        File file = new File("hi1.txt");

        //2.提供具体的流
        FileWriter wr = new FileWriter(file);

        //3.数据的写出
        wr.write("first\n");
        wr.write("second");

        //4.流的关闭
        wr.close();
    }


}
