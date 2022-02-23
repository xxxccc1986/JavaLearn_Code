package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/27 19:16
 */
public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double findArea(){
        return  Math.PI * radius * radius;
    }
}
