package OtherStream;

import java.util.Scanner;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/18 19:44
 */
public class StreamTest {
    public static void main(String[] args) {
        while (true){
            System.out.print("请输入一个单词：");
            Scanner scan = new Scanner(System.in);
            String in = scan.next();

            String da = in.toUpperCase();
            System.out.println(da);

            if (da.equals("E") || da.equals("EXIT")){
                System.out.println("程序结束");
                break;
            }
        }

    }
}
