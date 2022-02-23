package ObejctExer;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/29 16:29
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(12,"清风");
        Order order1 = new Order(12,"清风");
        System.out.println(order.equals(order1));
    }

}
