package code;

/*
对第一个Java程序的编写总结
1.Java程序编写-编译-运行
编写：将已经编写好的java代码保存在以".java"为后缀的源文件中
编译：利用"javac.exe"命令对保存好的源文件进行编译。格式：javac 源文件名字
运行：利用"java.exe"命令对编译后产生的以".class"为后缀的字节码
		文件进行处理。格式：java 类名

2.
一个java源文件中可以声明多个class，但只有一个类（class）可以声明为public。
此外声明为public的类必须与源文件名字相同

3.程序的入口是main()方法，它的格式是固定的
（）内的中括号 和args是可以变的 尤其是String这个固定的类名

4.输出语句
System.out.println();  先输出数据，后换行
System.out.pront();  只输出数据，不换行

5.每一个执行语句都以";"结尾

6.编译的过程
.class为后缀的字节码文件编译后可以产生多份
字节码文件名与Java源文件的类名一致


*/
public class Hello{
	public static void main(String[] args) {//public static void main(String[] args) {//arguments;参数
		System.out.println("Hello World!");
		System.out.println();//换行
		System.out.print("Hello World!");
	}
}


class Person{

}

class animal{

}
