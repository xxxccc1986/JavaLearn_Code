package top.year21.java;

public class ArrayTest {
    public  static void main(String[] args){
        //练习2
        int sum = 0;//记录数组的和
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        for (int i =0;i < arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("该二维数组的总和为：" + sum);

//       练习3
//       int [] x,y[] 实际上等于 int [] x, int [][] ；

        //杨辉三角练习
        //1.声明并初始化二维数组
        int [][] yangHui = new int[10][];
        //2.给数组的元素赋值
        for(int i = 0;i< yangHui.length;i++){
            yangHui[i] = new int[i +1];
        //2.1给首末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
        //2.2给每行的非首末元素赋值
//        if(i>1) {
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
//        }
        }
        //3.遍历二维数组
        for (int i =0;i< yangHui.length;i++){
            for (int j = 0;j< yangHui[i].length;j++){
                System.out.print(yangHui[i][j] + "  ");
            }
            System.out.println();
        }









    }
}
