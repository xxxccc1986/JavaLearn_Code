package top.year21.java;

public class ValueTransferTest {
    public static void main(String[] args) {
        //交换两个变量的值的操作
        int i = 10 ;
        int j = 20;
        ValueTransferTest test = new ValueTransferTest();
        test.swap(i,j);//这里的i，j和上面的实参是同一组，也就是10，20。

        System.out.println("i = " + i + "，j = " + j);

    }

    public  void swap(int i,int j){//此时的i，j是新的变量，是形参
        int temp = i;
        i = j;
        j= temp;

    }
}
