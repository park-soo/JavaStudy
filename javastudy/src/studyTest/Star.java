package studyTest;

import java.util.Scanner;

public class Star {
	double a ;
	int b;

	public static void print(double a, int b) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력하세요 숫자");
		
		int input = scan.nextInt();
		
	
		for(int i=0;i<input;i++) {
			System.out.println("*");
		}
		
		
		for(int i=0;i<input;i++) {
			System.out.print("*");
		}
		
		
		
		
		
		
		
		
	}
	
}
