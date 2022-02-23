package PolymorphismExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/28 22:40
 */
public class MyRectangle extends GeometricObject {
    //属性
    private double width;
    private double height;

    //构造器
    public MyRectangle(double width,double height,String color,double weight){
        super(color,weight);
        this.width = width;
        this.height = height;
    }

    //方法
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width * height;
    }
}
