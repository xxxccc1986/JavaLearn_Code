package TeamMangerProject.service;

import org.junit.Test;
import TeamMangerProject.domain.Employee;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 16:33
 */
public class test {
    @Test
    public void getTest(){
        NameListService test = new NameListService();
        Employee[] e = test.getAllEmployees();
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
