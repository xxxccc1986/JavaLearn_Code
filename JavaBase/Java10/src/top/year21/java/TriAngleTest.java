package top.year21.java;

public class TriAngleTest {
    public static void main(String[] args) {
            TriAngle t1 = new TriAngle(6.5,3.2);
            System.out.println("三角形的面积为：" + t1.sanArea());
            System.out.println("底边长：" + t1.getBase());
            System.out.println("高：" + t1.getHeight());
    }
}
