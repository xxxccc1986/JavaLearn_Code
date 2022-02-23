package top.year21.java;
//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象
        Person p1 = new Person();
        //调用对象的结构：属性、方法
        //调用属性：”对象.属性“
        p1.name = "zhang";
        p1.age = 1;
        p1.isMale = true;
        System.out.println(p1.name);

        // 调用对象的方法：”对象.方法“
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        //******************
        Person p2 = new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false
        //p3=p1，实际上将p1保存的对象地址值赋给了p3，导致p1和p3都指向了堆空间的同一个对象实体。
        Person p3 = p1;
        System.out.println(p3.name);//zhang
        p3.age = 10;
        System.out.println(p3.age);//10
    }
}

class  Person{
            //属性
            String name;
            int age;
            boolean isMale;
            //方法
            public void eat() {
                System.out.println("人可以吃");
            }
            public void sleep(){
                System.out.println("人可以睡");
            }
            public void talk(String language){
                System.out.println("人可以说话，使用的语言是：" + language);
            }

}

        class User{
            private String name;
            public  int age;
            protected boolean isMale;
            //下面是缺省的方式，也就是默认的声明方式
            int year;


                public void talk(String language) {//language:形参，也是局部变量
                    System.out.println("使用的语言是：" + language + "进行交流");
                }

                public void eat(){
                    String food = "面";//局部变量
                    System.out.println("北方以" + food + "为主");
                }






}