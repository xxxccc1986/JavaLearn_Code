package code;/*
变量的使用
1.java定义变量的格式：数据类型 变量名=变量值
2.说明
①变量必须先声明，再使用。
②变量都定义在其作用域内。在作用域内，它是有效的

*/

class VariableTest{
	public static void main(String[] args) {
		//变量的声明
		int myAge = 14;
		//变量的使用
		System.out.println(myAge);

		//变量的声明
		int myNumber;
		//变量的赋值
		myNumber = 18;
		System.out.println(myNumber);
	}
}
