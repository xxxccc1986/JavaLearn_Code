package URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 21:13
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url  =  new URL("http://localhost:4000/link/1.txt?user=xx&name=xx");

            //            public String getProtocol(  )     获取该URL的协议名
            System.out.println(url.getProtocol());
//            public String getHost(  )           获取该URL的主机名
            System.out.println(url.getHost());
//            public String getPort(  )            获取该URL的端口号
            System.out.println(url.getPort());
//            public String getPath(  )           获取该URL的文件路径
            System.out.println(url.getPath());
//            public String getFile(  )             获取该URL的文件名
            System.out.println(url.getFile());
//            public String getQuery(   )        获取该URL的查询名
            System.out.println(url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
