package top.year21.java;

public class HideTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "小黄";
//        a.age = 4;
//        a.legs = 4;
        a.getInfo();

        a.setLegs(4);
        a.getInfo();

    }
}
class Animal{

    String name;
    private int age;
    private int legs;//对legs属性的私有化

    //对legs属性的设置
    public void setLegs(int l){
        if (l >=0 && l % 2 ==0){
            legs =  l;
        }else {
            legs =  0;
            //抛出一个异常
        }
    }
    //对legs属性的读取
    public int getLegs(){
        return legs;
    }

    //对age属性的设置
    public void setAge(int a){
        if (a >0 ){
            age =a;
        }else {
            age = 0;
        }
    }

    //对age属性的读取
    public int getAge(){
        return age;
    }

    public void  getInfo(){
        System.out.println("name：" + name + ",age:" + age + ",legs:" + legs);
    }
}

