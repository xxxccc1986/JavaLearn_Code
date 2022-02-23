package Scoket;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: UDP网络编程的说明
 * @date 2022/2/19 21:01
 */
public class UDPTest {

    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String str = "wssb";
        byte[] bytes = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,inet,8800);

        socket.send(datagramPacket);

        socket.close();
    }


    @Test
    public void receiver() throws IOException {

        DatagramSocket socket = new DatagramSocket(8800);

        byte[] b = new byte[100];
        DatagramPacket packet = new DatagramPacket(b,0,b.length);

        socket.receive(packet);

        System.out.println(new String(packet.getData(),0, packet.getLength()));

        socket.close();
    }
}
