package study05;

import java.util.Scanner;

public class CharCheck {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("영문자를 입력하세요: "); 
		String in = input.nextLine();
		
		int con = 0; // 자음 consonant
		int vow = 0; // 모음 vowel aeiou
		String check = in.toLowerCase();
		
		
		for(int i=0; i< check.length();i++) {
			char c = check.charAt(i);
			
			if(c>='a'&& c<='z') {
				
				if(c=='a'|| c=='e'|| c=='i'|| c=='o' || c=='u') {
					vow ++; // vow += 1; // 
				} else {
					con++; // con += 1;
				} 
			}
		
		}
		
		
		System.out.println("자음개수: " + con+ "모음 개수: "+ vow+ "개");
		
		
		
		
		
	}
}
