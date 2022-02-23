package top.year21.java;

public class LoopTest11 {
    public static void main(String [] args){
                    //遍历100以内的偶数，并计算所有偶数的个数以及偶数的和
                    //do-while方式
                    int i = 1;
                    int sum = 0;
                    int count = 0;
                    do {
                        if (i % 2 ==0){
                            System.out.println(i);
                            sum += i;
                            count++;
                        }
                            i++;
                    }while(i <= 100);

                    System.out.println("100以内偶数的个数为：" + count);
                    System.out.println("100以内偶数的和为：" + sum);


                    //for循环方式
                          int sum1 = 0;
                            int count1 = 0;
                            for (int i1 = 1;i1<=100;i1++){
                            if (i1 % 2 ==0){
                                System.out.println(i1);
                                sum1 += i1;
                                count1++;
                        }
                    }
                    System.out.println("100以内偶数的个数为：" + count);
                    System.out.println("100以内偶数的和为：" + sum);



                    //while循环方式
                    int i1 = 0;
                    int count2= 0;
                    int sum2 = 0;
                    while(i1 < 100){
                        i1++;
                        if(i%2 ==0){
                            System.out.println(i1);
                            sum2 +=i1;
                            count2++;
                        }
                    }
                    System.out.println("100以内偶数的个数为：" + count);
                    System.out.println("100以内偶数的和为：" + sum);


    }
}
