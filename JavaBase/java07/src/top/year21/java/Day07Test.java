package top.year21.java;

public class Day07Test {
    public static void main(String[] args) {
        //数组的冒泡排序
        int[] arr =new int[]{34,5,22,-98,6,-76,0,-3};
        for (int i=0;i< arr.length-1;i++){
            for (int j = 0;j< arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //数组的反转
        for (int i =0 ;i< arr.length /2 ;i++){
            int temp =arr[i];
            arr[i] =arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp;
        }

        for (int i= 0;i< arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //数组的复制
        System.out.println("*********************");

        int[] arr1 = new int[arr.length];
        for (int i =0;i< arr1.length;i++){
            arr1[i]=arr[i];
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

        //数组的元素线性查找
        int number = 22;
        boolean isFlag = true;
        for (int i=0;i < arr1.length; i++){
            if (number == arr1[i]){
                System.out.println("已找到，该数的位置在" + i);
                isFlag =false;
                break;
            }
        }
            if (isFlag){
                System.out.println("很遗憾，没有找到");
            }
         //数组的常见异常；1.元素角标越界 2.空指针异常

    }
}
