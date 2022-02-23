package top.year21.java;

public class Exer1Test {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
        System.out.println("now radius is " + c.radius);

    }
}

class Circle{
    //属性
    double radius;

    //方法
    public double findArea(){
        double area = Math.PI * radius *radius;
        return area;
    }
}

class PassObject{
     public  void printAreas(Circle c,int time){
         System.out.println("Radius\t\tArea");
         for (int i =1;i<=time;i++){
             c.radius = i;
             double area = c.findArea();
             System.out.println(c.radius + "\t\t" + area);
//                 System.out.println(c.radius + "\t\t" + c.findArea());
             }
            c.radius = time +1;
         }
     }







