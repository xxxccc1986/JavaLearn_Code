package Scoket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 20:17
 */
public class TcpTest3 {

    @Test
    public void client() throws IOException {
        InetAddress i = InetAddress.getByName("192.168.0.101");
        Socket socket = new Socket(i,8890);
        OutputStream output = socket.getOutputStream();

        FileInputStream fileIn = new FileInputStream("1.jpg");

        byte[] b = new byte[1024];
        int len;
        while ((len = fileIn.read(b)) != -1 ){
            output.write(b,0,len);
        }

        //关闭数据的输出  解决线程阻塞问题
        socket.shutdownOutput();

       // 5.接收来自于服务器端的数据，并显示到控制台上
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream bt = new ByteArrayOutputStream();
        byte[] b1 = new byte[20];
        int len1;
        while ((len1 = inputStream.read(b1)) != -1){
           bt.write(b1,0,len1);

        }

        System.out.println(bt.toString());



        fileIn.close();
        output.close();

    }



    @Test
    public void server() throws IOException {
        ServerSocket socket = new ServerSocket(8890);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();

        FileOutputStream output = new FileOutputStream("3.jpg");
        byte[] b = new byte[1024];
        int len;
        while ((len = inputStream.read(b)) != -1){
            output.write(b,0,len);
        }

        //6.服务器端给予客户端反馈
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("发送成功".getBytes());


        output.close();
        inputStream.close();
        accept.close();
        socket.close();
    }
}
