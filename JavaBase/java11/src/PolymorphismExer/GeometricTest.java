package PolymorphismExer;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 22:41
 */
public class GeometricTest {
//    public static void main(String[] args) {
//        GeometricTest test  = new GeometricTest();
//        System.out.println(test.getClass().getSuperclass());
//    }
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        //本处采用了匿名对象的方法比较冗余，可以采用Circle或者MyRectangle各自new两个对象进行比较
        test.equalsArea(new Circle(1.2, "黑", 20.0)
                , new Circle(1.5,"黑", 20.0));
        test.equalsArea(new MyRectangle(2, 5, "黑", 20.0)
                , new MyRectangle(1.5, 5, "黑", 20.0));
        test.displayGeometricObject(new Circle(1.2, "黑", 20.0)
                , new Circle(1.5,"黑", 20.0));
        test.displayGeometricObject(new MyRectangle(2, 5, "黑", 20.0)
                , new MyRectangle(1.5, 5, "黑", 20.0));
    }



             //判断两个面积是否相等
             //方式一 更符合答案 题目要求的是判断
//            public boolean equalsArea(GeometricObject obj,GeometricObject obj1) {
//                return obj.findArea() == obj1.findArea();
//            }
            //方式二
             //多态的形式，采用虚拟方法调用，根据父类引用的子类对象动态调用属于该子类的方法（重写）
            public void equalsArea(GeometricObject obj, GeometricObject obj1) {
                double area = obj.findArea();
                double area2 = obj1.findArea();
                if (area == area2) {
                    System.out.println("两个几何图形的面积相等");
                } else {
                    System.out.println("两个几何图形的面积不相等");
                }

                    }
                //显示图形的面积
                //方式一 更符合答案
        //                public void displayGeometricObject(GeometricObject obj){
        //                    System.out.println(obj.findArea());
        //                }
                //方式二
                public void displayGeometricObject(GeometricObject obj, GeometricObject obj1){
                    System.out.println(obj.findArea());
                    System.out.println(obj1.findArea());
                }
    }


