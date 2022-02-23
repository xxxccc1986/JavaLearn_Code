package top.year21.java;

public class ExerTest {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.mOl(2);
        t1.mOl(2,1);
        t1.mOl("Hello");
        Test1 t2 = new Test1();
        int max=t2.max(3,4);
        System.out.println("最大值是：" + max);
        double max1 = t2.max(5.5,6.6);
        System.out.println("最大值是：" + max1);
        t2.max(1.2,5.4,6.3);
    }
}


class Test {
    public void  mOl(int i){

        System.out.println(i*i);
    }

    public void mOl(int i,int j){
        System.out.println(i*j);
    }

    public void mOl(String s1){
        System.out.println(s1);
    }

}


class Test1{
    //也可以用三元运算符来写
//    int max = (i>j)?i:j;
    public int max(int i,int j){
        int max = i;
        if (i>j){
            max = i;
        }else if (i < j){
            max = j;
        }
        return max;
    }

    public double max(double d1,double d2){
        double max = d1;
        if (d1>d2){
            max = d1;
        }else if (d1 < d2){
            max = d2;
        }
        return max;
    }

    public void max(double d1,double d2,double d3){
        if (d1>d2 & d1 > d3){
            System.out.println("最大值是" + d1);
        }else if(d2>d1 & d2 > d3){
            System.out.println("最大值是" + d2);
        }else if (d3>d1 & d3 > d2){
            System.out.println("最大值是" + d3);
        }
    }

}