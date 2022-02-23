package code;

public class AriExer{
		public static void main(String[] args){
			int num = 1440;
			int qian = num / 1000;
			int bai = num / 100 % 10;
			int shi = num / 10 % 10;
			int ge = num / 1 % 10 ;	
			System.out.println("千分位为:" + qian);
			System.out.println("百分位为:" + bai);
			System.out.println("十分位为:" + shi);
			System.out.println("个分位为:" + ge);
		
		}



}