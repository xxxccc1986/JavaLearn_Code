package URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 21:24
 */
public class URLTest1 {
    public static void main(String[] args)  {
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        FileOutputStream file = null;
        try {
            URL url = new URL("http://localhost:4000/link/1.jpg");
            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();

            inputStream = urlConnection.getInputStream();

            file = new FileOutputStream("JavaSenior 10\\4.jpg");

            byte[] b = new byte[1024];
            int len;
            while ((len = inputStream.read(b)) != -1){
                file.write(b,0,len);
            }

            System.out.println("下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流资源
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (urlConnection != null)
                urlConnection.disconnect();
        }

    }
}
