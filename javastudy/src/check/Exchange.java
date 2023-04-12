package check;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		//유로 달러 두번 입력
		//한호로 얼마 인지
		//환율 검색 달러 1229 유로 1338
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("유로: ");
		int eur = input.nextInt();
		System.out.print("달러: ");
		int usd = input.nextInt();
		
		//환율
		int uerEx = 1338;
		int usdEX = 1229;
		
		int uerMoney = eurExchange(eur, uerEx);
		
		System.out.println("한국환율 급액(UER): " +uerMoney+"원");
		
		
		int usdMoney = usdExchange(usd, usdEX);
		
		System.out.println("한국환율 급액(USD): " +usdMoney+"원");
		
		
		int total = totalMoney(eur, usd, uerEx, usdEX);
		
		System.out.println("한국환율 총 급액(UER+USD): " +total+"원");
		
		
	}
	
	public static int eurExchange(int eur, int uerEX) {
		
		int uerMoney = eur*uerEX;
		
		return uerMoney;
		
	}
	
	public static int usdExchange(int usd, int usdEx) {
		
		int usdMoney = usd*usdEx;
		
		return usdMoney;
		
	}
	
	
	public static int totalMoney(int eur, int usd, int uerEX, int usdEx) {
		
		int total = eur*uerEX+usd*usdEx;
		
		return total;
		
	}
	
	
	
	
	
	
}
