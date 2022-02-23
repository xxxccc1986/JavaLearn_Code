package getClassFieldsMethod;

import java.io.Serializable;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/20 17:47
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

}
