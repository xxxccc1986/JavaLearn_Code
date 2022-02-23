package ObjectStream;

import org.junit.Test;

import java.io.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 14:27
 */
public class CustomerTest {
    public static void main(String[] args) {

        //序列化的过程
        ObjectOutputStream obj = null;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("Customer.dat"));

            obj.writeObject(new Customer("李响",20));
            obj.flush();
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
    public void test(){

                ObjectInputStream ob = null;
        try {
            //反序列化的过程
            ob = new ObjectInputStream(new FileInputStream("C:\\Users\\hcxs1986\\IdeaProjects\\JavaLearn\\Customer.dat"));

            Customer cus = (Customer) ob.readObject();
            System.out.println(cus);
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
