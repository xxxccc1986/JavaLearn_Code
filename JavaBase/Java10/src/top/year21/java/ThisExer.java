package top.year21.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ThisExer {
    public static void main(String[] args) {
            Boy boy = new Boy();
    }
}

class Boy{
    //属性
    private  String name;
    private  int age;

    //方法
    public void setName(String i){
        name = i;
    }
    public  String getName(){
        return name;
    }

    public void setAge(int i){
        age = i;
    }
    public  int getAge(){
        return  age;
    }

    public void marry(Girl girl){
        System.out.println("想娶的女孩名字是" + girl.getName());
    }

    public void  shout(){
        if(this.age >= 22){
            System.out.println("你可以去合法登记了");
        }else{
            System.out.println("你还小");
        }
    }
}


class Girl{
    //属性
    private  String name;
    private  int age;

    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String i){
        name = i;
    }
    public  String getName(){
        return name;
    }


    public void marry(Boy boy){
        System.out.println("想嫁的男孩名字是" + boy.getName());
        boy.marry(this);
    }

    /**
     * @Author: Year 21
     * @Description: 比较两个对象的大小
     * @param: girl
     * @return  正数：当前对象大 负数：当前对象小 0：当前对象和形参对象相等
     */
    public int  compare(Girl girl){
        if(this.age > girl.age){
            return 1;
        }else  if (this.age < girl.age){
            return -1;
        }else {
            return 0;
        }
    }
}