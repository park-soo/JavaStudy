package study05;

public class Lotto {
	public static void main(String[] args) {
	
		
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
