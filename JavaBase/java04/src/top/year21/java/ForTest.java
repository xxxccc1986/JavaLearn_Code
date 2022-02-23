package top.year21.java;

public class ForTest {
    public static void main(String[] args) {
        //for (int i1 = 1; i1 <= 5; i1++) {
        /* System.out.println("Hello World！");
            }
         */
            //示例
            int num = 1;
            for (System.out.print('a'); num <= 3; System.out.print('c'), num++) {
                System.out.print('b');
                //输出结果：abcbcbc
            }

            //练习 1 遍历100以内的偶数
            int sum = 0;//记录所有偶数的和，输出偶数的个数。
            int count = 0;//记录偶数的个数
            for (int i = 2;i < 100 ;i++){
            if (i % 2 ==0){
                    System.out.println(i);
                    sum +=1;
                    count++;
                }
            }
                    System.out.println("总和为：" + sum);
                    System.out.println("偶数的个数为：" + count);

            //  练习
            for(int i1 = 1; i1 <= 150;i1++) {
                System.out.print(i1 + "  ");
                if (i1 % 3 == 0) {
                    System.out.print("foo ");
                }
                if (i1 % 5 == 0) {
                    System.out.print("biz ");
                }
                if (i1 % 7 == 0){
                    System.out.print("baz ");
            }
                //换行
                System.out.println();
            }
            //更简短一点的方式；
            for(int i1 = 1; i1 <= 150;i1++) {
                System.out.print(i1 + "  ");
                if (i1 % 3 == 0 ||i1 % 5 == 0 || i1 % 7 == 0) {
                    System.out.print("foo ");
                    System.out.print("biz ");
                    System.out.print("baz ");
                }
                //换行
                System.out.println();
            }
            int jiSum =0 ;
            for(int num1 = 1; num1 <= 100; num1++){
                System.out.println(num1);
            if (num1 %  2 == 1 ) {
                System.out.println(num1);
                jiSum += num1;
            }
            }
                System.out.println("奇数的和为："+ jiSum);




        }
    }
