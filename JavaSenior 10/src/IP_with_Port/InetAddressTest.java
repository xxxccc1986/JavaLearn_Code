package IP_with_Port;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 16:36
 */
public class InetAddressTest {

    public static void main(String[] args) {
        try {
            InetAddress name = InetAddress.getByName("www.year21.top");
            System.out.println(name);

            System.out.println(name.getHostName());
            System.out.println(name.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
