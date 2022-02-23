package Scoket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 客户端发送文件给服务端，服务端将文件保存在本地。
 * @date 2022/2/19 17:51
 */
public class TcpTest2 {

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

        fileIn.close();
        output.close();

    }



    @Test
    public void server() throws IOException {
        ServerSocket socket = new ServerSocket(8890);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();

        FileOutputStream output = new FileOutputStream("2.jpg");
        byte[] b = new byte[1024];
        int len;
        while ((len = inputStream.read(b)) != -1){
            output.write(b,0,len);
        }



        output.close();
        inputStream.close();
        accept.close();
        socket.close();
    }

}
