package top.year21.Exer4;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/2 18:31
 */
public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle() {
    }

    public ComparableCircle(int radius) {
        super(radius);
    }

    //方法的实现
    //方式一
    public int compareTo(Object o) {
        if (this == o) {
            return 0 ;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            if (this.getRadius() > c.getRadius()){
                return 1;
            }else if (this.getRadius() < c.getRadius()){
                return  -1;
            }else {
                return 0;
            }
        }
//            return 0;
        throw new RuntimeException("传入的数据不匹配");

        //方式二：

    }




}