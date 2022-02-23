package ObjectStream;

import org.junit.Test;

import java.io.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 14:05
 */
public class InPut_outPutStreamTest {

    @Test
    public void test() {

        //序列化的过程
        ObjectOutputStream obj = null;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("day.dat"));

            obj.writeObject(new String("keep~"));
            obj.flush();//刷新操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test1(){
        ObjectInputStream ob = null;
        try {
            //反序列化的过程
            ob = new ObjectInputStream(new FileInputStream("day.dat"));
            Object dx = ob.readObject();
            String str = (String) dx;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ob != null) {
                try {
                    ob.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
