package study01;

public class Loop {

	public static void main(String[] args) {
		int num = 1; // 초기화
		int sum = 0; // 합계
		
		while(num<=10) { // 조건식
			sum += num;
			num ++; // 증감식
		}
		
		System.out.println("합계:"+sum);
		
		num = 1; // 초기화
		sum = 0; // 합계
		
		do {
			sum += num;
			num ++; // 증감식
		} while(num<=10); // 조건식
		
		System.out.println("합계:"+sum);

		
		
		sum=0;
		for(int i=1; i<=10; i++) {
			sum += i;
			
		}
		System.out.println("합계:"+sum);
		
		// 구구단
		
		for(int dan=2; dan<=9; dan++) {
			for(int t=1; t<10; t++) {
				System.out.println(dan+"X"+t+"="+(dan*t));
			}
			System.out.println();
		}
		
		
		int dan = 2;
		while(dan<=9) {
			int t =1;
			while(t<=9) {
				System.out.println(dan+"X"+t+"="+(dan*t));
				t++;
			}
			System.out.println();
			dan++;
		}
		
		
		for(int i=0; i<10; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		// 1 ~ 100 까지의 합계
		sum=0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("합계 : "+sum);
		
		
		// 1~100까지 짝수만 합계(1)
		sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				continue;
			}
			sum += i;
		}
		System.out.println("합계 : "+sum);
		
		// 1~100까지 짝수만 합계(2)
		sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("합계 : "+sum);
		
		// 1~100까지 짝수만 합계(3)
		sum=0;
		for(int i=2;i<=100; i+=2) {
			sum +=i;
		}
		System.out.println("합계 : "+sum);
	
		
		// 합계가 100을 초과 했을 때
		int sum1 = 0;
		int num1 = 1;
		while(num1<=100) {
			sum1 += num1;
			if(sum1>100) {
				break;
			}
			num1++;
		}
		System.out.println(sum1 +" "+ num1);
		
		int sum2 = 0;
		int num2 = 1;
		for(num2 =1; num2<100; num2++) {
			sum2 += num2;
			if(sum2>100) {
				break;
			}
		}
		System.out.println(sum2 + " " + num2);
		
		// 구구단 5단만 제외하고 출력
		for(dan=2; dan<=9; dan++) {
			for(int t=1; t<10; t++) {
				if(dan==5) {  
					break;
				}
				System.out.println(dan+"X"+t+"="+(dan*t));
			}
			System.out.println();
		}
		
		// 5단 전까지 출력
		out:
		for(dan=2; dan<=9; dan++) {
			for(int t=1; t<10; t++) {
				if(dan==5)
					break out;
				System.out.println(dan+"X"+t+"="+(dan*t));
			}
			System.out.println();
		}
		
		
		
	}

}