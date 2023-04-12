package check;

import java.util.Scanner;

public class SumNumber {
	//자릿수의 합
	//세자리수를 입력받아 각 자릿수를 더하여 결과를 출력
	//단 세자리 정수가 아닌 경우 예외처리
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = input.nextInt();
		
		int sum = numSum(number);
		
		
		
	}
	
	public static int numSum(int number) {
		
		int sum = 0;														// 다른 수식
		int a = number/100; //100의 자리										// number/100
		int b = (number-a*100)/10; // a(198)-a(1)*100 = 98/10 = 9			//(number/10)%10
		int c = (number-a*100)%10; // a(198)-a(1)*100 = 98%10 = 8			//(number%10)
		
		if(100<=number && number<1000) {
			
			sum = a + b + c;
			System.out.println(sum);
			
		} else {
			System.out.println("3자리 정수가 아닙니다.");
		}
		
		
		return sum;
	}
	
	
}
