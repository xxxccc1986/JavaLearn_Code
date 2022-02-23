package PolymorphismExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 22:40
 */
public class GeometricObject {
    //属性
    protected String color;
    protected double weight;

    //构造器
    public GeometricObject(){

    }
    public GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    //方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
