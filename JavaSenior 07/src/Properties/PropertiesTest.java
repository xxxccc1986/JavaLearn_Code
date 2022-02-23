package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/16 17:43
 */
public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fils = null;
        try {
            Properties properties = new Properties();

            fils = new FileInputStream("jdbc.properties");
            properties.load(fils);

            String name = properties.getProperty("name");
            String password = properties.getProperty("password");

            System.out.println("name=" + name + ",password=" + password);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fils != null)
            try {
                fils.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }



