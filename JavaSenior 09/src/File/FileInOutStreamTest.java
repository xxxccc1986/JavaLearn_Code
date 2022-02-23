package File;

import org.junit.Test;

import java.io.File;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: File类的说明
 * @date 2022/2/17 20:51
 */
public class FileInOutStreamTest {
    @Test
    public void test() {
        File file = new File("Hello.txt");
        File file1 = new File("C:\\Users\\hcxs1986\\IdeaProjects\\JavaLearn\\JavaSenior 09");

        System.out.println(file);
        System.out.println(file1);

        //构造器2：
        File file3 = new File("C:\\Users\\hcxs1986\\IdeaProjects\\JavaLearn","JavaSenior 09");
        System.out.println(file3);

        //构造器3：
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);

    }
}
