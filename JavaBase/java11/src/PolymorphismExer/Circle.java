package PolymorphismExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 22:40
 */
public class Circle extends GeometricObject {
    //属性
    private double radius;

    //构造器
    public Circle(double radius,String color,double weight){
        //通过super关键字调用指定的父类构造器初始化传入的形参值
        super(color, weight);
        this.radius = radius;

    }

    //方法
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
