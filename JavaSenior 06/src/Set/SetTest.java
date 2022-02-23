package Set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/15 15:57
 */
public class SetTest {
    @Test
    public void Test(){
        Set s = new HashSet();
        s.add(456);
        s.add("CC");
        s.add(789);
        s.add("aa");


        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
