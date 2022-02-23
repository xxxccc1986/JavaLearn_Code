package top.year21.java;

public class ArrayTest2 {
        public static void main(String[] args) {
            //定义两个数组
            int[] array1 ,array2;
            //显示数组array1的内容
            array1 = new int[]{2,3,5,7,11,13,17,19};
            for (int i = 0;i< array1.length;i++){
                System.out.print(array1[i] + "\t");
            }
            System.out.println();

            //赋值array2变量等于array1 ；不能称作数组的复制，只是array2复制了array1的地址值。
            array2 = array1;
            //修改array2的偶索引元素，使其索引值等于（如array[0]=0，array[2]=2，
            for (int i =0;i<array2.length;i++){
                if (i % 2 == 0 ){
                    array2[i] = i;
                }
            }
            System.out.println();

            //打印出数组array1；
            for (int i = 0;i< array1.length;i++) {
                System.out.print(array1[i] + "\t");
            }



            //补充 真正意义上array2对array1数组的复制
            array2 = new int[array1.length];
            for (int i =0; i< array2.length;i++){
                array2[i]=array1[i];
            }
    }
}
