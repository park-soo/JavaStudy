package check;

import java.util.Scanner;

public class Profile {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름: ");
		String name = input.nextLine();
		
		System.out.print("학번: ");
		int num = input.nextInt();
		
		System.out.print("신장: ");
		double tall = input.nextDouble();
		
		System.out.print("남자인가요? ");
		boolean gender = input.nextBoolean();
		genderCheck(gender);
		
		
	}
	
	public static void genderCheck(boolean gender) {
		
		if(gender==true) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
				
	}
	
	
//			//String name="홍길동";
//			//int num = 2018122104;
//			//double tall = 1.78;
//			//boolean gender = true;
//
//			
//			System.out.println("이름:" +name);
//			System.out.println("학번:" +num);
//			System.out.println("신장:" +tall+"m");
//			System.out.println("남자인가요?:" +gender);
	
	
	
	
	
}
