package top.year21.java;

public class Exer3Test {
    public static void main(String[] args) {
        Exer3 e1 = new Exer3();
        System.out.println( e1.method());
        int area = e1.method1(5,6);
        System.out.println(area);
    }
}

class Exer3{
    //属性 ；略
    //方法
    public int method(){
        for(int i = 1;i<=10;i++){
            for (int j = 1;j<=8;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }


    public int method1(int m,int n){
        for(int i = 1;i<=m;i++){
            for (int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }


}
