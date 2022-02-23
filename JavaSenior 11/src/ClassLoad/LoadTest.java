package ClassLoad;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 类的加载器
 * @date 2022/2/20 16:25
 */
public class LoadTest {
    @Test
    public void test() throws IOException {
        Properties pro = new Properties();

        //方式一：
        //配置文件识别在当前的module下
//        FileInputStream file = new FileInputStream("test.properties");
//        FileInputStream file = new FileInputStream("src\\test.properties");
//
//        pro.load(file);

        //方式二：使用ClassLoader方式
        //配置文件此时识别在当前的module下的src
        ClassLoader classLoader = LoadTest.class.getClassLoader();
        //通过类的加载器得到一个输入流
        InputStream file1 = classLoader.getResourceAsStream("test1.properties");

        pro.load(file1);

        String name = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println("name=" + name + ",password=" + password);



    }
}
