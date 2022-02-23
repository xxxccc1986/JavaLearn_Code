package top.year21.java;

public class ArrayExer3 {
    public static void main(String[] args){

        //方式一：
        int[] arr = new int[6];
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 30) + 1;

            while(true){
                for(int j = 0; j < i; j++){
                    if(arr[i] == arr[j]){
                        flag = true;
                        break;
                    }
                }
                if(flag == true){
                    arr[i] = (int)(Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}


