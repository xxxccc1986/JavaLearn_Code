package java.fuzhi.java;

public class StudentTest {
    public static void main(String[] args){
        //定义一个对象数组
        Student[]  arr = new Student[20];
        //给数组的元素赋值
        for (int i=0;i< arr.length;i++){
             arr[i]=new Student();//没遍历一个数就创建了一个类的新的对象
        //给数组的元素属性赋值；
            arr[i].number = i+1;
            arr[i].state = (int)(Math.random() * (6-1+1)+1);
            arr[i].score = (int)(Math.random() * (100-0+1));
        }
        //遍历数组赋值后的结果 arr[i] 输出的是地址值
        for (int i = 0 ;i< arr.length;i++){
            System.out.println(arr[i] );
        }
        // 通过调用student类中的method方法输出年纪为3的学生信息
        for (int i =0;i< arr.length;i++){
            if (arr[i].state == 3){
                System.out.println(arr[i].method());
            }
        }

        System.out.println("********************************");
        //利用冒泡排序根据学生的成绩自低往高排序
        for (int i =0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j].score >arr[j+1].score){
                    //通过创建student类的一个新的临时对象temp接受arr[j] 的值
                    Student temp = arr[j];//等价于Student temp；temp=arr[j]
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //通过调用student类中的method方法输出经成绩高低排序后的数组信息
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i].method());
        }

    }
}



class Student{
    //属性
    int number;
    int state;
    int score;

    //方法
    public String method(){
        String info = "学号为" + number + "是" + state + "年级的学生，" +  "成绩是" + score;
        return info;
    }
}