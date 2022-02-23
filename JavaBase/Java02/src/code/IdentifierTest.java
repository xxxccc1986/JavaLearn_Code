package code;/*
标识符

定义：java对各种变量、方法和类等要素命名使用的字符序列

技巧：凡是自己命名的地方都统称为标识符

比如：类名，变量，方法，接口名，包名等等

命名规则

1.由26个字母大小写，0-9，_或者$组成

2.数字不可以开头

3.不可以使用关键字和保留字，但允许包含关键字和保留字

4.java中严格区分大小写字母，长度则无限制

5.标识符不能含有空格

以上规则不遵守则无法通过编译！

java名称规范

包名：多单词组成的所有字母都是小写：xxxyyyzzz

类名、接口名：多单词组成时，所有的单词首字母大写：XxxYyyZzz

变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz

常变量：所有字母都大写。多单词时每个单词用下划线连接：Xxx_Yyy_Zzz

*/

class IdentifierTest{
		public static void main(String[] args){

			int myNumber=1002  ;
			System.out.println("myNumber");

	}


}
