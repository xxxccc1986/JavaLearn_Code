package top.year21.java;

public class BreakContinueTest {
    public static void main(String[] args){
/*
        for(int i = 1;i <=10;i++) {
            if (i % 4 == 0) {
                //break;//123
                continue;//123567910
            }
            System.out.println(i);
        }
*/

        labe1:for (int i =1;i <4;i++){
            for (int j =1;j <= 10;j++){
                if (j % 4 ==0){
                    //break;//默认跳出包裹此关键字最近一层的循环
                    //continue;//默认跳出包裹此关键字最近一层的一次循环

                    //break labe1;//结束指定标识的一层循环结构
                    continue labe1;//结束指定标识的一层循环结构的当次循环
                }
            }
        }




    }
}
