package test1;

public class Exam04 {
	public static void main(String[] args) {
		
		System.out.println(Math.random());  //Math - 0 ~ 1 사이의 랜덤한 값이 나온다.
		// 2개의 주사위를 던졌을 때 눈의 합의 값이 5이면 코드 정지
		// 12가 나오면 감탄사 
		// 나오는 값을 출력
		
		while(true) {
			
			int i = (int)(Math.random()*6)+1; //주사위 숫자를 하기 위해 *6 + 1를 통하여 정수형으로 표현하여 범위적으로 보기위해서.
			int j = (int)(Math.random()*6)+1;
			
			System.out.println("DICE GAME");
			System.out.printf("rolling...[주사위:%d, 주사위:%d]\n",i,j);
			
			if (i+j==5) {
				System.out.println("5가 나왔엉~ ");
				continue;
			} else if (i+j==12) {
				System.out.println("WoW~~~");
				break;
			} else if(i==j) {
				System.out.println("떠블~~~");
			}
				
			
		
		}
		
		// 로또~
		int[] arr = new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			int luckyNum = (int)(Math.random()*45)+1;
			arr[i] = luckyNum;
			for(int j=0; j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		for(int i=0; i<6;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
