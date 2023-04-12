package test1;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//초를 입력 받아서 시간 분 초로 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("초를 입력하시오 : ");
		int time = scan.nextInt();
		scan.close(); // 리소스, 메모리 관리를 위해 해줘야 함. 
		
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		System.out.print("결과 출력 : " + time + "초 => ");
		
		if(time>=3600) {
			hour = time/3600;
			time = time%3600;
			
			System.out.printf("%d시간",hour);
		}
		
		if(time>=60) {
			minute = time/60;
			time = time%60;
			
			System.out.printf("%02d분",minute);
		}
		
		if(0<time&&time<60) {
			second = time;
			
			System.out.printf("%02d초",second);
		}
		
		
///////////////////////// 선생님 풀이////////////////////////		
//		int hour = time/3600;;
//		int minute = (time%3600)/60;
//		int second = time%60;
//		
//		System.out.print("결과 출력 : " + time + "초 => ");
//		
//		if(hour != 0) {
//			System.out.printf("%d시간",hour);
//		}
//		
//		if(minute != 0) {
//			System.out.printf("%02d분",minute);
//		}
//		
//		if(second != 0) {
//			System.out.printf("%02d초",second);
//		}
		
		
	}
}
