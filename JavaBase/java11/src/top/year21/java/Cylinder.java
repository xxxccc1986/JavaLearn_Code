package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/27 19:20
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder(){
        length = 1.0;
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }

    public double findVolume(){
        return  Math.PI * length * getRadius() * getRadius();
        //return findArea() * length;
    }

}
