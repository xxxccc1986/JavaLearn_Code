package Scoket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 客户端发送内容给服务端，服务端将内容打印到控制台上。
 * @date 2022/2/19 17:16
 */
public class TcpTest {

    //客户端
    @Test
    public void client()  {
        Socket socket = null;
        OutputStream out = null;
        try {
            //1.创建Socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("192.168.0.101");
            socket = new Socket(inet,8899);
            //2.获取一个输出流，用于输出数据
            out = socket.getOutputStream();
            //3.写出数据的操作
            out.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源的关闭
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //服务端
    @Test
    public void server(){
        ServerSocket ses = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream ba = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ses = new ServerSocket(8899);

            //2.调用accept()表示接收来自于客户端的socket
            accept = ses.accept();

            //3.获取输入流
            inputStream = accept.getInputStream();

            //有可能出现乱码
//        byte[] b = new byte[20];
//        int len;
//        while ((len = inputStream.read(b)) != -1 ){
//            String str = new String(b, 0, len);
//            System.out.println(str);
//        }

            //4.读取输入流中的数据
            ba = new ByteArrayOutputStream();
            byte[] b = new byte[10];
            int len;
            while ((len = inputStream.read(b)) != -1 ){
                ba.write(b,0,len);
            }
            System.out.println(ba.toString());
            System.out.println("收到来自于：" + accept.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            if (ba != null) {
                try {
                    ba.close();
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
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ses != null) {
                try {
                    ses.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
