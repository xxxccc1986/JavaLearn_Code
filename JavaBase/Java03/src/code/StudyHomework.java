package code;

public class StudyHomework {
    public static void main(String[] args){
        //两个变量交换的练习
       String place1 = "广东", place2 = "江苏",tempPlace = "中转";//定义一个临时变量
            //利用临时变量交换赋值
            tempPlace = place1;
            place1 = place2;
            place2 = tempPlace;
            //输出最终交换的结果
            System.out.println("起点:" + place1);
            System.out.println("终点:" + place2 );

        //利用三元运算符或者if-else将三者最大值输出
        int num1 = 2, num2 = 4, num3 = 6;
        int max = (num1 > num2)? num1 : num2;
        int max1 = (num2 > num3)? num2 : num3;
            System.out.println(max1 );



        int i1 = 2, i2 = 4, i3=6;
        if (i1 > i2 && i1 >i3) {
            System.out.println("三个数字当中最大值:" + i1);
        }else if (i2 >i1 && i2 >  i3) {
            System.out.println("三个数字当中最大值:" + i2);
        }else if (i3 >i1 && i3>  i2) {
            System.out.println("三个数字当中最大值:" + i3);
        }
        else {
            System.out.println("没有合适的答案" );
        }


        //通过if-else二选一输出定义的double变量的数据
        double d1 = 10.1 , d2 = 15.4;
        if (d1 > 10 && d2 < 20) {
            System.out.println(d1 + d2);
        }else {
            System.out.println(d1 * d2 );
        }






    }
}
