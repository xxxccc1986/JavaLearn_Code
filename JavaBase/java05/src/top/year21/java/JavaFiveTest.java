package top.year21.java;

public class JavaFiveTest {
    public static void main(String[] args) {
        for(int i = 1;i <= 1000;i++){
                int factor  = 0;
            for (int j =1;j <i;j++){
                if (i % j ==0){
                    factor += j;
                }
            }
            if (i == factor){
                System.out.println(i);
                //重置factor
                // factor = 0；
            }
             }

    }
}
