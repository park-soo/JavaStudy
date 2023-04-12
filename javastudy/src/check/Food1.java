package check;

public class Food1 {

	public static void main(String[] args) {
		
		//음식 명
		String f1 = "치킨";
		String f2 = "왕만두";
		String f3 = "쌀국수";
		
		//음식 가격
		int fp1 = 25000;
		int fp2 = 5000;
		int fp3 = 8500;
		
		//음식 수량
		int f1p = 34;
		int f2p = 12;
 		int f3p = 12;
		
		//음식 합
		int fpt1 = fp1*f1p;
		int fpt2 = fp2*f2p;
		int fpt3 = fp3*f3p;
		
		//음식 총 합
		int total = fpt1 + fpt2+fpt3;
		
		
		
		System.out.println(f1+" x "+ f1p+" = "+fpt1);
		System.out.println(f2+" x "+ f2p+" = "+fpt2);
		System.out.println(f3+" x "+ f3p+" = "+fpt3);
		System.out.println("===================");
		System.out.println("총합: "+ total);
		
		

	}

}
