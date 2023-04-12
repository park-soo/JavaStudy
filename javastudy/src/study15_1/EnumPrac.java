package study15_1;

import java.util.HashMap;

enum CoffeeType{Americano, IceAmericano, CafeLatte}



public class EnumPrac {
	static void printCoffeePrice(CoffeeType type) {

		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.Americano, 3000);
		priceMap.put(CoffeeType.IceAmericano, 4000);
		priceMap.put(CoffeeType.CafeLatte, 5000);
		
		
		int price = priceMap.get(type);				//키 값을 가져오는게 아니라,     키에 해당 하는 값을 가져오는거 
		
		System.out.printf("가격은 %d원입니다.",price);
	}
	
	public static void main(String[] args) {
		printCoffeePrice(CoffeeType.CafeLatte);
	}
}
