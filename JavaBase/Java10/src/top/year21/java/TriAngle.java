package top.year21.java;

import java.util.Base64;

public class TriAngle {
    //属性
    private double base;
    private double height;

    //构造器
    public  TriAngle(){

    }

    public TriAngle(double b,double h){
        base = b;
        height = h;
    }

    //分别设置私有变量base、height的值
    public void setBase(double b){
        base = b;
    }
    public void setHeight(double h){
        height = h;
    }

    //分别获取私有变量base、height的值
    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double sanArea(){
        return (base*height) / 2 ;
    }
}
