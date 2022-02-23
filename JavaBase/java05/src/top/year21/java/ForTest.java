package top.year21.java;

import java.util.Scanner;
public class ForTest {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入第一个正整数：");
                int n1 = scan.nextInt();
            System.out.println("请输入第二个正整数：");
                int n2 = scan.nextInt();
            //获取两个树中的最小值
            int min =(n1 <= n2 )? n1 :n2;
            //遍历
            for(int i = min; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0) {
                System.out.println("最小公约数为：" + i);
                break;//一旦循环中执行到break就跳出循环
            }
            }
            int max = (n1 >= n2)? n1:n2;
            for (int i = max;i<n1 * n2 ;i++){
            if (i % n1 ==0 && i % n2 ==0 ){
                System.out.println("最大公倍数为：" + i);
                break;
            }
            }
            int jiHe =0;
            for(int i1 =1; i1 <= 100;i1++){
            if (i1 % 2 ==1){
                System.out.println(i1);
                jiHe += i1;
            }
            }
                System.out.println("所有奇数的和为:" + jiHe);

            int info = 0;
            int count = 0;
            for (int i = 1 ; i <=100;i++){
            if (i % 7 ==0){
                System.out.println(i);
                info += i;//info = info + i;
                count++;
            }
            }
                System.out.println("所有7的倍数的个数为:" + count);
                System.out.println("所有7的倍数的和为:" + info);


            for(int i =100;i <=1000;i++) {
                int bai = i /100 ;
                int shi = i /10 % 10;
                int ge = i % 10 ;
            if(bai*bai*bai+shi*shi*shi+ge*ge*ge ==i){
                System.out.println("水仙花数分别是:" + i);

            }

            }




            }

}
