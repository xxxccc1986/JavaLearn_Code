package ObjectExer2;

import ObejctExer.MyDate;
import PolymorphismExer.GeometricTest;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/29 19:51
 */
public class Circle  extends GeometricObject {
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle circle = (Circle)obj;
            return this.radius == circle.radius;
        }else {
            return false;
        }
    }

    public String toString(){
        return "圆的半径为：" + radius;

    }
}
