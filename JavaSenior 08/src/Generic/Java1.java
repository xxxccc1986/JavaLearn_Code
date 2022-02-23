package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/16 22:08
 */
public class Java1 extends Java<Integer> {//Java1<T>不再是个泛型类

    //泛型方法
    public static <E> List<E> get(E[] arr){
        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;
    }
}
