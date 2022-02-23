package code;/*
数据类型
基本数据类型
①整形：byte \ short \ int \ long 
②浮点型：float \ double
③字符型：char
④布尔型：Boolean

引用数据类型
①类（class）
②接口（interface0
③数组（array）

变量在类中声明的位置
成员变量 vs  局部变量

*/

class VariableTest1{
	public static void main(String[] args) {
		//整形:byte（1字节）\short（2字节\int（4字节）\long （8字节）
		//①byte的范围：-128~127
		byte b1 = 25;
		byte b2 = -124;
		//byte定义范围超过则不能成功编译
		System.out.println(b1);
		System.out.println(b2);
		//②声明long型变量，必须以“l”或者“L”结尾
		//③通常，定义整型，使用int型
		short s1 = 128;
		int i1 = 12345;
		long l1 = 11565515L;
		System.out.println(l1);

		//浮点型：folat（4字节） double（8字节）
		//①浮点型，表示带小数点的值
		//②float表示的数值比long还大 

		double d1 = 1244.4;
		
		System.out.println(d1 + 5);
		//float变量要以"f"或者"F"
		float f1 = 125.4f;
		System.out.println(f1 + 1);
		//通常，定义浮点型，默使用double型

		//字符型：char（一字符=2字节）
		//char的定义格式通常使用一对''
		char c1 = 'a';
		char c2 = '1';
		char c3 = '我';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//表示方式：1.声明一个符号 2.转义字符 3.直接使用Unicode值来表示字符型常量
		char c4 = '\n';//转义字符
		char c5 = '\t';//制表符
		System.out.print("Hello"+c4);
		System.out.println("World");

		char c6 = '\u0042';
		System.out.println(c6);

		//布尔型；boolean
		boolean bb1 = true;
		System.out.println(bb1);

		boolean isSuccess =true;
		if(isSuccess){
			System.out.println("恭喜\"你\"！\\n很高兴听到这个消息");
		}else{
			System.out.println("很抱歉，希望你继续努力！");
			}




	}
} 
