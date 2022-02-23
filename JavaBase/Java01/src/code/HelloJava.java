package code;/*
1.java规范了三种注释方式
单行注释
多行注释
文档注释（Java特有）
2.单行注释和多行注释的作用：
①对所写的程序进行解释说明，增强可读性，便于方便自己，同时方便别人
②可以对已完成的代码进行调试

3.单行注释和多行注释的内容不参与编译。
编译生成的.class结尾的字节码文件不包含注释的信息

4.多行注释里面不可嵌套注释。
*/ 


/**
文档注释：
@author Ssk
@version jdk8.0 
这是今天学习的第一个java程序

*/

public class HelloJava {
	/*多行注释：
	如下的main方法是程序的入口！
	mian的格式是固定的！
	*/
	public static void main(String[] args) {
		//单行注释：如下的语句表示输出到控制台 
		System.out.println("Hello World!");
	}
}
