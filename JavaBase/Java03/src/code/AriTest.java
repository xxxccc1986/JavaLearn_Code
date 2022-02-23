package code;

public class AriTest {

        public static void main(String[] args) {
            //取模运算示例
            int num1 = 12;
            int num2 = 5;
            int result = num1 / num2;
            System.out.println(result);//2
            int result1 = num1 / num2 * num2;
            System.out.println(result1);//10
            int result2 = num1 % num2;
            System.out.println(result2);


            /*
            (前）++ ：先自增1，后运算。
            (后）++ ：先运算，后自增1。
                    下列示例


             */
            int a1 = 10;
            int b1 = ++a1;
            System.out.println("a1=" + a1 + ",b1 = " + b1 );
            int a2 = 10;
            int b2 = a2++;
            System.out.println("a2=" + a2 + ",b2=" + b2 );
            //补充  让s1+1变成11
            short s1 = 10;
            ++s1;
            //short s2=(short)++s1;
            System.out.println(s1);

            int ii1 = 10;
            ii1 +=2;//ii1=ii1+2
            System.out.println(ii1);
            int ii2 = 12;
            ii2 %= 5;//ii2=ii2 % 5
            System.out.println(ii2);

            short ss1 = 10;
            //ss1=ss1+2;编译失败
            ss1 +=2;//不会改变本身的数据类型
            System.out.println(ss1);

            /*开发中。如果希望变量实现+1的操作，有以下几种方法。int  num = 10；
                第一种 num + 1;
                第二种 num +=1；
                第三种 num++ ；

            */
            //练习一
            int m = 2;
            int n = 3 ;
             n *= m++ ; // n=n*m++     //n = n * 2
             System.out.println("m:" + m + "\t"+"n:" + n );

            //练习2
            int n1 =10;
            n1 +=(n1++) + (++n1);//n = n1 +(n1++ ) + (++n1); 10+10+12=32
            System.out.println(n1);



            //- 比较运算符的结果都属于boolean布尔型的数据类型
            //- 区分== 和 =
            int z1 = 10;
            int x1 = 20;
            System.out.println(z1 == x1);//false ==是代表着等于
            System.out.println(z1 = x1);//此操作是将j的值赋予i，再将i输出

            /*
            思考题：
            原因：因为b4定义为假，但下方是两个==示意b4为真
            与定义的不同，导致输出结果为假
             */
            boolean c4 = false;
            if (c4 == true) {
                System.out.println("结果为真");
            }else{
                System.out.println("结果为假");
            }


        }
}
