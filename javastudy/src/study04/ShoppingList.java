package study04;

public class ShoppingList {
	public static void main(String[] args) {
		String item1 = "한우 꽃등심";
		int price1 = 112500;
		String item2 = "참치 선물팩";
		int price2 = 25500;
		String item3 = "맥스봉 한팩";
		int price3 = 10000;
		
		System.out.printf("품명: %-9s 가격: %07d\n",item1,price1);
		System.out.printf("품명: %-9s 가격: %7d\n",item2,price2);
		System.out.printf("품명: %-9s 가격: %7d\n",item3,price3);
		
		
		
		//		System.out.printf(format, arguments)
		//		%n : 줄바꿈 \n도 가능~
		//		%s : String
		//		%d : int
		//		%f : float
		//		%t : date, time
		//		%b : boolean
		

		
		
	}
}
