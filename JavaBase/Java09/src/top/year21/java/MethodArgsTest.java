package top.year21.java;

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("nihao","hou");
    }

    public void show(int i){

    }

    public void show(String s){
        System.out.println("show(String)");

    }

    public void show(String ... strs){
        System.out.println("show(String ... strs)");
    }

}
