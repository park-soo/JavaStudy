package study01;

public class Variable {
	public static void main(String[] ar) {
		
		// 변수 선언
		int num = 10;
		System.out.println(num);
		
		// 진수 표현
		int binNum = 0B1010;
		System.out.println(binNum);
		int octNum = 013;
		System.out.println(octNum);
		int hexNum = 0x1A;
		System.out.println(hexNum);

		// 변수명 가독성
		int mp; //멤버쉽 포인트
		int membershipPoint; // 오타 조심
		
		byte byteData = -128;
		System.out.println(byteData);
		byteData = (byte)-129;
		System.out.println(byteData);
		
		int integerNum = 1234567;
		long longNum = 24234234234233L;
		
		
	char ch = 'A';
	System.out.println(ch);
	ch = 66;
	System.out.println(ch);
	int chin = 'D';
	System.out.println(chin);
		                   
	double doubleNum = 3.14; 
	float floatNum = 3.14F;
	System.out.println(doubleNum+" "+floatNum);
	
	final double PI = 3.1419; // 상수
	// PI = 2.23; // 상수는 재할당 불가
	
	int iNum = binNum;
	System.out.println(iNum);
	iNum = (int)longNum;
	System.out.println(longNum + "  "+iNum);
	iNum = (int)floatNum;
	System.out.println(floatNum+"  "+iNum);
	doubleNum = floatNum + iNum;
	System.out.println(doubleNum);

	
	floatNum = 0.9f;
	int iNum1 = (int)(doubleNum + floatNum);
	int iNum2 = (int)doubleNum + (int)floatNum;
	System.out.println(iNum1 + "  "+ iNum2);
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}