package top.year21.java;

public class DoWhileTest {
    public static void main(String[] args){
        //遍历100以内的偶数，并计算所有偶数的个数以及偶数的和
        int n1 = 1;//①
        int sum = 0;
        int count = 0 ;
        do{

            if(n1 % 2 ==0){
                System.out.println(n1);//③
                sum += n1;//sum = sum +n1；
                count++;
            }

            n1++;//④

        }while(n1 <= 100);//②

        System.out.println("总和为;" + sum);
        System.out.println("个数为;" + count);

        //***********do-while和while的区别************
        int number = 10;
        while(number >10 ){
            System.out.println(("Hello：while"));
            number--;
        }

        int number1 = 10;
        do{
            System.out.println(("Hello：do-while"));
            number1--;

        }while(number1 >10);
        System.out.println((number1));


    }
}
