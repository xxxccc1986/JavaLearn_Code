package top.year21.java;

public class LoopTest {
    public static void main(String[] args) {
        for(int i =1; i <= 5;i++){
            for (int j= 1; j <=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("*******************");
        for(int i=1 ; i <=4;i++){
            for (int j = 1;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //9*9乘法的输出
        for (int i =1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i + "*"+ j + "="+ (i*j) );
                System.out.print('\t');
            }
            System.out.println();
        }


        //100以内质数的输出
        boolean isFlag = true; //标识i是否被j除尽，修改其值
        int count = 0;//记录质数的个数
        //获取当前时间距离1970-01-01的毫秒数
        long start =System.currentTimeMillis();
        for(int i = 2;i <=100;i++){//遍历100以内的自然数
            for (int j = 2;j<i;j++){//j：被i去除
                //for (int j = 2;j<=Math.sqrt(i);j++){
                if (i % j ==0) {//i被j除尽
                    isFlag=false;
                    break;//优化一：只对本身非质数的自然数有效
                }

                }
                if(isFlag ==true){
                    //count++
                System.out.println(i);

            }
                isFlag =true;
        }
        //获取当前时间距离1970 01-01的毫秒查
        long end =System.currentTimeMillis();

        System.out.println("质数的个数为："+count);
        System.out.println("所花费的时间为："+ (end - start));

   }
}
