package code;
/*
三元运算符：
 */
public class SanYuanTest {
    public static void main(String[] args){
        //获取两个整数的较大值
      int num1 = 10,num2 = 12;
        int max = (num1 > num2)?num1 : num2 ;
        System.out.println(max);


        int i1 = 25 , i2= 20;
       String strMin = (i1<i2)? "是的，i1比i2 大" : "i1 比 i2 大 5" ;
       System.out.println(strMin);


    }
}
