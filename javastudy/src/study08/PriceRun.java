package study08;

import java.util.ArrayList;

public class PriceRun {
	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<>();
		Customer lee = new Customer("이순신");
		Customer hong = new Customer("홍길동");
		GoldCustomer sung = new GoldCustomer("성시경");
		VipCustomer kim = new VipCustomer("김정호", "대동아");
		VipCustomer kong = new VipCustomer("공유", "와이파이");
		
		cusList.add(lee);
		cusList.add(sung);
		cusList.add(hong);
		cusList.add(kong);
		cusList.add(kim);
		
		showCustomer(cusList);
		calcPriceAll(cusList,100000);
		
		//int price =10000;
		//int costLee = lee.calcPrice(price);
		//int costSung = sung.calcPrice(price);
		//System.out.println(costLee);
		//System.out.println(costSung);
		//System.out.println(lee.getCustomerInfo());
		//System.out.println(sung.getCustomerInfo());
		
	}
	
	public static void showCustomer(ArrayList<Customer> cusList) {
		System.out.println("====고객====");
		
		for(Customer cus : cusList) {
			System.out.println(cus.getCustomerInfo());
		}
		
		
	}
	
	public static void calcPriceAll(ArrayList<Customer> cusList, int price) {
		System.out.println("====가격 계산====");
		System.out.println("가격: "+price);
		for(Customer cus : cusList) {
			int cost = cus.calcPrice(price);
			System.out.printf("%s 고객님의 구매금액은 %d원 입니다.", cus.customerName, cost);
			System.out.println(cus.getCustomerInfo());
		}
	}
	
	
	
}
