package top.year21.Exer4;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/2 18:08
 */
public class Circle{
    //属性
    private int radius;
    //构造器
    public Circle() {
    }
    public Circle(int radius) {
        this.radius = radius;
    }

    //方法
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

interface CompareObject {
    public int compareTo(Object o);
}
