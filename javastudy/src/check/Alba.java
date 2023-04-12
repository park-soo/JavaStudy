package check;

import java.util.Scanner;

public class Alba {
	
	//급여계산
	//시급, 일한 시간을 입력(Scanner 사용)
	//최종적으로 급여를 출력
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("최저시급: ");
		int money = input.nextInt();
		
		System.out.print("일한 시간: ");
		int time = input.nextInt();
		input.close();
		
		System.out.println("===================");		
		
		//일급
		int tm = timeMoney(money,time);
		System.out.println("일급: "+tm+"원");
		 
		System.out.println("===================");
		
		//주급(5일 기준)
		int wm = weekendMoney(money,time);
		System.out.println("주급: "+wm+"원");
		
		System.out.println("===================");
		
		//월급(20일 기준)
		int mm = monthMoney(wm);
		System.out.println("월급: "+mm+"원");
	}
	
	public static int timeMoney(int money, int time) {
		
		int timeMoney=0;
		
		timeMoney = money*time;
		
		if(time>8) {
			timeMoney = time%8*money;
		}
		
		
		return timeMoney;
	}
	
	public static int weekendMoney(int money, int time) {
		
		int weekendMoney=0;
		
		weekendMoney = (money*time);
		
		if(time>=40) {
			weekendMoney += money*8;
			System.out.println("주휴수당 발생");
		}
				
		return weekendMoney;
	}
	public static int monthMoney(int wm) {
		
		int monthMoney=0;
		
		monthMoney = wm*4;
		
		return monthMoney;
	}
	
	
	
	
}
