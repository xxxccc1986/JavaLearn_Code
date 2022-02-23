package code;

class StringTest {
	public static void main(String[] args) {
		String s1 = "Hello World!";
		System.out.println(s1);
		int number = 10001;
		String numberStr = "学号";
		String info = number + numberStr;
		System.out.println(info);
		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);


		//练习1
		char c1 = 'a'; //'a'=97    'A'=65
		int num = 10;
		String str = "Hello";
		System.out.println(c1+num+str);//107Hello
		System.out.println(c1+str+num);//aHello10
		System.out.println(c1+(num+str));//a10Hello
		System.out.println((c1+num)+str);//107Hello	
		System.out.println(str+c1+num);//Hello10a

		//String str1=123;编译无法通过
		String str1 = 123 + "";
		System.out.println(str1);//"123"


	}
}



