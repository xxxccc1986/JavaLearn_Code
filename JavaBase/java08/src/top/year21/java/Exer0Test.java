package top.year21.java;

public class Exer0Test {
    public static void main(String[] args) {
        Student num1 = new Student();
        String info = num1.say();
        System.out.println(info);
        Teacher t1 = new Teacher();
        t1.say();


    }
    }




class Student{
            //属性
            String name;
            int age;
            String major;
            String interests;

            //方法
           public String say(){
               String info = "学生的名字是： " + name +"\t" + "年龄是： " + age
                       +"\t" + "专业是： " + major +"\t" + "兴趣是： " + interests;
               return info;
           }

}

class Teacher{
            //属性
            String name;
            int age;
            int teachAge;
            String course;

            //方法
            public void say(){
                System.out.println("教师的名字是： " + name +"\t" + "年龄是： " + age
                        +"\t" + "教龄是： " + teachAge +"\t" + "科目是： " + course);
            }


}



