package check;

import java.util.Scanner;

public class Food {


	// 치킨 34인분, 왕만두 10인분, 쌀국수 12인분
	// 가격 치킨:25000원, 왕만두:5000원, 쌀국수:8500원
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("치킨: ");
		int fp1 = input.nextInt();
	
		
		System.out.print("왕만두: ");
		int fp2 = input.nextInt();
		
		System.out.print("쌀국수: ");
		int fp3 = input.nextInt();
		
		System.out.println("===================");
		
		int f1 = f1Check(fp1);
		System.out.println("치킨: " + f1 + "원");		
		int f2 = f2Check(fp2);
		System.out.println("왕만두: " + f2 + "원");
		int f3 = f3Check(fp3);
		System.out.println("쌀국수: " + f3 + "원");
		
		System.out.println("------------------------");
		
		int total = totalCheck(fp1,fp2,fp3);
		
		System.out.println("총금액: "+total+"원");
		
		
	}
	public static int f1Check(int fp1) {
		
		int f1 = fp1*25000;
		
		return f1;
				
	}
	public static int f2Check(int fp2) {
		
		int f2 = fp2*5000;
		
		return f2;
				
	}
	public static int f3Check(int fp3) {
		
		int f3 = fp3*8500;
		
		return f3;
				
	}
	
	public static int totalCheck(int fp1, int fp2, int fp3) {
		
		fp1 = fp1*25000;
		fp2 = fp2*5000;
		fp3 = fp3*8500;
		
		int total = fp1+fp2+fp3;
		
		return total;
				
	}
	
	
	
	
	
	
	
}
