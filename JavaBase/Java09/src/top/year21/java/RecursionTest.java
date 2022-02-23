package top.year21.java;

public class RecursionTest {
            //练习1 计算1-n之间的自然数
            public int getSum(int i){
                if ( i == 1){
                    return i;
                }else {
                    return i + getSum(i-1);
                }
            }
            //练习3 f（0）=1，f（1）=4，f（n+2）=2*f（n+1）+f（n）
            public int f(int n) {
                if (n == 0) {
                    return 1;
                } else if (n == 1) {
                    return 4;
                } else {
                    return 2 * f(n - 1) + f(n - 2);//有点类似斐波那契数列  哈诺塔问题
                }
            }


}
