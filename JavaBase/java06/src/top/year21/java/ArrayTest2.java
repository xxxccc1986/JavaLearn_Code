package top.year21.java;

public class ArrayTest2 {
            public static void main(String[] args) {
                //①二维数组的声明和初始化
                int[] arr = new int[]{1,2,3};//一维数组
                //二维数组静态初始化
                int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
                //二维数组动态初始化1
                String[][] arr2 = new String[3][2];
                //二维数组动态初始化2
                String[][] arr3 = new String[3][];
                //不算标准的写法
                int [][]  arr5 = {{1,2,3},{4,5},{6,7,8}};
                int [] arr4 [] = new int[][] {{1,2,3},{4,5},{6,7,8}};

                //②如何调用数组的指定位置的元素：
                System.out.println(arr1[0][1]);//2
                System.out.println(arr2[1][1]);//nu11

                arr3[1] = new String[4];
                System.out.println(arr3[1][0]);

                //③获取数组的长度
                System.out.println(arr4.length);//3
                System.out.println(arr4[0].length);//3
                System.out.println(arr4[1].length);//2

                //④如何遍历二维数组
                for(int i = 0 ;i < arr4.length;i++) {

                    for (int j = 0; j<arr4[i].length;j++){
                        System.out.print(arr4[i][j] + "  ");
                    }
                        System.out.println();
                }

                //⑤数组元素的默认初始化值
                int arr6 [][] = new int[4][3];
                System.out.println(arr6 [0]);//地址值
                System.out.println(arr6 [0][0]);//0

                //特殊情况
                double [][] arr7 = new double[4][];
                System.out.println(arr7 [1]);//null
                System.out.println(arr7 [1][0]);//空指针，报错



    }
}
