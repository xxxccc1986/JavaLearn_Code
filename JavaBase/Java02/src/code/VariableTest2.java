package code;

/*
自动类型提升：
当容量小的数据类型和容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
byte、short、char-->int-->long-->float-->double
特别的：当byte、short、char三种类型的变量做运算时，结果为int的数据类型

强制类型转换：
自动类型提升运算的逆运算
需要使用强转符（）

*/
class VariableTest2 {
	public static void main(String[] args) {
		//自动类型提升示例
			byte b1 = 2;
			int i1 = 128;
			int i2 = b1 + i1;
			System.out.println(i2);

			byte b2 = -110;
			char c1 = 'a';
			int i3 = b2 + c1;
			System.out.println(i3);

			short s1 = 123;
			double d1= s1 ;
			System.out.println(d1);

		//强制类型转换示例
		//	精度损失示例1
			double d4 = 12.8;
			int i4 = (int) d4;//截断操作
			System.out.println(i4);
		//没有精度损失
			long l1 = 123;
			short s2 = (short)l1;
			System.out.println(s2);
		//精度损失示例2
			int i5 = 128;
			byte b3= (byte)i5;
			System.out.println(b3);
	}
}
