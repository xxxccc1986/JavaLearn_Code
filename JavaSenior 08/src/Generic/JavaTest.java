package Generic;

import org.junit.Test;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 自定义java泛型类
 * @date 2022/2/16 21:57
 */
public class JavaTest {
    public static void main(String[] args) {
        Java<String> test = new Java<>("Tom",20,"JavaWeb");
        test.setJavaClass("Mysql");
    }

    @Test
        public void getTest(){
        Java1 java1 = new Java1();
        java1.setJavaClass(123);

        Java2<String> java2 = new Java2<>();
        java2.setJavaClass("java");
    }
}


class Java<T> {//自定义的泛型类
    String name;
    int age;

    T javaClass;

    public Java() {

    }

    public Java(String name, int age, T javaClass) {
        this.name = name;
        this.age = age;
        this.javaClass = javaClass;
    }

    public T getJavaClass() {
        return javaClass;
    }

    public void setJavaClass(T javaClass) {
        this.javaClass = javaClass;
    }


    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", javaClass=" + javaClass +
                '}';
    }
}