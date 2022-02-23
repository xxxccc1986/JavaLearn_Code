package Optional;

import java.util.Optional;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 21:32
 */
public class Test {

    @org.junit.Test
    public void test1(){
        Girl girl = new Girl();
//        girl = null;
        //of(T t):保证t是非空的
        Optional<Girl> optionalGirl = Optional.of(girl);

    }

    public String getGirlName(Boy boy){
        return boy.getGirl().getName();
    }

    @org.junit.Test
    public void test3(){
        Boy boy = new Boy();
//        boy = null;
        String girlName = getGirlName(boy);
        System.out.println(girlName);

    }

}
