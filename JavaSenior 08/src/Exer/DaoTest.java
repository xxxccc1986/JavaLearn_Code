package Exer;

import org.junit.Test;


/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/18 0:03
 */
public class DaoTest {
    @Test
    public void test(){
        User user = new User(1001,20,"张三");
        User user1 = new User(1002,50,"李四");
        User user2 = new User(1003,40,"王五");
        DAO<User> dao = new DAO<>();
        dao.save("1001",user);
        dao.save("1002",user1);
        dao.save("1003",user2);

        dao.update("1002",new User(1002,60,"无穷"));
        dao.delete("1001");
        System.out.println(dao.get("1003"));
//        System.out.println(dao.list());



    }
}
