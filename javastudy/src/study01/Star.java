package study01;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력:");
		
		int line = scan.nextInt();
		if(line%2!=1) { // line%2==0
			System.out.println("홀 수 를 입 력 해 주 세 요!");
		} else {
			

		int space = 0;
		int star = line;
		for(int i=0; i<line; i++) {
			for (int j=0; j<space;j++) {
					System.out.print(" ");
			}
				for(int k=0; k<star; k++) {
					System.out.print("*");					
				}
				if(i<line/2) {
				space++;
				star -=2;
				} else {
					space--;
					star +=2;
				}
				System.out.println();		
				
		}
		
		
		

	}

}
}