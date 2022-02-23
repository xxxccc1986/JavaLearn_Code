package top.year21.java;
//计算原的面积
public class Exer2Test {
    public static void main(String[] args) {
        Circle area = new Circle();
        area.r = 5;
        double theArea = area.circularArea();
        System.out.println("该圆的面积为：" + theArea);
        area.circularArea1();
    }
}



class Circle{
    //属性
    double r;

    //方法
    //方式一
    public double circularArea(){
        double  area = Math.PI * r * r;
        return  area;
    }
    //方式二
    public void circularArea1(){
        double area1= Math.PI * r * r;
        System.out.println("该圆的面积为：" + area1);
    }
}